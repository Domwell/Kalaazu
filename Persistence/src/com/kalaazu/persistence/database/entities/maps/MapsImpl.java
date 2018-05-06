package com.kalaazu.persistence.database.entities.maps;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.*;
import com.kalaazu.persistence.database.entities.maps.generated.GeneratedMapsImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The default implementation of the {@link
 * Maps}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class MapsImpl
        extends GeneratedMapsImpl
        implements Maps {
    /**
     * Faction.
     */
    private Optional<Factions> faction;

    /**
     * Npcs on map.
     */
    private List<MapsNpcs> npcs;

    /**
     * Portals on map.
     */
    private List<MapsPortals> portals;

    /**
     * Stations on map.
     */
    private List<MapsStations> stations;

    @Override
    public Optional<Factions> getFaction() {
        if (this.faction != null) {
            return this.faction;
        }

        this.faction = super.findFactionsId(
                Database.getInstance()
                        .getDb()
                        .manager(Factions.class)
        );

        return this.faction;
    }

    @Override
    public List<MapsNpcs> getNpcs() {
        if (this.npcs != null) {
            return this.npcs;
        }

        this.npcs = Database.getInstance()
                            .all(MapsNpcs.class)
                            .filter(n -> n.getMapsId() == super.getId())
                            .collect(Collectors.toList());

        return this.npcs;
    }

    @Override
    public List<MapsPortals> getPortals() {
        if (this.portals != null) {
            return this.portals;
        }

        this.portals = Database.getInstance()
                               .all(MapsPortals.class)
                               .filter(p -> p.getMapsId() == super.getId())
                               .collect(Collectors.toList());

        return this.portals;
    }

    @Override
    public List<MapsStations> getStations() {
        if (this.stations != null) {
            return this.stations;
        }

        this.stations = Database.getInstance()
                                .all(MapsStations.class)
                                .filter(
                                        s -> s.getMapsId()
                                              .orElse((byte) 0)
                                              .equals(super.getId())
                                )
                                .collect(Collectors.toList());

        return this.stations;
    }
}
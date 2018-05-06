package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.maps_portals.generated.GeneratedMapsPortals;

/**
 * The main interface for entities of the {@code maps_portals}-table in the
 * database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface MapsPortals extends GeneratedMapsPortals, Entity<Byte> {
    /**
     * Returns the level required to use this portal.
     *
     * @return Required level.
     */
    Levels getLevel();

    /**
     * Returns the map in which the portal is located.
     *
     * @return Current map.
     */
    Maps getMap();

    /**
     * Returns the target map.
     *
     * @return Target map.
     */
    Maps getTargetMap();
}
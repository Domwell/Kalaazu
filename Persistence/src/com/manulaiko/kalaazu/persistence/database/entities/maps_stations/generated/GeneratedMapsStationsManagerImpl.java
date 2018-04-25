package com.manulaiko.kalaazu.persistence.database.entities.maps_stations.generated;

import com.manulaiko.kalaazu.persistence.database.entities.maps_stations.MapsStations;
import com.manulaiko.kalaazu.persistence.database.entities.maps_stations.MapsStationsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.maps_stations.MapsStations}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMapsStationsManagerImpl
        extends AbstractManager<MapsStations>
        implements GeneratedMapsStationsManager {

    private final TableIdentifier<MapsStations> tableIdentifier;

    protected GeneratedMapsStationsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "maps_stations");
    }

    @Override
    public TableIdentifier<MapsStations> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<MapsStations>> fields() {
        return MapsStationsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<MapsStations>> primaryKeyFields() {
        return Stream.of(
                MapsStations.ID
        );
    }
}
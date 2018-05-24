package com.kalaazu.persistence.database.entities.maps_stations.generated;

import com.kalaazu.persistence.database.entities.MapsStations;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.maps_stations.MapsStations} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMapsStationsManager extends Manager<MapsStations> {

    TableIdentifier<MapsStations> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "maps_stations"
    );

    List<Field<MapsStations>>     FIELDS     = unmodifiableList(asList(
            MapsStations.ID,
            MapsStations.POSITION,
            MapsStations.MAPS_ID,
            MapsStations.FACTIONS_ID
    ));

    @Override
    default Class<MapsStations> getEntityClass() {
        return MapsStations.class;
    }
}
package com.kalaazu.persistence.database.entities.maps_npcs.generated;

import com.kalaazu.persistence.database.entities.MapsNpcs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.maps_npcs.MapsNpcs} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMapsNpcsManager extends Manager<MapsNpcs> {

    TableIdentifier<MapsNpcs> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "maps_npcs"
    );

    List<Field<MapsNpcs>>     FIELDS     = unmodifiableList(asList(
            MapsNpcs.ID,
            MapsNpcs.MAPS_ID,
            MapsNpcs.NPCS_ID,
            MapsNpcs.AMOUNT
    ));

    @Override
    default Class<MapsNpcs> getEntityClass() {
        return MapsNpcs.class;
    }
}
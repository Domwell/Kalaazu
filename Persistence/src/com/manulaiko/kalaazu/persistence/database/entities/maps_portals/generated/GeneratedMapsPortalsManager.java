package com.manulaiko.kalaazu.persistence.database.entities.maps_portals.generated;

import com.manulaiko.kalaazu.persistence.database.entities.MapsPortals;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * MapsPortals}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMapsPortalsManager extends Manager<MapsPortals> {

    List<Field<MapsPortals>> FIELDS = unmodifiableList(asList(
            MapsPortals.ID,
            MapsPortals.LEVELS_ID,
            MapsPortals.MAPS_ID,
            MapsPortals.POSITION,
            MapsPortals.TARGET_MAPS_ID,
            MapsPortals.TARGET_POSITION,
            MapsPortals.IS_VISIBLE,
            MapsPortals.IS_WORKING,
            MapsPortals.GFX
    ));

    @Override
    default Class<MapsPortals> getEntityClass() {
        return MapsPortals.class;
    }
}
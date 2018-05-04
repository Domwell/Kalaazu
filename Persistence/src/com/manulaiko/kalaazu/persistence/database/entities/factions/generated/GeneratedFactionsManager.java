package com.manulaiko.kalaazu.persistence.database.entities.factions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Factions;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * Factions}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFactionsManager extends Manager<Factions> {

    List<Field<Factions>> FIELDS = unmodifiableList(asList(
            Factions.ID,
            Factions.NAME,
            Factions.TAG,
            Factions.DESCRIPTION,
            Factions.IS_PUBLIC,
            Factions.LOW_MAPS_ID,
            Factions.LOW_MAPS_POSITION,
            Factions.HIGH_MAPS_ID,
            Factions.HIGH_MAPS_POSITION
    ));

    @Override
    default Class<Factions> getEntityClass() {
        return Factions.class;
    }
}
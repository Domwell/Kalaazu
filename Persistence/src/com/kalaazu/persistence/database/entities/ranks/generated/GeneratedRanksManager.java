package com.kalaazu.persistence.database.entities.ranks.generated;

import com.kalaazu.persistence.database.entities.Ranks;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * Ranks} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRanksManager extends Manager<Ranks> {

    List<Field<Ranks>> FIELDS = unmodifiableList(asList(
            Ranks.ID,
            Ranks.NAME,
            Ranks.PERCENTAJE,
            Ranks.IS_PUBLIC
    ));

    @Override
    default Class<Ranks> getEntityClass() {
        return Ranks.class;
    }
}
package com.kalaazu.persistence.database.entities.levels.generated;

import com.kalaazu.persistence.database.entities.Levels;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.levels.Levels} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedLevelsManager extends Manager<Levels> {

    TableIdentifier<Levels> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "levels"
    );

    List<Field<Levels>>     FIELDS     = unmodifiableList(asList(
            Levels.ID,
            Levels.ACCOUNT,
            Levels.DRONE,
            Levels.PET,
            Levels.DAMAGE,
            Levels.SHIELD
    ));

    @Override
    default Class<Levels> getEntityClass() {
        return Levels.class;
    }
}
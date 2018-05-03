package com.manulaiko.kalaazu.persistence.database.entities.skylab_modules.generated;

import com.manulaiko.kalaazu.persistence.database.entities.skylab_modules.SkylabModules;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.skylab_modules.SkylabModules}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSkylabModulesManager extends Manager<SkylabModules> {

    List<Field<SkylabModules>> FIELDS = unmodifiableList(asList(
            SkylabModules.ID,
            SkylabModules.NAME,
            SkylabModules.PRODUCTION_FACTOR,
            SkylabModules.PRODUCTION_BASE,
            SkylabModules.STORAGE_FACTOR,
            SkylabModules.STORAGE_BASE,
            SkylabModules.UPGRADE_FACTOR,
            SkylabModules.UPGRADE_BASE,
            SkylabModules.ENERGY_FACTOR,
            SkylabModules.ENERGY_BASE
    ));

    @Override
    default Class<SkylabModules> getEntityClass() {
        return SkylabModules.class;
    }
}
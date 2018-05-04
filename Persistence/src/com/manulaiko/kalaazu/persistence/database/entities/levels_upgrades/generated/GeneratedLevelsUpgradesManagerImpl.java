package com.manulaiko.kalaazu.persistence.database.entities.levels_upgrades.generated;

import com.manulaiko.kalaazu.persistence.database.entities.LevelsUpgrades;
import com.manulaiko.kalaazu.persistence.database.entities.levels_upgrades.LevelsUpgradesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * LevelsUpgrades}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLevelsUpgradesManagerImpl
        extends AbstractManager<LevelsUpgrades>
        implements GeneratedLevelsUpgradesManager {

    private final TableIdentifier<LevelsUpgrades> tableIdentifier;

    protected GeneratedLevelsUpgradesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "levels_upgrades");
    }

    @Override
    public TableIdentifier<LevelsUpgrades> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<LevelsUpgrades>> fields() {
        return LevelsUpgradesManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<LevelsUpgrades>> primaryKeyFields() {
        return Stream.of(
                LevelsUpgrades.ID
        );
    }
}
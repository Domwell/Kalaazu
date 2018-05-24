package com.kalaazu.persistence.database.entities.levels_upgrades.generated;

import com.kalaazu.persistence.database.entities.Levels;
import com.kalaazu.persistence.database.entities.LevelsUpgrades;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.levels_upgrades.LevelsUpgrades}-interface
 * representing entities of the {@code levels_upgrades}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedLevelsUpgrades {

    /**
     * This Field corresponds to the {@link LevelsUpgrades} field that can be
     * obtained using the {@link LevelsUpgrades#getId()} method.
     */
    IntField<LevelsUpgrades, Integer>                 ID          = IntField.create(
            Identifier.ID,
            LevelsUpgrades::getId,
            LevelsUpgrades::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link LevelsUpgrades} field that can be
     * obtained using the {@link LevelsUpgrades#getLevelsId()} method.
     */
    ByteForeignKeyField<LevelsUpgrades, Byte, Levels> LEVELS_ID   = ByteForeignKeyField.create(
            Identifier.LEVELS_ID,
            LevelsUpgrades::getLevelsId,
            LevelsUpgrades::setLevelsId,
            Levels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link LevelsUpgrades} field that can be
     * obtained using the {@link LevelsUpgrades#getProbability()} method.
     */
    ByteField<LevelsUpgrades, Byte>                   PROBABILITY = ByteField.create(
            Identifier.PROBABILITY,
            LevelsUpgrades::getProbability,
            LevelsUpgrades::setProbability,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link LevelsUpgrades} field that can be
     * obtained using the {@link LevelsUpgrades#getCredits()} method.
     */
    IntField<LevelsUpgrades, Integer>                 CREDITS     = IntField.create(
            Identifier.CREDITS,
            LevelsUpgrades::getCredits,
            LevelsUpgrades::setCredits,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link LevelsUpgrades} field that can be
     * obtained using the {@link LevelsUpgrades#getUridium()} method.
     */
    ShortField<LevelsUpgrades, Short>                 URIDIUM     = ShortField.create(
            Identifier.URIDIUM,
            LevelsUpgrades::getUridium,
            LevelsUpgrades::setUridium,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this LevelsUpgrades. The id field corresponds to the
     * database column kalaazu.kalaazu.levels_upgrades.id.
     *
     * @return the id of this LevelsUpgrades
     */
    Integer getId();

    /**
     * Returns the levelsId of this LevelsUpgrades. The levelsId field
     * corresponds to the database column
     * kalaazu.kalaazu.levels_upgrades.levels_id.
     *
     * @return the levelsId of this LevelsUpgrades
     */
    byte getLevelsId();

    /**
     * Returns the probability of this LevelsUpgrades. The probability field
     * corresponds to the database column
     * kalaazu.kalaazu.levels_upgrades.probability.
     *
     * @return the probability of this LevelsUpgrades
     */
    byte getProbability();

    /**
     * Returns the credits of this LevelsUpgrades. The credits field corresponds
     * to the database column kalaazu.kalaazu.levels_upgrades.credits.
     *
     * @return the credits of this LevelsUpgrades
     */
    int getCredits();

    /**
     * Returns the uridium of this LevelsUpgrades. The uridium field corresponds
     * to the database column kalaazu.kalaazu.levels_upgrades.uridium.
     *
     * @return the uridium of this LevelsUpgrades
     */
    short getUridium();

    /**
     * Sets the id of this LevelsUpgrades. The id field corresponds to the
     * database column kalaazu.kalaazu.levels_upgrades.id.
     *
     * @param id to set of this LevelsUpgrades
     *
     * @return this LevelsUpgrades instance
     */
    LevelsUpgrades setId(int id);

    /**
     * Sets the levelsId of this LevelsUpgrades. The levelsId field corresponds
     * to the database column kalaazu.kalaazu.levels_upgrades.levels_id.
     *
     * @param levelsId to set of this LevelsUpgrades
     *
     * @return this LevelsUpgrades instance
     */
    LevelsUpgrades setLevelsId(byte levelsId);

    /**
     * Sets the probability of this LevelsUpgrades. The probability field
     * corresponds to the database column
     * kalaazu.kalaazu.levels_upgrades.probability.
     *
     * @param probability to set of this LevelsUpgrades
     *
     * @return this LevelsUpgrades instance
     */
    LevelsUpgrades setProbability(byte probability);

    /**
     * Sets the credits of this LevelsUpgrades. The credits field corresponds to
     * the database column kalaazu.kalaazu.levels_upgrades.credits.
     *
     * @param credits to set of this LevelsUpgrades
     *
     * @return this LevelsUpgrades instance
     */
    LevelsUpgrades setCredits(int credits);

    /**
     * Sets the uridium of this LevelsUpgrades. The uridium field corresponds to
     * the database column kalaazu.kalaazu.levels_upgrades.uridium.
     *
     * @param uridium to set of this LevelsUpgrades
     *
     * @return this LevelsUpgrades instance
     */
    LevelsUpgrades setUridium(short uridium);

    /**
     * Queries the specified manager for the referenced Levels. If no such
     * Levels exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Levels findLevelsId(Manager<Levels> foreignManager);

    enum Identifier implements ColumnIdentifier<LevelsUpgrades> {

        ID("id"),
        LEVELS_ID("levels_id"),
        PROBABILITY("probability"),
        CREDITS("credits"),
        URIDIUM("uridium");

        private final String                          columnId;

        private final TableIdentifier<LevelsUpgrades> tableIdentifier;

        Identifier(String columnId) {
            this.columnId = columnId;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsId(),
                    getSchemaId(),
                    getTableId()
            );
        }

        @Override
        public String getDbmsId() {
            return "kalaazu";
        }

        @Override
        public String getSchemaId() {
            return "kalaazu";
        }

        @Override
        public String getTableId() {
            return "levels_upgrades";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<LevelsUpgrades> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
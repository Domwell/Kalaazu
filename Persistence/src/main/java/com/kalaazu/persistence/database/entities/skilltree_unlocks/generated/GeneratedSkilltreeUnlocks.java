package com.kalaazu.persistence.database.entities.skilltree_unlocks.generated;

import com.kalaazu.persistence.database.entities.SkilltreeLevels;
import com.kalaazu.persistence.database.entities.SkilltreeUnlocks;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.skilltree_unlocks.SkilltreeUnlocks}-interface
 * representing entities of the {@code skilltree_unlocks}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSkilltreeUnlocks {

    /**
     * This Field corresponds to the {@link SkilltreeUnlocks} field that can be
     * obtained using the {@link SkilltreeUnlocks#getId()} method.
     */
    ShortField<SkilltreeUnlocks, Short>                            ID                           = ShortField.create(
            Identifier.ID,
            SkilltreeUnlocks::getId,
            SkilltreeUnlocks::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link SkilltreeUnlocks} field that can be
     * obtained using the {@link SkilltreeUnlocks#getUpgradeSkilltreeLevelsId()}
     * method.
     */
    ShortForeignKeyField<SkilltreeUnlocks, Short, SkilltreeLevels> UPGRADE_SKILLTREE_LEVELS_ID  = ShortForeignKeyField.create(
            Identifier.UPGRADE_SKILLTREE_LEVELS_ID,
            SkilltreeUnlocks::getUpgradeSkilltreeLevelsId,
            SkilltreeUnlocks::setUpgradeSkilltreeLevelsId,
            SkilltreeLevels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link SkilltreeUnlocks} field that can be
     * obtained using the {@link
     * SkilltreeUnlocks#getRequiredSkilltreeLevelsId()} method.
     */
    ShortForeignKeyField<SkilltreeUnlocks, Short, SkilltreeLevels> REQUIRED_SKILLTREE_LEVELS_ID = ShortForeignKeyField.create(
            Identifier.REQUIRED_SKILLTREE_LEVELS_ID,
            SkilltreeUnlocks::getRequiredSkilltreeLevelsId,
            SkilltreeUnlocks::setRequiredSkilltreeLevelsId,
            SkilltreeLevels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this SkilltreeUnlocks. The id field corresponds to the
     * database column kalaazu.kalaazu.skilltree_unlocks.id.
     *
     * @return the id of this SkilltreeUnlocks
     */
    Short getId();

    /**
     * Returns the upgradeSkilltreeLevelsId of this SkilltreeUnlocks. The
     * upgradeSkilltreeLevelsId field corresponds to the database column
     * kalaazu.kalaazu.skilltree_unlocks.upgrade_skilltree_levels_id.
     *
     * @return the upgradeSkilltreeLevelsId of this SkilltreeUnlocks
     */
    short getUpgradeSkilltreeLevelsId();

    /**
     * Returns the requiredSkilltreeLevelsId of this SkilltreeUnlocks. The
     * requiredSkilltreeLevelsId field corresponds to the database column
     * kalaazu.kalaazu.skilltree_unlocks.required_skilltree_levels_id.
     *
     * @return the requiredSkilltreeLevelsId of this SkilltreeUnlocks
     */
    short getRequiredSkilltreeLevelsId();

    /**
     * Sets the id of this SkilltreeUnlocks. The id field corresponds to the
     * database column kalaazu.kalaazu.skilltree_unlocks.id.
     *
     * @param id to set of this SkilltreeUnlocks
     *
     * @return this SkilltreeUnlocks instance
     */
    SkilltreeUnlocks setId(short id);

    /**
     * Sets the upgradeSkilltreeLevelsId of this SkilltreeUnlocks. The
     * upgradeSkilltreeLevelsId field corresponds to the database column
     * kalaazu.kalaazu.skilltree_unlocks.upgrade_skilltree_levels_id.
     *
     * @param upgradeSkilltreeLevelsId to set of this SkilltreeUnlocks
     *
     * @return this SkilltreeUnlocks instance
     */
    SkilltreeUnlocks setUpgradeSkilltreeLevelsId(short upgradeSkilltreeLevelsId);

    /**
     * Sets the requiredSkilltreeLevelsId of this SkilltreeUnlocks. The
     * requiredSkilltreeLevelsId field corresponds to the database column
     * kalaazu.kalaazu.skilltree_unlocks.required_skilltree_levels_id.
     *
     * @param requiredSkilltreeLevelsId to set of this SkilltreeUnlocks
     *
     * @return this SkilltreeUnlocks instance
     */
    SkilltreeUnlocks setRequiredSkilltreeLevelsId(short requiredSkilltreeLevelsId);

    /**
     * Queries the specified manager for the referenced SkilltreeLevels. If no
     * such SkilltreeLevels exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    SkilltreeLevels findUpgradeSkilltreeLevelsId(Manager<SkilltreeLevels> foreignManager);

    /**
     * Queries the specified manager for the referenced SkilltreeLevels. If no
     * such SkilltreeLevels exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    SkilltreeLevels findRequiredSkilltreeLevelsId(Manager<SkilltreeLevels> foreignManager);

    enum Identifier implements ColumnIdentifier<SkilltreeUnlocks> {

        ID("id"),
        UPGRADE_SKILLTREE_LEVELS_ID("upgrade_skilltree_levels_id"),
        REQUIRED_SKILLTREE_LEVELS_ID("required_skilltree_levels_id");

        private final String                            columnId;

        private final TableIdentifier<SkilltreeUnlocks> tableIdentifier;

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
            return "skilltree_unlocks";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<SkilltreeUnlocks> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
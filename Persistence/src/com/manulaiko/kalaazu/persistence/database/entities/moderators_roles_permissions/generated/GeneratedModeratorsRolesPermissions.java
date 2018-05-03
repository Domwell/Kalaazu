package com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles;
import com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.ModeratorsRolesPermissions;
import com.manulaiko.kalaazu.persistence.database.entities.permissions.Permissions;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.OptionalBoolean;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.BooleanField;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.integer.PrimitiveIntegerZeroOneToBooleanMapper;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.ModeratorsRolesPermissions}-interface
 * representing entities of the {@code moderators_roles_permissions}-table in
 * the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedModeratorsRolesPermissions {

    /**
     * This Field corresponds to the {@link ModeratorsRolesPermissions} field
     * that can be obtained using the {@link ModeratorsRolesPermissions#getId()}
     * method.
     */
    ByteField<ModeratorsRolesPermissions, Byte>                            ID                  = ByteField.create(
            Identifier.ID,
            ModeratorsRolesPermissions::getId,
            ModeratorsRolesPermissions::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ModeratorsRolesPermissions} field
     * that can be obtained using the {@link
     * ModeratorsRolesPermissions#getModeratorsRolesId()} method.
     */
    ByteForeignKeyField<ModeratorsRolesPermissions, Byte, ModeratorsRoles> MODERATORS_ROLES_ID = ByteForeignKeyField.create(
            Identifier.MODERATORS_ROLES_ID,
            ModeratorsRolesPermissions::getModeratorsRolesId,
            ModeratorsRolesPermissions::setModeratorsRolesId,
            ModeratorsRoles.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ModeratorsRolesPermissions} field
     * that can be obtained using the {@link
     * ModeratorsRolesPermissions#getPermissionsId()} method.
     */
    ByteForeignKeyField<ModeratorsRolesPermissions, Byte, Permissions>     PERMISSIONS_ID      = ByteForeignKeyField.create(
            Identifier.PERMISSIONS_ID,
            ModeratorsRolesPermissions::getPermissionsId,
            ModeratorsRolesPermissions::setPermissionsId,
            Permissions.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ModeratorsRolesPermissions} field
     * that can be obtained using the {@link
     * ModeratorsRolesPermissions#getIsEnabled()} method.
     */
    BooleanField<ModeratorsRolesPermissions, Integer>                      IS_ENABLED          = BooleanField.create(
            Identifier.IS_ENABLED,
            o -> OptionalUtil.unwrap(o.getIsEnabled()),
            ModeratorsRolesPermissions::setIsEnabled,
            new PrimitiveIntegerZeroOneToBooleanMapper(),
            false
    );

    /**
     * Returns the id of this ModeratorsRolesPermissions. The id field
     * corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.id.
     *
     * @return the id of this ModeratorsRolesPermissions
     */
    Byte getId();

    /**
     * Returns the moderatorsRolesId of this ModeratorsRolesPermissions. The
     * moderatorsRolesId field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.moderators_roles_id.
     *
     * @return the moderatorsRolesId of this ModeratorsRolesPermissions
     */
    byte getModeratorsRolesId();

    /**
     * Returns the permissionsId of this ModeratorsRolesPermissions. The
     * permissionsId field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.permissions_id.
     *
     * @return the permissionsId of this ModeratorsRolesPermissions
     */
    byte getPermissionsId();

    /**
     * Returns the isEnabled of this ModeratorsRolesPermissions. The isEnabled
     * field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.is_enabled.
     *
     * @return the isEnabled of this ModeratorsRolesPermissions
     */
    OptionalBoolean getIsEnabled();

    /**
     * Sets the id of this ModeratorsRolesPermissions. The id field corresponds
     * to the database column kalaazu.kalaazu.moderators_roles_permissions.id.
     *
     * @param id to set of this ModeratorsRolesPermissions
     *
     * @return this ModeratorsRolesPermissions instance
     */
    ModeratorsRolesPermissions setId(byte id);

    /**
     * Sets the moderatorsRolesId of this ModeratorsRolesPermissions. The
     * moderatorsRolesId field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.moderators_roles_id.
     *
     * @param moderatorsRolesId to set of this ModeratorsRolesPermissions
     *
     * @return this ModeratorsRolesPermissions instance
     */
    ModeratorsRolesPermissions setModeratorsRolesId(byte moderatorsRolesId);

    /**
     * Sets the permissionsId of this ModeratorsRolesPermissions. The
     * permissionsId field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.permissions_id.
     *
     * @param permissionsId to set of this ModeratorsRolesPermissions
     *
     * @return this ModeratorsRolesPermissions instance
     */
    ModeratorsRolesPermissions setPermissionsId(byte permissionsId);

    /**
     * Sets the isEnabled of this ModeratorsRolesPermissions. The isEnabled
     * field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles_permissions.is_enabled.
     *
     * @param isEnabled to set of this ModeratorsRolesPermissions
     *
     * @return this ModeratorsRolesPermissions instance
     */
    ModeratorsRolesPermissions setIsEnabled(boolean isEnabled);

    /**
     * Queries the specified manager for the referenced ModeratorsRoles. If no
     * such ModeratorsRoles exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    ModeratorsRoles findModeratorsRolesId(Manager<ModeratorsRoles> foreignManager);

    /**
     * Queries the specified manager for the referenced Permissions. If no such
     * Permissions exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Permissions findPermissionsId(Manager<Permissions> foreignManager);

    enum Identifier implements ColumnIdentifier<ModeratorsRolesPermissions> {

        ID("id"),
        MODERATORS_ROLES_ID("moderators_roles_id"),
        PERMISSIONS_ID("permissions_id"),
        IS_ENABLED("is_enabled");

        private final String                                      columnName;

        private final TableIdentifier<ModeratorsRolesPermissions> tableIdentifier;

        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsName(),
                    getSchemaName(),
                    getTableName()
            );
        }

        @Override
        public String getDbmsName() {
            return "kalaazu";
        }

        @Override
        public String getSchemaName() {
            return "kalaazu";
        }

        @Override
        public String getTableName() {
            return "moderators_roles_permissions";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<ModeratorsRolesPermissions> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
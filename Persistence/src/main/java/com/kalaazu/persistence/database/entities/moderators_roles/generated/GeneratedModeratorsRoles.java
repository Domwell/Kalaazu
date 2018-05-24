package com.kalaazu.persistence.database.entities.moderators_roles.generated;

import com.kalaazu.persistence.database.entities.ModeratorsRoles;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles}-interface
 * representing entities of the {@code moderators_roles}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedModeratorsRoles {

    /**
     * This Field corresponds to the {@link ModeratorsRoles} field that can be
     * obtained using the {@link ModeratorsRoles#getId()} method.
     */
    ByteField<ModeratorsRoles, Byte>             ID                  = ByteField.create(
            Identifier.ID,
            ModeratorsRoles::getId,
            ModeratorsRoles::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ModeratorsRoles} field that can be
     * obtained using the {@link ModeratorsRoles#getName()} method.
     */
    StringField<ModeratorsRoles, String>         NAME                = StringField.create(
            Identifier.NAME,
            ModeratorsRoles::getName,
            ModeratorsRoles::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ModeratorsRoles} field that can be
     * obtained using the {@link ModeratorsRoles#getModeratorsRolesId()} method.
     */
    ComparableField<ModeratorsRoles, Byte, Byte> MODERATORS_ROLES_ID = ComparableField.create(
            Identifier.MODERATORS_ROLES_ID,
            o -> OptionalUtil.unwrap(o.getModeratorsRolesId()),
            ModeratorsRoles::setModeratorsRolesId,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ModeratorsRoles} field that can be
     * obtained using the {@link ModeratorsRoles#getPriority()} method.
     */
    ByteField<ModeratorsRoles, Byte>             PRIORITY            = ByteField.create(
            Identifier.PRIORITY,
            ModeratorsRoles::getPriority,
            ModeratorsRoles::setPriority,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this ModeratorsRoles. The id field corresponds to the
     * database column kalaazu.kalaazu.moderators_roles.id.
     *
     * @return the id of this ModeratorsRoles
     */
    Byte getId();

    /**
     * Returns the name of this ModeratorsRoles. The name field corresponds to
     * the database column kalaazu.kalaazu.moderators_roles.name.
     *
     * @return the name of this ModeratorsRoles
     */
    String getName();

    /**
     * Returns the moderatorsRolesId of this ModeratorsRoles. The
     * moderatorsRolesId field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles.moderators_roles_id.
     *
     * @return the moderatorsRolesId of this ModeratorsRoles
     */
    Optional<Byte> getModeratorsRolesId();

    /**
     * Returns the priority of this ModeratorsRoles. The priority field
     * corresponds to the database column
     * kalaazu.kalaazu.moderators_roles.priority.
     *
     * @return the priority of this ModeratorsRoles
     */
    byte getPriority();

    /**
     * Sets the id of this ModeratorsRoles. The id field corresponds to the
     * database column kalaazu.kalaazu.moderators_roles.id.
     *
     * @param id to set of this ModeratorsRoles
     *
     * @return this ModeratorsRoles instance
     */
    ModeratorsRoles setId(byte id);

    /**
     * Sets the name of this ModeratorsRoles. The name field corresponds to the
     * database column kalaazu.kalaazu.moderators_roles.name.
     *
     * @param name to set of this ModeratorsRoles
     *
     * @return this ModeratorsRoles instance
     */
    ModeratorsRoles setName(String name);

    /**
     * Sets the moderatorsRolesId of this ModeratorsRoles. The moderatorsRolesId
     * field corresponds to the database column
     * kalaazu.kalaazu.moderators_roles.moderators_roles_id.
     *
     * @param moderatorsRolesId to set of this ModeratorsRoles
     *
     * @return this ModeratorsRoles instance
     */
    ModeratorsRoles setModeratorsRolesId(Byte moderatorsRolesId);

    /**
     * Sets the priority of this ModeratorsRoles. The priority field corresponds
     * to the database column kalaazu.kalaazu.moderators_roles.priority.
     *
     * @param priority to set of this ModeratorsRoles
     *
     * @return this ModeratorsRoles instance
     */
    ModeratorsRoles setPriority(byte priority);

    enum Identifier implements ColumnIdentifier<ModeratorsRoles> {

        ID("id"),
        NAME("name"),
        MODERATORS_ROLES_ID("moderators_roles_id"),
        PRIORITY("priority");

        private final String                           columnId;

        private final TableIdentifier<ModeratorsRoles> tableIdentifier;

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
            return "moderators_roles";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<ModeratorsRoles> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
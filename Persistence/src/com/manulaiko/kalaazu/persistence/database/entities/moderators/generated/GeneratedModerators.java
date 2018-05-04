package com.manulaiko.kalaazu.persistence.database.entities.moderators.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.Moderators;
import com.manulaiko.kalaazu.persistence.database.entities.ModeratorsRoles;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * Moderators}-interface
 * representing entities of the {@code moderators}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedModerators {

    /**
     * This Field corresponds to the {@link Moderators} field that can be
     * obtained using the {@link Moderators#getId()} method.
     */
    ByteField<Moderators, Byte>                            ID                  = ByteField.create(
            Identifier.ID,
            Moderators::getId,
            Moderators::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Moderators} field that can be
     * obtained using the {@link Moderators#getAccountsId()} method.
     */
    IntForeignKeyField<Moderators, Integer, Accounts>      ACCOUNTS_ID         = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            Moderators::getAccountsId,
            Moderators::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Moderators} field that can be
     * obtained using the {@link Moderators#getModeratorsRolesId()} method.
     */
    ByteForeignKeyField<Moderators, Byte, ModeratorsRoles> MODERATORS_ROLES_ID = ByteForeignKeyField.create(
            Identifier.MODERATORS_ROLES_ID,
            Moderators::getModeratorsRolesId,
            Moderators::setModeratorsRolesId,
            ModeratorsRoles.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Moderators} field that can be
     * obtained using the {@link Moderators#getDate()} method.
     */
    ComparableField<Moderators, Timestamp, Timestamp>      DATE                = ComparableField.create(
            Identifier.DATE,
            Moderators::getDate,
            Moderators::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this Moderators. The id field corresponds to the
     * database column kalaazu.kalaazu.moderators.id.
     *
     * @return the id of this Moderators
     */
    Byte getId();

    /**
     * Returns the accountsId of this Moderators. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.moderators.accounts_id.
     *
     * @return the accountsId of this Moderators
     */
    int getAccountsId();

    /**
     * Returns the moderatorsRolesId of this Moderators. The moderatorsRolesId
     * field corresponds to the database column
     * kalaazu.kalaazu.moderators.moderators_roles_id.
     *
     * @return the moderatorsRolesId of this Moderators
     */
    byte getModeratorsRolesId();

    /**
     * Returns the date of this Moderators. The date field corresponds to the
     * database column kalaazu.kalaazu.moderators.date.
     *
     * @return the date of this Moderators
     */
    Timestamp getDate();

    /**
     * Sets the id of this Moderators. The id field corresponds to the database
     * column kalaazu.kalaazu.moderators.id.
     *
     * @param id to set of this Moderators
     *
     * @return this Moderators instance
     */
    Moderators setId(byte id);

    /**
     * Sets the accountsId of this Moderators. The accountsId field corresponds
     * to the database column kalaazu.kalaazu.moderators.accounts_id.
     *
     * @param accountsId to set of this Moderators
     *
     * @return this Moderators instance
     */
    Moderators setAccountsId(int accountsId);

    /**
     * Sets the moderatorsRolesId of this Moderators. The moderatorsRolesId
     * field corresponds to the database column
     * kalaazu.kalaazu.moderators.moderators_roles_id.
     *
     * @param moderatorsRolesId to set of this Moderators
     *
     * @return this Moderators instance
     */
    Moderators setModeratorsRolesId(byte moderatorsRolesId);

    /**
     * Sets the date of this Moderators. The date field corresponds to the
     * database column kalaazu.kalaazu.moderators.date.
     *
     * @param date to set of this Moderators
     *
     * @return this Moderators instance
     */
    Moderators setDate(Timestamp date);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

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

    enum Identifier implements ColumnIdentifier<Moderators> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        MODERATORS_ROLES_ID("moderators_roles_id"),
        DATE("date");

        private final String                      columnName;

        private final TableIdentifier<Moderators> tableIdentifier;

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
            return "moderators";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<Moderators> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
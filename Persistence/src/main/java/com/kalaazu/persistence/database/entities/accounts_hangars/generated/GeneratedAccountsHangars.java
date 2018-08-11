package com.kalaazu.persistence.database.entities.accounts_hangars.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsHangars;
import com.kalaazu.persistence.database.entities.AccountsShips;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.*;
import com.speedment.runtime.field.method.ReferenceSetter;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * AccountsHangars}-interface
 * representing entities of the {@code accounts_hangars}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsHangars {

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#id()} method.
     */
    IntField<AccountsHangars, Integer> ID = IntField.create(
            Identifier.ID,
            AccountsHangars::id,
            AccountsHangars::id,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#accountsId()} method.
     */
    IntForeignKeyField<AccountsHangars, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsHangars::accountsId,
            AccountsHangars::accountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#accountsShipsId()} method.
     */
    ComparableForeignKeyField<AccountsHangars, Integer, Integer, AccountsShips> ACCOUNTS_SHIPS_ID = ComparableForeignKeyField.create(
            Identifier.ACCOUNTS_SHIPS_ID,
            o -> OptionalUtil.unwrap(o.accountsShipsId()),
            AccountsHangars::accountsShipsId,
            AccountsShips.ID,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#accountsConfigurationsId()}
     * method.
     */
    ComparableField<AccountsHangars, Integer, Integer> ACCOUNTS_CONFIGURATIONS_ID = ComparableField.create(
            Identifier.ACCOUNTS_CONFIGURATIONS_ID,
            o -> OptionalUtil.unwrap(o.accountsConfigurationsId()),
            (ReferenceSetter<AccountsHangars, Integer>) AccountsHangars::accountsConfigurationsId,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#name()} method.
     */
    StringField<AccountsHangars, String> NAME = StringField.create(
            Identifier.NAME,
            AccountsHangars::name,
            AccountsHangars::name,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#priority()} method.
     */
    ComparableField<AccountsHangars, Byte, Byte> PRIORITY = ComparableField.create(
            Identifier.PRIORITY,
            o -> OptionalUtil.unwrap(o.priority()),
            (ReferenceSetter<AccountsHangars, Byte>) AccountsHangars::priority,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#date()} method.
     */
    ComparableField<AccountsHangars, Timestamp, Timestamp> DATE = ComparableField.create(
            Identifier.DATE,
            AccountsHangars::date,
            (ReferenceSetter<AccountsHangars, Timestamp>) AccountsHangars::date,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this AccountsHangars. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.id.
     *
     * @return the id of this AccountsHangars
     */
    Integer id();

    /**
     * Returns the accountsId of this AccountsHangars. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_id.
     *
     * @return the accountsId of this AccountsHangars
     */
    int accountsId();

    /**
     * Returns the accountsShipsId of this AccountsHangars. The accountsShipsId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_ships_id.
     *
     * @return the accountsShipsId of this AccountsHangars
     */
    OptionalInt accountsShipsId();

    /**
     * Returns the accountsConfigurationsId of this AccountsHangars. The
     * accountsConfigurationsId field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_configurations_id.
     *
     * @return the accountsConfigurationsId of this AccountsHangars
     */
    OptionalInt accountsConfigurationsId();

    /**
     * Returns the name of this AccountsHangars. The name field corresponds to
     * the database column kalaazu.kalaazu.accounts_hangars.name.
     *
     * @return the name of this AccountsHangars
     */
    String name();

    /**
     * Returns the priority of this AccountsHangars. The priority field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.priority.
     *
     * @return the priority of this AccountsHangars
     */
    Optional<Byte> priority();

    /**
     * Returns the date of this AccountsHangars. The date field corresponds to
     * the database column kalaazu.kalaazu.accounts_hangars.date.
     *
     * @return the date of this AccountsHangars
     */
    Timestamp date();

    /**
     * s the id of this AccountsHangars. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.id.
     *
     * @param id to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars id(Integer id);

    /**
     * s the accountsId of this AccountsHangars. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_id.
     *
     * @param accountsId to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars accountsId(int accountsId);

    /**
     * s the accountsShipsId of this AccountsHangars. The accountsShipsId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_ships_id.
     *
     * @param accountsShipsId to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars accountsShipsId(Integer accountsShipsId);

    /**
     * s the accountsConfigurationsId of this AccountsHangars. The
     * accountsConfigurationsId field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_configurations_id.
     *
     * @param accountsConfigurationsId to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars accountsConfigurationsId(Integer accountsConfigurationsId);

    /**
     * s the name of this AccountsHangars. The name field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.name.
     *
     * @param name to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars name(String name);

    /**
     * s the priority of this AccountsHangars. The priority field corresponds
     * to the database column kalaazu.kalaazu.accounts_hangars.priority.
     *
     * @param priority to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars priority(Byte priority);

    /**
     * s the date of this AccountsHangars. The date field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.date.
     *
     * @param date to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars date(Timestamp date);

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
     * Queries the specified manager for the referenced AccountsShips. If no
     * such AccountsShips exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Optional<AccountsShips> findAccountsShipsId(Manager<AccountsShips> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsHangars> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        ACCOUNTS_SHIPS_ID("accounts_ships_id"),
        ACCOUNTS_CONFIGURATIONS_ID("accounts_configurations_id"),
        NAME("name"),
        PRIORITY("priority"),
        DATE("date");

        private final String columnName;

        private final TableIdentifier<AccountsHangars> tableIdentifier;

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
            return "accounts_hangars";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsHangars> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
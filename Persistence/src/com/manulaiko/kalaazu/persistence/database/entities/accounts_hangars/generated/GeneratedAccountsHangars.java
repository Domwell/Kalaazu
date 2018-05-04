package com.manulaiko.kalaazu.persistence.database.entities.accounts_hangars.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.AccountsHangars;
import com.manulaiko.kalaazu.persistence.database.entities.AccountsShips;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.*;
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
     * obtained using the {@link AccountsHangars#getId()} method.
     */
    IntField<AccountsHangars, Integer>                                          ID                         = IntField.create(
            Identifier.ID,
            AccountsHangars::getId,
            AccountsHangars::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsHangars, Integer, Accounts>                      ACCOUNTS_ID                = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsHangars::getAccountsId,
            AccountsHangars::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#getAccountsShipsId()} method.
     */
    ComparableForeignKeyField<AccountsHangars, Integer, Integer, AccountsShips> ACCOUNTS_SHIPS_ID          = ComparableForeignKeyField.create(
            Identifier.ACCOUNTS_SHIPS_ID,
            o -> OptionalUtil.unwrap(o.getAccountsShipsId()),
            AccountsHangars::setAccountsShipsId,
            AccountsShips.ID,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#getAccountsConfigurationsId()}
     * method.
     */
    ComparableField<AccountsHangars, Integer, Integer>                          ACCOUNTS_CONFIGURATIONS_ID = ComparableField.create(
            Identifier.ACCOUNTS_CONFIGURATIONS_ID,
            o -> OptionalUtil.unwrap(o.getAccountsConfigurationsId()),
            AccountsHangars::setAccountsConfigurationsId,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#getName()} method.
     */
    StringField<AccountsHangars, String>                                        NAME                       = StringField.create(
            Identifier.NAME,
            AccountsHangars::getName,
            AccountsHangars::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#getPriority()} method.
     */
    ComparableField<AccountsHangars, Byte, Byte>                                PRIORITY                   = ComparableField.create(
            Identifier.PRIORITY,
            o -> OptionalUtil.unwrap(o.getPriority()),
            AccountsHangars::setPriority,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHangars} field that can be
     * obtained using the {@link AccountsHangars#getDate()} method.
     */
    ComparableField<AccountsHangars, Timestamp, Timestamp>                      DATE                       = ComparableField.create(
            Identifier.DATE,
            AccountsHangars::getDate,
            AccountsHangars::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this AccountsHangars. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.id.
     *
     * @return the id of this AccountsHangars
     */
    Integer getId();

    /**
     * Returns the accountsId of this AccountsHangars. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_id.
     *
     * @return the accountsId of this AccountsHangars
     */
    int getAccountsId();

    /**
     * Returns the accountsShipsId of this AccountsHangars. The accountsShipsId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_ships_id.
     *
     * @return the accountsShipsId of this AccountsHangars
     */
    OptionalInt getAccountsShipsId();

    /**
     * Returns the accountsConfigurationsId of this AccountsHangars. The
     * accountsConfigurationsId field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_configurations_id.
     *
     * @return the accountsConfigurationsId of this AccountsHangars
     */
    OptionalInt getAccountsConfigurationsId();

    /**
     * Returns the name of this AccountsHangars. The name field corresponds to
     * the database column kalaazu.kalaazu.accounts_hangars.name.
     *
     * @return the name of this AccountsHangars
     */
    String getName();

    /**
     * Returns the priority of this AccountsHangars. The priority field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.priority.
     *
     * @return the priority of this AccountsHangars
     */
    Optional<Byte> getPriority();

    /**
     * Returns the date of this AccountsHangars. The date field corresponds to
     * the database column kalaazu.kalaazu.accounts_hangars.date.
     *
     * @return the date of this AccountsHangars
     */
    Timestamp getDate();

    /**
     * Sets the id of this AccountsHangars. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.id.
     *
     * @param id to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setId(int id);

    /**
     * Sets the accountsId of this AccountsHangars. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_id.
     *
     * @param accountsId to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setAccountsId(int accountsId);

    /**
     * Sets the accountsShipsId of this AccountsHangars. The accountsShipsId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_ships_id.
     *
     * @param accountsShipsId to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setAccountsShipsId(Integer accountsShipsId);

    /**
     * Sets the accountsConfigurationsId of this AccountsHangars. The
     * accountsConfigurationsId field corresponds to the database column
     * kalaazu.kalaazu.accounts_hangars.accounts_configurations_id.
     *
     * @param accountsConfigurationsId to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setAccountsConfigurationsId(Integer accountsConfigurationsId);

    /**
     * Sets the name of this AccountsHangars. The name field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.name.
     *
     * @param name to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setName(String name);

    /**
     * Sets the priority of this AccountsHangars. The priority field corresponds
     * to the database column kalaazu.kalaazu.accounts_hangars.priority.
     *
     * @param priority to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setPriority(Byte priority);

    /**
     * Sets the date of this AccountsHangars. The date field corresponds to the
     * database column kalaazu.kalaazu.accounts_hangars.date.
     *
     * @param date to set of this AccountsHangars
     *
     * @return this AccountsHangars instance
     */
    AccountsHangars setDate(Timestamp date);

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

        private final String                           columnName;

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
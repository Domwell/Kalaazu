package com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactory_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactory_items.AccountsTechfactoryItems;
import com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItems;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactory_items.AccountsTechfactoryItems}-interface
 * representing entities of the {@code accounts_techfactory_items}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsTechfactoryItems {

    /**
     * This Field corresponds to the {@link AccountsTechfactoryItems} field that
     * can be obtained using the {@link AccountsTechfactoryItems#getId()}
     * method.
     */
    IntField<AccountsTechfactoryItems, Integer>                           ID                   = IntField.create(
            Identifier.ID,
            AccountsTechfactoryItems::getId,
            AccountsTechfactoryItems::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsTechfactoryItems} field that
     * can be obtained using the {@link
     * AccountsTechfactoryItems#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsTechfactoryItems, Integer, Accounts>       ACCOUNTS_ID          = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsTechfactoryItems::getAccountsId,
            AccountsTechfactoryItems::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsTechfactoryItems} field that
     * can be obtained using the {@link
     * AccountsTechfactoryItems#getTechfactoryItemsId()} method.
     */
    ByteForeignKeyField<AccountsTechfactoryItems, Byte, TechfactoryItems> TECHFACTORY_ITEMS_ID = ByteForeignKeyField.create(
            Identifier.TECHFACTORY_ITEMS_ID,
            AccountsTechfactoryItems::getTechfactoryItemsId,
            AccountsTechfactoryItems::setTechfactoryItemsId,
            TechfactoryItems.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsTechfactoryItems} field that
     * can be obtained using the {@link AccountsTechfactoryItems#getAmount()}
     * method.
     */
    ShortField<AccountsTechfactoryItems, Short>                           AMOUNT               = ShortField.create(
            Identifier.AMOUNT,
            AccountsTechfactoryItems::getAmount,
            AccountsTechfactoryItems::setAmount,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsTechfactoryItems} field that
     * can be obtained using the {@link AccountsTechfactoryItems#getDate()}
     * method.
     */
    ComparableField<AccountsTechfactoryItems, Timestamp, Timestamp>       DATE                 = ComparableField.create(
            Identifier.DATE,
            o -> OptionalUtil.unwrap(o.getDate()),
            AccountsTechfactoryItems::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this AccountsTechfactoryItems. The id field corresponds
     * to the database column kalaazu.kalaazu.accounts_techfactory_items.id.
     *
     * @return the id of this AccountsTechfactoryItems
     */
    int getId();

    /**
     * Returns the accountsId of this AccountsTechfactoryItems. The accountsId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.accounts_id.
     *
     * @return the accountsId of this AccountsTechfactoryItems
     */
    int getAccountsId();

    /**
     * Returns the techfactoryItemsId of this AccountsTechfactoryItems. The
     * techfactoryItemsId field corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.techfactory_items_id.
     *
     * @return the techfactoryItemsId of this AccountsTechfactoryItems
     */
    byte getTechfactoryItemsId();

    /**
     * Returns the amount of this AccountsTechfactoryItems. The amount field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.amount.
     *
     * @return the amount of this AccountsTechfactoryItems
     */
    short getAmount();

    /**
     * Returns the date of this AccountsTechfactoryItems. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.date.
     *
     * @return the date of this AccountsTechfactoryItems
     */
    Optional<Timestamp> getDate();

    /**
     * Sets the id of this AccountsTechfactoryItems. The id field corresponds to
     * the database column kalaazu.kalaazu.accounts_techfactory_items.id.
     *
     * @param id to set of this AccountsTechfactoryItems
     *
     * @return this AccountsTechfactoryItems instance
     */
    AccountsTechfactoryItems setId(int id);

    /**
     * Sets the accountsId of this AccountsTechfactoryItems. The accountsId
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.accounts_id.
     *
     * @param accountsId to set of this AccountsTechfactoryItems
     *
     * @return this AccountsTechfactoryItems instance
     */
    AccountsTechfactoryItems setAccountsId(int accountsId);

    /**
     * Sets the techfactoryItemsId of this AccountsTechfactoryItems. The
     * techfactoryItemsId field corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.techfactory_items_id.
     *
     * @param techfactoryItemsId to set of this AccountsTechfactoryItems
     *
     * @return this AccountsTechfactoryItems instance
     */
    AccountsTechfactoryItems setTechfactoryItemsId(byte techfactoryItemsId);

    /**
     * Sets the amount of this AccountsTechfactoryItems. The amount field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.amount.
     *
     * @param amount to set of this AccountsTechfactoryItems
     *
     * @return this AccountsTechfactoryItems instance
     */
    AccountsTechfactoryItems setAmount(short amount);

    /**
     * Sets the date of this AccountsTechfactoryItems. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_techfactory_items.date.
     *
     * @param date to set of this AccountsTechfactoryItems
     *
     * @return this AccountsTechfactoryItems instance
     */
    AccountsTechfactoryItems setDate(Timestamp date);

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
     * Queries the specified manager for the referenced TechfactoryItems. If no
     * such TechfactoryItems exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    TechfactoryItems findTechfactoryItemsId(Manager<TechfactoryItems> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsTechfactoryItems> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        TECHFACTORY_ITEMS_ID("techfactory_items_id"),
        AMOUNT("amount"),
        DATE("date");

        private final String                                    columnName;

        private final TableIdentifier<AccountsTechfactoryItems> tableIdentifier;

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
            return "accounts_techfactory_items";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsTechfactoryItems> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
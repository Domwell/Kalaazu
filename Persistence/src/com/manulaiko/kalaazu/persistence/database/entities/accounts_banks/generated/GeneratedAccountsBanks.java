package com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.AccountsBanks;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.AccountsBanks}-interface
 * representing entities of the {@code accounts_banks}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsBanks {

    /**
     * This Field corresponds to the {@link AccountsBanks} field that can be
     * obtained using the {@link AccountsBanks#getId()} method.
     */
    IntField<AccountsBanks, Integer>                     ID          = IntField.create(
            Identifier.ID,
            AccountsBanks::getId,
            AccountsBanks::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsBanks} field that can be
     * obtained using the {@link AccountsBanks#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsBanks, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsBanks::getAccountsId,
            AccountsBanks::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsBanks} field that can be
     * obtained using the {@link AccountsBanks#getCredits()} method.
     */
    LongField<AccountsBanks, Long>                       CREDITS     = LongField.create(
            Identifier.CREDITS,
            AccountsBanks::getCredits,
            AccountsBanks::setCredits,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsBanks} field that can be
     * obtained using the {@link AccountsBanks#getUridium()} method.
     */
    LongField<AccountsBanks, Long>                       URIDIUM     = LongField.create(
            Identifier.URIDIUM,
            AccountsBanks::getUridium,
            AccountsBanks::setUridium,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsBanks} field that can be
     * obtained using the {@link AccountsBanks#getTaxCredits()} method.
     */
    ByteField<AccountsBanks, Byte>                       TAX_CREDITS = ByteField.create(
            Identifier.TAX_CREDITS,
            AccountsBanks::getTaxCredits,
            AccountsBanks::setTaxCredits,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsBanks} field that can be
     * obtained using the {@link AccountsBanks#getTaxUridium()} method.
     */
    ByteField<AccountsBanks, Byte>                       TAX_URIDIUM = ByteField.create(
            Identifier.TAX_URIDIUM,
            AccountsBanks::getTaxUridium,
            AccountsBanks::setTaxUridium,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this AccountsBanks. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_banks.id.
     *
     * @return the id of this AccountsBanks
     */
    int getId();

    /**
     * Returns the accountsId of this AccountsBanks. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_banks.accounts_id.
     *
     * @return the accountsId of this AccountsBanks
     */
    int getAccountsId();

    /**
     * Returns the credits of this AccountsBanks. The credits field corresponds
     * to the database column kalaazu.kalaazu.accounts_banks.credits.
     *
     * @return the credits of this AccountsBanks
     */
    long getCredits();

    /**
     * Returns the uridium of this AccountsBanks. The uridium field corresponds
     * to the database column kalaazu.kalaazu.accounts_banks.uridium.
     *
     * @return the uridium of this AccountsBanks
     */
    long getUridium();

    /**
     * Returns the taxCredits of this AccountsBanks. The taxCredits field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_banks.tax_credits.
     *
     * @return the taxCredits of this AccountsBanks
     */
    byte getTaxCredits();

    /**
     * Returns the taxUridium of this AccountsBanks. The taxUridium field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_banks.tax_uridium.
     *
     * @return the taxUridium of this AccountsBanks
     */
    byte getTaxUridium();

    /**
     * Sets the id of this AccountsBanks. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_banks.id.
     *
     * @param id to set of this AccountsBanks
     *
     * @return this AccountsBanks instance
     */
    AccountsBanks setId(int id);

    /**
     * Sets the accountsId of this AccountsBanks. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_banks.accounts_id.
     *
     * @param accountsId to set of this AccountsBanks
     *
     * @return this AccountsBanks instance
     */
    AccountsBanks setAccountsId(int accountsId);

    /**
     * Sets the credits of this AccountsBanks. The credits field corresponds to
     * the database column kalaazu.kalaazu.accounts_banks.credits.
     *
     * @param credits to set of this AccountsBanks
     *
     * @return this AccountsBanks instance
     */
    AccountsBanks setCredits(long credits);

    /**
     * Sets the uridium of this AccountsBanks. The uridium field corresponds to
     * the database column kalaazu.kalaazu.accounts_banks.uridium.
     *
     * @param uridium to set of this AccountsBanks
     *
     * @return this AccountsBanks instance
     */
    AccountsBanks setUridium(long uridium);

    /**
     * Sets the taxCredits of this AccountsBanks. The taxCredits field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_banks.tax_credits.
     *
     * @param taxCredits to set of this AccountsBanks
     *
     * @return this AccountsBanks instance
     */
    AccountsBanks setTaxCredits(byte taxCredits);

    /**
     * Sets the taxUridium of this AccountsBanks. The taxUridium field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_banks.tax_uridium.
     *
     * @param taxUridium to set of this AccountsBanks
     *
     * @return this AccountsBanks instance
     */
    AccountsBanks setTaxUridium(byte taxUridium);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsBanks> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        CREDITS("credits"),
        URIDIUM("uridium"),
        TAX_CREDITS("tax_credits"),
        TAX_URIDIUM("tax_uridium");

        private final String                         columnName;

        private final TableIdentifier<AccountsBanks> tableIdentifier;

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
            return "accounts_banks";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsBanks> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
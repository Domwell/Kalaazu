package com.manulaiko.kalaazu.persistence.database.entities.accounts_history.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.AccountsHistory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * AccountsHistory}-interface
 * representing entities of the {@code accounts_history}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsHistory {

    /**
     * This Field corresponds to the {@link AccountsHistory} field that can be
     * obtained using the {@link AccountsHistory#getId()} method.
     */
    IntField<AccountsHistory, Integer>                     ID          = IntField.create(
            Identifier.ID,
            AccountsHistory::getId,
            AccountsHistory::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsHistory} field that can be
     * obtained using the {@link AccountsHistory#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsHistory, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsHistory::getAccountsId,
            AccountsHistory::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsHistory} field that can be
     * obtained using the {@link AccountsHistory#getType()} method.
     */
    ByteField<AccountsHistory, Byte>                       TYPE        = ByteField.create(
            Identifier.TYPE,
            AccountsHistory::getType,
            AccountsHistory::setType,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHistory} field that can be
     * obtained using the {@link AccountsHistory#getMessage()} method.
     */
    StringField<AccountsHistory, String>                   MESSAGE     = StringField.create(
            Identifier.MESSAGE,
            AccountsHistory::getMessage,
            AccountsHistory::setMessage,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHistory} field that can be
     * obtained using the {@link AccountsHistory#getAmount()} method.
     */
    IntField<AccountsHistory, Integer>                     AMOUNT      = IntField.create(
            Identifier.AMOUNT,
            AccountsHistory::getAmount,
            AccountsHistory::setAmount,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsHistory} field that can be
     * obtained using the {@link AccountsHistory#getDate()} method.
     */
    ComparableField<AccountsHistory, Timestamp, Timestamp> DATE        = ComparableField.create(
            Identifier.DATE,
            AccountsHistory::getDate,
            AccountsHistory::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this AccountsHistory. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_history.id.
     *
     * @return the id of this AccountsHistory
     */
    Integer getId();

    /**
     * Returns the accountsId of this AccountsHistory. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_history.accounts_id.
     *
     * @return the accountsId of this AccountsHistory
     */
    int getAccountsId();

    /**
     * Returns the type of this AccountsHistory. The type field corresponds to
     * the database column kalaazu.kalaazu.accounts_history.type.
     *
     * @return the type of this AccountsHistory
     */
    byte getType();

    /**
     * Returns the message of this AccountsHistory. The message field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_history.message.
     *
     * @return the message of this AccountsHistory
     */
    String getMessage();

    /**
     * Returns the amount of this AccountsHistory. The amount field corresponds
     * to the database column kalaazu.kalaazu.accounts_history.amount.
     *
     * @return the amount of this AccountsHistory
     */
    int getAmount();

    /**
     * Returns the date of this AccountsHistory. The date field corresponds to
     * the database column kalaazu.kalaazu.accounts_history.date.
     *
     * @return the date of this AccountsHistory
     */
    Timestamp getDate();

    /**
     * Sets the id of this AccountsHistory. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_history.id.
     *
     * @param id to set of this AccountsHistory
     *
     * @return this AccountsHistory instance
     */
    AccountsHistory setId(int id);

    /**
     * Sets the accountsId of this AccountsHistory. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_history.accounts_id.
     *
     * @param accountsId to set of this AccountsHistory
     *
     * @return this AccountsHistory instance
     */
    AccountsHistory setAccountsId(int accountsId);

    /**
     * Sets the type of this AccountsHistory. The type field corresponds to the
     * database column kalaazu.kalaazu.accounts_history.type.
     *
     * @param type to set of this AccountsHistory
     *
     * @return this AccountsHistory instance
     */
    AccountsHistory setType(byte type);

    /**
     * Sets the message of this AccountsHistory. The message field corresponds
     * to the database column kalaazu.kalaazu.accounts_history.message.
     *
     * @param message to set of this AccountsHistory
     *
     * @return this AccountsHistory instance
     */
    AccountsHistory setMessage(String message);

    /**
     * Sets the amount of this AccountsHistory. The amount field corresponds to
     * the database column kalaazu.kalaazu.accounts_history.amount.
     *
     * @param amount to set of this AccountsHistory
     *
     * @return this AccountsHistory instance
     */
    AccountsHistory setAmount(int amount);

    /**
     * Sets the date of this AccountsHistory. The date field corresponds to the
     * database column kalaazu.kalaazu.accounts_history.date.
     *
     * @param date to set of this AccountsHistory
     *
     * @return this AccountsHistory instance
     */
    AccountsHistory setDate(Timestamp date);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsHistory> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        TYPE("type"),
        MESSAGE("message"),
        AMOUNT("amount"),
        DATE("date");

        private final String                           columnName;

        private final TableIdentifier<AccountsHistory> tableIdentifier;

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
            return "accounts_history";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsHistory> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
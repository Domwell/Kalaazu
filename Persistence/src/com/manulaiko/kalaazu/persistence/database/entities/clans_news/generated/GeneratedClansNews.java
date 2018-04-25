package com.manulaiko.kalaazu.persistence.database.entities.clans_news.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.clans.Clans;
import com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNews;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNews}-interface
 * representing entities of the {@code clans_news}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansNews {

    /**
     * This Field corresponds to the {@link ClansNews} field that can be
     * obtained using the {@link ClansNews#getId()} method.
     */
    IntField<ClansNews, Integer>                     ID          = IntField.create(
            Identifier.ID,
            ClansNews::getId,
            ClansNews::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ClansNews} field that can be
     * obtained using the {@link ClansNews#getAccountsId()} method.
     */
    IntForeignKeyField<ClansNews, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            ClansNews::getAccountsId,
            ClansNews::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansNews} field that can be
     * obtained using the {@link ClansNews#getClansId()} method.
     */
    IntForeignKeyField<ClansNews, Integer, Clans>    CLANS_ID    = IntForeignKeyField.create(
            Identifier.CLANS_ID,
            ClansNews::getClansId,
            ClansNews::setClansId,
            Clans.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansNews} field that can be
     * obtained using the {@link ClansNews#getDate()} method.
     */
    ComparableField<ClansNews, Timestamp, Timestamp> DATE        = ComparableField.create(
            Identifier.DATE,
            ClansNews::getDate,
            ClansNews::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansNews} field that can be
     * obtained using the {@link ClansNews#getText()} method.
     */
    StringField<ClansNews, String>                   TEXT        = StringField.create(
            Identifier.TEXT,
            ClansNews::getText,
            ClansNews::setText,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this ClansNews. The id field corresponds to the
     * database column kalaazu.kalaazu.clans_news.id.
     *
     * @return the id of this ClansNews
     */
    int getId();

    /**
     * Returns the accountsId of this ClansNews. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_news.accounts_id.
     *
     * @return the accountsId of this ClansNews
     */
    int getAccountsId();

    /**
     * Returns the clansId of this ClansNews. The clansId field corresponds to
     * the database column kalaazu.kalaazu.clans_news.clans_id.
     *
     * @return the clansId of this ClansNews
     */
    int getClansId();

    /**
     * Returns the date of this ClansNews. The date field corresponds to the
     * database column kalaazu.kalaazu.clans_news.date.
     *
     * @return the date of this ClansNews
     */
    Timestamp getDate();

    /**
     * Returns the text of this ClansNews. The text field corresponds to the
     * database column kalaazu.kalaazu.clans_news.text.
     *
     * @return the text of this ClansNews
     */
    String getText();

    /**
     * Sets the id of this ClansNews. The id field corresponds to the database
     * column kalaazu.kalaazu.clans_news.id.
     *
     * @param id to set of this ClansNews
     *
     * @return this ClansNews instance
     */
    ClansNews setId(int id);

    /**
     * Sets the accountsId of this ClansNews. The accountsId field corresponds
     * to the database column kalaazu.kalaazu.clans_news.accounts_id.
     *
     * @param accountsId to set of this ClansNews
     *
     * @return this ClansNews instance
     */
    ClansNews setAccountsId(int accountsId);

    /**
     * Sets the clansId of this ClansNews. The clansId field corresponds to the
     * database column kalaazu.kalaazu.clans_news.clans_id.
     *
     * @param clansId to set of this ClansNews
     *
     * @return this ClansNews instance
     */
    ClansNews setClansId(int clansId);

    /**
     * Sets the date of this ClansNews. The date field corresponds to the
     * database column kalaazu.kalaazu.clans_news.date.
     *
     * @param date to set of this ClansNews
     *
     * @return this ClansNews instance
     */
    ClansNews setDate(Timestamp date);

    /**
     * Sets the text of this ClansNews. The text field corresponds to the
     * database column kalaazu.kalaazu.clans_news.text.
     *
     * @param text to set of this ClansNews
     *
     * @return this ClansNews instance
     */
    ClansNews setText(String text);

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
     * Queries the specified manager for the referenced Clans. If no such Clans
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Clans findClansId(Manager<Clans> foreignManager);

    enum Identifier implements ColumnIdentifier<ClansNews> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        CLANS_ID("clans_id"),
        DATE("date"),
        TEXT("text");

        private final String                     columnName;

        private final TableIdentifier<ClansNews> tableIdentifier;

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
            return "clans_news";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<ClansNews> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
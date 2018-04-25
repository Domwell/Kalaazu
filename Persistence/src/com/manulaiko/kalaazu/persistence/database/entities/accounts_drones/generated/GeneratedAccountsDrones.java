package com.manulaiko.kalaazu.persistence.database.entities.accounts_drones.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_drones.AccountsDrones;
import com.manulaiko.kalaazu.persistence.database.entities.levels.Levels;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_drones.AccountsDrones}-interface
 * representing entities of the {@code accounts_drones}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsDrones {

    /**
     * This Field corresponds to the {@link AccountsDrones} field that can be
     * obtained using the {@link AccountsDrones#getId()} method.
     */
    IntField<AccountsDrones, Integer>                     ID          = IntField.create(
            Identifier.ID,
            AccountsDrones::getId,
            AccountsDrones::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsDrones} field that can be
     * obtained using the {@link AccountsDrones#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsDrones, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsDrones::getAccountsId,
            AccountsDrones::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsDrones} field that can be
     * obtained using the {@link AccountsDrones#getLevelsId()} method.
     */
    ByteForeignKeyField<AccountsDrones, Byte, Levels>     LEVELS_ID   = ByteForeignKeyField.create(
            Identifier.LEVELS_ID,
            AccountsDrones::getLevelsId,
            AccountsDrones::setLevelsId,
            Levels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsDrones} field that can be
     * obtained using the {@link AccountsDrones#getExperience()} method.
     */
    ShortField<AccountsDrones, Short>                     EXPERIENCE  = ShortField.create(
            Identifier.EXPERIENCE,
            AccountsDrones::getExperience,
            AccountsDrones::setExperience,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsDrones} field that can be
     * obtained using the {@link AccountsDrones#getDate()} method.
     */
    ComparableField<AccountsDrones, Timestamp, Timestamp> DATE        = ComparableField.create(
            Identifier.DATE,
            AccountsDrones::getDate,
            AccountsDrones::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this AccountsDrones. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_drones.id.
     *
     * @return the id of this AccountsDrones
     */
    int getId();

    /**
     * Returns the accountsId of this AccountsDrones. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_drones.accounts_id.
     *
     * @return the accountsId of this AccountsDrones
     */
    int getAccountsId();

    /**
     * Returns the levelsId of this AccountsDrones. The levelsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_drones.levels_id.
     *
     * @return the levelsId of this AccountsDrones
     */
    byte getLevelsId();

    /**
     * Returns the experience of this AccountsDrones. The experience field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_drones.experience.
     *
     * @return the experience of this AccountsDrones
     */
    short getExperience();

    /**
     * Returns the date of this AccountsDrones. The date field corresponds to
     * the database column kalaazu.kalaazu.accounts_drones.date.
     *
     * @return the date of this AccountsDrones
     */
    Timestamp getDate();

    /**
     * Sets the id of this AccountsDrones. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_drones.id.
     *
     * @param id to set of this AccountsDrones
     *
     * @return this AccountsDrones instance
     */
    AccountsDrones setId(int id);

    /**
     * Sets the accountsId of this AccountsDrones. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_drones.accounts_id.
     *
     * @param accountsId to set of this AccountsDrones
     *
     * @return this AccountsDrones instance
     */
    AccountsDrones setAccountsId(int accountsId);

    /**
     * Sets the levelsId of this AccountsDrones. The levelsId field corresponds
     * to the database column kalaazu.kalaazu.accounts_drones.levels_id.
     *
     * @param levelsId to set of this AccountsDrones
     *
     * @return this AccountsDrones instance
     */
    AccountsDrones setLevelsId(byte levelsId);

    /**
     * Sets the experience of this AccountsDrones. The experience field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_drones.experience.
     *
     * @param experience to set of this AccountsDrones
     *
     * @return this AccountsDrones instance
     */
    AccountsDrones setExperience(short experience);

    /**
     * Sets the date of this AccountsDrones. The date field corresponds to the
     * database column kalaazu.kalaazu.accounts_drones.date.
     *
     * @param date to set of this AccountsDrones
     *
     * @return this AccountsDrones instance
     */
    AccountsDrones setDate(Timestamp date);

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
     * Queries the specified manager for the referenced Levels. If no such
     * Levels exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Levels findLevelsId(Manager<Levels> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsDrones> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        LEVELS_ID("levels_id"),
        EXPERIENCE("experience"),
        DATE("date");

        private final String                          columnName;

        private final TableIdentifier<AccountsDrones> tableIdentifier;

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
            return "accounts_drones";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsDrones> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
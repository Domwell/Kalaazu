package com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_items.AccountsItems;
import com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations.ClansBattlestations;
import com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_items.ClansBattlestationsItems;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations_items.ClansBattlestationsItems}-interface
 * representing entities of the {@code clans_battlestations_items}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansBattlestationsItems {

    /**
     * This Field corresponds to the {@link ClansBattlestationsItems} field that
     * can be obtained using the {@link ClansBattlestationsItems#getId()}
     * method.
     */
    IntField<ClansBattlestationsItems, Integer>                              ID                      = IntField.create(
            Identifier.ID,
            ClansBattlestationsItems::getId,
            ClansBattlestationsItems::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsItems} field that
     * can be obtained using the {@link
     * ClansBattlestationsItems#getClansBattlestationsId()} method.
     */
    ByteForeignKeyField<ClansBattlestationsItems, Byte, ClansBattlestations> CLANS_BATTLESTATIONS_ID = ByteForeignKeyField.create(
            Identifier.CLANS_BATTLESTATIONS_ID,
            ClansBattlestationsItems::getClansBattlestationsId,
            ClansBattlestationsItems::setClansBattlestationsId,
            ClansBattlestations.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsItems} field that
     * can be obtained using the {@link
     * ClansBattlestationsItems#getAccountsItemsId()} method.
     */
    IntForeignKeyField<ClansBattlestationsItems, Integer, AccountsItems>     ACCOUNTS_ITEMS_ID       = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ITEMS_ID,
            ClansBattlestationsItems::getAccountsItemsId,
            ClansBattlestationsItems::setAccountsItemsId,
            AccountsItems.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsItems} field that
     * can be obtained using the {@link ClansBattlestationsItems#getSlot()}
     * method.
     */
    ByteField<ClansBattlestationsItems, Byte>                                SLOT                    = ByteField.create(
            Identifier.SLOT,
            ClansBattlestationsItems::getSlot,
            ClansBattlestationsItems::setSlot,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestationsItems} field that
     * can be obtained using the {@link ClansBattlestationsItems#getDate()}
     * method.
     */
    ComparableField<ClansBattlestationsItems, Timestamp, Timestamp>          DATE                    = ComparableField.create(
            Identifier.DATE,
            ClansBattlestationsItems::getDate,
            ClansBattlestationsItems::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this ClansBattlestationsItems. The id field corresponds
     * to the database column kalaazu.kalaazu.clans_battlestations_items.id.
     *
     * @return the id of this ClansBattlestationsItems
     */
    int getId();

    /**
     * Returns the clansBattlestationsId of this ClansBattlestationsItems. The
     * clansBattlestationsId field corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.clans_battlestations_id.
     *
     * @return the clansBattlestationsId of this ClansBattlestationsItems
     */
    byte getClansBattlestationsId();

    /**
     * Returns the accountsItemsId of this ClansBattlestationsItems. The
     * accountsItemsId field corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.accounts_items_id.
     *
     * @return the accountsItemsId of this ClansBattlestationsItems
     */
    int getAccountsItemsId();

    /**
     * Returns the slot of this ClansBattlestationsItems. The slot field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.slot.
     *
     * @return the slot of this ClansBattlestationsItems
     */
    byte getSlot();

    /**
     * Returns the date of this ClansBattlestationsItems. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.date.
     *
     * @return the date of this ClansBattlestationsItems
     */
    Timestamp getDate();

    /**
     * Sets the id of this ClansBattlestationsItems. The id field corresponds to
     * the database column kalaazu.kalaazu.clans_battlestations_items.id.
     *
     * @param id to set of this ClansBattlestationsItems
     *
     * @return this ClansBattlestationsItems instance
     */
    ClansBattlestationsItems setId(int id);

    /**
     * Sets the clansBattlestationsId of this ClansBattlestationsItems. The
     * clansBattlestationsId field corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.clans_battlestations_id.
     *
     * @param clansBattlestationsId to set of this ClansBattlestationsItems
     *
     * @return this ClansBattlestationsItems instance
     */
    ClansBattlestationsItems setClansBattlestationsId(byte clansBattlestationsId);

    /**
     * Sets the accountsItemsId of this ClansBattlestationsItems. The
     * accountsItemsId field corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.accounts_items_id.
     *
     * @param accountsItemsId to set of this ClansBattlestationsItems
     *
     * @return this ClansBattlestationsItems instance
     */
    ClansBattlestationsItems setAccountsItemsId(int accountsItemsId);

    /**
     * Sets the slot of this ClansBattlestationsItems. The slot field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.slot.
     *
     * @param slot to set of this ClansBattlestationsItems
     *
     * @return this ClansBattlestationsItems instance
     */
    ClansBattlestationsItems setSlot(byte slot);

    /**
     * Sets the date of this ClansBattlestationsItems. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations_items.date.
     *
     * @param date to set of this ClansBattlestationsItems
     *
     * @return this ClansBattlestationsItems instance
     */
    ClansBattlestationsItems setDate(Timestamp date);

    /**
     * Queries the specified manager for the referenced ClansBattlestations. If
     * no such ClansBattlestations exists, an {@code NullPointerException} will
     * be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    ClansBattlestations findClansBattlestationsId(Manager<ClansBattlestations> foreignManager);

    /**
     * Queries the specified manager for the referenced AccountsItems. If no
     * such AccountsItems exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    AccountsItems findAccountsItemsId(Manager<AccountsItems> foreignManager);

    enum Identifier implements ColumnIdentifier<ClansBattlestationsItems> {

        ID("id"),
        CLANS_BATTLESTATIONS_ID("clans_battlestations_id"),
        ACCOUNTS_ITEMS_ID("accounts_items_id"),
        SLOT("slot"),
        DATE("date");

        private final String                                    columnName;

        private final TableIdentifier<ClansBattlestationsItems> tableIdentifier;

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
            return "clans_battlestations_items";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<ClansBattlestationsItems> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
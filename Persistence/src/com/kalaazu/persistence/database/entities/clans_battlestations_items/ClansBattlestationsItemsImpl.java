package com.kalaazu.persistence.database.entities.clans_battlestations_items;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.AccountsItems;
import com.kalaazu.persistence.database.entities.ClansBattlestations;
import com.kalaazu.persistence.database.entities.ClansBattlestationsItems;
import com.kalaazu.persistence.database.entities.clans_battlestations_items.generated.GeneratedClansBattlestationsItemsImpl;

/**
 * The default implementation of the {@link
 * ClansBattlestationsItems}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class ClansBattlestationsItemsImpl
        extends GeneratedClansBattlestationsItemsImpl
        implements ClansBattlestationsItems {
    /**
     * The battlestation.
     */
    private ClansBattlestations battlestation;

    /**
     * The item.
     */
    private AccountsItems item;

    @Override
    public ClansBattlestations getBattlestation() {
        if (this.battlestation != null) {
            return this.battlestation;
        }

        this.battlestation = super.findClansBattlestationsId(
                Database.getInstance()
                        .getDb()
                        .manager(ClansBattlestations.class)
        );

        return this.battlestation;
    }

    @Override
    public AccountsItems getItem() {
        if (this.item != null) {
            return this.item;
        }

        this.item = super.findAccountsItemsId(
                Database.getInstance()
                        .getDb()
                        .manager(AccountsItems.class)
        );

        return this.item;
    }
}
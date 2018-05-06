package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.clans_banks.generated.GeneratedClansBanks;

import java.util.List;

/**
 * The main interface for entities of the {@code clans_banks}-table in the
 * database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface ClansBanks extends GeneratedClansBanks, Entity<Integer> {
    /**
     * Returns the clan.
     *
     * @return The clan.
     */
    Clans getClan();

    /**
     * Returns the transaction logs.
     *
     * @return Transaction logs.
     */
    List<ClansBanksLogs> getLogs();
}
package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.accounts_drones.generated.GeneratedAccountsDrones;

/**
 * The main interface for entities of the {@code accounts_drones}-table in the
 * database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface AccountsDrones extends GeneratedAccountsDrones, Entity<Integer> {
    /**
     * Returns the account.
     *
     * @return The account.
     */
    Accounts getAccount();

    /**
     * Returns the level.
     *
     * @return The level.
     */
    Levels getLevel();
}
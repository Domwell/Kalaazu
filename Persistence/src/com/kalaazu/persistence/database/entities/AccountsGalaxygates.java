package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.accounts_galaxygates.generated.GeneratedAccountsGalaxygates;

/**
 * The main interface for entities of the {@code accounts_galaxygates}-table in
 * the database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface AccountsGalaxygates extends GeneratedAccountsGalaxygates, Entity<Integer> {
    /**
     * Returns the account.
     *
     * @return The account.
     */
    Accounts getAccount();

    /**
     * Returns the galaxygate.
     *
     * @return The galaxygate.
     */
    Galaxygates getGalaxygate();
}
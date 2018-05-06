package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.accounts_skylabs.generated.GeneratedAccountsSkylabs;

/**
 * The main interface for entities of the {@code accounts_skylabs}-table in the
 * database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface AccountsSkylabs extends GeneratedAccountsSkylabs, Entity<Integer> {
    /**
     * Returns the account.
     *
     * @return The account.
     */
    Accounts getAccount();

    /**
     * Returns the module.
     *
     * @return The module.
     */
    SkylabModules getModule();

    /**
     * Returns the module level.
     *
     * @return Module level.
     */
    Levels getLevel();
}
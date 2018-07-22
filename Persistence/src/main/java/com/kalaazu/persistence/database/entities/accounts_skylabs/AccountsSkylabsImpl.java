package com.kalaazu.persistence.database.entities.accounts_skylabs;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsSkylabs;
import com.kalaazu.persistence.database.entities.Levels;
import com.kalaazu.persistence.database.entities.SkylabModules;
import com.kalaazu.persistence.database.entities.accounts_skylabs.generated.GeneratedAccountsSkylabsImpl;

/**
 * The default implementation of the {@link
 * AccountsSkylabs}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class AccountsSkylabsImpl
        extends GeneratedAccountsSkylabsImpl
        implements AccountsSkylabs {
    /**
     * The account.
     */
    private Accounts account;

    /**
     * The module.
     */
    private SkylabModules module;

    /**
     * The level.
     */
    private Levels level;

    @Override
    public Accounts account() {
        if (this.account != null) {
            return this.account;
        }

        this.account = super.findAccountsId(
                Database.getInstance()
                        .db()
                        .manager(Accounts.class)
        );

        return this.account;
    }

    @Override
    public SkylabModules module() {
        if (this.module != null) {
            return this.module;
        }

        this.module = super.findSkylabModulesId(
                Database.getInstance()
                        .db()
                        .manager(SkylabModules.class)
        );

        return this.module;
    }

    @Override
    public Levels level() {
        if (this.level != null) {
            return this.level;
        }

        this.level = super.findLevelsId(
                Database.getInstance()
                        .db()
                        .manager(Levels.class)
        );

        return this.level;
    }
}
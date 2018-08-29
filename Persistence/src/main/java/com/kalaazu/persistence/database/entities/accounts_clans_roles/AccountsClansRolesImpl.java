package com.kalaazu.persistence.database.entities.accounts_clans_roles;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsClansRoles;
import com.kalaazu.persistence.database.entities.ClansRoles;
import com.kalaazu.persistence.database.entities.accounts_clans_roles.generated.GeneratedAccountsClansRolesImpl;

/**
 * The default implementation of the {@link
 * AccountsClansRoles}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class AccountsClansRolesImpl
        extends GeneratedAccountsClansRolesImpl
        implements AccountsClansRoles {
    /**
     * The account.
     */
    private Accounts account;

    /**
     * The role.
     */
    private ClansRoles role;

    @Override
    public Accounts account() {
        if (this.account != null) {
            return this.account;
        }

        this.account = super.findAccountsId(
                Database.instance()
                        .db()
                        .manager(Accounts.class)
        );

        return this.account;
    }

    @Override
    public ClansRoles role() {
        if (this.role != null) {
            return this.role;
        }

        this.role = super.findClansRolesId(
                Database.instance()
                        .db()
                        .manager(ClansRoles.class)
        );

        return this.role;
    }
}
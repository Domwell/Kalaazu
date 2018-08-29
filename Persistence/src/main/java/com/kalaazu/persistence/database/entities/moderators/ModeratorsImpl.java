package com.kalaazu.persistence.database.entities.moderators;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.Moderators;
import com.kalaazu.persistence.database.entities.ModeratorsLogs;
import com.kalaazu.persistence.database.entities.ModeratorsRoles;
import com.kalaazu.persistence.database.entities.moderators.generated.GeneratedModeratorsImpl;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The default implementation of the {@link
 * Moderators}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class ModeratorsImpl
        extends GeneratedModeratorsImpl
        implements Moderators {
    /**
     * This moderator's logs.
     */
    private List<ModeratorsLogs> logs;

    /**
     * This moderator's account.
     */
    private Accounts account;

    /**
     * This moderator's role.
     */
    private ModeratorsRoles role;

    @Override
    public List<ModeratorsLogs> logs() {
        if (this.logs != null) {
            return this.logs;
        }

        this.logs = Database.instance()
                            .all(ModeratorsLogs.class)
                            .filter(ModeratorsLogs.MODERATORS_ID.equal(super.id()))
                            .collect(Collectors.toList());

        return this.logs;
    }

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
    public ModeratorsRoles role() {
        if (this.role != null) {
            return this.role;
        }

        this.role = super.findModeratorsRolesId(
                Database.instance()
                        .db()
                        .manager(ModeratorsRoles.class)
        );

        return this.role;
    }
}
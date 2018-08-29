package com.kalaazu.persistence.database.entities.accounts;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.*;
import com.kalaazu.persistence.database.entities.accounts.generated.GeneratedAccountsImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The default implementation of the {@link
 * Accounts}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class AccountsImpl
        extends GeneratedAccountsImpl
        implements Accounts {
    /**
     * The user.
     */
    private Users user;

    /**
     * The level.
     */
    private Levels level;

    /**
     * The faction.
     */
    private Optional<Factions> faction;

    /**
     * The active hangar.
     */
    private Optional<AccountsHangars> hangar;

    /**
     * The clan.
     */
    private Optional<Clans> clan;

    /**
     * The rank.
     */
    private Ranks rank;

    /**
     * The clan roles.
     */
    private List<ClansRoles> clanRoles;

    /**
     * The destroy logs.
     */
    private List<AccountsDestroys> destroys;

    /**
     * The drones.
     */
    private List<AccountsDrones> drones;

    /**
     * The galaxygates.
     */
    private List<AccountsGalaxygates> galaxygates;

    /**
     * The hangars.
     */
    private List<AccountsHangars> hangars;

    /**
     * The history logs.
     */
    private List<AccountsHistory> histories;

    /**
     * The items.
     */
    private List<AccountsItems> items;

    /**
     * The messages.
     */
    private List<AccountsMessages> messages;

    /**
     * The pet.
     */
    private Optional<AccountsPets> pet;

    /**
     * The active quests.
     */
    private List<AccountsQuests> quest;

    /**
     * The ranking
     */
    private AccountsRankings ranking;

    /**
     * The ships.
     */
    private List<AccountsShips> ships;

    /**
     * The skills.
     */
    private List<AccountsSkills> skills;

    /**
     * The skylabs.
     */
    private List<AccountsSkylabs> skylabs;

    /**
     * The techfactories.
     */
    private List<AccountsTechfactories> techfactories;

    /**
     * The techfactories items.
     */
    private List<AccountsTechfactoryItems> techfactoryItems;

    /**
     * The clan applications.
     */
    private List<ClansApplications> clanApplications;

    /**
     * The clan messages.
     */
    private List<ClansMessages> clanMessages;

    @Override
    public Users user() {
        if (this.user != null) {
            return this.user;
        }

        this.user = super.findUsersId(
                Database.instance()
                        .db()
                        .manager(Users.class)
        );

        return this.user;
    }

    @Override
    public Levels level() {
        if (this.level != null) {
            return this.level;
        }

        this.level = super.findLevelsId(
                Database.instance()
                        .db()
                        .manager(Levels.class)
        );

        return this.level;
    }

    @Override
    public Optional<Factions> faction() {
        if (this.faction != null) {
            return this.faction;
        }

        this.faction = super.findFactionsId(
                Database.instance()
                        .db()
                        .manager(Factions.class)
        );

        return this.faction;
    }

    @Override
    public Optional<AccountsHangars> hangar() {
        if (this.hangar != null) {
            return this.hangar;
        }

        this.hangar = super.findAccountsHangarsId(
                Database.instance()
                        .db()
                        .manager(AccountsHangars.class)
        );

        return this.hangar;
    }

    @Override
    public Optional<Clans> clan() {
        if (this.clan != null) {
            return this.clan;
        }

        this.clan = super.findClansId(
                Database.instance()
                        .db()
                        .manager(Clans.class)
        );

        return this.clan;
    }

    @Override
    public Ranks rank() {
        if (this.rank != null) {
            return this.rank;
        }

        this.rank = super.findRanksId(
                Database.instance()
                        .db()
                        .manager(Ranks.class)
        );

        return this.rank;
    }

    @Override
    public List<ClansRoles> clanRoles() {
        if (this.clanRoles != null) {
            return this.clanRoles;
        }

        this.clanRoles = Database.instance()
                                 .all(AccountsClansRoles.class)
                                 .filter(AccountsClansRoles.ACCOUNTS_ID.equal(super.id()))
                                 .map(AccountsClansRoles::role)
                                 .collect(Collectors.toList());

        return this.clanRoles;
    }

    @Override
    public List<AccountsDestroys> destroys() {
        if (this.destroys != null) {
            return this.destroys;
        }

        this.destroys = Database.instance()
                                .all(AccountsDestroys.class)
                                .filter(AccountsDestroys.ACCOUNTS_ID.equal(super.id()))
                                .collect(Collectors.toList());

        return this.destroys;
    }

    @Override
    public List<AccountsDrones> drones() {
        if (this.drones != null) {
            return this.drones;
        }

        this.drones = Database.instance()
                              .all(AccountsDrones.class)
                              .filter(AccountsDrones.ACCOUNTS_ID.equal(super.id()))
                              .collect(Collectors.toList());

        return this.drones;
    }

    @Override
    public List<AccountsGalaxygates> galaxygates() {
        if (this.galaxygates != null) {
            return this.galaxygates;
        }

        this.galaxygates = Database.instance()
                                   .all(AccountsGalaxygates.class)
                                   .filter(AccountsGalaxygates.ACCOUNTS_ID.equal(super.id()))
                                   .collect(Collectors.toList());

        return this.galaxygates;
    }

    @Override
    public List<AccountsHangars> hangars() {
        if (this.hangars != null) {
            return this.hangars;
        }

        this.hangars = Database.instance()
                               .all(AccountsHangars.class)
                               .filter(AccountsHangars.ACCOUNTS_ID.equal(super.id()))
                               .collect(Collectors.toList());

        return this.hangars;
    }

    @Override
    public List<AccountsHistory> histories() {
        if (this.histories != null) {
            return this.histories;
        }

        this.histories = Database.instance()
                                 .all(AccountsHistory.class)
                                 .filter(AccountsHistory.ACCOUNTS_ID.equal(super.id()))
                                 .collect(Collectors.toList());

        return this.histories;
    }

    @Override
    public List<AccountsItems> items() {
        if (this.items != null) {
            return this.items;
        }

        this.items = Database.instance()
                             .all(AccountsItems.class)
                             .filter(AccountsItems.ACCOUNTS_ID.equal(super.id()))
                             .collect(Collectors.toList());

        return this.items;
    }

    @Override
    public List<AccountsMessages> messages() {
        if (this.messages != null) {
            return this.messages;
        }

        this.messages = Database.instance()
                                .all(AccountsMessages.class)
                                .filter(AccountsMessages.FROM_ACCOUNTS_ID.equal(super.id())
                                                                         .or(AccountsMessages.TO_ACCOUNTS_ID.equal(
                                                                                 super.id())))
                                .collect(Collectors.toList());

        return this.messages;
    }

    @Override
    public Optional<AccountsPets> pet() {
        if (this.pet != null) {
            return this.pet;
        }

        this.pet = Database.instance()
                           .all(AccountsPets.class)
                           .filter(AccountsPets.ACCOUNTS_ID.equal(super.id()))
                           .findAny();

        return this.pet;
    }

    @Override
    public List<AccountsQuests> quests() {
        if (this.quest != null) {
            return this.quest;
        }

        this.quest = Database.instance()
                             .all(AccountsQuests.class)
                             .filter(AccountsQuests.ACCOUNTS_ID.equal(super.id()))
                             .collect(Collectors.toList());

        return this.quest;
    }

    @Override
    public AccountsRankings ranking() {
        if (this.ranking != null) {
            return this.ranking;
        }

        this.ranking = Database.instance()
                               .all(AccountsRankings.class)
                               .filter(AccountsRankings.ACCOUNTS_ID.equal(super.id()))
                               .findFirst()
                               .orElse(null);

        return this.ranking;
    }

    @Override
    public List<AccountsShips> ships() {
        if (this.ships != null) {
            return this.ships;
        }

        this.ships = Database.instance()
                             .all(AccountsShips.class)
                             .filter(AccountsShips.ACCOUNTS_ID.equal(super.id()))
                             .collect(Collectors.toList());

        return this.ships;
    }

    @Override
    public List<AccountsSkills> skills() {
        if (this.skills != null) {
            return this.skills;
        }

        this.skills = Database.instance()
                              .all(AccountsSkills.class)
                              .filter(AccountsSkills.ACCOUNTS_ID.equal(super.id()))
                              .collect(Collectors.toList());

        return this.skills;
    }

    @Override
    public List<AccountsSkylabs> skylabs() {
        if (this.skylabs != null) {
            return this.skylabs;
        }

        this.skylabs = Database.instance()
                               .all(AccountsSkylabs.class)
                               .filter(AccountsSkylabs.ACCOUNTS_ID.equal(super.id()))
                               .collect(Collectors.toList());

        return this.skylabs;
    }

    @Override
    public List<AccountsTechfactories> techfactories() {
        if (this.techfactories != null) {
            return this.techfactories;
        }

        this.techfactories = Database.instance()
                                     .all(AccountsTechfactories.class)
                                     .filter(AccountsTechfactories.ACCOUNTS_ID.equal(super.id()))
                                     .collect(Collectors.toList());

        return this.techfactories;
    }

    @Override
    public List<AccountsTechfactoryItems> techfactoryItems() {
        if (this.techfactoryItems != null) {
            return this.techfactoryItems;
        }

        this.techfactoryItems = Database.instance()
                                        .all(AccountsTechfactoryItems.class)
                                        .filter(AccountsTechfactoryItems.ACCOUNTS_ID.equal(super.id()))
                                        .collect(Collectors.toList());

        return this.techfactoryItems;
    }

    @Override
    public List<ClansApplications> clanApplications() {
        if (this.clanApplications != null) {
            return this.clanApplications;
        }

        this.clanApplications = Database.instance()
                                        .all(ClansApplications.class)
                                        .filter(ClansApplications.ACCOUNTS_ID.equal(super.id()))
                                        .collect(Collectors.toList());

        return this.clanApplications;
    }

    @Override
    public List<ClansMessages> clanMessages() {
        if (this.clanMessages != null) {
            return this.clanMessages;
        }

        // If author
        var where = ClansMessages.FROM_ACCOUNTS_ID.equal(super.id());

        // If destination
        where = where.or(ClansMessages.TO_ACCOUNTS_ID.equal(super.id()));

        // If destination == null and clan_id == this.clan_id
        where = where.or(
                ClansMessages.TO_ACCOUNTS_ID.isNull()
                                            .and(ClansMessages.CLANS_ID.equal(
                                                    super.clansId()
                                                         .orElse(0)))
        ); // ayy

        this.clanMessages = Database.instance()
                                    .all(ClansMessages.class)
                                    .filter(where)
                                    .collect(Collectors.toList());

        return this.clanMessages;
    }
}
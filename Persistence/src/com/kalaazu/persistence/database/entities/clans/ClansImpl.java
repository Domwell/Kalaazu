package com.kalaazu.persistence.database.entities.clans;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.*;
import com.kalaazu.persistence.database.entities.clans.generated.GeneratedClansImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The default implementation of the {@link
 * Clans}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class ClansImpl
        extends GeneratedClansImpl
        implements Clans {
    /**
     * Clan owner.
     */
    private Accounts owner;

    /**
     * Faction.
     */
    private Optional<Factions> faction;

    /**
     * Applications.
     */
    private List<ClansApplications> applications;

    /**
     * Diplomacies.
     */
    private List<ClansDiplomacies> diplomacies;

    /**
     * Bank.
     */
    private List<ClansBanks> banks;

    /**
     * Battlestations.
     */
    private List<ClansBattlestations> battlestations;

    @Override
    public Accounts getOwner() {
        if (this.owner != null) {
            return this.owner;
        }

        this.owner = super.findAccountsId(
                Database.getInstance()
                        .getDb()
                        .manager(Accounts.class)
        );

        return this.owner;
    }

    @Override
    public Optional<Factions> getFaction() {
        if (this.faction != null) {
            return this.faction;
        }

        super.getFactionsId()
             .ifPresentOrElse(
                     i -> this.faction = Database.getInstance()
                                                 .find(i, Factions.class),
                     () -> this.faction = Optional.empty()
             );

        return this.faction;
    }

    @Override
    public List<ClansApplications> getApplications() {
        if (this.applications != null) {
            return this.applications;
        }

        this.applications = Database.getInstance()
                                    .all(ClansApplications.class)
                                    .filter(a -> a.getClansId() == super.getId())
                                    .collect(Collectors.toList());

        return this.applications;
    }

    @Override
    public List<ClansDiplomacies> getDiplomacies() {
        if (this.diplomacies != null) {
            return this.diplomacies;
        }

        this.diplomacies = Database.getInstance()
                                   .all(ClansDiplomacies.class)
                                   .filter(a -> a.getFromClansId() == super.getId() || a.getToClansId() == super.getId())
                                   .collect(Collectors.toList());

        return this.diplomacies;
    }

    @Override
    public List<ClansBanks> getBanks() {
        if (this.banks != null) {
            return this.banks;
        }

        this.banks = Database.getInstance()
                             .all(ClansBanks.class)
                             .filter(b -> b.getClansId() == super.getId())
                             .collect(Collectors.toList());

        return this.banks;
    }

    @Override
    public List<ClansBattlestations> getBattlestations() {
        if (this.battlestations != null) {
            return this.battlestations;
        }

        this.battlestations = Database.getInstance()
                                      .all(ClansBattlestations.class)
                                      .filter(
                                              b -> b.getClansId()
                                                    .orElse(0) == super.getId()
                                      )
                                      .collect(Collectors.toList());

        return this.battlestations;
    }
}
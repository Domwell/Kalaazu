package com.manulaiko.kalaazu.persistence.database.entities.accounts_rankings.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.AccountsRankings;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * AccountsRankings}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsRankingsImpl implements AccountsRankings {

    private int   id;

    private int   accountsId;

    private int   points;

    private int   bestPoints;

    private short destroyedAllies;

    private short destroyedPhoenix;

    private short destroyedTimes;

    private short destroyedRadiation;

    protected GeneratedAccountsRankingsImpl() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getAccountsId() {
        return accountsId;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public int getBestPoints() {
        return bestPoints;
    }

    @Override
    public short getDestroyedAllies() {
        return destroyedAllies;
    }

    @Override
    public short getDestroyedPhoenix() {
        return destroyedPhoenix;
    }

    @Override
    public short getDestroyedTimes() {
        return destroyedTimes;
    }

    @Override
    public short getDestroyedRadiation() {
        return destroyedRadiation;
    }

    @Override
    public AccountsRankings setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsRankings setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsRankings setPoints(int points) {
        this.points = points;
        return this;
    }

    @Override
    public AccountsRankings setBestPoints(int bestPoints) {
        this.bestPoints = bestPoints;
        return this;
    }

    @Override
    public AccountsRankings setDestroyedAllies(short destroyedAllies) {
        this.destroyedAllies = destroyedAllies;
        return this;
    }

    @Override
    public AccountsRankings setDestroyedPhoenix(short destroyedPhoenix) {
        this.destroyedPhoenix = destroyedPhoenix;
        return this;
    }

    @Override
    public AccountsRankings setDestroyedTimes(short destroyedTimes) {
        this.destroyedTimes = destroyedTimes;
        return this;
    }

    @Override
    public AccountsRankings setDestroyedRadiation(short destroyedRadiation) {
        this.destroyedRadiation = destroyedRadiation;
        return this;
    }

    @Override
    public Accounts findAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream()
                             .filter(Accounts.ID.equal(getAccountsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("points = " + Objects.toString(getPoints()));
        sj.add("bestPoints = " + Objects.toString(getBestPoints()));
        sj.add("destroyedAllies = " + Objects.toString(getDestroyedAllies()));
        sj.add("destroyedPhoenix = " + Objects.toString(getDestroyedPhoenix()));
        sj.add("destroyedTimes = " + Objects.toString(getDestroyedTimes()));
        sj.add("destroyedRadiation = " + Objects.toString(getDestroyedRadiation()));
        return "AccountsRankingsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsRankings)) {
            return false;
        }
        final AccountsRankings thatAccountsRankings = (AccountsRankings) that;
        if (this.getId() != thatAccountsRankings.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsRankings.getAccountsId()) {
            return false;
        }
        if (this.getPoints() != thatAccountsRankings.getPoints()) {
            return false;
        }
        if (this.getBestPoints() != thatAccountsRankings.getBestPoints()) {
            return false;
        }
        if (this.getDestroyedAllies() != thatAccountsRankings.getDestroyedAllies()) {
            return false;
        }
        if (this.getDestroyedPhoenix() != thatAccountsRankings.getDestroyedPhoenix()) {
            return false;
        }
        if (this.getDestroyedTimes() != thatAccountsRankings.getDestroyedTimes()) {
            return false;
        }
        if (this.getDestroyedRadiation() != thatAccountsRankings.getDestroyedRadiation()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Integer.hashCode(getPoints());
        hash = 31 * hash + Integer.hashCode(getBestPoints());
        hash = 31 * hash + Short.hashCode(getDestroyedAllies());
        hash = 31 * hash + Short.hashCode(getDestroyedPhoenix());
        hash = 31 * hash + Short.hashCode(getDestroyedTimes());
        hash = 31 * hash + Short.hashCode(getDestroyedRadiation());
        return hash;
    }
}
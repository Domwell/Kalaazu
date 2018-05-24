package com.kalaazu.persistence.database.entities.clans_applications.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.Clans;
import com.kalaazu.persistence.database.entities.ClansApplications;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.clans_applications.ClansApplications}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansApplicationsImpl implements ClansApplications {

    private int       id;

    private int       clansId;

    private int       accountsId;

    private Timestamp date;

    private String    text;

    protected GeneratedClansApplicationsImpl() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getClansId() {
        return clansId;
    }

    @Override
    public int getAccountsId() {
        return accountsId;
    }

    @Override
    public Timestamp getDate() {
        return date;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public ClansApplications setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ClansApplications setClansId(int clansId) {
        this.clansId = clansId;
        return this;
    }

    @Override
    public ClansApplications setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public ClansApplications setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    @Override
    public ClansApplications setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public Clans findClansId(Manager<Clans> foreignManager) {
        return foreignManager.stream()
                             .filter(Clans.ID.equal(getClansId()))
                             .findAny()
                             .orElse(null);
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
        sj.add("clansId = " + Objects.toString(getClansId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("date = " + Objects.toString(getDate()));
        sj.add("text = " + Objects.toString(getText()));
        return "ClansApplicationsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ClansApplications)) {
            return false;
        }
        final ClansApplications thatClansApplications = (ClansApplications) that;
        if (this.getId() != thatClansApplications.getId()) {
            return false;
        }
        if (this.getClansId() != thatClansApplications.getClansId()) {
            return false;
        }
        if (this.getAccountsId() != thatClansApplications.getAccountsId()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatClansApplications.getDate())) {
            return false;
        }
        if (!Objects.equals(this.getText(), thatClansApplications.getText())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getClansId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Objects.hashCode(getDate());
        hash = 31 * hash + Objects.hashCode(getText());
        return hash;
    }
}
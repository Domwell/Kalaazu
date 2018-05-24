package com.kalaazu.persistence.database.entities.clans_banks_logs.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.ClansBanks;
import com.kalaazu.persistence.database.entities.ClansBanksLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.clans_banks_logs.ClansBanksLogs}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBanksLogsImpl implements ClansBanksLogs {

    private int       id;

    private int       clansBanksId;

    private int       fromAccountsId;

    private int       toAccountsId;

    private Timestamp date;

    private byte      type;

    private int       amount;

    private byte      currency;

    protected GeneratedClansBanksLogsImpl() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getClansBanksId() {
        return clansBanksId;
    }

    @Override
    public int getFromAccountsId() {
        return fromAccountsId;
    }

    @Override
    public int getToAccountsId() {
        return toAccountsId;
    }

    @Override
    public Timestamp getDate() {
        return date;
    }

    @Override
    public byte getType() {
        return type;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public byte getCurrency() {
        return currency;
    }

    @Override
    public ClansBanksLogs setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ClansBanksLogs setClansBanksId(int clansBanksId) {
        this.clansBanksId = clansBanksId;
        return this;
    }

    @Override
    public ClansBanksLogs setFromAccountsId(int fromAccountsId) {
        this.fromAccountsId = fromAccountsId;
        return this;
    }

    @Override
    public ClansBanksLogs setToAccountsId(int toAccountsId) {
        this.toAccountsId = toAccountsId;
        return this;
    }

    @Override
    public ClansBanksLogs setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    @Override
    public ClansBanksLogs setType(byte type) {
        this.type = type;
        return this;
    }

    @Override
    public ClansBanksLogs setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public ClansBanksLogs setCurrency(byte currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public ClansBanks findClansBanksId(Manager<ClansBanks> foreignManager) {
        return foreignManager.stream()
                             .filter(ClansBanks.ID.equal(getClansBanksId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Accounts findFromAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream()
                             .filter(Accounts.ID.equal(getFromAccountsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Accounts findToAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream()
                             .filter(Accounts.ID.equal(getToAccountsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("clansBanksId = " + Objects.toString(getClansBanksId()));
        sj.add("fromAccountsId = " + Objects.toString(getFromAccountsId()));
        sj.add("toAccountsId = " + Objects.toString(getToAccountsId()));
        sj.add("date = " + Objects.toString(getDate()));
        sj.add("type = " + Objects.toString(getType()));
        sj.add("amount = " + Objects.toString(getAmount()));
        sj.add("currency = " + Objects.toString(getCurrency()));
        return "ClansBanksLogsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ClansBanksLogs)) {
            return false;
        }
        final ClansBanksLogs thatClansBanksLogs = (ClansBanksLogs) that;
        if (this.getId() != thatClansBanksLogs.getId()) {
            return false;
        }
        if (this.getClansBanksId() != thatClansBanksLogs.getClansBanksId()) {
            return false;
        }
        if (this.getFromAccountsId() != thatClansBanksLogs.getFromAccountsId()) {
            return false;
        }
        if (this.getToAccountsId() != thatClansBanksLogs.getToAccountsId()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatClansBanksLogs.getDate())) {
            return false;
        }
        if (this.getType() != thatClansBanksLogs.getType()) {
            return false;
        }
        if (this.getAmount() != thatClansBanksLogs.getAmount()) {
            return false;
        }
        if (this.getCurrency() != thatClansBanksLogs.getCurrency()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getClansBanksId());
        hash = 31 * hash + Integer.hashCode(getFromAccountsId());
        hash = 31 * hash + Integer.hashCode(getToAccountsId());
        hash = 31 * hash + Objects.hashCode(getDate());
        hash = 31 * hash + Byte.hashCode(getType());
        hash = 31 * hash + Integer.hashCode(getAmount());
        hash = 31 * hash + Byte.hashCode(getCurrency());
        return hash;
    }
}
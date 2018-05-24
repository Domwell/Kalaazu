package com.kalaazu.persistence.database.entities.clans_banks.generated;

import com.kalaazu.persistence.database.entities.Clans;
import com.kalaazu.persistence.database.entities.ClansBanks;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.clans_banks.ClansBanks}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBanksImpl implements ClansBanks {

    private int  id;

    private int  clansId;

    private long credits;

    private long uridium;

    private byte taxCredits;

    private byte taxUridium;

    protected GeneratedClansBanksImpl() {
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
    public long getCredits() {
        return credits;
    }

    @Override
    public long getUridium() {
        return uridium;
    }

    @Override
    public byte getTaxCredits() {
        return taxCredits;
    }

    @Override
    public byte getTaxUridium() {
        return taxUridium;
    }

    @Override
    public ClansBanks setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ClansBanks setClansId(int clansId) {
        this.clansId = clansId;
        return this;
    }

    @Override
    public ClansBanks setCredits(long credits) {
        this.credits = credits;
        return this;
    }

    @Override
    public ClansBanks setUridium(long uridium) {
        this.uridium = uridium;
        return this;
    }

    @Override
    public ClansBanks setTaxCredits(byte taxCredits) {
        this.taxCredits = taxCredits;
        return this;
    }

    @Override
    public ClansBanks setTaxUridium(byte taxUridium) {
        this.taxUridium = taxUridium;
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
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("clansId = " + Objects.toString(getClansId()));
        sj.add("credits = " + Objects.toString(getCredits()));
        sj.add("uridium = " + Objects.toString(getUridium()));
        sj.add("taxCredits = " + Objects.toString(getTaxCredits()));
        sj.add("taxUridium = " + Objects.toString(getTaxUridium()));
        return "ClansBanksImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ClansBanks)) {
            return false;
        }
        final ClansBanks thatClansBanks = (ClansBanks) that;
        if (this.getId() != thatClansBanks.getId()) {
            return false;
        }
        if (this.getClansId() != thatClansBanks.getClansId()) {
            return false;
        }
        if (this.getCredits() != thatClansBanks.getCredits()) {
            return false;
        }
        if (this.getUridium() != thatClansBanks.getUridium()) {
            return false;
        }
        if (this.getTaxCredits() != thatClansBanks.getTaxCredits()) {
            return false;
        }
        if (this.getTaxUridium() != thatClansBanks.getTaxUridium()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getClansId());
        hash = 31 * hash + Long.hashCode(getCredits());
        hash = 31 * hash + Long.hashCode(getUridium());
        hash = 31 * hash + Byte.hashCode(getTaxCredits());
        hash = 31 * hash + Byte.hashCode(getTaxUridium());
        return hash;
    }
}
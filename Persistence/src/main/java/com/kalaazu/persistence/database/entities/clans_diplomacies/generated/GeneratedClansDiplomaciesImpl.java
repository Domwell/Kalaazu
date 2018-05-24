package com.kalaazu.persistence.database.entities.clans_diplomacies.generated;

import com.kalaazu.persistence.database.entities.Clans;
import com.kalaazu.persistence.database.entities.ClansDiplomacies;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.clans_diplomacies.ClansDiplomacies}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansDiplomaciesImpl implements ClansDiplomacies {

    private int       id;

    private int       fromClansId;

    private int       toClansId;

    private Timestamp date;

    private Timestamp expires;

    private byte      status;

    private byte      type;

    protected GeneratedClansDiplomaciesImpl() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getFromClansId() {
        return fromClansId;
    }

    @Override
    public int getToClansId() {
        return toClansId;
    }

    @Override
    public Timestamp getDate() {
        return date;
    }

    @Override
    public Optional<Timestamp> getExpires() {
        return Optional.ofNullable(expires);
    }

    @Override
    public byte getStatus() {
        return status;
    }

    @Override
    public byte getType() {
        return type;
    }

    @Override
    public ClansDiplomacies setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ClansDiplomacies setFromClansId(int fromClansId) {
        this.fromClansId = fromClansId;
        return this;
    }

    @Override
    public ClansDiplomacies setToClansId(int toClansId) {
        this.toClansId = toClansId;
        return this;
    }

    @Override
    public ClansDiplomacies setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    @Override
    public ClansDiplomacies setExpires(Timestamp expires) {
        this.expires = expires;
        return this;
    }

    @Override
    public ClansDiplomacies setStatus(byte status) {
        this.status = status;
        return this;
    }

    @Override
    public ClansDiplomacies setType(byte type) {
        this.type = type;
        return this;
    }

    @Override
    public Clans findFromClansId(Manager<Clans> foreignManager) {
        return foreignManager.stream()
                             .filter(Clans.ID.equal(getFromClansId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Clans findToClansId(Manager<Clans> foreignManager) {
        return foreignManager.stream()
                             .filter(Clans.ID.equal(getToClansId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("fromClansId = " + Objects.toString(getFromClansId()));
        sj.add("toClansId = " + Objects.toString(getToClansId()));
        sj.add("date = " + Objects.toString(getDate()));
        sj.add("expires = " + Objects.toString(OptionalUtil.unwrap(getExpires())));
        sj.add("status = " + Objects.toString(getStatus()));
        sj.add("type = " + Objects.toString(getType()));
        return "ClansDiplomaciesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ClansDiplomacies)) {
            return false;
        }
        final ClansDiplomacies thatClansDiplomacies = (ClansDiplomacies) that;
        if (this.getId() != thatClansDiplomacies.getId()) {
            return false;
        }
        if (this.getFromClansId() != thatClansDiplomacies.getFromClansId()) {
            return false;
        }
        if (this.getToClansId() != thatClansDiplomacies.getToClansId()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatClansDiplomacies.getDate())) {
            return false;
        }
        if (!Objects.equals(this.getExpires(), thatClansDiplomacies.getExpires())) {
            return false;
        }
        if (this.getStatus() != thatClansDiplomacies.getStatus()) {
            return false;
        }
        if (this.getType() != thatClansDiplomacies.getType()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getFromClansId());
        hash = 31 * hash + Integer.hashCode(getToClansId());
        hash = 31 * hash + Objects.hashCode(getDate());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getExpires()));
        hash = 31 * hash + Byte.hashCode(getStatus());
        hash = 31 * hash + Byte.hashCode(getType());
        return hash;
    }
}
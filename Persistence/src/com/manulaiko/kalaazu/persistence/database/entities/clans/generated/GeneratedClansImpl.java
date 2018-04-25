package com.manulaiko.kalaazu.persistence.database.entities.clans.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.clans.Clans;
import com.manulaiko.kalaazu.persistence.database.mappers.ClanStatus;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans.Clans}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansImpl implements Clans {

    private int        id;

    private int        accountsId;

    private Byte       factionsId;

    private String     tag;

    private String     name;

    private String     description;

    private String     logo;

    private ClanStatus status;

    protected GeneratedClansImpl() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getAccountsId() {
        return accountsId;
    }

    @Override
    public Optional<Byte> getFactionsId() {
        return Optional.ofNullable(factionsId);
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getLogo() {
        return logo;
    }

    @Override
    public ClanStatus getStatus() {
        return status;
    }

    @Override
    public Clans setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Clans setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public Clans setFactionsId(Byte factionsId) {
        this.factionsId = factionsId;
        return this;
    }

    @Override
    public Clans setTag(String tag) {
        this.tag = tag;
        return this;
    }

    @Override
    public Clans setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Clans setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Clans setLogo(String logo) {
        this.logo = logo;
        return this;
    }

    @Override
    public Clans setStatus(ClanStatus status) {
        this.status = status;
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
        sj.add("factionsId = " + Objects.toString(OptionalUtil.unwrap(getFactionsId())));
        sj.add("tag = " + Objects.toString(getTag()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("description = " + Objects.toString(getDescription()));
        sj.add("logo = " + Objects.toString(getLogo()));
        sj.add("status = " + Objects.toString(getStatus()));
        return "ClansImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Clans)) {
            return false;
        }
        final Clans thatClans = (Clans) that;
        if (this.getId() != thatClans.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatClans.getAccountsId()) {
            return false;
        }
        if (!Objects.equals(this.getFactionsId(), thatClans.getFactionsId())) {
            return false;
        }
        if (!Objects.equals(this.getTag(), thatClans.getTag())) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatClans.getName())) {
            return false;
        }
        if (!Objects.equals(this.getDescription(), thatClans.getDescription())) {
            return false;
        }
        if (!Objects.equals(this.getLogo(), thatClans.getLogo())) {
            return false;
        }
        if (!Objects.equals(this.getStatus(), thatClans.getStatus())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Objects.hashCode(getFactionsId());
        hash = 31 * hash + Objects.hashCode(getTag());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Objects.hashCode(getLogo());
        hash = 31 * hash + Objects.hashCode(getStatus());
        return hash;
    }
}
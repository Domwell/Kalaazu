package com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactories.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactories.AccountsTechfactories;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_techfactories.AccountsTechfactories}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsTechfactoriesImpl implements AccountsTechfactories {

    private int  id;

    private int  accountsId;

    private int  slotUnlockPrice;

    private byte slotUnlockFactor;

    private byte slots;

    protected GeneratedAccountsTechfactoriesImpl() {

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
    public int getSlotUnlockPrice() {
        return slotUnlockPrice;
    }

    @Override
    public byte getSlotUnlockFactor() {
        return slotUnlockFactor;
    }

    @Override
    public byte getSlots() {
        return slots;
    }

    @Override
    public AccountsTechfactories setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsTechfactories setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsTechfactories setSlotUnlockPrice(int slotUnlockPrice) {
        this.slotUnlockPrice = slotUnlockPrice;
        return this;
    }

    @Override
    public AccountsTechfactories setSlotUnlockFactor(byte slotUnlockFactor) {
        this.slotUnlockFactor = slotUnlockFactor;
        return this;
    }

    @Override
    public AccountsTechfactories setSlots(byte slots) {
        this.slots = slots;
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
        sj.add("slotUnlockPrice = " + Objects.toString(getSlotUnlockPrice()));
        sj.add("slotUnlockFactor = " + Objects.toString(getSlotUnlockFactor()));
        sj.add("slots = " + Objects.toString(getSlots()));
        return "AccountsTechfactoriesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsTechfactories)) {
            return false;
        }
        final AccountsTechfactories thatAccountsTechfactories = (AccountsTechfactories) that;
        if (this.getId() != thatAccountsTechfactories.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsTechfactories.getAccountsId()) {
            return false;
        }
        if (this.getSlotUnlockPrice() != thatAccountsTechfactories.getSlotUnlockPrice()) {
            return false;
        }
        if (this.getSlotUnlockFactor() != thatAccountsTechfactories.getSlotUnlockFactor()) {
            return false;
        }
        if (this.getSlots() != thatAccountsTechfactories.getSlots()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Integer.hashCode(getSlotUnlockPrice());
        hash = 31 * hash + Byte.hashCode(getSlotUnlockFactor());
        hash = 31 * hash + Byte.hashCode(getSlots());
        return hash;
    }
}
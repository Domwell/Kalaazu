package com.manulaiko.kalaazu.persistence.database.entities.accounts_history.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_history.AccountsHistory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_history.AccountsHistory}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsHistoryImpl implements AccountsHistory {

    private int       id;

    private int       accountsId;

    private byte      type;

    private String    message;

    private int       amount;

    private Timestamp date;

    protected GeneratedAccountsHistoryImpl() {

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
    public byte getType() {
        return type;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public Timestamp getDate() {
        return date;
    }

    @Override
    public AccountsHistory setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsHistory setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsHistory setType(byte type) {
        this.type = type;
        return this;
    }

    @Override
    public AccountsHistory setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public AccountsHistory setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public AccountsHistory setDate(Timestamp date) {
        this.date = date;
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
        sj.add("type = " + Objects.toString(getType()));
        sj.add("message = " + Objects.toString(getMessage()));
        sj.add("amount = " + Objects.toString(getAmount()));
        sj.add("date = " + Objects.toString(getDate()));
        return "AccountsHistoryImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsHistory)) {
            return false;
        }
        final AccountsHistory thatAccountsHistory = (AccountsHistory) that;
        if (this.getId() != thatAccountsHistory.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsHistory.getAccountsId()) {
            return false;
        }
        if (this.getType() != thatAccountsHistory.getType()) {
            return false;
        }
        if (!Objects.equals(this.getMessage(), thatAccountsHistory.getMessage())) {
            return false;
        }
        if (this.getAmount() != thatAccountsHistory.getAmount()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatAccountsHistory.getDate())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Byte.hashCode(getType());
        hash = 31 * hash + Objects.hashCode(getMessage());
        hash = 31 * hash + Integer.hashCode(getAmount());
        hash = 31 * hash + Objects.hashCode(getDate());
        return hash;
    }
}
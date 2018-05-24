package com.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.generated;

import com.kalaazu.persistence.database.entities.AccountsConfigurations;
import com.kalaazu.persistence.database.entities.AccountsConfigurationsAccountsItems;
import com.kalaazu.persistence.database.entities.AccountsDrones;
import com.kalaazu.persistence.database.entities.AccountsItems;
import com.kalaazu.persistence.database.entities.AccountsPets;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.AccountsConfigurationsAccountsItems}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsConfigurationsAccountsItemsImpl implements AccountsConfigurationsAccountsItems {

    private int id;

    private int accountsConfigurationsId;

    private int accountsItemsId;

    private int accountsDronesId;

    private int accountsPetsId;

    protected GeneratedAccountsConfigurationsAccountsItemsImpl() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getAccountsConfigurationsId() {
        return accountsConfigurationsId;
    }

    @Override
    public int getAccountsItemsId() {
        return accountsItemsId;
    }

    @Override
    public OptionalInt getAccountsDronesId() {
        return OptionalUtil.ofNullable(accountsDronesId);
    }

    @Override
    public OptionalInt getAccountsPetsId() {
        return OptionalUtil.ofNullable(accountsPetsId);
    }

    @Override
    public AccountsConfigurationsAccountsItems setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsConfigurationsAccountsItems setAccountsConfigurationsId(int accountsConfigurationsId) {
        this.accountsConfigurationsId = accountsConfigurationsId;
        return this;
    }

    @Override
    public AccountsConfigurationsAccountsItems setAccountsItemsId(int accountsItemsId) {
        this.accountsItemsId = accountsItemsId;
        return this;
    }

    @Override
    public AccountsConfigurationsAccountsItems setAccountsDronesId(int accountsDronesId) {
        this.accountsDronesId = accountsDronesId;
        return this;
    }

    @Override
    public AccountsConfigurationsAccountsItems setAccountsPetsId(int accountsPetsId) {
        this.accountsPetsId = accountsPetsId;
        return this;
    }

    @Override
    public AccountsConfigurations findAccountsConfigurationsId(Manager<AccountsConfigurations> foreignManager) {
        return foreignManager.stream()
                             .filter(AccountsConfigurations.ID.equal(getAccountsConfigurationsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public AccountsItems findAccountsItemsId(Manager<AccountsItems> foreignManager) {
        return foreignManager.stream()
                             .filter(AccountsItems.ID.equal(getAccountsItemsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Optional<AccountsDrones> findAccountsDronesId(Manager<AccountsDrones> foreignManager) {
        if (getAccountsDronesId().isPresent()) {
            return foreignManager.stream()
                                 .filter(AccountsDrones.ID.equal(getAccountsDronesId().get()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<AccountsPets> findAccountsPetsId(Manager<AccountsPets> foreignManager) {
        if (getAccountsPetsId().isPresent()) {
            return foreignManager.stream()
                                 .filter(AccountsPets.ID.equal(getAccountsPetsId().get()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("accountsConfigurationsId = " + Objects.toString(getAccountsConfigurationsId()));
        sj.add("accountsItemsId = " + Objects.toString(getAccountsItemsId()));
        sj.add("accountsDronesId = " + Objects.toString(OptionalUtil.unwrap(getAccountsDronesId())));
        sj.add("accountsPetsId = " + Objects.toString(OptionalUtil.unwrap(getAccountsPetsId())));
        return "AccountsConfigurationsAccountsItemsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsConfigurationsAccountsItems)) {
            return false;
        }
        final AccountsConfigurationsAccountsItems thatAccountsConfigurationsAccountsItems = (AccountsConfigurationsAccountsItems) that;
        if (this.getId() != thatAccountsConfigurationsAccountsItems.getId()) {
            return false;
        }
        if (this.getAccountsConfigurationsId() != thatAccountsConfigurationsAccountsItems.getAccountsConfigurationsId()) {
            return false;
        }
        if (this.getAccountsItemsId() != thatAccountsConfigurationsAccountsItems.getAccountsItemsId()) {
            return false;
        }
        if (!Objects.equals(
                this.getAccountsDronesId(), thatAccountsConfigurationsAccountsItems.getAccountsDronesId())) {
            return false;
        }
        if (!Objects.equals(this.getAccountsPetsId(), thatAccountsConfigurationsAccountsItems.getAccountsPetsId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsConfigurationsId());
        hash = 31 * hash + Integer.hashCode(getAccountsItemsId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAccountsDronesId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAccountsPetsId()));
        return hash;
    }
}
package com.kalaazu.persistence.database.entities.trade_items.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.Items;
import com.kalaazu.persistence.database.entities.TradeItems;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.trade_items.TradeItems}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTradeItemsImpl implements TradeItems {

    private short   id;

    private short   itemsId;

    private Integer accountsId;

    private int     price;

    private byte    type;

    protected GeneratedTradeItemsImpl() {
    }

    @Override
    public Short getId() {
        return id;
    }

    @Override
    public short getItemsId() {
        return itemsId;
    }

    @Override
    public OptionalInt getAccountsId() {
        return OptionalUtil.ofNullable(accountsId);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public byte getType() {
        return type;
    }

    @Override
    public TradeItems setId(short id) {
        this.id = id;
        return this;
    }

    @Override
    public TradeItems setItemsId(short itemsId) {
        this.itemsId = itemsId;
        return this;
    }

    @Override
    public TradeItems setAccountsId(Integer accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public TradeItems setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public TradeItems setType(byte type) {
        this.type = type;
        return this;
    }

    @Override
    public Items findItemsId(Manager<Items> foreignManager) {
        return foreignManager.stream()
                             .filter(Items.ID.equal(getItemsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Optional<Accounts> findAccountsId(Manager<Accounts> foreignManager) {
        if (getAccountsId().isPresent()) {
            return foreignManager.stream()
                                 .filter(Accounts.ID.equal(getAccountsId().getAsInt()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("itemsId = " + Objects.toString(getItemsId()));
        sj.add("accountsId = " + Objects.toString(OptionalUtil.unwrap(getAccountsId())));
        sj.add("price = " + Objects.toString(getPrice()));
        sj.add("type = " + Objects.toString(getType()));
        return "TradeItemsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof TradeItems)) {
            return false;
        }
        final TradeItems thatTradeItems = (TradeItems) that;
        if (this.getId() != thatTradeItems.getId()) {
            return false;
        }
        if (this.getItemsId() != thatTradeItems.getItemsId()) {
            return false;
        }
        if (!Objects.equals(this.getAccountsId(), thatTradeItems.getAccountsId())) {
            return false;
        }
        if (this.getPrice() != thatTradeItems.getPrice()) {
            return false;
        }
        if (this.getType() != thatTradeItems.getType()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getId());
        hash = 31 * hash + Short.hashCode(getItemsId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getAccountsId()));
        hash = 31 * hash + Integer.hashCode(getPrice());
        hash = 31 * hash + Byte.hashCode(getType());
        return hash;
    }
}
package com.kalaazu.persistence.database.entities.rewards.generated;

import com.kalaazu.persistence.database.entities.Items;
import com.kalaazu.persistence.database.entities.Rewards;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.rewards.Rewards}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsImpl implements Rewards {

    private short  id;

    private short  itemsId;

    private int    amount;

    private double probability;

    private String comment;

    protected GeneratedRewardsImpl() {
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
    public int getAmount() {
        return amount;
    }

    @Override
    public double getProbability() {
        return probability;
    }

    @Override
    public Optional<String> getComment() {
        return Optional.ofNullable(comment);
    }

    @Override
    public Rewards setId(short id) {
        this.id = id;
        return this;
    }

    @Override
    public Rewards setItemsId(short itemsId) {
        this.itemsId = itemsId;
        return this;
    }

    @Override
    public Rewards setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public Rewards setProbability(double probability) {
        this.probability = probability;
        return this;
    }

    @Override
    public Rewards setComment(String comment) {
        this.comment = comment;
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
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("itemsId = " + Objects.toString(getItemsId()));
        sj.add("amount = " + Objects.toString(getAmount()));
        sj.add("probability = " + Objects.toString(getProbability()));
        sj.add("comment = " + Objects.toString(OptionalUtil.unwrap(getComment())));
        return "RewardsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Rewards)) {
            return false;
        }
        final Rewards thatRewards = (Rewards) that;
        if (this.getId() != thatRewards.getId()) {
            return false;
        }
        if (this.getItemsId() != thatRewards.getItemsId()) {
            return false;
        }
        if (this.getAmount() != thatRewards.getAmount()) {
            return false;
        }
        if (this.getProbability() != thatRewards.getProbability()) {
            return false;
        }
        if (!Objects.equals(this.getComment(), thatRewards.getComment())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getId());
        hash = 31 * hash + Short.hashCode(getItemsId());
        hash = 31 * hash + Integer.hashCode(getAmount());
        hash = 31 * hash + Double.hashCode(getProbability());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getComment()));
        return hash;
    }
}
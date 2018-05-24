package com.kalaazu.persistence.database.entities.rewards_ships.generated;

import com.kalaazu.persistence.database.entities.Rewards;
import com.kalaazu.persistence.database.entities.RewardsShips;
import com.kalaazu.persistence.database.entities.Ships;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.rewards_ships.RewardsShips}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsShipsImpl implements RewardsShips {

    private byte  id;

    private byte  shipsId;

    private short rewardsId;

    protected GeneratedRewardsShipsImpl() {
    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public byte getShipsId() {
        return shipsId;
    }

    @Override
    public short getRewardsId() {
        return rewardsId;
    }

    @Override
    public RewardsShips setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public RewardsShips setShipsId(byte shipsId) {
        this.shipsId = shipsId;
        return this;
    }

    @Override
    public RewardsShips setRewardsId(short rewardsId) {
        this.rewardsId = rewardsId;
        return this;
    }

    @Override
    public Ships findShipsId(Manager<Ships> foreignManager) {
        return foreignManager.stream()
                             .filter(Ships.ID.equal(getShipsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Rewards findRewardsId(Manager<Rewards> foreignManager) {
        return foreignManager.stream()
                             .filter(Rewards.ID.equal(getRewardsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("shipsId = " + Objects.toString(getShipsId()));
        sj.add("rewardsId = " + Objects.toString(getRewardsId()));
        return "RewardsShipsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof RewardsShips)) {
            return false;
        }
        final RewardsShips thatRewardsShips = (RewardsShips) that;
        if (this.getId() != thatRewardsShips.getId()) {
            return false;
        }
        if (this.getShipsId() != thatRewardsShips.getShipsId()) {
            return false;
        }
        if (this.getRewardsId() != thatRewardsShips.getRewardsId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getShipsId());
        hash = 31 * hash + Short.hashCode(getRewardsId());
        return hash;
    }
}
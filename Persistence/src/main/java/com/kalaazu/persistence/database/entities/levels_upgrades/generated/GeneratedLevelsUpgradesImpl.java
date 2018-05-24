package com.kalaazu.persistence.database.entities.levels_upgrades.generated;

import com.kalaazu.persistence.database.entities.Levels;
import com.kalaazu.persistence.database.entities.LevelsUpgrades;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.levels_upgrades.LevelsUpgrades}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLevelsUpgradesImpl implements LevelsUpgrades {

    private int   id;

    private byte  levelsId;

    private byte  probability;

    private int   credits;

    private short uridium;

    protected GeneratedLevelsUpgradesImpl() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public byte getLevelsId() {
        return levelsId;
    }

    @Override
    public byte getProbability() {
        return probability;
    }

    @Override
    public int getCredits() {
        return credits;
    }

    @Override
    public short getUridium() {
        return uridium;
    }

    @Override
    public LevelsUpgrades setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public LevelsUpgrades setLevelsId(byte levelsId) {
        this.levelsId = levelsId;
        return this;
    }

    @Override
    public LevelsUpgrades setProbability(byte probability) {
        this.probability = probability;
        return this;
    }

    @Override
    public LevelsUpgrades setCredits(int credits) {
        this.credits = credits;
        return this;
    }

    @Override
    public LevelsUpgrades setUridium(short uridium) {
        this.uridium = uridium;
        return this;
    }

    @Override
    public Levels findLevelsId(Manager<Levels> foreignManager) {
        return foreignManager.stream()
                             .filter(Levels.ID.equal(getLevelsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("levelsId = " + Objects.toString(getLevelsId()));
        sj.add("probability = " + Objects.toString(getProbability()));
        sj.add("credits = " + Objects.toString(getCredits()));
        sj.add("uridium = " + Objects.toString(getUridium()));
        return "LevelsUpgradesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof LevelsUpgrades)) {
            return false;
        }
        final LevelsUpgrades thatLevelsUpgrades = (LevelsUpgrades) that;
        if (this.getId() != thatLevelsUpgrades.getId()) {
            return false;
        }
        if (this.getLevelsId() != thatLevelsUpgrades.getLevelsId()) {
            return false;
        }
        if (this.getProbability() != thatLevelsUpgrades.getProbability()) {
            return false;
        }
        if (this.getCredits() != thatLevelsUpgrades.getCredits()) {
            return false;
        }
        if (this.getUridium() != thatLevelsUpgrades.getUridium()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getLevelsId());
        hash = 31 * hash + Byte.hashCode(getProbability());
        hash = 31 * hash + Integer.hashCode(getCredits());
        hash = 31 * hash + Short.hashCode(getUridium());
        return hash;
    }
}
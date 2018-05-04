package com.manulaiko.kalaazu.persistence.database.entities.skilltree_unlocks.generated;

import com.manulaiko.kalaazu.persistence.database.entities.SkilltreeLevels;
import com.manulaiko.kalaazu.persistence.database.entities.SkilltreeUnlocks;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * SkilltreeUnlocks}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSkilltreeUnlocksImpl implements SkilltreeUnlocks {

    private short id;

    private short upgradeSkilltreeLevelsId;

    private short requiredSkilltreeLevelsId;

    protected GeneratedSkilltreeUnlocksImpl() {

    }

    @Override
    public Short getId() {
        return id;
    }

    @Override
    public short getUpgradeSkilltreeLevelsId() {
        return upgradeSkilltreeLevelsId;
    }

    @Override
    public short getRequiredSkilltreeLevelsId() {
        return requiredSkilltreeLevelsId;
    }

    @Override
    public SkilltreeUnlocks setId(short id) {
        this.id = id;
        return this;
    }

    @Override
    public SkilltreeUnlocks setUpgradeSkilltreeLevelsId(short upgradeSkilltreeLevelsId) {
        this.upgradeSkilltreeLevelsId = upgradeSkilltreeLevelsId;
        return this;
    }

    @Override
    public SkilltreeUnlocks setRequiredSkilltreeLevelsId(short requiredSkilltreeLevelsId) {
        this.requiredSkilltreeLevelsId = requiredSkilltreeLevelsId;
        return this;
    }

    @Override
    public SkilltreeLevels findUpgradeSkilltreeLevelsId(Manager<SkilltreeLevels> foreignManager) {
        return foreignManager.stream()
                             .filter(SkilltreeLevels.ID.equal(getUpgradeSkilltreeLevelsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public SkilltreeLevels findRequiredSkilltreeLevelsId(Manager<SkilltreeLevels> foreignManager) {
        return foreignManager.stream()
                             .filter(SkilltreeLevels.ID.equal(getRequiredSkilltreeLevelsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("upgradeSkilltreeLevelsId = " + Objects.toString(getUpgradeSkilltreeLevelsId()));
        sj.add("requiredSkilltreeLevelsId = " + Objects.toString(getRequiredSkilltreeLevelsId()));
        return "SkilltreeUnlocksImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof SkilltreeUnlocks)) {
            return false;
        }
        final SkilltreeUnlocks thatSkilltreeUnlocks = (SkilltreeUnlocks) that;
        if (this.getId() != thatSkilltreeUnlocks.getId()) {
            return false;
        }
        if (this.getUpgradeSkilltreeLevelsId() != thatSkilltreeUnlocks.getUpgradeSkilltreeLevelsId()) {
            return false;
        }
        if (this.getRequiredSkilltreeLevelsId() != thatSkilltreeUnlocks.getRequiredSkilltreeLevelsId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getId());
        hash = 31 * hash + Short.hashCode(getUpgradeSkilltreeLevelsId());
        hash = 31 * hash + Short.hashCode(getRequiredSkilltreeLevelsId());
        return hash;
    }
}
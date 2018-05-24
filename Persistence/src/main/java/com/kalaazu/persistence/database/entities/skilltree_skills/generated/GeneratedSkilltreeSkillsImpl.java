package com.kalaazu.persistence.database.entities.skilltree_skills.generated;

import com.kalaazu.persistence.database.entities.SkilltreeSkills;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.skilltree_skills.SkilltreeSkills}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSkilltreeSkillsImpl implements SkilltreeSkills {

    private byte   id;

    private String name;

    private String description;

    private byte   type;

    private int    isAdvanced;

    private String bonusType;

    private int    bonusAmount;

    private byte   bonusFactor;

    protected GeneratedSkilltreeSkillsImpl() {
    }

    @Override
    public Byte getId() {
        return id;
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
    public byte getType() {
        return type;
    }

    @Override
    public int getIsAdvanced() {
        return isAdvanced;
    }

    @Override
    public String getBonusType() {
        return bonusType;
    }

    @Override
    public int getBonusAmount() {
        return bonusAmount;
    }

    @Override
    public byte getBonusFactor() {
        return bonusFactor;
    }

    @Override
    public SkilltreeSkills setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public SkilltreeSkills setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public SkilltreeSkills setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public SkilltreeSkills setType(byte type) {
        this.type = type;
        return this;
    }

    @Override
    public SkilltreeSkills setIsAdvanced(int isAdvanced) {
        this.isAdvanced = isAdvanced;
        return this;
    }

    @Override
    public SkilltreeSkills setBonusType(String bonusType) {
        this.bonusType = bonusType;
        return this;
    }

    @Override
    public SkilltreeSkills setBonusAmount(int bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    @Override
    public SkilltreeSkills setBonusFactor(byte bonusFactor) {
        this.bonusFactor = bonusFactor;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("description = " + Objects.toString(getDescription()));
        sj.add("type = " + Objects.toString(getType()));
        sj.add("isAdvanced = " + Objects.toString(getIsAdvanced()));
        sj.add("bonusType = " + Objects.toString(getBonusType()));
        sj.add("bonusAmount = " + Objects.toString(getBonusAmount()));
        sj.add("bonusFactor = " + Objects.toString(getBonusFactor()));
        return "SkilltreeSkillsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof SkilltreeSkills)) {
            return false;
        }
        final SkilltreeSkills thatSkilltreeSkills = (SkilltreeSkills) that;
        if (this.getId() != thatSkilltreeSkills.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatSkilltreeSkills.getName())) {
            return false;
        }
        if (!Objects.equals(this.getDescription(), thatSkilltreeSkills.getDescription())) {
            return false;
        }
        if (this.getType() != thatSkilltreeSkills.getType()) {
            return false;
        }
        if (this.getIsAdvanced() != thatSkilltreeSkills.getIsAdvanced()) {
            return false;
        }
        if (!Objects.equals(this.getBonusType(), thatSkilltreeSkills.getBonusType())) {
            return false;
        }
        if (this.getBonusAmount() != thatSkilltreeSkills.getBonusAmount()) {
            return false;
        }
        if (this.getBonusFactor() != thatSkilltreeSkills.getBonusFactor()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Byte.hashCode(getType());
        hash = 31 * hash + Integer.hashCode(getIsAdvanced());
        hash = 31 * hash + Objects.hashCode(getBonusType());
        hash = 31 * hash + Integer.hashCode(getBonusAmount());
        hash = 31 * hash + Byte.hashCode(getBonusFactor());
        return hash;
    }
}
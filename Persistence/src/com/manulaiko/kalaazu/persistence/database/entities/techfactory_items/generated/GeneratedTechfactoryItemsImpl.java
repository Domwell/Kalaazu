package com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItems;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItems}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTechfactoryItemsImpl implements TechfactoryItems {

    private byte   id;

    private String name;

    private String description;

    private String effect;

    private short  duration;

    private short  cooldown;

    private int    time;

    private short  freeProduction;

    private short  instantProduction;

    protected GeneratedTechfactoryItemsImpl() {

    }

    @Override
    public byte getId() {
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
    public String getEffect() {
        return effect;
    }

    @Override
    public short getDuration() {
        return duration;
    }

    @Override
    public short getCooldown() {
        return cooldown;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public short getFreeProduction() {
        return freeProduction;
    }

    @Override
    public short getInstantProduction() {
        return instantProduction;
    }

    @Override
    public TechfactoryItems setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public TechfactoryItems setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public TechfactoryItems setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public TechfactoryItems setEffect(String effect) {
        this.effect = effect;
        return this;
    }

    @Override
    public TechfactoryItems setDuration(short duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public TechfactoryItems setCooldown(short cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    @Override
    public TechfactoryItems setTime(int time) {
        this.time = time;
        return this;
    }

    @Override
    public TechfactoryItems setFreeProduction(short freeProduction) {
        this.freeProduction = freeProduction;
        return this;
    }

    @Override
    public TechfactoryItems setInstantProduction(short instantProduction) {
        this.instantProduction = instantProduction;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("description = " + Objects.toString(getDescription()));
        sj.add("effect = " + Objects.toString(getEffect()));
        sj.add("duration = " + Objects.toString(getDuration()));
        sj.add("cooldown = " + Objects.toString(getCooldown()));
        sj.add("time = " + Objects.toString(getTime()));
        sj.add("freeProduction = " + Objects.toString(getFreeProduction()));
        sj.add("instantProduction = " + Objects.toString(getInstantProduction()));
        return "TechfactoryItemsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof TechfactoryItems)) {
            return false;
        }
        final TechfactoryItems thatTechfactoryItems = (TechfactoryItems) that;
        if (this.getId() != thatTechfactoryItems.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatTechfactoryItems.getName())) {
            return false;
        }
        if (!Objects.equals(this.getDescription(), thatTechfactoryItems.getDescription())) {
            return false;
        }
        if (!Objects.equals(this.getEffect(), thatTechfactoryItems.getEffect())) {
            return false;
        }
        if (this.getDuration() != thatTechfactoryItems.getDuration()) {
            return false;
        }
        if (this.getCooldown() != thatTechfactoryItems.getCooldown()) {
            return false;
        }
        if (this.getTime() != thatTechfactoryItems.getTime()) {
            return false;
        }
        if (this.getFreeProduction() != thatTechfactoryItems.getFreeProduction()) {
            return false;
        }
        if (this.getInstantProduction() != thatTechfactoryItems.getInstantProduction()) {
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
        hash = 31 * hash + Objects.hashCode(getEffect());
        hash = 31 * hash + Short.hashCode(getDuration());
        hash = 31 * hash + Short.hashCode(getCooldown());
        hash = 31 * hash + Integer.hashCode(getTime());
        hash = 31 * hash + Short.hashCode(getFreeProduction());
        hash = 31 * hash + Short.hashCode(getInstantProduction());
        return hash;
    }
}
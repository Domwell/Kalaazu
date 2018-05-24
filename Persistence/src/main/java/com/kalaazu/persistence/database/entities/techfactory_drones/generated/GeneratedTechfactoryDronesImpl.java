package com.kalaazu.persistence.database.entities.techfactory_drones.generated;

import com.kalaazu.persistence.database.entities.TechfactoryDrones;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.techfactory_drones.TechfactoryDrones}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTechfactoryDronesImpl implements TechfactoryDrones {

    private byte   id;

    private String name;

    private String description;

    private byte   time;

    private byte   parts;

    private int    price;

    private byte   factor;

    protected GeneratedTechfactoryDronesImpl() {
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
    public byte getTime() {
        return time;
    }

    @Override
    public byte getParts() {
        return parts;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public byte getFactor() {
        return factor;
    }

    @Override
    public TechfactoryDrones setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public TechfactoryDrones setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public TechfactoryDrones setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public TechfactoryDrones setTime(byte time) {
        this.time = time;
        return this;
    }

    @Override
    public TechfactoryDrones setParts(byte parts) {
        this.parts = parts;
        return this;
    }

    @Override
    public TechfactoryDrones setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public TechfactoryDrones setFactor(byte factor) {
        this.factor = factor;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("description = " + Objects.toString(getDescription()));
        sj.add("time = " + Objects.toString(getTime()));
        sj.add("parts = " + Objects.toString(getParts()));
        sj.add("price = " + Objects.toString(getPrice()));
        sj.add("factor = " + Objects.toString(getFactor()));
        return "TechfactoryDronesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof TechfactoryDrones)) {
            return false;
        }
        final TechfactoryDrones thatTechfactoryDrones = (TechfactoryDrones) that;
        if (this.getId() != thatTechfactoryDrones.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatTechfactoryDrones.getName())) {
            return false;
        }
        if (!Objects.equals(this.getDescription(), thatTechfactoryDrones.getDescription())) {
            return false;
        }
        if (this.getTime() != thatTechfactoryDrones.getTime()) {
            return false;
        }
        if (this.getParts() != thatTechfactoryDrones.getParts()) {
            return false;
        }
        if (this.getPrice() != thatTechfactoryDrones.getPrice()) {
            return false;
        }
        if (this.getFactor() != thatTechfactoryDrones.getFactor()) {
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
        hash = 31 * hash + Byte.hashCode(getTime());
        hash = 31 * hash + Byte.hashCode(getParts());
        hash = 31 * hash + Integer.hashCode(getPrice());
        hash = 31 * hash + Byte.hashCode(getFactor());
        return hash;
    }
}
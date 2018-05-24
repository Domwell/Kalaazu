package com.kalaazu.persistence.database.entities.collectables.generated;

import com.kalaazu.persistence.database.entities.Collectables;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.collectables.Collectables}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCollectablesImpl implements Collectables {

    private byte   id;

    private byte   gfx;

    private byte   type;

    private String name;

    protected GeneratedCollectablesImpl() {
    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public byte getGfx() {
        return gfx;
    }

    @Override
    public byte getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Collectables setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public Collectables setGfx(byte gfx) {
        this.gfx = gfx;
        return this;
    }

    @Override
    public Collectables setType(byte type) {
        this.type = type;
        return this;
    }

    @Override
    public Collectables setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("gfx = " + Objects.toString(getGfx()));
        sj.add("type = " + Objects.toString(getType()));
        sj.add("name = " + Objects.toString(getName()));
        return "CollectablesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Collectables)) {
            return false;
        }
        final Collectables thatCollectables = (Collectables) that;
        if (this.getId() != thatCollectables.getId()) {
            return false;
        }
        if (this.getGfx() != thatCollectables.getGfx()) {
            return false;
        }
        if (this.getType() != thatCollectables.getType()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatCollectables.getName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getGfx());
        hash = 31 * hash + Byte.hashCode(getType());
        hash = 31 * hash + Objects.hashCode(getName());
        return hash;
    }
}
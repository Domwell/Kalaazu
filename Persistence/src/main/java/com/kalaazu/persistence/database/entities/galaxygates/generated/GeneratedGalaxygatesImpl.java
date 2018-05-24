package com.kalaazu.persistence.database.entities.galaxygates.generated;

import com.kalaazu.persistence.database.entities.Galaxygates;
import com.kalaazu.persistence.database.entities.GalaxygatesWaves;
import com.speedment.common.annotation.GeneratedCode;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.galaxygates.Galaxygates}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesImpl implements Galaxygates {

    private byte   id;

    private String name;

    private Byte   galaxygatesWavesId;

    private byte   parts;

    protected GeneratedGalaxygatesImpl() {
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
    public Optional<Byte> getGalaxygatesWavesId() {
        return Optional.ofNullable(galaxygatesWavesId);
    }

    @Override
    public byte getParts() {
        return parts;
    }

    @Override
    public Galaxygates setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public Galaxygates setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Galaxygates setGalaxygatesWavesId(Byte galaxygatesWavesId) {
        this.galaxygatesWavesId = galaxygatesWavesId;
        return this;
    }

    @Override
    public Galaxygates setParts(byte parts) {
        this.parts = parts;
        return this;
    }

    @Override
    public Optional<GalaxygatesWaves> findGalaxygatesWavesId(Manager<GalaxygatesWaves> foreignManager) {
        if (getGalaxygatesWavesId().isPresent()) {
            return foreignManager.stream()
                                 .filter(GalaxygatesWaves.ID.equal(getGalaxygatesWavesId().get()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("galaxygatesWavesId = " + Objects.toString(OptionalUtil.unwrap(getGalaxygatesWavesId())));
        sj.add("parts = " + Objects.toString(getParts()));
        return "GalaxygatesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Galaxygates)) {
            return false;
        }
        final Galaxygates thatGalaxygates = (Galaxygates) that;
        if (this.getId() != thatGalaxygates.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatGalaxygates.getName())) {
            return false;
        }
        if (!Objects.equals(this.getGalaxygatesWavesId(), thatGalaxygates.getGalaxygatesWavesId())) {
            return false;
        }
        if (this.getParts() != thatGalaxygates.getParts()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getGalaxygatesWavesId()));
        hash = 31 * hash + Byte.hashCode(getParts());
        return hash;
    }
}
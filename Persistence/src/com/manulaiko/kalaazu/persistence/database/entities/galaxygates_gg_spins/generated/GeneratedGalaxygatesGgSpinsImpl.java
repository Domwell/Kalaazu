package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_spins.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Galaxygates;
import com.manulaiko.kalaazu.persistence.database.entities.GalaxygatesGgSpins;
import com.manulaiko.kalaazu.persistence.database.entities.GalaxygatesSpins;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * GalaxygatesGgSpins}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesGgSpinsImpl implements GalaxygatesGgSpins {

    private short id;

    private byte  galaxygatesId;

    private byte  galaxygatesSpinsId;

    protected GeneratedGalaxygatesGgSpinsImpl() {

    }

    @Override
    public Short getId() {
        return id;
    }

    @Override
    public byte getGalaxygatesId() {
        return galaxygatesId;
    }

    @Override
    public byte getGalaxygatesSpinsId() {
        return galaxygatesSpinsId;
    }

    @Override
    public GalaxygatesGgSpins setId(short id) {
        this.id = id;
        return this;
    }

    @Override
    public GalaxygatesGgSpins setGalaxygatesId(byte galaxygatesId) {
        this.galaxygatesId = galaxygatesId;
        return this;
    }

    @Override
    public GalaxygatesGgSpins setGalaxygatesSpinsId(byte galaxygatesSpinsId) {
        this.galaxygatesSpinsId = galaxygatesSpinsId;
        return this;
    }

    @Override
    public Galaxygates findGalaxygatesId(Manager<Galaxygates> foreignManager) {
        return foreignManager.stream()
                             .filter(Galaxygates.ID.equal(getGalaxygatesId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public GalaxygatesSpins findGalaxygatesSpinsId(Manager<GalaxygatesSpins> foreignManager) {
        return foreignManager.stream()
                             .filter(GalaxygatesSpins.ID.equal(getGalaxygatesSpinsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("galaxygatesId = " + Objects.toString(getGalaxygatesId()));
        sj.add("galaxygatesSpinsId = " + Objects.toString(getGalaxygatesSpinsId()));
        return "GalaxygatesGgSpinsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof GalaxygatesGgSpins)) {
            return false;
        }
        final GalaxygatesGgSpins thatGalaxygatesGgSpins = (GalaxygatesGgSpins) that;
        if (this.getId() != thatGalaxygatesGgSpins.getId()) {
            return false;
        }
        if (this.getGalaxygatesId() != thatGalaxygatesGgSpins.getGalaxygatesId()) {
            return false;
        }
        if (this.getGalaxygatesSpinsId() != thatGalaxygatesGgSpins.getGalaxygatesSpinsId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getId());
        hash = 31 * hash + Byte.hashCode(getGalaxygatesId());
        hash = 31 * hash + Byte.hashCode(getGalaxygatesSpinsId());
        return hash;
    }
}
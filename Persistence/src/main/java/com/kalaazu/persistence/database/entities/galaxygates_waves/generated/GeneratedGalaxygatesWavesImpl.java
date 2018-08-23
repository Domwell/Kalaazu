package com.kalaazu.persistence.database.entities.galaxygates_waves.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesWaves;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Maps;
import com.speedment.common.annotation.GeneratedCode;
import lombok.Data;

/**
 * The generated base implementation of the {@link
 * GalaxygatesWaves}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
@Data
public abstract class GeneratedGalaxygatesWavesImpl implements GalaxygatesWaves {

    private Byte id;

    private byte mapsId;

    private byte seconds;

    private byte npcs;

    protected GeneratedGalaxygatesWavesImpl() {

    }

    @Override
    public Maps findMapsId(Manager<Maps> foreignManager) {
        return foreignManager.stream()
                             .filter(Maps.ID.equal(mapsId()))
                             .findAny()
                             .orElse(null);
    }
}
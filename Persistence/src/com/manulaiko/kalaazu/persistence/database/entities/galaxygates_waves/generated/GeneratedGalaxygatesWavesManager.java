package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.generated;

import com.manulaiko.kalaazu.persistence.database.entities.GalaxygatesWaves;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * GalaxygatesWaves}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedGalaxygatesWavesManager extends Manager<GalaxygatesWaves> {

    List<Field<GalaxygatesWaves>> FIELDS = unmodifiableList(asList(
            GalaxygatesWaves.ID,
            GalaxygatesWaves.MAPS_ID,
            GalaxygatesWaves.SECONDS,
            GalaxygatesWaves.NPCS
    ));

    @Override
    default Class<GalaxygatesWaves> getEntityClass() {
        return GalaxygatesWaves.class;
    }
}
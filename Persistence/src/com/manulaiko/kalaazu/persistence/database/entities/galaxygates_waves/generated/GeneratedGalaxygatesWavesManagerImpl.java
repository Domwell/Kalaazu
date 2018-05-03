package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.generated;

import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.GalaxygatesWaves;
import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.GalaxygatesWavesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.GalaxygatesWaves}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesWavesManagerImpl
        extends AbstractManager<GalaxygatesWaves>
        implements GeneratedGalaxygatesWavesManager {

    private final TableIdentifier<GalaxygatesWaves> tableIdentifier;

    protected GeneratedGalaxygatesWavesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_waves");
    }

    @Override
    public TableIdentifier<GalaxygatesWaves> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<GalaxygatesWaves>> fields() {
        return GalaxygatesWavesManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<GalaxygatesWaves>> primaryKeyFields() {
        return Stream.of(
                GalaxygatesWaves.ID
        );
    }
}
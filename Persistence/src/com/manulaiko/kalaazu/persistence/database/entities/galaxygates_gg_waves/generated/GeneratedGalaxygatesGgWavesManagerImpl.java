package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_waves.generated;

import com.manulaiko.kalaazu.persistence.database.entities.GalaxygatesGgWaves;
import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_waves.GalaxygatesGgWavesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * GalaxygatesGgWaves}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesGgWavesManagerImpl
        extends AbstractManager<GalaxygatesGgWaves>
        implements GeneratedGalaxygatesGgWavesManager {

    private final TableIdentifier<GalaxygatesGgWaves> tableIdentifier;

    protected GeneratedGalaxygatesGgWavesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_gg_waves");
    }

    @Override
    public TableIdentifier<GalaxygatesGgWaves> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<GalaxygatesGgWaves>> fields() {
        return GalaxygatesGgWavesManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<GalaxygatesGgWaves>> primaryKeyFields() {
        return Stream.of(
                GalaxygatesGgWaves.ID
        );
    }
}
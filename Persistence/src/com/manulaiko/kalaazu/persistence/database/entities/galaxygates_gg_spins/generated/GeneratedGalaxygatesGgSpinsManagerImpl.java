package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_spins.generated;

import com.manulaiko.kalaazu.persistence.database.entities.GalaxygatesGgSpins;
import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_gg_spins.GalaxygatesGgSpinsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * GalaxygatesGgSpins}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesGgSpinsManagerImpl
        extends AbstractManager<GalaxygatesGgSpins>
        implements GeneratedGalaxygatesGgSpinsManager {

    private final TableIdentifier<GalaxygatesGgSpins> tableIdentifier;

    protected GeneratedGalaxygatesGgSpinsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_gg_spins");
    }

    @Override
    public TableIdentifier<GalaxygatesGgSpins> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<GalaxygatesGgSpins>> fields() {
        return GalaxygatesGgSpinsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<GalaxygatesGgSpins>> primaryKeyFields() {
        return Stream.of(
                GalaxygatesGgSpins.ID
        );
    }
}
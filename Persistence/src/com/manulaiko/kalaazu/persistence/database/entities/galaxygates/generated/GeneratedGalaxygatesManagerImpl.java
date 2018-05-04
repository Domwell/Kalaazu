package com.manulaiko.kalaazu.persistence.database.entities.galaxygates.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Galaxygates;
import com.manulaiko.kalaazu.persistence.database.entities.galaxygates.GalaxygatesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * Galaxygates}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesManagerImpl
        extends AbstractManager<Galaxygates>
        implements GeneratedGalaxygatesManager {

    private final TableIdentifier<Galaxygates> tableIdentifier;

    protected GeneratedGalaxygatesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates");
    }

    @Override
    public TableIdentifier<Galaxygates> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<Galaxygates>> fields() {
        return GalaxygatesManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<Galaxygates>> primaryKeyFields() {
        return Stream.of(
                Galaxygates.ID
        );
    }
}
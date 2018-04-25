package com.manulaiko.kalaazu.persistence.database.entities.maps.generated;

import com.manulaiko.kalaazu.persistence.database.entities.maps.Maps;
import com.manulaiko.kalaazu.persistence.database.entities.maps.MapsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.maps.Maps} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMapsManagerImpl
        extends AbstractManager<Maps>
        implements GeneratedMapsManager {

    private final TableIdentifier<Maps> tableIdentifier;

    protected GeneratedMapsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "maps");
    }

    @Override
    public TableIdentifier<Maps> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<Maps>> fields() {
        return MapsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<Maps>> primaryKeyFields() {
        return Stream.of(
                Maps.ID
        );
    }
}
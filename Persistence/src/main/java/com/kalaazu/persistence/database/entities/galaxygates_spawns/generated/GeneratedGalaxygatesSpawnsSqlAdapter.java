package com.kalaazu.persistence.database.entities.galaxygates_spawns.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesSpawns;
import com.kalaazu.persistence.database.entities.galaxygates_spawns.GalaxygatesSpawnsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * GalaxygatesSpawns}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesSpawnsSqlAdapter {

    private final TableIdentifier<GalaxygatesSpawns> tableIdentifier;

    protected GeneratedGalaxygatesSpawnsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_spawns");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected GalaxygatesSpawns apply(ResultSet resultSet) throws SpeedmentException {
        final GalaxygatesSpawns entity = createEntity();
        try {
            entity.id(resultSet.getInt(1));
            entity.npcsId(resultSet.getByte(2));
            entity.amount(resultSet.getByte(3));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected GalaxygatesSpawnsImpl createEntity() {
        return new GalaxygatesSpawnsImpl();
    }
}
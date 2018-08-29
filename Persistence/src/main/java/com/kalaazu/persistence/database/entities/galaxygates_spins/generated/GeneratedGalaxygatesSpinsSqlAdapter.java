package com.kalaazu.persistence.database.entities.galaxygates_spins.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesSpins;
import com.kalaazu.persistence.database.entities.galaxygates_spins.GalaxygatesSpinsImpl;
import com.kalaazu.persistence.database.mappers.GalaxyGateProbabilityType;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.Project;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.ProjectComponent;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.component.sql.SqlTypeMapperHelper;
import com.speedment.runtime.core.exception.SpeedmentException;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * GalaxygatesSpins}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesSpinsSqlAdapter {

    private final TableIdentifier<GalaxygatesSpins> tableIdentifier;

    private SqlTypeMapperHelper<Byte, GalaxyGateProbabilityType> typeHelper;

    protected GeneratedGalaxygatesSpinsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_spins");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected GalaxygatesSpins apply(ResultSet resultSet) throws SpeedmentException {
        final GalaxygatesSpins entity = createEntity();
        try {
            entity.id(resultSet.getByte(1));
            entity.type(typeHelper.apply(resultSet.getByte(2)));
            entity.probability(resultSet.getDouble(3));
            entity.itemsId(resultSet.getShort(4));
            entity.amount(resultSet.getShort(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected GalaxygatesSpinsImpl createEntity() {
        return new GalaxygatesSpinsImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        typeHelper = SqlTypeMapperHelper.create(project, GalaxygatesSpins.TYPE, GalaxygatesSpins.class);
    }
}
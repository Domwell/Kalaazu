package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities.generated;

import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities.GalaxygatesProbabilities;
import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities.GalaxygatesProbabilitiesImpl;
import com.manulaiko.kalaazu.persistence.database.mappers.GalaxyGateProbabilityType;
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
 * com.manulaiko.kalaazu.persistence.database.entities.galaxygates_probabilities.GalaxygatesProbabilities}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedGalaxygatesProbabilitiesSqlAdapter {

    private final TableIdentifier<GalaxygatesProbabilities>            tableIdentifier;

    private       SqlTypeMapperHelper<Byte, GalaxyGateProbabilityType> typeHelper;

    protected GeneratedGalaxygatesProbabilitiesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "galaxygates_probabilities");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected GalaxygatesProbabilities apply(ResultSet resultSet) throws SpeedmentException {
        final GalaxygatesProbabilities entity = createEntity();
        try {
            entity.setId(resultSet.getByte(1));
            entity.setGalaxygatesId(resultSet.getByte(2));
            entity.setType(typeHelper.apply(resultSet.getByte(3)));
            entity.setProbability(resultSet.getDouble(4));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected GalaxygatesProbabilitiesImpl createEntity() {
        return new GalaxygatesProbabilitiesImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        typeHelper = SqlTypeMapperHelper.create(project, GalaxygatesProbabilities.TYPE, GalaxygatesProbabilities.class);
    }
}
package com.kalaazu.persistence.database.entities.techfactory_costs.generated;

import com.kalaazu.persistence.database.entities.TechfactoryCosts;
import com.kalaazu.persistence.database.entities.techfactory_costs.TechfactoryCostsImpl;
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
 * TechfactoryCosts}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTechfactoryCostsSqlAdapter {

    private final TableIdentifier<TechfactoryCosts> tableIdentifier;

    protected GeneratedTechfactoryCostsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "techfactory_costs");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected TechfactoryCosts apply(ResultSet resultSet) throws SpeedmentException {
        final TechfactoryCosts entity = createEntity();
        try {
            entity.id(resultSet.getByte(1));
            entity.techfactoryItemsId(resultSet.getByte(2));
            entity.itemsId(resultSet.getShort(3));
            entity.amount(resultSet.getInt(4));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected TechfactoryCostsImpl createEntity() {
        return new TechfactoryCostsImpl();
    }
}
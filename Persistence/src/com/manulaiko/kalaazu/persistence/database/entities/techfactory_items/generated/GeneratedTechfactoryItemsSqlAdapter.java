package com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItems;
import com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItemsImpl;
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
 * com.manulaiko.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItems}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTechfactoryItemsSqlAdapter {

    private final TableIdentifier<TechfactoryItems> tableIdentifier;

    protected GeneratedTechfactoryItemsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "techfactory_items");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected TechfactoryItems apply(ResultSet resultSet) throws SpeedmentException {
        final TechfactoryItems entity = createEntity();
        try {
            entity.setId(resultSet.getByte(1));
            entity.setName(resultSet.getString(2));
            entity.setDescription(resultSet.getString(3));
            entity.setEffect(resultSet.getString(4));
            entity.setDuration(resultSet.getShort(5));
            entity.setCooldown(resultSet.getShort(6));
            entity.setTime(resultSet.getInt(7));
            entity.setFreeProduction(resultSet.getShort(8));
            entity.setInstantProduction(resultSet.getShort(9));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected TechfactoryItemsImpl createEntity() {
        return new TechfactoryItemsImpl();
    }
}
package com.kalaazu.persistence.database.entities.rewards_collectables.generated;

import com.kalaazu.persistence.database.entities.RewardsCollectables;
import com.kalaazu.persistence.database.entities.rewards_collectables.RewardsCollectablesImpl;
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
 * RewardsCollectables}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsCollectablesSqlAdapter {

    private final TableIdentifier<RewardsCollectables> tableIdentifier;

    protected GeneratedRewardsCollectablesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "rewards_collectables");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected RewardsCollectables apply(ResultSet resultSet) throws SpeedmentException {
        final RewardsCollectables entity = createEntity();
        try {
            entity.setId(resultSet.getShort(1));
            entity.setCollectablesId(resultSet.getByte(2));
            entity.setRewardsId(resultSet.getShort(3));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected RewardsCollectablesImpl createEntity() {
        return new RewardsCollectablesImpl();
    }
}
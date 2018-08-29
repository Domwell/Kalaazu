package com.kalaazu.persistence.database.entities.rewards.generated;

import com.kalaazu.persistence.database.entities.Rewards;
import com.kalaazu.persistence.database.entities.rewards.RewardsImpl;
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
 * Rewards} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsSqlAdapter {

    private final TableIdentifier<Rewards> tableIdentifier;

    protected GeneratedRewardsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "rewards");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected Rewards apply(ResultSet resultSet) throws SpeedmentException {
        final Rewards entity = createEntity();
        try {
            entity.id(resultSet.getShort(1));
            entity.itemsId(resultSet.getShort(2));
            entity.amount(resultSet.getInt(3));
            entity.probability(resultSet.getDouble(4));
            entity.comment(resultSet.getString(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected RewardsImpl createEntity() {
        return new RewardsImpl();
    }
}
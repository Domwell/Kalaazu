package com.kalaazu.persistence.database.entities.accounts_rankings.generated;

import com.kalaazu.persistence.database.entities.AccountsRankings;
import com.kalaazu.persistence.database.entities.accounts_rankings.AccountsRankingsImpl;
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
 * AccountsRankings}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsRankingsSqlAdapter {

    private final TableIdentifier<AccountsRankings> tableIdentifier;

    protected GeneratedAccountsRankingsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_rankings");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected AccountsRankings apply(ResultSet resultSet) throws SpeedmentException {
        final AccountsRankings entity = createEntity();
        try {
            entity.id(resultSet.getInt(1));
            entity.accountsId(resultSet.getInt(2));
            entity.points(resultSet.getInt(3));
            entity.bestPoints(resultSet.getInt(4));
            entity.destroyedAllies(resultSet.getShort(5));
            entity.destroyedPhoenix(resultSet.getShort(6));
            entity.destroyedTimes(resultSet.getShort(7));
            entity.destroyedRadiation(resultSet.getShort(8));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected AccountsRankingsImpl createEntity() {
        return new AccountsRankingsImpl();
    }
}
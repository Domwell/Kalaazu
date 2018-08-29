package com.kalaazu.persistence.database.entities.accounts_banks.generated;

import com.kalaazu.persistence.database.entities.AccountsBanks;
import com.kalaazu.persistence.database.entities.accounts_banks.AccountsBanksImpl;
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
 * AccountsBanks}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsBanksSqlAdapter {

    private final TableIdentifier<AccountsBanks> tableIdentifier;

    protected GeneratedAccountsBanksSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_banks");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected AccountsBanks apply(ResultSet resultSet) throws SpeedmentException {
        final AccountsBanks entity = createEntity();
        try {
            entity.id(resultSet.getInt(1));
            entity.accountsId(resultSet.getInt(2));
            entity.credits(resultSet.getLong(3));
            entity.uridium(resultSet.getLong(4));
            entity.taxCredits(resultSet.getByte(5));
            entity.taxUridium(resultSet.getByte(6));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected AccountsBanksImpl createEntity() {
        return new AccountsBanksImpl();
    }
}
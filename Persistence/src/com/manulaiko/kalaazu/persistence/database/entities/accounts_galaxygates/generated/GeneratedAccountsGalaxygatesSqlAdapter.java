package com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygates;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygatesImpl;
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
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygates}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsGalaxygatesSqlAdapter {

    private final TableIdentifier<AccountsGalaxygates> tableIdentifier;

    protected GeneratedAccountsGalaxygatesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_galaxygates");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected AccountsGalaxygates apply(ResultSet resultSet) throws SpeedmentException {
        final AccountsGalaxygates entity = createEntity();
        try {
            entity.setId(resultSet.getInt(1));
            entity.setGalaxygatesId(resultSet.getByte(2));
            entity.setAccountsId(resultSet.getInt(3));
            entity.setParts(resultSet.getByte(4));
            entity.setLifes(resultSet.getByte(5));
            entity.setWave(resultSet.getByte(6));
            entity.setTimes(resultSet.getShort(7));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected AccountsGalaxygatesImpl createEntity() {
        return new AccountsGalaxygatesImpl();
    }
}
package com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.generated;

import com.manulaiko.kalaazu.math.Vector2;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShips;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShipsImpl;
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
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShips}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsShipsSqlAdapter {

    private final TableIdentifier<AccountsShips>     tableIdentifier;

    private       SqlTypeMapperHelper<Long, Vector2> positionHelper;

    protected GeneratedAccountsShipsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_ships");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected AccountsShips apply(ResultSet resultSet) throws SpeedmentException {
        final AccountsShips entity = createEntity();
        try {
            entity.setId(resultSet.getInt(1));
            entity.setAccountsId(resultSet.getInt(2));
            entity.setShipsId(resultSet.getByte(3));
            entity.setMapsId(resultSet.getByte(4));
            entity.setPosition(positionHelper.apply(resultSet.getLong(5)));
            entity.setHealth(resultSet.getInt(6));
            entity.setNanohull(resultSet.getInt(7));
            entity.setGfx(resultSet.getByte(8));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected AccountsShipsImpl createEntity() {
        return new AccountsShipsImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        positionHelper = SqlTypeMapperHelper.create(project, AccountsShips.POSITION, AccountsShips.class);
    }
}
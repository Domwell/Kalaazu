package com.manulaiko.kalaazu.persistence.database.entities.clans_roles.generated;

import com.manulaiko.kalaazu.persistence.database.entities.ClansRoles;
import com.manulaiko.kalaazu.persistence.database.entities.clans_roles.ClansRolesImpl;
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
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getInt;

/**
 * The generated Sql Adapter for a {@link
 * ClansRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansRolesSqlAdapter {

    private final TableIdentifier<ClansRoles> tableIdentifier;

    protected GeneratedClansRolesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_roles");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected ClansRoles apply(ResultSet resultSet) throws SpeedmentException {
        final ClansRoles entity = createEntity();
        try {
            entity.setId(resultSet.getInt(1));
            entity.setName(resultSet.getString(2));
            entity.setClansId(resultSet.getInt(3));
            entity.setClansRolesId(getInt(resultSet, 4));
            entity.setPriority(resultSet.getByte(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected ClansRolesImpl createEntity() {
        return new ClansRolesImpl();
    }
}
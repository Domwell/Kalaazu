package com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.generated;

import com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles;
import com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRolesImpl;
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
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getByte;

/**
 * The generated Sql Adapter for a {@link
 * com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedModeratorsRolesSqlAdapter {

    private final TableIdentifier<ModeratorsRoles> tableIdentifier;

    protected GeneratedModeratorsRolesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "moderators_roles");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected ModeratorsRoles apply(ResultSet resultSet) throws SpeedmentException {
        final ModeratorsRoles entity = createEntity();
        try {
            entity.setId(resultSet.getByte(1));
            entity.setName(resultSet.getString(2));
            entity.setModeratorsRolesId(getByte(resultSet, 3));
            entity.setPriority(resultSet.getByte(4));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected ModeratorsRolesImpl createEntity() {
        return new ModeratorsRolesImpl();
    }
}
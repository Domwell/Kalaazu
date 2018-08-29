package com.kalaazu.persistence.database.entities.moderators_roles_permissions.generated;

import com.kalaazu.persistence.database.entities.ModeratorsRolesPermissions;
import com.kalaazu.persistence.database.entities.moderators_roles_permissions.ModeratorsRolesPermissionsImpl;
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
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getInt;

/**
 * The generated Sql Adapter for a {@link
 * ModeratorsRolesPermissions}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedModeratorsRolesPermissionsSqlAdapter {

    private final TableIdentifier<ModeratorsRolesPermissions> tableIdentifier;

    private SqlTypeMapperHelper<Integer, Boolean> isEnabledHelper;

    protected GeneratedModeratorsRolesPermissionsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "moderators_roles_permissions");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected ModeratorsRolesPermissions apply(ResultSet resultSet) throws SpeedmentException {
        final ModeratorsRolesPermissions entity = createEntity();
        try {
            entity.id(resultSet.getByte(1));
            entity.moderatorsRolesId(resultSet.getByte(2));
            entity.permissionsId(resultSet.getByte(3));
            entity.isEnabled(isEnabledHelper.apply(getInt(resultSet, 4)));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected ModeratorsRolesPermissionsImpl createEntity() {
        return new ModeratorsRolesPermissionsImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        isEnabledHelper = SqlTypeMapperHelper.create(
                project, ModeratorsRolesPermissions.IS_ENABLED, ModeratorsRolesPermissions.class);
    }
}
package com.manulaiko.kalaazu.persistence.database.entities.users.generated;

import com.manulaiko.kalaazu.persistence.database.entities.users.Users;
import com.manulaiko.kalaazu.persistence.database.entities.users.UsersImpl;
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
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getShort;

/**
 * The generated Sql Adapter for a {@link
 * com.manulaiko.kalaazu.persistence.database.entities.users.Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersSqlAdapter {

    private final TableIdentifier<Users>              tableIdentifier;

    private       SqlTypeMapperHelper<Object, byte[]> ipHelper;

    protected GeneratedUsersSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "users");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected Users apply(ResultSet resultSet) throws SpeedmentException {
        final Users entity = createEntity();
        try {
            entity.setId(resultSet.getInt(1));
            entity.setDate(resultSet.getTimestamp(2));
            entity.setInvitationCodesId(getShort(resultSet, 3));
            entity.setName(resultSet.getString(4));
            entity.setPassword(resultSet.getString(5));
            entity.setEmail(resultSet.getString(6));
            entity.setEmailVerificationCode(resultSet.getString(7));
            entity.setEmailVerificationDate(resultSet.getTimestamp(8));
            entity.setIp(ipHelper.apply(resultSet.getObject(9)));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected UsersImpl createEntity() {
        return new UsersImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        ipHelper = SqlTypeMapperHelper.create(project, Users.IP, Users.class);
    }
}
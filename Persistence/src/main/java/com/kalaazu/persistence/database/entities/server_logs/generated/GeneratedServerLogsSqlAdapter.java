package com.kalaazu.persistence.database.entities.server_logs.generated;

import com.kalaazu.persistence.database.entities.ServerLogs;
import com.kalaazu.persistence.database.entities.server_logs.ServerLogsImpl;
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
 * ServerLogs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedServerLogsSqlAdapter {

    private final TableIdentifier<ServerLogs> tableIdentifier;

    protected GeneratedServerLogsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "server_logs");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected ServerLogs apply(ResultSet resultSet) throws SpeedmentException {
        final ServerLogs entity = createEntity();
        try {
            entity.id(resultSet.getInt(1));
            entity.date(resultSet.getTimestamp(2));
            entity.level(resultSet.getString(3));
            entity.type(resultSet.getString(4));
            entity.context(resultSet.getString(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected ServerLogsImpl createEntity() {
        return new ServerLogsImpl();
    }
}
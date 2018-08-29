package com.kalaazu.persistence.database.entities.clans_battlestations.generated;

import com.kalaazu.math.Vector2;
import com.kalaazu.persistence.database.entities.ClansBattlestations;
import com.kalaazu.persistence.database.entities.clans_battlestations.ClansBattlestationsImpl;
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
 * ClansBattlestations}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBattlestationsSqlAdapter {

    private final TableIdentifier<ClansBattlestations> tableIdentifier;

    private SqlTypeMapperHelper<Long, Vector2> positionHelper;

    protected GeneratedClansBattlestationsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_battlestations");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected ClansBattlestations apply(ResultSet resultSet) throws SpeedmentException {
        final ClansBattlestations entity = createEntity();
        try {
            entity.id(resultSet.getByte(1));
            entity.clansId(getInt(resultSet, 2));
            entity.mapsId(resultSet.getByte(3));
            entity.name(resultSet.getString(4));
            entity.position(positionHelper.apply(resultSet.getLong(5)));
            entity.date(resultSet.getTimestamp(6));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected ClansBattlestationsImpl createEntity() {
        return new ClansBattlestationsImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        positionHelper = SqlTypeMapperHelper.create(project, ClansBattlestations.POSITION, ClansBattlestations.class);
    }
}
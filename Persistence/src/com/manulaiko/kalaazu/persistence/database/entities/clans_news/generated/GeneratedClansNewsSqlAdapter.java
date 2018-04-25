package com.manulaiko.kalaazu.persistence.database.entities.clans_news.generated;

import com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNews;
import com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNewsImpl;
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
 * com.manulaiko.kalaazu.persistence.database.entities.clans_news.ClansNews}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansNewsSqlAdapter {

    private final TableIdentifier<ClansNews> tableIdentifier;

    protected GeneratedClansNewsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_news");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected ClansNews apply(ResultSet resultSet) throws SpeedmentException {
        final ClansNews entity = createEntity();
        try {
            entity.setId(resultSet.getInt(1));
            entity.setAccountsId(resultSet.getInt(2));
            entity.setClansId(resultSet.getInt(3));
            entity.setDate(resultSet.getTimestamp(4));
            entity.setText(resultSet.getString(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected ClansNewsImpl createEntity() {
        return new ClansNewsImpl();
    }
}
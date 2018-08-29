package com.kalaazu.persistence.database.entities.news.generated;

import com.kalaazu.persistence.database.entities.News;
import com.kalaazu.persistence.database.entities.news.NewsImpl;
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
 * News} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedNewsSqlAdapter {

    private final TableIdentifier<News> tableIdentifier;

    protected GeneratedNewsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "news");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected News apply(ResultSet resultSet) throws SpeedmentException {
        final News entity = createEntity();
        try {
            entity.id(resultSet.getShort(1));
            entity.date(resultSet.getTimestamp(2));
            entity.image(resultSet.getString(3));
            entity.title(resultSet.getString(4));
            entity.teaser(resultSet.getString(5));
            entity.text(resultSet.getString(6));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected NewsImpl createEntity() {
        return new NewsImpl();
    }
}
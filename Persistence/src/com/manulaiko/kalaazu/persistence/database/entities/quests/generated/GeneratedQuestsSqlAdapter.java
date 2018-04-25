package com.manulaiko.kalaazu.persistence.database.entities.quests.generated;

import com.manulaiko.kalaazu.persistence.database.entities.quests.Quests;
import com.manulaiko.kalaazu.persistence.database.entities.quests.QuestsImpl;
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
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getShort;

/**
 * The generated Sql Adapter for a {@link
 * com.manulaiko.kalaazu.persistence.database.entities.quests.Quests} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedQuestsSqlAdapter {

    private final TableIdentifier<Quests> tableIdentifier;

    protected GeneratedQuestsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "quests");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected Quests apply(ResultSet resultSet) throws SpeedmentException {
        final Quests entity = createEntity();
        try {
            entity.setId(resultSet.getShort(1));
            entity.setLevelsId(resultSet.getByte(2));
            entity.setQuestsId(getShort(resultSet, 3));
            entity.setFactionsId(getByte(resultSet, 4));
            entity.setName(resultSet.getString(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected QuestsImpl createEntity() {
        return new QuestsImpl();
    }
}
package com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.QuestsConditions;
import com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.QuestsConditionsImpl;
import com.manulaiko.kalaazu.persistence.database.mappers.QuestConditionType;
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
 * com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.QuestsConditions}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedQuestsConditionsSqlAdapter {

    private final TableIdentifier<QuestsConditions>             tableIdentifier;

    private       SqlTypeMapperHelper<Byte, QuestConditionType> typeHelper;

    protected GeneratedQuestsConditionsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "quests_conditions");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected QuestsConditions apply(ResultSet resultSet) throws SpeedmentException {
        final QuestsConditions entity = createEntity();
        try {
            entity.setId(resultSet.getInt(1));
            entity.setQuestsConditionsId(getInt(resultSet, 2));
            entity.setQuestsId(resultSet.getShort(3));
            entity.setType(typeHelper.apply(resultSet.getByte(4)));
            entity.setValue(resultSet.getString(5));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected QuestsConditionsImpl createEntity() {
        return new QuestsConditionsImpl();
    }

    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        typeHelper = SqlTypeMapperHelper.create(project, QuestsConditions.TYPE, QuestsConditions.class);
    }
}
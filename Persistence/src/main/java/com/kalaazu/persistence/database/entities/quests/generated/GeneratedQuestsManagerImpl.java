package com.kalaazu.persistence.database.entities.quests.generated;

import com.kalaazu.persistence.database.entities.Quests;
import com.kalaazu.persistence.database.entities.quests.QuestsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.kalaazu.persistence.database.entities.quests.Quests} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedQuestsManagerImpl
        extends AbstractManager<Quests>
        implements GeneratedQuestsManager {

    private final TableIdentifier<Quests> tableIdentifier;

    protected GeneratedQuestsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "quests");
    }

    @Override
    public TableIdentifier<Quests> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<Quests>> fields() {
        return QuestsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<Quests>> primaryKeyFields() {
        return Stream.of(
                Quests.ID
        );
    }
}
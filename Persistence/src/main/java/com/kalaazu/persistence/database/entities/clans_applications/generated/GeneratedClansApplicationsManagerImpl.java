package com.kalaazu.persistence.database.entities.clans_applications.generated;

import com.kalaazu.persistence.database.entities.ClansApplications;
import com.kalaazu.persistence.database.entities.clans_applications.ClansApplicationsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.kalaazu.persistence.database.entities.clans_applications.ClansApplications}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansApplicationsManagerImpl
        extends AbstractManager<ClansApplications>
        implements GeneratedClansApplicationsManager {

    private final TableIdentifier<ClansApplications> tableIdentifier;

    protected GeneratedClansApplicationsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_applications");
    }

    @Override
    public TableIdentifier<ClansApplications> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<ClansApplications>> fields() {
        return ClansApplicationsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<ClansApplications>> primaryKeyFields() {
        return Stream.of(
                ClansApplications.ID
        );
    }
}
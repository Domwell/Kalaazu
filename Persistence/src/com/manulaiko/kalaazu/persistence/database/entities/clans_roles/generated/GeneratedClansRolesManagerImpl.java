package com.manulaiko.kalaazu.persistence.database.entities.clans_roles.generated;

import com.manulaiko.kalaazu.persistence.database.entities.clans_roles.ClansRoles;
import com.manulaiko.kalaazu.persistence.database.entities.clans_roles.ClansRolesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_roles.ClansRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansRolesManagerImpl
        extends AbstractManager<ClansRoles>
        implements GeneratedClansRolesManager {

    private final TableIdentifier<ClansRoles> tableIdentifier;

    protected GeneratedClansRolesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_roles");
    }

    @Override
    public TableIdentifier<ClansRoles> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<ClansRoles>> fields() {
        return ClansRolesManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<ClansRoles>> primaryKeyFields() {
        return Stream.of(
                ClansRoles.ID
        );
    }
}
package com.kalaazu.persistence.database.entities.clans_roles_permissions.generated;

import com.kalaazu.persistence.database.entities.ClansRolesPermissions;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.clans_roles_permissions.ClansRolesPermissions}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansRolesPermissionsManager extends Manager<ClansRolesPermissions> {

    TableIdentifier<ClansRolesPermissions> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "clans_roles_permissions"
    );

    List<Field<ClansRolesPermissions>>     FIELDS     = unmodifiableList(asList(
            ClansRolesPermissions.ID,
            ClansRolesPermissions.CLANS_ROLES_ID,
            ClansRolesPermissions.PERMISSIONS_ID,
            ClansRolesPermissions.IS_ENABLED
    ));

    @Override
    default Class<ClansRolesPermissions> getEntityClass() {
        return ClansRolesPermissions.class;
    }
}
package com.kalaazu.persistence.database.entities.clans_roles_permissions;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.ClansRoles;
import com.kalaazu.persistence.database.entities.ClansRolesPermissions;
import com.kalaazu.persistence.database.entities.ModeratorsRoles;
import com.kalaazu.persistence.database.entities.Permissions;
import com.kalaazu.persistence.database.entities.clans_roles_permissions.generated.GeneratedClansRolesPermissionsImpl;

/**
 * The default implementation of the {@link
 * ClansRolesPermissions}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class ClansRolesPermissionsImpl
        extends GeneratedClansRolesPermissionsImpl
        implements ClansRolesPermissions {
    /**
     * The role.
     */
    private ClansRoles role;

    /**
     * The permission.
     */
    private Permissions permission;

    @Override
    public ClansRoles getRole() {
        if (this.role != null) {
            return this.role;
        }

        this.role = super.findClansRolesId(
                Database.getInstance()
                        .getDb()
                        .manager(ModeratorsRoles.class)
        );

        return this.role;
    }

    @Override
    public Permissions getPermission() {
        if (this.permission != null) {
            return this.permission;
        }

        this.permission = super.findPermissionsId(
                Database.getInstance()
                        .getDb()
                        .manager(Permissions.class)
        );

        return this.permission;
    }

    @Override
    public int getRolesId() {
        return super.getClansRolesId();
    }
}
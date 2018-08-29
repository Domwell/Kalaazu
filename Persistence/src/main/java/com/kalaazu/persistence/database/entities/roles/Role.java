package com.kalaazu.persistence.database.entities.roles;

import java.util.List;
import java.util.Optional;

/**
 * Role interface.
 * ===============
 *
 * Base interface for all roles.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface Role {
    /**
     * Returns parent role.
     *
     * @return Parent role.
     */
    Optional<? extends Role> role();

    /**
     * Returns role's permissions.
     *
     * @return Role's permissions.
     */
    List<? extends RolePermission> permissions();

    /**
     * Checks if the give permission is allowed.
     *
     * @param permission Permission to check.
     *
     * @return Whether this role has `permission` enabled or not.
     */
    default boolean can(Permission permission) {
        var p = this.findPermission(permission);

        if (!p.isPresent()) {
            return this.parentCan(permission);
        }

        var enabled = p.get()
                       .isEnabled();

        if (enabled.isPresent()) {
            return enabled.getAsBoolean();
        }

        return this.parentCan(permission);
    }

    private Optional<RolePermission> findPermission(Permission permissions) {
        for (RolePermission p : this.permissions()) {
            if (p.permissionsId() == permissions.id()) {
                return Optional.of(p);
            }
        }

        return Optional.empty();
    }

    private boolean parentCan(Permission permission) {
        if (!this.role()
                 .isPresent()) {
            return false;
        }

        return this.role()
                   .get()
                   .can(permission);
    }
}

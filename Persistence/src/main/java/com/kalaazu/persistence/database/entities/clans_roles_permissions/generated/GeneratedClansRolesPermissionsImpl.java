package com.kalaazu.persistence.database.entities.clans_roles_permissions.generated;

import com.kalaazu.persistence.database.entities.ClansRoles;
import com.kalaazu.persistence.database.entities.ClansRolesPermissions;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Permissions;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.function.OptionalBoolean;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * ClansRolesPermissions}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansRolesPermissionsImpl implements ClansRolesPermissions {

    private int id;

    private int clansRolesId;

    private byte permissionsId;

    private boolean isEnabled;

    protected GeneratedClansRolesPermissionsImpl() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getClansRolesId() {
        return clansRolesId;
    }

    @Override
    public byte permissionId() {
        return permissionsId;
    }

    @Override
    public OptionalBoolean enabled() {
        return OptionalUtil.ofNullable(isEnabled);
    }

    @Override
    public ClansRolesPermissions setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public ClansRolesPermissions setClansRolesId(int clansRolesId) {
        this.clansRolesId = clansRolesId;
        return this;
    }

    @Override
    public ClansRolesPermissions setPermissionsId(byte permissionsId) {
        this.permissionsId = permissionsId;
        return this;
    }

    @Override
    public ClansRolesPermissions setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    @Override
    public ClansRoles findClansRolesId(Manager<ClansRoles> foreignManager) {
        return foreignManager.stream()
                             .filter(ClansRoles.ID.equal(getClansRolesId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Permissions findPermissionsId(Manager<Permissions> foreignManager) {
        return foreignManager.stream()
                             .filter(Permissions.ID.equal(permissionId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("clansRolesId = " + Objects.toString(getClansRolesId()));
        sj.add("permissionsId = " + Objects.toString(permissionId()));
        sj.add("isEnabled = " + Objects.toString(OptionalUtil.unwrap(enabled())));
        return "ClansRolesPermissionsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ClansRolesPermissions)) {
            return false;
        }
        final ClansRolesPermissions thatClansRolesPermissions = (ClansRolesPermissions) that;
        if (this.getId() != thatClansRolesPermissions.getId()) {
            return false;
        }
        if (this.getClansRolesId() != thatClansRolesPermissions.getClansRolesId()) {
            return false;
        }
        if (this.permissionId() != thatClansRolesPermissions.getPermissionsId()) {
            return false;
        }
        if (this.enabled() != thatClansRolesPermissions.getIsEnabled()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getClansRolesId());
        hash = 31 * hash + Byte.hashCode(permissionId());
        hash = 31 * hash + Boolean.hashCode(enabled().orElse(false));
        return hash;
    }
}
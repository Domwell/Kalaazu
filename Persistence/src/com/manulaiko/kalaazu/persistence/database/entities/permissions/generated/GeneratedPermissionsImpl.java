package com.manulaiko.kalaazu.persistence.database.entities.permissions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.permissions.Permissions;
import com.speedment.common.annotation.GeneratedCode;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.permissions.Permissions}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedPermissionsImpl implements Permissions {

    private byte   id;

    private String name;

    private String category;

    protected GeneratedPermissionsImpl() {

    }

    @Override
    public byte getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public Permissions setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public Permissions setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Permissions setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("category = " + Objects.toString(getCategory()));
        return "PermissionsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Permissions)) {
            return false;
        }
        final Permissions thatPermissions = (Permissions) that;
        if (this.getId() != thatPermissions.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatPermissions.getName())) {
            return false;
        }
        if (!Objects.equals(this.getCategory(), thatPermissions.getCategory())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getCategory());
        return hash;
    }
}
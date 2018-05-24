package com.kalaazu.persistence.database.entities.moderators_roles.generated;

import com.kalaazu.persistence.database.entities.ModeratorsRoles;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedModeratorsRolesImpl implements ModeratorsRoles {

    private byte   id;

    private String name;

    private Byte   moderatorsRolesId;

    private byte   priority;

    protected GeneratedModeratorsRolesImpl() {
    }

    @Override
    public Byte getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Optional<Byte> getModeratorsRolesId() {
        return Optional.ofNullable(moderatorsRolesId);
    }

    @Override
    public byte getPriority() {
        return priority;
    }

    @Override
    public ModeratorsRoles setId(byte id) {
        this.id = id;
        return this;
    }

    @Override
    public ModeratorsRoles setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ModeratorsRoles setModeratorsRolesId(Byte moderatorsRolesId) {
        this.moderatorsRolesId = moderatorsRolesId;
        return this;
    }

    @Override
    public ModeratorsRoles setPriority(byte priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("moderatorsRolesId = " + Objects.toString(OptionalUtil.unwrap(getModeratorsRolesId())));
        sj.add("priority = " + Objects.toString(getPriority()));
        return "ModeratorsRolesImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof ModeratorsRoles)) {
            return false;
        }
        final ModeratorsRoles thatModeratorsRoles = (ModeratorsRoles) that;
        if (this.getId() != thatModeratorsRoles.getId()) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatModeratorsRoles.getName())) {
            return false;
        }
        if (!Objects.equals(this.getModeratorsRolesId(), thatModeratorsRoles.getModeratorsRolesId())) {
            return false;
        }
        if (this.getPriority() != thatModeratorsRoles.getPriority()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Byte.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getModeratorsRolesId()));
        hash = 31 * hash + Byte.hashCode(getPriority());
        return hash;
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.ModeratorsRolesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Moderator's roles.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModeratorsRoles extends TableImpl<ModeratorsRolesRecord> {

    private static final long serialVersionUID = -365304965;

    /**
     * The reference instance of <code>kalaazu.moderators_roles</code>
     */
    public static final ModeratorsRoles MODERATORS_ROLES = new ModeratorsRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ModeratorsRolesRecord> getRecordType() {
        return ModeratorsRolesRecord.class;
    }

    /**
     * The column <code>kalaazu.moderators_roles.id</code>. Primary Key.
     */
    public final TableField<ModeratorsRolesRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.moderators_roles.name</code>.
     */
    public final TableField<ModeratorsRolesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kalaazu.moderators_roles.moderators_roles_id</code>. Parent role.
     */
    public final TableField<ModeratorsRolesRecord, Byte> MODERATORS_ROLES_ID = createField(DSL.name("moderators_roles_id"), org.jooq.impl.SQLDataType.TINYINT, this, "Parent role.");

    /**
     * The column <code>kalaazu.moderators_roles.priority</code>.
     */
    public final TableField<ModeratorsRolesRecord, Byte> PRIORITY = createField(DSL.name("priority"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>kalaazu.moderators_roles</code> table reference
     */
    public ModeratorsRoles() {
        this(DSL.name("moderators_roles"), null);
    }

    /**
     * Create an aliased <code>kalaazu.moderators_roles</code> table reference
     */
    public ModeratorsRoles(String alias) {
        this(DSL.name(alias), MODERATORS_ROLES);
    }

    /**
     * Create an aliased <code>kalaazu.moderators_roles</code> table reference
     */
    public ModeratorsRoles(Name alias) {
        this(alias, MODERATORS_ROLES);
    }

    private ModeratorsRoles(Name alias, Table<ModeratorsRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ModeratorsRoles(Name alias, Table<ModeratorsRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Moderator's roles."));
    }

    public <O extends Record> ModeratorsRoles(Table<O> child, ForeignKey<O, ModeratorsRolesRecord> key) {
        super(child, key, MODERATORS_ROLES);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MODERATORS_ROLES_MODERATORS_ROLES_NAME_IDX, Indexes.MODERATORS_ROLES_PRIMARY);
    }

    @Override
    public Identity<ModeratorsRolesRecord, Byte> getIdentity() {
        return Keys.IDENTITY_MODERATORS_ROLES;
    }

    @Override
    public UniqueKey<ModeratorsRolesRecord> getPrimaryKey() {
        return Keys.KEY_MODERATORS_ROLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ModeratorsRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<ModeratorsRolesRecord>>asList(Keys.KEY_MODERATORS_ROLES_PRIMARY);
    }

    @Override
    public ModeratorsRoles as(String alias) {
        return new ModeratorsRoles(DSL.name(alias), this);
    }

    @Override
    public ModeratorsRoles as(Name alias) {
        return new ModeratorsRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ModeratorsRoles rename(String name) {
        return new ModeratorsRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ModeratorsRoles rename(Name name) {
        return new ModeratorsRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Byte, String, Byte, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

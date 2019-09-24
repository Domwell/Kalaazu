/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.ClansRolesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Clan's roles.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClansRoles extends TableImpl<ClansRolesRecord> {

    private static final long serialVersionUID = 1603572200;

    /**
     * The reference instance of <code>kalaazu.clans_roles</code>
     */
    public static final ClansRoles CLANS_ROLES = new ClansRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClansRolesRecord> getRecordType() {
        return ClansRolesRecord.class;
    }

    /**
     * The column <code>kalaazu.clans_roles.id</code>. Primary Key.
     */
    public final TableField<ClansRolesRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.clans_roles.name</code>.
     */
    public final TableField<ClansRolesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kalaazu.clans_roles.clans_id</code>.
     */
    public final TableField<ClansRolesRecord, Integer> CLANS_ID = createField(DSL.name("clans_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kalaazu.clans_roles.clans_roles_id</code>. Parent role.
     */
    public final TableField<ClansRolesRecord, Integer> CLANS_ROLES_ID = createField(DSL.name("clans_roles_id"), org.jooq.impl.SQLDataType.INTEGER, this, "Parent role.");

    /**
     * The column <code>kalaazu.clans_roles.priority</code>.
     */
    public final TableField<ClansRolesRecord, Byte> PRIORITY = createField(DSL.name("priority"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>kalaazu.clans_roles</code> table reference
     */
    public ClansRoles() {
        this(DSL.name("clans_roles"), null);
    }

    /**
     * Create an aliased <code>kalaazu.clans_roles</code> table reference
     */
    public ClansRoles(String alias) {
        this(DSL.name(alias), CLANS_ROLES);
    }

    /**
     * Create an aliased <code>kalaazu.clans_roles</code> table reference
     */
    public ClansRoles(Name alias) {
        this(alias, CLANS_ROLES);
    }

    private ClansRoles(Name alias, Table<ClansRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClansRoles(Name alias, Table<ClansRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Clan's roles."));
    }

    public <O extends Record> ClansRoles(Table<O> child, ForeignKey<O, ClansRolesRecord> key) {
        super(child, key, CLANS_ROLES);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CLANS_ROLES_CLANS_ROLES_CLANS_ID_IDX, Indexes.CLANS_ROLES_CLANS_ROLES_NAME_IDX, Indexes.CLANS_ROLES_PRIMARY);
    }

    @Override
    public Identity<ClansRolesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLANS_ROLES;
    }

    @Override
    public UniqueKey<ClansRolesRecord> getPrimaryKey() {
        return Keys.KEY_CLANS_ROLES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ClansRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClansRolesRecord>>asList(Keys.KEY_CLANS_ROLES_PRIMARY);
    }

    @Override
    public List<ForeignKey<ClansRolesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClansRolesRecord, ?>>asList(Keys.CLANS_ROLES_CLANS);
    }

    public Clans clans() {
        return new Clans(this, Keys.CLANS_ROLES_CLANS);
    }

    @Override
    public ClansRoles as(String alias) {
        return new ClansRoles(DSL.name(alias), this);
    }

    @Override
    public ClansRoles as(Name alias) {
        return new ClansRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClansRoles rename(String name) {
        return new ClansRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClansRoles rename(Name name) {
        return new ClansRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Integer, Integer, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

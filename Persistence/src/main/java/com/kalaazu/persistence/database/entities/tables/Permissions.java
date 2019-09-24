/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.PermissionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Server permissions.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Permissions extends TableImpl<PermissionsRecord> {

    private static final long serialVersionUID = 603655076;

    /**
     * The reference instance of <code>kalaazu.permissions</code>
     */
    public static final Permissions PERMISSIONS = new Permissions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PermissionsRecord> getRecordType() {
        return PermissionsRecord.class;
    }

    /**
     * The column <code>kalaazu.permissions.id</code>. Primary Key.
     */
    public final TableField<PermissionsRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.permissions.name</code>.
     */
    public final TableField<PermissionsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kalaazu.permissions.category</code>.
     */
    public final TableField<PermissionsRecord, String> CATEGORY = createField(DSL.name("category"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>kalaazu.permissions</code> table reference
     */
    public Permissions() {
        this(DSL.name("permissions"), null);
    }

    /**
     * Create an aliased <code>kalaazu.permissions</code> table reference
     */
    public Permissions(String alias) {
        this(DSL.name(alias), PERMISSIONS);
    }

    /**
     * Create an aliased <code>kalaazu.permissions</code> table reference
     */
    public Permissions(Name alias) {
        this(alias, PERMISSIONS);
    }

    private Permissions(Name alias, Table<PermissionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Permissions(Name alias, Table<PermissionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Server permissions."));
    }

    public <O extends Record> Permissions(Table<O> child, ForeignKey<O, PermissionsRecord> key) {
        super(child, key, PERMISSIONS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PERMISSIONS_PERMISSIONS_CATEGORY_IDX, Indexes.PERMISSIONS_PERMISSIONS_NAME_IDX, Indexes.PERMISSIONS_PRIMARY);
    }

    @Override
    public Identity<PermissionsRecord, Byte> getIdentity() {
        return Keys.IDENTITY_PERMISSIONS;
    }

    @Override
    public UniqueKey<PermissionsRecord> getPrimaryKey() {
        return Keys.KEY_PERMISSIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<PermissionsRecord>> getKeys() {
        return Arrays.<UniqueKey<PermissionsRecord>>asList(Keys.KEY_PERMISSIONS_PRIMARY);
    }

    @Override
    public Permissions as(String alias) {
        return new Permissions(DSL.name(alias), this);
    }

    @Override
    public Permissions as(Name alias) {
        return new Permissions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Permissions rename(String name) {
        return new Permissions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Permissions rename(Name name) {
        return new Permissions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Byte, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.FactionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Contains server's factions.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Factions extends TableImpl<FactionsRecord> {

    private static final long serialVersionUID = -992912547;

    /**
     * The reference instance of <code>kalaazu.factions</code>
     */
    public static final Factions FACTIONS = new Factions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FactionsRecord> getRecordType() {
        return FactionsRecord.class;
    }

    /**
     * The column <code>kalaazu.factions.id</code>. Primary Key.
     */
    public final TableField<FactionsRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.factions.name</code>.
     */
    public final TableField<FactionsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>kalaazu.factions.tag</code>. Name abbreviation.
     */
    public final TableField<FactionsRecord, String> TAG = createField(DSL.name("tag"), org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Name abbreviation.");

    /**
     * The column <code>kalaazu.factions.description</code>.
     */
    public final TableField<FactionsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>kalaazu.factions.is_public</code>.
     */
    public final TableField<FactionsRecord, Byte> IS_PUBLIC = createField(DSL.name("is_public"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>kalaazu.factions.low_maps_id</code>.
     */
    public final TableField<FactionsRecord, Byte> LOW_MAPS_ID = createField(DSL.name("low_maps_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>kalaazu.factions.low_maps_position</code>. Starting position on map.
     */
    public final TableField<FactionsRecord, Long> LOW_MAPS_POSITION = createField(DSL.name("low_maps_position"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "Starting position on map.");

    /**
     * The column <code>kalaazu.factions.high_maps_id</code>.
     */
    public final TableField<FactionsRecord, Byte> HIGH_MAPS_ID = createField(DSL.name("high_maps_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>kalaazu.factions.high_maps_position</code>. Starting position on map.
     */
    public final TableField<FactionsRecord, Long> HIGH_MAPS_POSITION = createField(DSL.name("high_maps_position"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "Starting position on map.");

    /**
     * Create a <code>kalaazu.factions</code> table reference
     */
    public Factions() {
        this(DSL.name("factions"), null);
    }

    /**
     * Create an aliased <code>kalaazu.factions</code> table reference
     */
    public Factions(String alias) {
        this(DSL.name(alias), FACTIONS);
    }

    /**
     * Create an aliased <code>kalaazu.factions</code> table reference
     */
    public Factions(Name alias) {
        this(alias, FACTIONS);
    }

    private Factions(Name alias, Table<FactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Factions(Name alias, Table<FactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains server's factions."));
    }

    public <O extends Record> Factions(Table<O> child, ForeignKey<O, FactionsRecord> key) {
        super(child, key, FACTIONS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FACTIONS_FACTIONS_HIGH_MAPS, Indexes.FACTIONS_FACTIONS_LOW_MAPS, Indexes.FACTIONS_FACTIONS_NAME_IDX, Indexes.FACTIONS_FACTIONS_TAG_IDX, Indexes.FACTIONS_PRIMARY);
    }

    @Override
    public Identity<FactionsRecord, Byte> getIdentity() {
        return Keys.IDENTITY_FACTIONS;
    }

    @Override
    public UniqueKey<FactionsRecord> getPrimaryKey() {
        return Keys.KEY_FACTIONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<FactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<FactionsRecord>>asList(Keys.KEY_FACTIONS_PRIMARY, Keys.KEY_FACTIONS_FACTIONS_NAME_IDX, Keys.KEY_FACTIONS_FACTIONS_TAG_IDX);
    }

    @Override
    public List<ForeignKey<FactionsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FactionsRecord, ?>>asList(Keys.FACTIONS_LOW_MAPS, Keys.FACTIONS_HIGH_MAPS);
    }

    public Maps factionsLowMaps() {
        return new Maps(this, Keys.FACTIONS_LOW_MAPS);
    }

    public Maps factionsHighMaps() {
        return new Maps(this, Keys.FACTIONS_HIGH_MAPS);
    }

    @Override
    public Factions as(String alias) {
        return new Factions(DSL.name(alias), this);
    }

    @Override
    public Factions as(Name alias) {
        return new Factions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Factions rename(String name) {
        return new Factions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Factions rename(Name name) {
        return new Factions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Byte, String, String, String, Byte, Byte, Long, Byte, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}

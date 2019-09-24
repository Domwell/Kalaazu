/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.GalaxygatesWavesRecord;

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
 * Waves of the galaxy gate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GalaxygatesWaves extends TableImpl<GalaxygatesWavesRecord> {

    private static final long serialVersionUID = 643396001;

    /**
     * The reference instance of <code>kalaazu.galaxygates_waves</code>
     */
    public static final GalaxygatesWaves GALAXYGATES_WAVES = new GalaxygatesWaves();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GalaxygatesWavesRecord> getRecordType() {
        return GalaxygatesWavesRecord.class;
    }

    /**
     * The column <code>kalaazu.galaxygates_waves.id</code>. Primary Key.
     */
    public final TableField<GalaxygatesWavesRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.galaxygates_waves.maps_id</code>. Map
     */
    public final TableField<GalaxygatesWavesRecord, Byte> MAPS_ID = createField(DSL.name("maps_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "Map");

    /**
     * The column <code>kalaazu.galaxygates_waves.seconds</code>. Seconds to wait between stages
     */
    public final TableField<GalaxygatesWavesRecord, Byte> SECONDS = createField(DSL.name("seconds"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("120", org.jooq.impl.SQLDataType.TINYINT)), this, "Seconds to wait between stages");

    /**
     * The column <code>kalaazu.galaxygates_waves.npcs</code>. NPCS that the user must destroy to spawn next stage
     */
    public final TableField<GalaxygatesWavesRecord, Byte> NPCS = createField(DSL.name("npcs"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("5", org.jooq.impl.SQLDataType.TINYINT)), this, "NPCS that the user must destroy to spawn next stage");

    /**
     * Create a <code>kalaazu.galaxygates_waves</code> table reference
     */
    public GalaxygatesWaves() {
        this(DSL.name("galaxygates_waves"), null);
    }

    /**
     * Create an aliased <code>kalaazu.galaxygates_waves</code> table reference
     */
    public GalaxygatesWaves(String alias) {
        this(DSL.name(alias), GALAXYGATES_WAVES);
    }

    /**
     * Create an aliased <code>kalaazu.galaxygates_waves</code> table reference
     */
    public GalaxygatesWaves(Name alias) {
        this(alias, GALAXYGATES_WAVES);
    }

    private GalaxygatesWaves(Name alias, Table<GalaxygatesWavesRecord> aliased) {
        this(alias, aliased, null);
    }

    private GalaxygatesWaves(Name alias, Table<GalaxygatesWavesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Waves of the galaxy gate."));
    }

    public <O extends Record> GalaxygatesWaves(Table<O> child, ForeignKey<O, GalaxygatesWavesRecord> key) {
        super(child, key, GALAXYGATES_WAVES);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GALAXYGATES_WAVES_GALAXYGATES_WAVES_MAPS_ID_IDX, Indexes.GALAXYGATES_WAVES_PRIMARY);
    }

    @Override
    public Identity<GalaxygatesWavesRecord, Byte> getIdentity() {
        return Keys.IDENTITY_GALAXYGATES_WAVES;
    }

    @Override
    public UniqueKey<GalaxygatesWavesRecord> getPrimaryKey() {
        return Keys.KEY_GALAXYGATES_WAVES_PRIMARY;
    }

    @Override
    public List<UniqueKey<GalaxygatesWavesRecord>> getKeys() {
        return Arrays.<UniqueKey<GalaxygatesWavesRecord>>asList(Keys.KEY_GALAXYGATES_WAVES_PRIMARY);
    }

    @Override
    public List<ForeignKey<GalaxygatesWavesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GalaxygatesWavesRecord, ?>>asList(Keys.GALAXYGATES_WAVES_MAPS);
    }

    public Maps maps() {
        return new Maps(this, Keys.GALAXYGATES_WAVES_MAPS);
    }

    @Override
    public GalaxygatesWaves as(String alias) {
        return new GalaxygatesWaves(DSL.name(alias), this);
    }

    @Override
    public GalaxygatesWaves as(Name alias) {
        return new GalaxygatesWaves(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GalaxygatesWaves rename(String name) {
        return new GalaxygatesWaves(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GalaxygatesWaves rename(Name name) {
        return new GalaxygatesWaves(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Byte, Byte, Byte, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

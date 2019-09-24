/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.ShipsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Ships table.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ships extends TableImpl<ShipsRecord> {

    private static final long serialVersionUID = 663456640;

    /**
     * The reference instance of <code>kalaazu.ships</code>
     */
    public static final Ships SHIPS = new Ships();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShipsRecord> getRecordType() {
        return ShipsRecord.class;
    }

    /**
     * The column <code>kalaazu.ships.id</code>. Primary Key.
     */
    public final TableField<ShipsRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.ships.items_id</code>.
     */
    public final TableField<ShipsRecord, Short> ITEMS_ID = createField(DSL.name("items_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>kalaazu.ships.health</code>. Health points
     */
    public final TableField<ShipsRecord, Integer> HEALTH = createField(DSL.name("health"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Health points");

    /**
     * The column <code>kalaazu.ships.speed</code>. Base speed.
     */
    public final TableField<ShipsRecord, Short> SPEED = createField(DSL.name("speed"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "Base speed.");

    /**
     * The column <code>kalaazu.ships.cargo</code>. Cargo space.
     */
    public final TableField<ShipsRecord, Short> CARGO = createField(DSL.name("cargo"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("100", org.jooq.impl.SQLDataType.SMALLINT)), this, "Cargo space.");

    /**
     * The column <code>kalaazu.ships.batteries</code>. Batteries space.
     */
    public final TableField<ShipsRecord, Short> BATTERIES = createField(DSL.name("batteries"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1000", org.jooq.impl.SQLDataType.SMALLINT)), this, "Batteries space.");

    /**
     * The column <code>kalaazu.ships.rockets</code>. Rockets space.
     */
    public final TableField<ShipsRecord, Short> ROCKETS = createField(DSL.name("rockets"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("100", org.jooq.impl.SQLDataType.SMALLINT)), this, "Rockets space.");

    /**
     * The column <code>kalaazu.ships.lasers</code>. Laser slots.
     */
    public final TableField<ShipsRecord, Byte> LASERS = createField(DSL.name("lasers"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Laser slots.");

    /**
     * The column <code>kalaazu.ships.hellstorms</code>. Laser slots.
     */
    public final TableField<ShipsRecord, Byte> HELLSTORMS = createField(DSL.name("hellstorms"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Laser slots.");

    /**
     * The column <code>kalaazu.ships.generators</code>. Generator slots.
     */
    public final TableField<ShipsRecord, Byte> GENERATORS = createField(DSL.name("generators"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Generator slots.");

    /**
     * The column <code>kalaazu.ships.extras</code>. Extras slots.
     */
    public final TableField<ShipsRecord, Byte> EXTRAS = createField(DSL.name("extras"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Extras slots.");

    /**
     * The column <code>kalaazu.ships.gfx</code>.
     */
    public final TableField<ShipsRecord, Byte> GFX = createField(DSL.name("gfx"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>kalaazu.ships</code> table reference
     */
    public Ships() {
        this(DSL.name("ships"), null);
    }

    /**
     * Create an aliased <code>kalaazu.ships</code> table reference
     */
    public Ships(String alias) {
        this(DSL.name(alias), SHIPS);
    }

    /**
     * Create an aliased <code>kalaazu.ships</code> table reference
     */
    public Ships(Name alias) {
        this(alias, SHIPS);
    }

    private Ships(Name alias, Table<ShipsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ships(Name alias, Table<ShipsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Ships table."));
    }

    public <O extends Record> Ships(Table<O> child, ForeignKey<O, ShipsRecord> key) {
        super(child, key, SHIPS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SHIPS_PRIMARY, Indexes.SHIPS_SHIPS_GFX_IDX, Indexes.SHIPS_SHIPS_ITEMS_ID_IDX);
    }

    @Override
    public Identity<ShipsRecord, Byte> getIdentity() {
        return Keys.IDENTITY_SHIPS;
    }

    @Override
    public UniqueKey<ShipsRecord> getPrimaryKey() {
        return Keys.KEY_SHIPS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ShipsRecord>> getKeys() {
        return Arrays.<UniqueKey<ShipsRecord>>asList(Keys.KEY_SHIPS_PRIMARY);
    }

    @Override
    public List<ForeignKey<ShipsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShipsRecord, ?>>asList(Keys.SHIPS_ITEMS);
    }

    public Items items() {
        return new Items(this, Keys.SHIPS_ITEMS);
    }

    @Override
    public Ships as(String alias) {
        return new Ships(DSL.name(alias), this);
    }

    @Override
    public Ships as(Name alias) {
        return new Ships(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ships rename(String name) {
        return new Ships(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ships rename(Name name) {
        return new Ships(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Byte, Short, Integer, Short, Short, Short, Short, Byte, Byte, Byte, Byte, Byte> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.TechfactoryCostsRecord;

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
 * Item production costs.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TechfactoryCosts extends TableImpl<TechfactoryCostsRecord> {

    private static final long serialVersionUID = -833593833;

    /**
     * The reference instance of <code>kalaazu.techfactory_costs</code>
     */
    public static final TechfactoryCosts TECHFACTORY_COSTS = new TechfactoryCosts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TechfactoryCostsRecord> getRecordType() {
        return TechfactoryCostsRecord.class;
    }

    /**
     * The column <code>kalaazu.techfactory_costs.id</code>. Primary Key.
     */
    public final TableField<TechfactoryCostsRecord, Byte> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.techfactory_costs.techfactory_items_id</code>. Techfactory Item ID.
     */
    public final TableField<TechfactoryCostsRecord, Byte> TECHFACTORY_ITEMS_ID = createField(DSL.name("techfactory_items_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "Techfactory Item ID.");

    /**
     * The column <code>kalaazu.techfactory_costs.items_id</code>. Cost item ID.
     */
    public final TableField<TechfactoryCostsRecord, Short> ITEMS_ID = createField(DSL.name("items_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "Cost item ID.");

    /**
     * The column <code>kalaazu.techfactory_costs.amount</code>. Amount of items to build the techfactory item.
     */
    public final TableField<TechfactoryCostsRecord, Integer> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Amount of items to build the techfactory item.");

    /**
     * Create a <code>kalaazu.techfactory_costs</code> table reference
     */
    public TechfactoryCosts() {
        this(DSL.name("techfactory_costs"), null);
    }

    /**
     * Create an aliased <code>kalaazu.techfactory_costs</code> table reference
     */
    public TechfactoryCosts(String alias) {
        this(DSL.name(alias), TECHFACTORY_COSTS);
    }

    /**
     * Create an aliased <code>kalaazu.techfactory_costs</code> table reference
     */
    public TechfactoryCosts(Name alias) {
        this(alias, TECHFACTORY_COSTS);
    }

    private TechfactoryCosts(Name alias, Table<TechfactoryCostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TechfactoryCosts(Name alias, Table<TechfactoryCostsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Item production costs."));
    }

    public <O extends Record> TechfactoryCosts(Table<O> child, ForeignKey<O, TechfactoryCostsRecord> key) {
        super(child, key, TECHFACTORY_COSTS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TECHFACTORY_COSTS_PRIMARY, Indexes.TECHFACTORY_COSTS_TECHFACTORY_COSTS_ITEMS, Indexes.TECHFACTORY_COSTS_TECHFACTORY_COSTS_TECHFACTORY_ITEMS);
    }

    @Override
    public Identity<TechfactoryCostsRecord, Byte> getIdentity() {
        return Keys.IDENTITY_TECHFACTORY_COSTS;
    }

    @Override
    public UniqueKey<TechfactoryCostsRecord> getPrimaryKey() {
        return Keys.KEY_TECHFACTORY_COSTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<TechfactoryCostsRecord>> getKeys() {
        return Arrays.<UniqueKey<TechfactoryCostsRecord>>asList(Keys.KEY_TECHFACTORY_COSTS_PRIMARY);
    }

    @Override
    public List<ForeignKey<TechfactoryCostsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TechfactoryCostsRecord, ?>>asList(Keys.TECHFACTORY_COSTS_TECHFACTORY_ITEMS, Keys.TECHFACTORY_COSTS_ITEMS);
    }

    public TechfactoryItems techfactoryItems() {
        return new TechfactoryItems(this, Keys.TECHFACTORY_COSTS_TECHFACTORY_ITEMS);
    }

    public Items items() {
        return new Items(this, Keys.TECHFACTORY_COSTS_ITEMS);
    }

    @Override
    public TechfactoryCosts as(String alias) {
        return new TechfactoryCosts(DSL.name(alias), this);
    }

    @Override
    public TechfactoryCosts as(Name alias) {
        return new TechfactoryCosts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TechfactoryCosts rename(String name) {
        return new TechfactoryCosts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TechfactoryCosts rename(Name name) {
        return new TechfactoryCosts(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Byte, Byte, Short, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

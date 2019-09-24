/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.LevelsUpgradesRecord;

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
 * Contains the upgrade costs for each level.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LevelsUpgrades extends TableImpl<LevelsUpgradesRecord> {

    private static final long serialVersionUID = 1735122043;

    /**
     * The reference instance of <code>kalaazu.levels_upgrades</code>
     */
    public static final LevelsUpgrades LEVELS_UPGRADES = new LevelsUpgrades();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LevelsUpgradesRecord> getRecordType() {
        return LevelsUpgradesRecord.class;
    }

    /**
     * The column <code>kalaazu.levels_upgrades.id</code>. Primary Key.
     */
    public final TableField<LevelsUpgradesRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.levels_upgrades.levels_id</code>. The upgrade level.
     */
    public final TableField<LevelsUpgradesRecord, Byte> LEVELS_ID = createField(DSL.name("levels_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "The upgrade level.");

    /**
     * The column <code>kalaazu.levels_upgrades.probability</code>. Probability level.
     */
    public final TableField<LevelsUpgradesRecord, Byte> PROBABILITY = createField(DSL.name("probability"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("5", org.jooq.impl.SQLDataType.TINYINT)), this, "Probability level.");

    /**
     * The column <code>kalaazu.levels_upgrades.credits</code>. Credits needed to upgrade to this level with given probability.
     */
    public final TableField<LevelsUpgradesRecord, Integer> CREDITS = createField(DSL.name("credits"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Credits needed to upgrade to this level with given probability.");

    /**
     * The column <code>kalaazu.levels_upgrades.uridium</code>. Uridium needed to upgrade to this level with given probability.
     */
    public final TableField<LevelsUpgradesRecord, Short> URIDIUM = createField(DSL.name("uridium"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "Uridium needed to upgrade to this level with given probability.");

    /**
     * Create a <code>kalaazu.levels_upgrades</code> table reference
     */
    public LevelsUpgrades() {
        this(DSL.name("levels_upgrades"), null);
    }

    /**
     * Create an aliased <code>kalaazu.levels_upgrades</code> table reference
     */
    public LevelsUpgrades(String alias) {
        this(DSL.name(alias), LEVELS_UPGRADES);
    }

    /**
     * Create an aliased <code>kalaazu.levels_upgrades</code> table reference
     */
    public LevelsUpgrades(Name alias) {
        this(alias, LEVELS_UPGRADES);
    }

    private LevelsUpgrades(Name alias, Table<LevelsUpgradesRecord> aliased) {
        this(alias, aliased, null);
    }

    private LevelsUpgrades(Name alias, Table<LevelsUpgradesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains the upgrade costs for each level."));
    }

    public <O extends Record> LevelsUpgrades(Table<O> child, ForeignKey<O, LevelsUpgradesRecord> key) {
        super(child, key, LEVELS_UPGRADES);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.LEVELS_UPGRADES_LEVELS_UPGRADES_LEVELS, Indexes.LEVELS_UPGRADES_PRIMARY);
    }

    @Override
    public Identity<LevelsUpgradesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LEVELS_UPGRADES;
    }

    @Override
    public UniqueKey<LevelsUpgradesRecord> getPrimaryKey() {
        return Keys.KEY_LEVELS_UPGRADES_PRIMARY;
    }

    @Override
    public List<UniqueKey<LevelsUpgradesRecord>> getKeys() {
        return Arrays.<UniqueKey<LevelsUpgradesRecord>>asList(Keys.KEY_LEVELS_UPGRADES_PRIMARY);
    }

    @Override
    public List<ForeignKey<LevelsUpgradesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<LevelsUpgradesRecord, ?>>asList(Keys.LEVELS_UPGRADES_LEVELS);
    }

    public Levels levels() {
        return new Levels(this, Keys.LEVELS_UPGRADES_LEVELS);
    }

    @Override
    public LevelsUpgrades as(String alias) {
        return new LevelsUpgrades(DSL.name(alias), this);
    }

    @Override
    public LevelsUpgrades as(Name alias) {
        return new LevelsUpgrades(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LevelsUpgrades rename(String name) {
        return new LevelsUpgrades(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LevelsUpgrades rename(Name name) {
        return new LevelsUpgrades(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Byte, Byte, Integer, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

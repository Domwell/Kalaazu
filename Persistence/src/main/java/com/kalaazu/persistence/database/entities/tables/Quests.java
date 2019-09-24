/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.QuestsRecord;

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
 * In game quests.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Quests extends TableImpl<QuestsRecord> {

    private static final long serialVersionUID = 986841548;

    /**
     * The reference instance of <code>kalaazu.quests</code>
     */
    public static final Quests QUESTS = new Quests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QuestsRecord> getRecordType() {
        return QuestsRecord.class;
    }

    /**
     * The column <code>kalaazu.quests.id</code>. Primary Key.
     */
    public final TableField<QuestsRecord, Short> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.quests.levels_id</code>. Level required to unlock this quest.
     */
    public final TableField<QuestsRecord, Byte> LEVELS_ID = createField(DSL.name("levels_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.TINYINT)), this, "Level required to unlock this quest.");

    /**
     * The column <code>kalaazu.quests.quests_id</code>. Quest required to complete in order to unlock this quest.
     */
    public final TableField<QuestsRecord, Short> QUESTS_ID = createField(DSL.name("quests_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "Quest required to complete in order to unlock this quest.");

    /**
     * The column <code>kalaazu.quests.factions_id</code>. Faction required to unlock this quest.
     */
    public final TableField<QuestsRecord, Byte> FACTIONS_ID = createField(DSL.name("factions_id"), org.jooq.impl.SQLDataType.TINYINT, this, "Faction required to unlock this quest.");

    /**
     * The column <code>kalaazu.quests.name</code>.
     */
    public final TableField<QuestsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>kalaazu.quests</code> table reference
     */
    public Quests() {
        this(DSL.name("quests"), null);
    }

    /**
     * Create an aliased <code>kalaazu.quests</code> table reference
     */
    public Quests(String alias) {
        this(DSL.name(alias), QUESTS);
    }

    /**
     * Create an aliased <code>kalaazu.quests</code> table reference
     */
    public Quests(Name alias) {
        this(alias, QUESTS);
    }

    private Quests(Name alias, Table<QuestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Quests(Name alias, Table<QuestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("In game quests."));
    }

    public <O extends Record> Quests(Table<O> child, ForeignKey<O, QuestsRecord> key) {
        super(child, key, QUESTS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.QUESTS_PRIMARY, Indexes.QUESTS_QUESTS_FACTIONS, Indexes.QUESTS_QUESTS_LEVELS_ID, Indexes.QUESTS_QUESTS_NAME, Indexes.QUESTS_QUESTS_QUESTS_ID);
    }

    @Override
    public Identity<QuestsRecord, Short> getIdentity() {
        return Keys.IDENTITY_QUESTS;
    }

    @Override
    public UniqueKey<QuestsRecord> getPrimaryKey() {
        return Keys.KEY_QUESTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<QuestsRecord>> getKeys() {
        return Arrays.<UniqueKey<QuestsRecord>>asList(Keys.KEY_QUESTS_PRIMARY);
    }

    @Override
    public List<ForeignKey<QuestsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<QuestsRecord, ?>>asList(Keys.QUESTS_LEVELS, Keys.QUESTS_QUESTS, Keys.QUESTS_FACTIONS);
    }

    public Levels levels() {
        return new Levels(this, Keys.QUESTS_LEVELS);
    }

    public com.kalaazu.persistence.database.entities.tables.Quests quests() {
        return new com.kalaazu.persistence.database.entities.tables.Quests(this, Keys.QUESTS_QUESTS);
    }

    public Factions factions() {
        return new Factions(this, Keys.QUESTS_FACTIONS);
    }

    @Override
    public Quests as(String alias) {
        return new Quests(DSL.name(alias), this);
    }

    @Override
    public Quests as(Name alias) {
        return new Quests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Quests rename(String name) {
        return new Quests(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Quests rename(Name name) {
        return new Quests(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Short, Byte, Short, Byte, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

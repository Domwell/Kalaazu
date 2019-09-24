/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.RewardsNpcsRecord;

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
 * Many to many relations.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RewardsNpcs extends TableImpl<RewardsNpcsRecord> {

    private static final long serialVersionUID = -1622488128;

    /**
     * The reference instance of <code>kalaazu.rewards_npcs</code>
     */
    public static final RewardsNpcs REWARDS_NPCS = new RewardsNpcs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RewardsNpcsRecord> getRecordType() {
        return RewardsNpcsRecord.class;
    }

    /**
     * The column <code>kalaazu.rewards_npcs.id</code>. Primary Key.
     */
    public final TableField<RewardsNpcsRecord, Short> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.rewards_npcs.npcs_id</code>. NPC ID.
     */
    public final TableField<RewardsNpcsRecord, Byte> NPCS_ID = createField(DSL.name("npcs_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "NPC ID.");

    /**
     * The column <code>kalaazu.rewards_npcs.rewards_id</code>. Reward to award.
     */
    public final TableField<RewardsNpcsRecord, Short> REWARDS_ID = createField(DSL.name("rewards_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "Reward to award.");

    /**
     * Create a <code>kalaazu.rewards_npcs</code> table reference
     */
    public RewardsNpcs() {
        this(DSL.name("rewards_npcs"), null);
    }

    /**
     * Create an aliased <code>kalaazu.rewards_npcs</code> table reference
     */
    public RewardsNpcs(String alias) {
        this(DSL.name(alias), REWARDS_NPCS);
    }

    /**
     * Create an aliased <code>kalaazu.rewards_npcs</code> table reference
     */
    public RewardsNpcs(Name alias) {
        this(alias, REWARDS_NPCS);
    }

    private RewardsNpcs(Name alias, Table<RewardsNpcsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RewardsNpcs(Name alias, Table<RewardsNpcsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Many to many relations."));
    }

    public <O extends Record> RewardsNpcs(Table<O> child, ForeignKey<O, RewardsNpcsRecord> key) {
        super(child, key, REWARDS_NPCS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.REWARDS_NPCS_PRIMARY, Indexes.REWARDS_NPCS_REWARDS_NPCS_NPCS_ID_IDX, Indexes.REWARDS_NPCS_REWARDS_NPCS_REWARDS_ID_IDX);
    }

    @Override
    public Identity<RewardsNpcsRecord, Short> getIdentity() {
        return Keys.IDENTITY_REWARDS_NPCS;
    }

    @Override
    public UniqueKey<RewardsNpcsRecord> getPrimaryKey() {
        return Keys.KEY_REWARDS_NPCS_PRIMARY;
    }

    @Override
    public List<UniqueKey<RewardsNpcsRecord>> getKeys() {
        return Arrays.<UniqueKey<RewardsNpcsRecord>>asList(Keys.KEY_REWARDS_NPCS_PRIMARY);
    }

    @Override
    public List<ForeignKey<RewardsNpcsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RewardsNpcsRecord, ?>>asList(Keys.REWARDS_NPCS_NPCS, Keys.REWARDS_NPCS_REWARDS);
    }

    public Npcs npcs() {
        return new Npcs(this, Keys.REWARDS_NPCS_NPCS);
    }

    public Rewards rewards() {
        return new Rewards(this, Keys.REWARDS_NPCS_REWARDS);
    }

    @Override
    public RewardsNpcs as(String alias) {
        return new RewardsNpcs(DSL.name(alias), this);
    }

    @Override
    public RewardsNpcs as(Name alias) {
        return new RewardsNpcs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RewardsNpcs rename(String name) {
        return new RewardsNpcs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RewardsNpcs rename(Name name) {
        return new RewardsNpcs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Short, Byte, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

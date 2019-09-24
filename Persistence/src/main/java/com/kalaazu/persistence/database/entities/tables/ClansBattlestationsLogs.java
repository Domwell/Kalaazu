/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.ClansBattlestationsLogsRecord;

import java.sql.Timestamp;
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
 * Logs from clan's battlestations.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClansBattlestationsLogs extends TableImpl<ClansBattlestationsLogsRecord> {

    private static final long serialVersionUID = 236741626;

    /**
     * The reference instance of <code>kalaazu.clans_battlestations_logs</code>
     */
    public static final ClansBattlestationsLogs CLANS_BATTLESTATIONS_LOGS = new ClansBattlestationsLogs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClansBattlestationsLogsRecord> getRecordType() {
        return ClansBattlestationsLogsRecord.class;
    }

    /**
     * The column <code>kalaazu.clans_battlestations_logs.id</code>. Primary Key.
     */
    public final TableField<ClansBattlestationsLogsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.clans_battlestations_logs.clans_id</code>.
     */
    public final TableField<ClansBattlestationsLogsRecord, Integer> CLANS_ID = createField(DSL.name("clans_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kalaazu.clans_battlestations_logs.clans_battlestations_id</code>.
     */
    public final TableField<ClansBattlestationsLogsRecord, Byte> CLANS_BATTLESTATIONS_ID = createField(DSL.name("clans_battlestations_id"), org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>kalaazu.clans_battlestations_logs.message</code>.
     */
    public final TableField<ClansBattlestationsLogsRecord, String> MESSAGE = createField(DSL.name("message"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>kalaazu.clans_battlestations_logs.date</code>.
     */
    public final TableField<ClansBattlestationsLogsRecord, Timestamp> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kalaazu.clans_battlestations_logs</code> table reference
     */
    public ClansBattlestationsLogs() {
        this(DSL.name("clans_battlestations_logs"), null);
    }

    /**
     * Create an aliased <code>kalaazu.clans_battlestations_logs</code> table reference
     */
    public ClansBattlestationsLogs(String alias) {
        this(DSL.name(alias), CLANS_BATTLESTATIONS_LOGS);
    }

    /**
     * Create an aliased <code>kalaazu.clans_battlestations_logs</code> table reference
     */
    public ClansBattlestationsLogs(Name alias) {
        this(alias, CLANS_BATTLESTATIONS_LOGS);
    }

    private ClansBattlestationsLogs(Name alias, Table<ClansBattlestationsLogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClansBattlestationsLogs(Name alias, Table<ClansBattlestationsLogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Logs from clan's battlestations."));
    }

    public <O extends Record> ClansBattlestationsLogs(Table<O> child, ForeignKey<O, ClansBattlestationsLogsRecord> key) {
        super(child, key, CLANS_BATTLESTATIONS_LOGS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CLANS_BATTLESTATIONS_LOGS_CLANS_BATTLESTATIONS_LOGS_CLANS_BATTLESTATIONS_ID_IDX, Indexes.CLANS_BATTLESTATIONS_LOGS_CLANS_BATTLESTATIONS_LOGS_CLANS_ID_IDX, Indexes.CLANS_BATTLESTATIONS_LOGS_PRIMARY);
    }

    @Override
    public Identity<ClansBattlestationsLogsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLANS_BATTLESTATIONS_LOGS;
    }

    @Override
    public UniqueKey<ClansBattlestationsLogsRecord> getPrimaryKey() {
        return Keys.KEY_CLANS_BATTLESTATIONS_LOGS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ClansBattlestationsLogsRecord>> getKeys() {
        return Arrays.<UniqueKey<ClansBattlestationsLogsRecord>>asList(Keys.KEY_CLANS_BATTLESTATIONS_LOGS_PRIMARY);
    }

    @Override
    public List<ForeignKey<ClansBattlestationsLogsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ClansBattlestationsLogsRecord, ?>>asList(Keys.CLANS_BATTLESTATIONS_LOGS_CLANS, Keys.CLANS_BATTLESTATIONS_LOGS_CLANS_BATTLESTATIONS);
    }

    public Clans clans() {
        return new Clans(this, Keys.CLANS_BATTLESTATIONS_LOGS_CLANS);
    }

    public ClansBattlestations clansBattlestations() {
        return new ClansBattlestations(this, Keys.CLANS_BATTLESTATIONS_LOGS_CLANS_BATTLESTATIONS);
    }

    @Override
    public ClansBattlestationsLogs as(String alias) {
        return new ClansBattlestationsLogs(DSL.name(alias), this);
    }

    @Override
    public ClansBattlestationsLogs as(Name alias) {
        return new ClansBattlestationsLogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClansBattlestationsLogs rename(String name) {
        return new ClansBattlestationsLogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClansBattlestationsLogs rename(Name name) {
        return new ClansBattlestationsLogs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Byte, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

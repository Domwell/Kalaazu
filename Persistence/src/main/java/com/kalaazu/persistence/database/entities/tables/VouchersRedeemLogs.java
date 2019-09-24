/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.VouchersRedeemLogsRecord;

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
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Contains the redeem logs for the voucher codes.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VouchersRedeemLogs extends TableImpl<VouchersRedeemLogsRecord> {

    private static final long serialVersionUID = 928739598;

    /**
     * The reference instance of <code>kalaazu.vouchers_redeem_logs</code>
     */
    public static final VouchersRedeemLogs VOUCHERS_REDEEM_LOGS = new VouchersRedeemLogs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VouchersRedeemLogsRecord> getRecordType() {
        return VouchersRedeemLogsRecord.class;
    }

    /**
     * The column <code>kalaazu.vouchers_redeem_logs.id</code>. Primary Key.
     */
    public final TableField<VouchersRedeemLogsRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.vouchers_redeem_logs.vouchers_id</code>. Voucher code ID.
     */
    public final TableField<VouchersRedeemLogsRecord, Short> VOUCHERS_ID = createField(DSL.name("vouchers_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "Voucher code ID.");

    /**
     * The column <code>kalaazu.vouchers_redeem_logs.accounts_id</code>. Account that redeemed the voucher.
     */
    public final TableField<VouchersRedeemLogsRecord, Integer> ACCOUNTS_ID = createField(DSL.name("accounts_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Account that redeemed the voucher.");

    /**
     * The column <code>kalaazu.vouchers_redeem_logs.date</code>. Date when the voucher was redeemed.
     */
    public final TableField<VouchersRedeemLogsRecord, Timestamp> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "Date when the voucher was redeemed.");

    /**
     * Create a <code>kalaazu.vouchers_redeem_logs</code> table reference
     */
    public VouchersRedeemLogs() {
        this(DSL.name("vouchers_redeem_logs"), null);
    }

    /**
     * Create an aliased <code>kalaazu.vouchers_redeem_logs</code> table reference
     */
    public VouchersRedeemLogs(String alias) {
        this(DSL.name(alias), VOUCHERS_REDEEM_LOGS);
    }

    /**
     * Create an aliased <code>kalaazu.vouchers_redeem_logs</code> table reference
     */
    public VouchersRedeemLogs(Name alias) {
        this(alias, VOUCHERS_REDEEM_LOGS);
    }

    private VouchersRedeemLogs(Name alias, Table<VouchersRedeemLogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private VouchersRedeemLogs(Name alias, Table<VouchersRedeemLogsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains the redeem logs for the voucher codes."));
    }

    public <O extends Record> VouchersRedeemLogs(Table<O> child, ForeignKey<O, VouchersRedeemLogsRecord> key) {
        super(child, key, VOUCHERS_REDEEM_LOGS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VOUCHERS_REDEEM_LOGS_PRIMARY, Indexes.VOUCHERS_REDEEM_LOGS_VOUCHERS_REDEEM_LOGS_ACCOUNTS_ID_IDX, Indexes.VOUCHERS_REDEEM_LOGS_VOUCHERS_REDEEM_LOGS_VOUCHERS_ID_IDX);
    }

    @Override
    public Identity<VouchersRedeemLogsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VOUCHERS_REDEEM_LOGS;
    }

    @Override
    public UniqueKey<VouchersRedeemLogsRecord> getPrimaryKey() {
        return Keys.KEY_VOUCHERS_REDEEM_LOGS_PRIMARY;
    }

    @Override
    public List<UniqueKey<VouchersRedeemLogsRecord>> getKeys() {
        return Arrays.<UniqueKey<VouchersRedeemLogsRecord>>asList(Keys.KEY_VOUCHERS_REDEEM_LOGS_PRIMARY);
    }

    @Override
    public List<ForeignKey<VouchersRedeemLogsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VouchersRedeemLogsRecord, ?>>asList(Keys.VOUCHERS_REDEEM_LOGS_VOUCHERS, Keys.VOUCHERS_REDEEM_LOGS_ACCOUNTS);
    }

    public Vouchers vouchers() {
        return new Vouchers(this, Keys.VOUCHERS_REDEEM_LOGS_VOUCHERS);
    }

    public Accounts accounts() {
        return new Accounts(this, Keys.VOUCHERS_REDEEM_LOGS_ACCOUNTS);
    }

    @Override
    public VouchersRedeemLogs as(String alias) {
        return new VouchersRedeemLogs(DSL.name(alias), this);
    }

    @Override
    public VouchersRedeemLogs as(Name alias) {
        return new VouchersRedeemLogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VouchersRedeemLogs rename(String name) {
        return new VouchersRedeemLogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VouchersRedeemLogs rename(Name name) {
        return new VouchersRedeemLogs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

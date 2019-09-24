/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.RewardsVouchersRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RewardsVouchers extends TableImpl<RewardsVouchersRecord> {

    /**
     * The reference instance of <code>kalaazu.rewards_vouchers</code>
     */
    public static final RewardsVouchers REWARDS_VOUCHERS = new RewardsVouchers();
    private static final long serialVersionUID = -1672849067;
    /**
     * The column <code>kalaazu.rewards_vouchers.id</code>. Primary Key.
     */
    public final TableField<RewardsVouchersRecord, Short> ID = createField(
            DSL.name("id"),
            org.jooq.impl.SQLDataType.SMALLINT.nullable(false).identity(true),
            this,
            "Primary Key."
    );
    /**
     * The column <code>kalaazu.rewards_vouchers.vouchers_id</code>. Voucher ID.
     */
    public final TableField<RewardsVouchersRecord, Short> VOUCHERS_ID = createField(
            DSL.name("vouchers_id"),
            org.jooq.impl.SQLDataType.SMALLINT.nullable(false),
            this,
            "Voucher ID."
    );
    /**
     * The column <code>kalaazu.rewards_vouchers.rewards_id</code>. Reward to award.
     */
    public final TableField<RewardsVouchersRecord, Short> REWARDS_ID = createField(
            DSL.name("rewards_id"),
            org.jooq.impl.SQLDataType.SMALLINT.nullable(false),
            this,
            "Reward to award."
    );

    /**
     * Create a <code>kalaazu.rewards_vouchers</code> table reference
     */
    public RewardsVouchers() {
        this(DSL.name("rewards_vouchers"), null);
    }

    /**
     * Create an aliased <code>kalaazu.rewards_vouchers</code> table reference
     */
    public RewardsVouchers(String alias) {
        this(DSL.name(alias), REWARDS_VOUCHERS);
    }

    /**
     * Create an aliased <code>kalaazu.rewards_vouchers</code> table reference
     */
    public RewardsVouchers(Name alias) {
        this(alias, REWARDS_VOUCHERS);
    }

    private RewardsVouchers(Name alias, Table<RewardsVouchersRecord> aliased) {
        this(alias, aliased, null);
    }

    private RewardsVouchers(Name alias, Table<RewardsVouchersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Many to many relations."));
    }

    public <O extends Record> RewardsVouchers(Table<O> child, ForeignKey<O, RewardsVouchersRecord> key) {
        super(child, key, REWARDS_VOUCHERS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RewardsVouchersRecord> getRecordType() {
        return RewardsVouchersRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(
                Indexes.REWARDS_VOUCHERS_PRIMARY,
                Indexes.REWARDS_VOUCHERS_REWARDS_VOUCHERS_REWARDS_ID_IDX,
                Indexes.REWARDS_VOUCHERS_REWARDS_VOUCHERS_VOUCHERS_ID_IDX
        );
    }

    @Override
    public Identity<RewardsVouchersRecord, Short> getIdentity() {
        return Keys.IDENTITY_REWARDS_VOUCHERS;
    }

    @Override
    public UniqueKey<RewardsVouchersRecord> getPrimaryKey() {
        return Keys.KEY_REWARDS_VOUCHERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<RewardsVouchersRecord>> getKeys() {
        return Arrays.<UniqueKey<RewardsVouchersRecord>>asList(Keys.KEY_REWARDS_VOUCHERS_PRIMARY);
    }

    @Override
    public List<ForeignKey<RewardsVouchersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RewardsVouchersRecord, ?>>asList(
                Keys.REWARDS_VOUCHERS_VOUCHERS,
                Keys.REWARDS_VOUCHERS_REWARDS
        );
    }

    public Vouchers vouchers() {
        return new Vouchers(this, Keys.REWARDS_VOUCHERS_VOUCHERS);
    }

    public Rewards rewards() {
        return new Rewards(this, Keys.REWARDS_VOUCHERS_REWARDS);
    }

    @Override
    public RewardsVouchers as(String alias) {
        return new RewardsVouchers(DSL.name(alias), this);
    }

    @Override
    public RewardsVouchers as(Name alias) {
        return new RewardsVouchers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RewardsVouchers rename(String name) {
        return new RewardsVouchers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RewardsVouchers rename(Name name) {
        return new RewardsVouchers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Short, Short, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

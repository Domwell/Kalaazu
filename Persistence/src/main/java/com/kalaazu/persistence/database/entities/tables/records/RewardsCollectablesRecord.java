/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.RewardsCollectables;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class RewardsCollectablesRecord extends UpdatableRecordImpl<RewardsCollectablesRecord> implements Record3<Short, Byte, Short> {

    private static final long serialVersionUID = -667115205;

    /**
     * Setter for <code>kalaazu.rewards_collectables.id</code>. Primary Key.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.rewards_collectables.id</code>. Primary Key.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>kalaazu.rewards_collectables.collectables_id</code>. Collectable ID.
     */
    public void setCollectablesId(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.rewards_collectables.collectables_id</code>. Collectable ID.
     */
    public Byte getCollectablesId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.rewards_collectables.rewards_id</code>. Reward to award.
     */
    public void setRewardsId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.rewards_collectables.rewards_id</code>. Reward to award.
     */
    public Short getRewardsId() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Short, Byte, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Short, Byte, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return RewardsCollectables.REWARDS_COLLECTABLES.ID;
    }

    @Override
    public Field<Byte> field2() {
        return RewardsCollectables.REWARDS_COLLECTABLES.COLLECTABLES_ID;
    }

    @Override
    public Field<Short> field3() {
        return RewardsCollectables.REWARDS_COLLECTABLES.REWARDS_ID;
    }

    @Override
    public Short component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getCollectablesId();
    }

    @Override
    public Short component3() {
        return getRewardsId();
    }

    @Override
    public Short value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getCollectablesId();
    }

    @Override
    public Short value3() {
        return getRewardsId();
    }

    @Override
    public RewardsCollectablesRecord value1(Short value) {
        setId(value);
        return this;
    }

    @Override
    public RewardsCollectablesRecord value2(Byte value) {
        setCollectablesId(value);
        return this;
    }

    @Override
    public RewardsCollectablesRecord value3(Short value) {
        setRewardsId(value);
        return this;
    }

    @Override
    public RewardsCollectablesRecord values(Short value1, Byte value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RewardsCollectablesRecord
     */
    public RewardsCollectablesRecord() {
        super(RewardsCollectables.REWARDS_COLLECTABLES);
    }

    /**
     * Create a detached, initialised RewardsCollectablesRecord
     */
    public RewardsCollectablesRecord(Short id, Byte collectablesId, Short rewardsId) {
        super(RewardsCollectables.REWARDS_COLLECTABLES);

        set(0, id);
        set(1, collectablesId);
        set(2, rewardsId);
    }
}

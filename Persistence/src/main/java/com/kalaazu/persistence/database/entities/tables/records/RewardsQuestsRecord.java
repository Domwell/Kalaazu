/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.RewardsQuests;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


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
public class RewardsQuestsRecord extends UpdatableRecordImpl<RewardsQuestsRecord> implements Record3<Short, Short, Short> {

    private static final long serialVersionUID = 1325657235;

    /**
     * Create a detached RewardsQuestsRecord
     */
    public RewardsQuestsRecord() {
        super(RewardsQuests.REWARDS_QUESTS);
    }

    /**
     * Create a detached, initialised RewardsQuestsRecord
     */
    public RewardsQuestsRecord(Short id, Short questsId, Short rewardsId) {
        super(RewardsQuests.REWARDS_QUESTS);

        set(0, id);
        set(1, questsId);
        set(2, rewardsId);
    }

    /**
     * Getter for <code>kalaazu.rewards_quests.id</code>. Primary Key.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>kalaazu.rewards_quests.id</code>. Primary Key.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.rewards_quests.quests_id</code>. Quest ID.
     */
    public Short getQuestsId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>kalaazu.rewards_quests.quests_id</code>. Quest ID.
     */
    public void setQuestsId(Short value) {
        set(1, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.rewards_quests.rewards_id</code>. Reward to award.
     */
    public Short getRewardsId() {
        return (Short) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.rewards_quests.rewards_id</code>. Reward to award.
     */
    public void setRewardsId(Short value) {
        set(2, value);
    }

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    @Override
    public Row3<Short, Short, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Short, Short, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return RewardsQuests.REWARDS_QUESTS.ID;
    }

    @Override
    public Field<Short> field2() {
        return RewardsQuests.REWARDS_QUESTS.QUESTS_ID;
    }

    @Override
    public Field<Short> field3() {
        return RewardsQuests.REWARDS_QUESTS.REWARDS_ID;
    }

    @Override
    public Short component1() {
        return getId();
    }

    @Override
    public Short component2() {
        return getQuestsId();
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
    public Short value2() {
        return getQuestsId();
    }

    @Override
    public Short value3() {
        return getRewardsId();
    }

    @Override
    public RewardsQuestsRecord value1(Short value) {
        setId(value);
        return this;
    }

    @Override
    public RewardsQuestsRecord value2(Short value) {
        setQuestsId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public RewardsQuestsRecord value3(Short value) {
        setRewardsId(value);
        return this;
    }

    @Override
    public RewardsQuestsRecord values(Short value1, Short value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.AccountsTechfactories;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Nanotech factory items.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountsTechfactoriesRecord extends UpdatableRecordImpl<AccountsTechfactoriesRecord> implements Record5<Integer, Integer, Integer, Byte, Byte> {

    private static final long serialVersionUID = 153259153;

    /**
     * Create a detached AccountsTechfactoriesRecord
     */
    public AccountsTechfactoriesRecord() {
        super(AccountsTechfactories.ACCOUNTS_TECHFACTORIES);
    }

    /**
     * Create a detached, initialised AccountsTechfactoriesRecord
     */
    public AccountsTechfactoriesRecord(
            Integer id, Integer accountsId, Integer slotUnlockPrice, Byte slotUnlockFactor, Byte slots
    ) {
        super(AccountsTechfactories.ACCOUNTS_TECHFACTORIES);

        set(0, id);
        set(1, accountsId);
        set(2, slotUnlockPrice);
        set(3, slotUnlockFactor);
        set(4, slots);
    }

    /**
     * Getter for <code>kalaazu.accounts_techfactories.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.accounts_techfactories.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_techfactories.accounts_id</code>. Account ID.
     */
    public Integer getAccountsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kalaazu.accounts_techfactories.accounts_id</code>. Account ID.
     */
    public void setAccountsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_techfactories.slot_unlock_price</code>. Price for unlocking a slot.
     */
    public Integer getSlotUnlockPrice() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kalaazu.accounts_techfactories.slot_unlock_price</code>. Price for unlocking a slot.
     */
    public void setSlotUnlockPrice(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_techfactories.slot_unlock_factor</code>. Factor for unlocking a slot.
     */
    public Byte getSlotUnlockFactor() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>kalaazu.accounts_techfactories.slot_unlock_factor</code>. Factor for unlocking a slot.
     */
    public void setSlotUnlockFactor(Byte value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.accounts_techfactories.slots</code>. Unlocked slots.
     */
    public Byte getSlots() {
        return (Byte) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.accounts_techfactories.slots</code>. Unlocked slots.
     */
    public void setSlots(Byte value) {
        set(4, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Integer, Integer, Integer, Byte, Byte> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, Integer, Byte, Byte> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AccountsTechfactories.ACCOUNTS_TECHFACTORIES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AccountsTechfactories.ACCOUNTS_TECHFACTORIES.ACCOUNTS_ID;
    }

    @Override
    public Field<Integer> field3() {
        return AccountsTechfactories.ACCOUNTS_TECHFACTORIES.SLOT_UNLOCK_PRICE;
    }

    @Override
    public Field<Byte> field4() {
        return AccountsTechfactories.ACCOUNTS_TECHFACTORIES.SLOT_UNLOCK_FACTOR;
    }

    @Override
    public Field<Byte> field5() {
        return AccountsTechfactories.ACCOUNTS_TECHFACTORIES.SLOTS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getAccountsId();
    }

    @Override
    public Integer component3() {
        return getSlotUnlockPrice();
    }

    @Override
    public Byte component4() {
        return getSlotUnlockFactor();
    }

    @Override
    public Byte component5() {
        return getSlots();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getAccountsId();
    }

    @Override
    public Integer value3() {
        return getSlotUnlockPrice();
    }

    @Override
    public Byte value4() {
        return getSlotUnlockFactor();
    }

    @Override
    public Byte value5() {
        return getSlots();
    }

    @Override
    public AccountsTechfactoriesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsTechfactoriesRecord value2(Integer value) {
        setAccountsId(value);
        return this;
    }

    @Override
    public AccountsTechfactoriesRecord value3(Integer value) {
        setSlotUnlockPrice(value);
        return this;
    }

    @Override
    public AccountsTechfactoriesRecord value4(Byte value) {
        setSlotUnlockFactor(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AccountsTechfactoriesRecord value5(Byte value) {
        setSlots(value);
        return this;
    }

    @Override
    public AccountsTechfactoriesRecord values(
            Integer value1, Integer value2, Integer value3, Byte value4, Byte value5
    ) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}

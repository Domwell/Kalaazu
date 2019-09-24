/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.AccountsItems;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Items bough by an account.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AccountsItemsRecord extends UpdatableRecordImpl<AccountsItemsRecord> implements Record6<Integer, Short, Integer, Byte, Timestamp, Long> {

    private static final long serialVersionUID = 1873721027;

    /**
     * Create a detached AccountsItemsRecord
     */
    public AccountsItemsRecord() {
        super(AccountsItems.ACCOUNTS_ITEMS);
    }

    /**
     * Create a detached, initialised AccountsItemsRecord
     */
    public AccountsItemsRecord(
            Integer id, Short itemsId, Integer accountsId, Byte levelsId, Timestamp date, Long amount
    ) {
        super(AccountsItems.ACCOUNTS_ITEMS);

        set(0, id);
        set(1, itemsId);
        set(2, accountsId);
        set(3, levelsId);
        set(4, date);
        set(5, amount);
    }

    /**
     * Getter for <code>kalaazu.accounts_items.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.accounts_items.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_items.items_id</code>.
     */
    public Short getItemsId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>kalaazu.accounts_items.items_id</code>.
     */
    public void setItemsId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_items.accounts_id</code>.
     */
    public Integer getAccountsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>kalaazu.accounts_items.accounts_id</code>.
     */
    public void setAccountsId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_items.levels_id</code>.
     */
    public Byte getLevelsId() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>kalaazu.accounts_items.levels_id</code>.
     */
    public void setLevelsId(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_items.date</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>kalaazu.accounts_items.date</code>.
     */
    public void setDate(Timestamp value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.accounts_items.amount</code>. Amount of items bough (for stackable items).
     */
    public Long getAmount() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.accounts_items.amount</code>. Amount of items bough (for stackable items).
     */
    public void setAmount(Long value) {
        set(5, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row6<Integer, Short, Integer, Byte, Timestamp, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Short, Integer, Byte, Timestamp, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AccountsItems.ACCOUNTS_ITEMS.ID;
    }

    @Override
    public Field<Short> field2() {
        return AccountsItems.ACCOUNTS_ITEMS.ITEMS_ID;
    }

    @Override
    public Field<Integer> field3() {
        return AccountsItems.ACCOUNTS_ITEMS.ACCOUNTS_ID;
    }

    @Override
    public Field<Byte> field4() {
        return AccountsItems.ACCOUNTS_ITEMS.LEVELS_ID;
    }

    @Override
    public Field<Timestamp> field5() {
        return AccountsItems.ACCOUNTS_ITEMS.DATE;
    }

    @Override
    public Field<Long> field6() {
        return AccountsItems.ACCOUNTS_ITEMS.AMOUNT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Short component2() {
        return getItemsId();
    }

    @Override
    public Integer component3() {
        return getAccountsId();
    }

    @Override
    public Byte component4() {
        return getLevelsId();
    }

    @Override
    public Timestamp component5() {
        return getDate();
    }

    @Override
    public Long component6() {
        return getAmount();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Short value2() {
        return getItemsId();
    }

    @Override
    public Integer value3() {
        return getAccountsId();
    }

    @Override
    public Byte value4() {
        return getLevelsId();
    }

    @Override
    public Timestamp value5() {
        return getDate();
    }

    @Override
    public Long value6() {
        return getAmount();
    }

    @Override
    public AccountsItemsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsItemsRecord value2(Short value) {
        setItemsId(value);
        return this;
    }

    @Override
    public AccountsItemsRecord value3(Integer value) {
        setAccountsId(value);
        return this;
    }

    @Override
    public AccountsItemsRecord value4(Byte value) {
        setLevelsId(value);
        return this;
    }

    @Override
    public AccountsItemsRecord value5(Timestamp value) {
        setDate(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AccountsItemsRecord value6(Long value) {
        setAmount(value);
        return this;
    }

    @Override
    public AccountsItemsRecord values(
            Integer value1, Short value2, Integer value3, Byte value4, Timestamp value5, Long value6
    ) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}

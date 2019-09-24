/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.Items;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Contains server's items.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ItemsRecord extends UpdatableRecordImpl<ItemsRecord> implements Record9<Short, String, Byte, String, Integer, Byte, Byte, Byte, Byte> {

    private static final long serialVersionUID = -1379307774;

    /**
     * Create a detached ItemsRecord
     */
    public ItemsRecord() {
        super(Items.ITEMS);
    }

    /**
     * Create a detached, initialised ItemsRecord
     */
    public ItemsRecord(
            Short id, String name, Byte category, String description, Integer price, Byte type, Byte isElite,
            Byte isEvent, Byte isBuyable
    ) {
        super(Items.ITEMS);

        set(0, id);
        set(1, name);
        set(2, category);
        set(3, description);
        set(4, price);
        set(5, type);
        set(6, isElite);
        set(7, isEvent);
        set(8, isBuyable);
    }

    /**
     * Getter for <code>kalaazu.items.id</code>. Primary Key.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>kalaazu.items.id</code>. Primary Key.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.items.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kalaazu.items.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.items.category</code>.
     */
    public Byte getCategory() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>kalaazu.items.category</code>.
     */
    public void setCategory(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.items.description</code>. Shop description.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kalaazu.items.description</code>. Shop description.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.items.price</code>.
     */
    public Integer getPrice() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>kalaazu.items.price</code>.
     */
    public void setPrice(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>kalaazu.items.type</code>.
     */
    public Byte getType() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>kalaazu.items.type</code>.
     */
    public void setType(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>kalaazu.items.is_elite</code>.
     */
    public Byte getIsElite() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>kalaazu.items.is_elite</code>.
     */
    public void setIsElite(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>kalaazu.items.is_event</code>. Event item.
     */
    public Byte getIsEvent() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>kalaazu.items.is_event</code>. Event item.
     */
    public void setIsEvent(Byte value) {
        set(7, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.items.is_buyable</code>. Buyable in shop
     */
    public Byte getIsBuyable() {
        return (Byte) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.items.is_buyable</code>. Buyable in shop
     */
    public void setIsBuyable(Byte value) {
        set(8, value);
    }

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    @Override
    public Row9<Short, String, Byte, String, Integer, Byte, Byte, Byte, Byte> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Short, String, Byte, String, Integer, Byte, Byte, Byte, Byte> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return Items.ITEMS.ID;
    }

    @Override
    public Field<String> field2() {
        return Items.ITEMS.NAME;
    }

    @Override
    public Field<Byte> field3() {
        return Items.ITEMS.CATEGORY;
    }

    @Override
    public Field<String> field4() {
        return Items.ITEMS.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return Items.ITEMS.PRICE;
    }

    @Override
    public Field<Byte> field6() {
        return Items.ITEMS.TYPE;
    }

    @Override
    public Field<Byte> field7() {
        return Items.ITEMS.IS_ELITE;
    }

    @Override
    public Field<Byte> field8() {
        return Items.ITEMS.IS_EVENT;
    }

    @Override
    public Field<Byte> field9() {
        return Items.ITEMS.IS_BUYABLE;
    }

    @Override
    public Short component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Byte component3() {
        return getCategory();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Integer component5() {
        return getPrice();
    }

    @Override
    public Byte component6() {
        return getType();
    }

    @Override
    public Byte component7() {
        return getIsElite();
    }

    @Override
    public Byte component8() {
        return getIsEvent();
    }

    @Override
    public Byte component9() {
        return getIsBuyable();
    }

    @Override
    public Short value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Byte value3() {
        return getCategory();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Integer value5() {
        return getPrice();
    }

    @Override
    public Byte value6() {
        return getType();
    }

    @Override
    public Byte value7() {
        return getIsElite();
    }

    @Override
    public Byte value8() {
        return getIsEvent();
    }

    @Override
    public Byte value9() {
        return getIsBuyable();
    }

    @Override
    public ItemsRecord value1(Short value) {
        setId(value);
        return this;
    }

    @Override
    public ItemsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ItemsRecord value3(Byte value) {
        setCategory(value);
        return this;
    }

    @Override
    public ItemsRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ItemsRecord value5(Integer value) {
        setPrice(value);
        return this;
    }

    @Override
    public ItemsRecord value6(Byte value) {
        setType(value);
        return this;
    }

    @Override
    public ItemsRecord value7(Byte value) {
        setIsElite(value);
        return this;
    }

    @Override
    public ItemsRecord value8(Byte value) {
        setIsEvent(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public ItemsRecord value9(Byte value) {
        setIsBuyable(value);
        return this;
    }

    @Override
    public ItemsRecord values(
            Short value1, String value2, Byte value3, String value4, Integer value5, Byte value6, Byte value7,
            Byte value8, Byte value9
    ) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.MapsNpcs;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Many to many relation table.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MapsNpcsRecord extends UpdatableRecordImpl<MapsNpcsRecord> implements Record4<Byte, Byte, Byte, Byte> {

    private static final long serialVersionUID = -2041520893;

    /**
     * Create a detached MapsNpcsRecord
     */
    public MapsNpcsRecord() {
        super(MapsNpcs.MAPS_NPCS);
    }

    /**
     * Create a detached, initialised MapsNpcsRecord
     */
    public MapsNpcsRecord(Byte id, Byte mapsId, Byte npcsId, Byte amount) {
        super(MapsNpcs.MAPS_NPCS);

        set(0, id);
        set(1, mapsId);
        set(2, npcsId);
        set(3, amount);
    }

    /**
     * Getter for <code>kalaazu.maps_npcs.id</code>. Primary Key.
     */
    public Byte getId() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>kalaazu.maps_npcs.id</code>. Primary Key.
     */
    public void setId(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.maps_npcs.maps_id</code>. Map ID.
     */
    public Byte getMapsId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.maps_npcs.maps_id</code>. Map ID.
     */
    public void setMapsId(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.maps_npcs.npcs_id</code>. NPC ID.
     */
    public Byte getNpcsId() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>kalaazu.maps_npcs.npcs_id</code>. NPC ID.
     */
    public void setNpcsId(Byte value) {
        set(2, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.maps_npcs.amount</code>. Amount of NPCs on map
     */
    public Byte getAmount() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.maps_npcs.amount</code>. Amount of NPCs on map
     */
    public void setAmount(Byte value) {
        set(3, value);
    }

    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    @Override
    public Row4<Byte, Byte, Byte, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Byte, Byte, Byte, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Byte> field1() {
        return MapsNpcs.MAPS_NPCS.ID;
    }

    @Override
    public Field<Byte> field2() {
        return MapsNpcs.MAPS_NPCS.MAPS_ID;
    }

    @Override
    public Field<Byte> field3() {
        return MapsNpcs.MAPS_NPCS.NPCS_ID;
    }

    @Override
    public Field<Byte> field4() {
        return MapsNpcs.MAPS_NPCS.AMOUNT;
    }

    @Override
    public Byte component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getMapsId();
    }

    @Override
    public Byte component3() {
        return getNpcsId();
    }

    @Override
    public Byte component4() {
        return getAmount();
    }

    @Override
    public Byte value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getMapsId();
    }

    @Override
    public Byte value3() {
        return getNpcsId();
    }

    @Override
    public Byte value4() {
        return getAmount();
    }

    @Override
    public MapsNpcsRecord value1(Byte value) {
        setId(value);
        return this;
    }

    @Override
    public MapsNpcsRecord value2(Byte value) {
        setMapsId(value);
        return this;
    }

    @Override
    public MapsNpcsRecord value3(Byte value) {
        setNpcsId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public MapsNpcsRecord value4(Byte value) {
        setAmount(value);
        return this;
    }

    @Override
    public MapsNpcsRecord values(Byte value1, Byte value2, Byte value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}

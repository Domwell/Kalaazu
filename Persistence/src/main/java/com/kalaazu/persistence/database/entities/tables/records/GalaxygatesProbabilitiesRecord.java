/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.GalaxygatesProbabilities;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Spin probabilities for the galaxy gates.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GalaxygatesProbabilitiesRecord extends UpdatableRecordImpl<GalaxygatesProbabilitiesRecord> implements Record4<Byte, Byte, Byte, Double> {

    private static final long serialVersionUID = 1008420048;

    /**
     * Setter for <code>kalaazu.galaxygates_probabilities.id</code>. Primary Key.
     */
    public void setId(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_probabilities.id</code>. Primary Key.
     */
    public Byte getId() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_probabilities.galaxygates_id</code>. The galaxy gate.
     */
    public void setGalaxygatesId(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_probabilities.galaxygates_id</code>. The galaxy gate.
     */
    public Byte getGalaxygatesId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_probabilities.type</code>. 0 = ammo, 1 = resource, 2 = voucher, 3 = logfile, 4 = part, 5 = special.
     */
    public void setType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_probabilities.type</code>. 0 = ammo, 1 = resource, 2 = voucher, 3 = logfile, 4 = part, 5 = special.
     */
    public Byte getType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_probabilities.probability</code>. Probability of awarding one spin of this type.
     */
    public void setProbability(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_probabilities.probability</code>. Probability of awarding one spin of this type.
     */
    public Double getProbability() {
        return (Double) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Byte, Byte, Byte, Double> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Byte, Byte, Byte, Double> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Byte> field1() {
        return GalaxygatesProbabilities.GALAXYGATES_PROBABILITIES.ID;
    }

    @Override
    public Field<Byte> field2() {
        return GalaxygatesProbabilities.GALAXYGATES_PROBABILITIES.GALAXYGATES_ID;
    }

    @Override
    public Field<Byte> field3() {
        return GalaxygatesProbabilities.GALAXYGATES_PROBABILITIES.TYPE;
    }

    @Override
    public Field<Double> field4() {
        return GalaxygatesProbabilities.GALAXYGATES_PROBABILITIES.PROBABILITY;
    }

    @Override
    public Byte component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getGalaxygatesId();
    }

    @Override
    public Byte component3() {
        return getType();
    }

    @Override
    public Double component4() {
        return getProbability();
    }

    @Override
    public Byte value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getGalaxygatesId();
    }

    @Override
    public Byte value3() {
        return getType();
    }

    @Override
    public Double value4() {
        return getProbability();
    }

    @Override
    public GalaxygatesProbabilitiesRecord value1(Byte value) {
        setId(value);
        return this;
    }

    @Override
    public GalaxygatesProbabilitiesRecord value2(Byte value) {
        setGalaxygatesId(value);
        return this;
    }

    @Override
    public GalaxygatesProbabilitiesRecord value3(Byte value) {
        setType(value);
        return this;
    }

    @Override
    public GalaxygatesProbabilitiesRecord value4(Double value) {
        setProbability(value);
        return this;
    }

    @Override
    public GalaxygatesProbabilitiesRecord values(Byte value1, Byte value2, Byte value3, Double value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GalaxygatesProbabilitiesRecord
     */
    public GalaxygatesProbabilitiesRecord() {
        super(GalaxygatesProbabilities.GALAXYGATES_PROBABILITIES);
    }

    /**
     * Create a detached, initialised GalaxygatesProbabilitiesRecord
     */
    public GalaxygatesProbabilitiesRecord(Byte id, Byte galaxygatesId, Byte type, Double probability) {
        super(GalaxygatesProbabilities.GALAXYGATES_PROBABILITIES);

        set(0, id);
        set(1, galaxygatesId);
        set(2, type);
        set(3, probability);
    }
}

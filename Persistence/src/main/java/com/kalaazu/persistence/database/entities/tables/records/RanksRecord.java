/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.Ranks;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Contains the rank system.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class RanksRecord extends UpdatableRecordImpl<RanksRecord> implements Record4<Byte, String, Double, Byte> {

    private static final long serialVersionUID = -806698248;

    /**
     * Create a detached RanksRecord
     */
    public RanksRecord() {
        super(Ranks.RANKS);
    }

    /**
     * Create a detached, initialised RanksRecord
     */
    public RanksRecord(Byte id, String name, Double percentaje, Byte isPublic) {
        super(Ranks.RANKS);

        set(0, id);
        set(1, name);
        set(2, percentaje);
        set(3, isPublic);
    }

    /**
     * Getter for <code>kalaazu.ranks.id</code>. Primary Key.
     */
    public Byte getId() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>kalaazu.ranks.id</code>. Primary Key.
     */
    public void setId(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.ranks.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kalaazu.ranks.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.ranks.percentaje</code>.
     */
    public Double getPercentaje() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>kalaazu.ranks.percentaje</code>.
     */
    public void setPercentaje(Double value) {
        set(2, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.ranks.is_public</code>.
     */
    public Byte getIsPublic() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.ranks.is_public</code>.
     */
    public void setIsPublic(Byte value) {
        set(3, value);
    }

    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    @Override
    public Row4<Byte, String, Double, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Byte, String, Double, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Byte> field1() {
        return Ranks.RANKS.ID;
    }

    @Override
    public Field<String> field2() {
        return Ranks.RANKS.NAME;
    }

    @Override
    public Field<Double> field3() {
        return Ranks.RANKS.PERCENTAJE;
    }

    @Override
    public Field<Byte> field4() {
        return Ranks.RANKS.IS_PUBLIC;
    }

    @Override
    public Byte component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Double component3() {
        return getPercentaje();
    }

    @Override
    public Byte component4() {
        return getIsPublic();
    }

    @Override
    public Byte value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Double value3() {
        return getPercentaje();
    }

    @Override
    public Byte value4() {
        return getIsPublic();
    }

    @Override
    public RanksRecord value1(Byte value) {
        setId(value);
        return this;
    }

    @Override
    public RanksRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public RanksRecord value3(Double value) {
        setPercentaje(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public RanksRecord value4(Byte value) {
        setIsPublic(value);
        return this;
    }

    @Override
    public RanksRecord values(Byte value1, String value2, Double value3, Byte value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}

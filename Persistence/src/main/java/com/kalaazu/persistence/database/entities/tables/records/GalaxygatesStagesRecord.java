/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.GalaxygatesStages;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;


/**
 * Spawn stage for each wave.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class GalaxygatesStagesRecord extends UpdatableRecordImpl<GalaxygatesStagesRecord> implements Record3<Integer, Byte, String> {

    private static final long serialVersionUID = -162113785;

    /**
     * Create a detached GalaxygatesStagesRecord
     */
    public GalaxygatesStagesRecord() {
        super(GalaxygatesStages.GALAXYGATES_STAGES);
    }

    /**
     * Create a detached, initialised GalaxygatesStagesRecord
     */
    public GalaxygatesStagesRecord(Integer id, Byte galaxygatesWavesId, String comment) {
        super(GalaxygatesStages.GALAXYGATES_STAGES);

        set(0, id);
        set(1, galaxygatesWavesId);
        set(2, comment);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_stages.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_stages.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.galaxygates_stages.galaxygates_waves_id</code>. Wave this stage belongs to
     */
    public Byte getGalaxygatesWavesId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.galaxygates_stages.galaxygates_waves_id</code>. Wave this stage belongs to
     */
    public void setGalaxygatesWavesId(Byte value) {
        set(1, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.galaxygates_stages.comment</code>. Just so this isn't that empty
     */
    public String getComment() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.galaxygates_stages.comment</code>. Just so this isn't that empty
     */
    public void setComment(String value) {
        set(2, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row3<Integer, Byte, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Byte, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GalaxygatesStages.GALAXYGATES_STAGES.ID;
    }

    @Override
    public Field<Byte> field2() {
        return GalaxygatesStages.GALAXYGATES_STAGES.GALAXYGATES_WAVES_ID;
    }

    @Override
    public Field<String> field3() {
        return GalaxygatesStages.GALAXYGATES_STAGES.COMMENT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getGalaxygatesWavesId();
    }

    @Override
    public String component3() {
        return getComment();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getGalaxygatesWavesId();
    }

    @Override
    public String value3() {
        return getComment();
    }

    @Override
    public GalaxygatesStagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GalaxygatesStagesRecord value2(Byte value) {
        setGalaxygatesWavesId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public GalaxygatesStagesRecord value3(String value) {
        setComment(value);
        return this;
    }

    @Override
    public GalaxygatesStagesRecord values(Integer value1, Byte value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }
}

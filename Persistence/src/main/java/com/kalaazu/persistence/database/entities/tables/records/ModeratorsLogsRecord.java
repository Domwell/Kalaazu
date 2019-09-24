/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.ModeratorsLogs;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;


/**
 * Logged events made by moderators.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ModeratorsLogsRecord extends UpdatableRecordImpl<ModeratorsLogsRecord> implements Record5<Integer, Byte, Timestamp, String, String> {

    private static final long serialVersionUID = -2127788435;

    /**
     * Create a detached ModeratorsLogsRecord
     */
    public ModeratorsLogsRecord() {
        super(ModeratorsLogs.MODERATORS_LOGS);
    }

    /**
     * Create a detached, initialised ModeratorsLogsRecord
     */
    public ModeratorsLogsRecord(Integer id, Byte moderatorsId, Timestamp date, String type, String text) {
        super(ModeratorsLogs.MODERATORS_LOGS);

        set(0, id);
        set(1, moderatorsId);
        set(2, date);
        set(3, type);
        set(4, text);
    }

    /**
     * Getter for <code>kalaazu.moderators_logs.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.moderators_logs.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.moderators_logs.moderators_id</code>.
     */
    public Byte getModeratorsId() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>kalaazu.moderators_logs.moderators_id</code>.
     */
    public void setModeratorsId(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.moderators_logs.date</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>kalaazu.moderators_logs.date</code>.
     */
    public void setDate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.moderators_logs.type</code>.
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>kalaazu.moderators_logs.type</code>.
     */
    public void setType(String value) {
        set(3, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>kalaazu.moderators_logs.text</code>.
     */
    public String getText() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>kalaazu.moderators_logs.text</code>.
     */
    public void setText(String value) {
        set(4, value);
    }

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    @Override
    public Row5<Integer, Byte, Timestamp, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Byte, Timestamp, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ModeratorsLogs.MODERATORS_LOGS.ID;
    }

    @Override
    public Field<Byte> field2() {
        return ModeratorsLogs.MODERATORS_LOGS.MODERATORS_ID;
    }

    @Override
    public Field<Timestamp> field3() {
        return ModeratorsLogs.MODERATORS_LOGS.DATE;
    }

    @Override
    public Field<String> field4() {
        return ModeratorsLogs.MODERATORS_LOGS.TYPE;
    }

    @Override
    public Field<String> field5() {
        return ModeratorsLogs.MODERATORS_LOGS.TEXT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getModeratorsId();
    }

    @Override
    public Timestamp component3() {
        return getDate();
    }

    @Override
    public String component4() {
        return getType();
    }

    @Override
    public String component5() {
        return getText();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getModeratorsId();
    }

    @Override
    public Timestamp value3() {
        return getDate();
    }

    @Override
    public String value4() {
        return getType();
    }

    @Override
    public String value5() {
        return getText();
    }

    @Override
    public ModeratorsLogsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ModeratorsLogsRecord value2(Byte value) {
        setModeratorsId(value);
        return this;
    }

    @Override
    public ModeratorsLogsRecord value3(Timestamp value) {
        setDate(value);
        return this;
    }

    @Override
    public ModeratorsLogsRecord value4(String value) {
        setType(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public ModeratorsLogsRecord value5(String value) {
        setText(value);
        return this;
    }

    @Override
    public ModeratorsLogsRecord values(Integer value1, Byte value2, Timestamp value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }
}

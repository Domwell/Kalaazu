/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.InvitationCodesRedeemLogs;

import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Contains the redeem logs for the invitation codes.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InvitationCodesRedeemLogsRecord extends UpdatableRecordImpl<InvitationCodesRedeemLogsRecord> implements Record4<Integer, Short, String, Timestamp> {

    private static final long serialVersionUID = -34106442;

    /**
     * Setter for <code>kalaazu.invitation_codes_redeem_logs.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.invitation_codes_redeem_logs.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.invitation_codes_redeem_logs.invitation_codes_id</code>. Invitation code ID.
     */
    public void setInvitationCodesId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.invitation_codes_redeem_logs.invitation_codes_id</code>. Invitation code ID.
     */
    public Short getInvitationCodesId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>kalaazu.invitation_codes_redeem_logs.ip</code>. IP that redeemed the code.
     */
    public void setIp(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.invitation_codes_redeem_logs.ip</code>. IP that redeemed the code.
     */
    public String getIp() {
        return (String) get(2);
    }

    /**
     * Setter for <code>kalaazu.invitation_codes_redeem_logs.date</code>. Date when the code was redeemed.
     */
    public void setDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.invitation_codes_redeem_logs.date</code>. Date when the code was redeemed.
     */
    public Timestamp getDate() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Short, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return InvitationCodesRedeemLogs.INVITATION_CODES_REDEEM_LOGS.ID;
    }

    @Override
    public Field<Short> field2() {
        return InvitationCodesRedeemLogs.INVITATION_CODES_REDEEM_LOGS.INVITATION_CODES_ID;
    }

    @Override
    public Field<String> field3() {
        return InvitationCodesRedeemLogs.INVITATION_CODES_REDEEM_LOGS.IP;
    }

    @Override
    public Field<Timestamp> field4() {
        return InvitationCodesRedeemLogs.INVITATION_CODES_REDEEM_LOGS.DATE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Short component2() {
        return getInvitationCodesId();
    }

    @Override
    public String component3() {
        return getIp();
    }

    @Override
    public Timestamp component4() {
        return getDate();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Short value2() {
        return getInvitationCodesId();
    }

    @Override
    public String value3() {
        return getIp();
    }

    @Override
    public Timestamp value4() {
        return getDate();
    }

    @Override
    public InvitationCodesRedeemLogsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public InvitationCodesRedeemLogsRecord value2(Short value) {
        setInvitationCodesId(value);
        return this;
    }

    @Override
    public InvitationCodesRedeemLogsRecord value3(String value) {
        setIp(value);
        return this;
    }

    @Override
    public InvitationCodesRedeemLogsRecord value4(Timestamp value) {
        setDate(value);
        return this;
    }

    @Override
    public InvitationCodesRedeemLogsRecord values(Integer value1, Short value2, String value3, Timestamp value4) {
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
     * Create a detached InvitationCodesRedeemLogsRecord
     */
    public InvitationCodesRedeemLogsRecord() {
        super(InvitationCodesRedeemLogs.INVITATION_CODES_REDEEM_LOGS);
    }

    /**
     * Create a detached, initialised InvitationCodesRedeemLogsRecord
     */
    public InvitationCodesRedeemLogsRecord(Integer id, Short invitationCodesId, String ip, Timestamp date) {
        super(InvitationCodesRedeemLogs.INVITATION_CODES_REDEEM_LOGS);

        set(0, id);
        set(1, invitationCodesId);
        set(2, ip);
        set(3, date);
    }
}

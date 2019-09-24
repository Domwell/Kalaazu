/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.InvitationCodesRedeemLogsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class InvitationCodesRedeemLogs extends TableImpl<InvitationCodesRedeemLogsRecord> {

    /**
     * The reference instance of <code>kalaazu.invitation_codes_redeem_logs</code>
     */
    public static final InvitationCodesRedeemLogs INVITATION_CODES_REDEEM_LOGS = new InvitationCodesRedeemLogs();
    private static final long serialVersionUID = 737331707;
    /**
     * The column <code>kalaazu.invitation_codes_redeem_logs.id</code>. Primary Key.
     */
    public final TableField<InvitationCodesRedeemLogsRecord, Integer> ID = createField(
            DSL.name("id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false)
                                             .identity(true),
            this,
            "Primary Key."
    );
    /**
     * The column <code>kalaazu.invitation_codes_redeem_logs.invitation_codes_id</code>. Invitation code ID.
     */
    public final TableField<InvitationCodesRedeemLogsRecord, Short> INVITATION_CODES_ID = createField(DSL.name(
            "invitation_codes_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "Invitation code ID.");
    /**
     * The column <code>kalaazu.invitation_codes_redeem_logs.ip</code>. IP that redeemed the code.
     */
    public final TableField<InvitationCodesRedeemLogsRecord, String> IP = createField(
            DSL.name("ip"),
            org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false),
            this,
            "IP that redeemed the code."
    );
    /**
     * The column <code>kalaazu.invitation_codes_redeem_logs.date</code>. Date when the code was redeemed.
     */
    public final TableField<InvitationCodesRedeemLogsRecord, Timestamp> DATE = createField(
            DSL.name("date"),
            org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false)
                                               .defaultValue(org.jooq.impl.DSL.field(
                                                       "CURRENT_TIMESTAMP",
                                                       org.jooq.impl.SQLDataType.TIMESTAMP
                                               )),
            this,
            "Date when the code was redeemed."
    );

    /**
     * Create a <code>kalaazu.invitation_codes_redeem_logs</code> table reference
     */
    public InvitationCodesRedeemLogs() {
        this(DSL.name("invitation_codes_redeem_logs"), null);
    }

    /**
     * Create an aliased <code>kalaazu.invitation_codes_redeem_logs</code> table reference
     */
    public InvitationCodesRedeemLogs(String alias) {
        this(DSL.name(alias), INVITATION_CODES_REDEEM_LOGS);
    }

    /**
     * Create an aliased <code>kalaazu.invitation_codes_redeem_logs</code> table reference
     */
    public InvitationCodesRedeemLogs(Name alias) {
        this(alias, INVITATION_CODES_REDEEM_LOGS);
    }

    private InvitationCodesRedeemLogs(Name alias, Table<InvitationCodesRedeemLogsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InvitationCodesRedeemLogs(
            Name alias, Table<InvitationCodesRedeemLogsRecord> aliased, Field<?>[] parameters
    ) {
        super(alias, null, aliased, parameters, DSL.comment("Contains the redeem logs for the invitation codes."));
    }

    public <O extends Record> InvitationCodesRedeemLogs(
            Table<O> child, ForeignKey<O, InvitationCodesRedeemLogsRecord> key
    ) {
        super(child, key, INVITATION_CODES_REDEEM_LOGS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InvitationCodesRedeemLogsRecord> getRecordType() {
        return InvitationCodesRedeemLogsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(
                Indexes.INVITATION_CODES_REDEEM_LOGS_INVITATION_CODES_REDEEM_LOGS_INVITATION_CODES,
                Indexes.INVITATION_CODES_REDEEM_LOGS_PRIMARY
        );
    }

    @Override
    public Identity<InvitationCodesRedeemLogsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INVITATION_CODES_REDEEM_LOGS;
    }

    @Override
    public UniqueKey<InvitationCodesRedeemLogsRecord> getPrimaryKey() {
        return Keys.KEY_INVITATION_CODES_REDEEM_LOGS_PRIMARY;
    }

    @Override
    public List<UniqueKey<InvitationCodesRedeemLogsRecord>> getKeys() {
        return Arrays.<UniqueKey<InvitationCodesRedeemLogsRecord>>asList(Keys.KEY_INVITATION_CODES_REDEEM_LOGS_PRIMARY);
    }

    @Override
    public List<ForeignKey<InvitationCodesRedeemLogsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InvitationCodesRedeemLogsRecord, ?>>asList(Keys.INVITATION_CODES_REDEEM_LOGS_INVITATION_CODES);
    }

    public InvitationCodes invitationCodes() {
        return new InvitationCodes(this, Keys.INVITATION_CODES_REDEEM_LOGS_INVITATION_CODES);
    }

    @Override
    public InvitationCodesRedeemLogs as(String alias) {
        return new InvitationCodesRedeemLogs(DSL.name(alias), this);
    }

    @Override
    public InvitationCodesRedeemLogs as(Name alias) {
        return new InvitationCodesRedeemLogs(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InvitationCodesRedeemLogs rename(String name) {
        return new InvitationCodesRedeemLogs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InvitationCodesRedeemLogs rename(Name name) {
        return new InvitationCodesRedeemLogs(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.UsersRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Contains the login information of the registered users.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = -1420868445;

    /**
     * The reference instance of <code>kalaazu.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>kalaazu.users.id</code>. Primary Key.
     */
    public final TableField<UsersRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary Key.");

    /**
     * The column <code>kalaazu.users.date</code>. Date when the user registered.
     */
    public final TableField<UsersRecord, Timestamp> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "Date when the user registered.");

    /**
     * The column <code>kalaazu.users.invitation_codes_id</code>. Invitation code used to register
     */
    public final TableField<UsersRecord, Short> INVITATION_CODES_ID = createField(DSL.name("invitation_codes_id"), org.jooq.impl.SQLDataType.SMALLINT, this, "Invitation code used to register");

    /**
     * The column <code>kalaazu.users.name</code>. User name.
     */
    public final TableField<UsersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "User name.");

    /**
     * The column <code>kalaazu.users.password</code>. Password hash (argon).
     */
    public final TableField<UsersRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Password hash (argon).");

    /**
     * The column <code>kalaazu.users.email</code>. User email.
     */
    public final TableField<UsersRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "User email.");

    /**
     * The column <code>kalaazu.users.email_verification_code</code>. Email verification code.
     */
    public final TableField<UsersRecord, String> EMAIL_VERIFICATION_CODE = createField(DSL.name("email_verification_code"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Email verification code.");

    /**
     * The column <code>kalaazu.users.email_verification_date</code>. Date when the user verified its email.
     */
    public final TableField<UsersRecord, Timestamp> EMAIL_VERIFICATION_DATE = createField(DSL.name("email_verification_date"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "Date when the user verified its email.");

    /**
     * The column <code>kalaazu.users.ip</code>. Registration IP.
     */
    public final TableField<UsersRecord, String> IP = createField(DSL.name("ip"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.VARCHAR)), this, "Registration IP.");

    /**
     * Create a <code>kalaazu.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>kalaazu.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>kalaazu.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains the login information of the registered users."));
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USERS_PRIMARY, Indexes.USERS_USERS_EMAIL_VERIFICATION_CODE_IDX, Indexes.USERS_USERS_ID_IDX, Indexes.USERS_USERS_INVITATION_CODES, Indexes.USERS_USERS_NAME_IDX);
    }

    @Override
    public Identity<UsersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USERS;
    }

    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY, Keys.KEY_USERS_USERS_ID_IDX, Keys.KEY_USERS_USERS_NAME_IDX, Keys.KEY_USERS_USERS_EMAIL_VERIFICATION_CODE_IDX);
    }

    @Override
    public List<ForeignKey<UsersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UsersRecord, ?>>asList(Keys.USERS_INVITATION_CODES);
    }

    public InvitationCodes invitationCodes() {
        return new InvitationCodes(this, Keys.USERS_INVITATION_CODES);
    }

    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Timestamp, Short, String, String, String, String, Timestamp, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.AccountsClansRoles;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountsClansRolesRecord extends UpdatableRecordImpl<AccountsClansRolesRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 712801719;

    /**
     * Setter for <code>kalaazu.accounts_clans_roles.id</code>. Primary Key.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_clans_roles.id</code>. Primary Key.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kalaazu.accounts_clans_roles.accounts_id</code>. Account ID.
     */
    public void setAccountsId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_clans_roles.accounts_id</code>. Account ID.
     */
    public Integer getAccountsId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>kalaazu.accounts_clans_roles.clans_roles_id</code>. Role ID.
     */
    public void setClansRolesId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.accounts_clans_roles.clans_roles_id</code>. Role ID.
     */
    public Integer getClansRolesId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AccountsClansRoles.ACCOUNTS_CLANS_ROLES.ID;
    }

    @Override
    public Field<Integer> field2() {
        return AccountsClansRoles.ACCOUNTS_CLANS_ROLES.ACCOUNTS_ID;
    }

    @Override
    public Field<Integer> field3() {
        return AccountsClansRoles.ACCOUNTS_CLANS_ROLES.CLANS_ROLES_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getAccountsId();
    }

    @Override
    public Integer component3() {
        return getClansRolesId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getAccountsId();
    }

    @Override
    public Integer value3() {
        return getClansRolesId();
    }

    @Override
    public AccountsClansRolesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AccountsClansRolesRecord value2(Integer value) {
        setAccountsId(value);
        return this;
    }

    @Override
    public AccountsClansRolesRecord value3(Integer value) {
        setClansRolesId(value);
        return this;
    }

    @Override
    public AccountsClansRolesRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountsClansRolesRecord
     */
    public AccountsClansRolesRecord() {
        super(AccountsClansRoles.ACCOUNTS_CLANS_ROLES);
    }

    /**
     * Create a detached, initialised AccountsClansRolesRecord
     */
    public AccountsClansRolesRecord(Integer id, Integer accountsId, Integer clansRolesId) {
        super(AccountsClansRoles.ACCOUNTS_CLANS_ROLES);

        set(0, id);
        set(1, accountsId);
        set(2, clansRolesId);
    }
}

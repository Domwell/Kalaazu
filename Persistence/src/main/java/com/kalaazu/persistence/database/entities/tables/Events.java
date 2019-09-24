/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables;


import com.kalaazu.persistence.database.entities.Indexes;
import com.kalaazu.persistence.database.entities.Kalaazu;
import com.kalaazu.persistence.database.entities.Keys;
import com.kalaazu.persistence.database.entities.tables.records.EventsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.processing.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * Contains server's events.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Events extends TableImpl<EventsRecord> {

    /**
     * The reference instance of <code>kalaazu.events</code>
     */
    public static final Events EVENTS = new Events();
    private static final long serialVersionUID = 1722765260;
    /**
     * The column <code>kalaazu.events.id</code>. Primary Key.
     */
    public final TableField<EventsRecord, Integer> ID = createField(
            DSL.name("id"),
            org.jooq.impl.SQLDataType.INTEGER.nullable(false)
                                             .identity(true),
            this,
            "Primary Key."
    );
    /**
     * The column <code>kalaazu.events.name</code>.
     */
    public final TableField<EventsRecord, String> NAME = createField(
            DSL.name("name"),
            org.jooq.impl.SQLDataType.VARCHAR(255)
                                     .nullable(false)
                                     .defaultValue(org.jooq.impl.DSL.field(
                                             "",
                                             org.jooq.impl.SQLDataType.VARCHAR
                                     )),
            this,
            ""
    );
    /**
     * The column <code>kalaazu.events.description</code>.
     */
    public final TableField<EventsRecord, String> DESCRIPTION = createField(
            DSL.name("description"),
            org.jooq.impl.SQLDataType.CLOB.nullable(false),
            this,
            ""
    );
    /**
     * The column <code>kalaazu.events.start_date</code>. Event start date.
     */
    public final TableField<EventsRecord, Timestamp> START_DATE = createField(
            DSL.name("start_date"),
            org.jooq.impl.SQLDataType.TIMESTAMP,
            this,
            "Event start date."
    );
    /**
     * The column <code>kalaazu.events.end_date</code>. Event end date.
     */
    public final TableField<EventsRecord, Timestamp> END_DATE = createField(
            DSL.name("end_date"),
            org.jooq.impl.SQLDataType.TIMESTAMP,
            this,
            "Event end date."
    );

    /**
     * Create a <code>kalaazu.events</code> table reference
     */
    public Events() {
        this(DSL.name("events"), null);
    }

    /**
     * Create an aliased <code>kalaazu.events</code> table reference
     */
    public Events(String alias) {
        this(DSL.name(alias), EVENTS);
    }

    /**
     * Create an aliased <code>kalaazu.events</code> table reference
     */
    public Events(Name alias) {
        this(alias, EVENTS);
    }

    private Events(Name alias, Table<EventsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Events(Name alias, Table<EventsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Contains server's events."));
    }

    public <O extends Record> Events(Table<O> child, ForeignKey<O, EventsRecord> key) {
        super(child, key, EVENTS);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsRecord> getRecordType() {
        return EventsRecord.class;
    }

    @Override
    public Schema getSchema() {
        return Kalaazu.KALAAZU;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EVENTS_PRIMARY);
    }

    @Override
    public Identity<EventsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EVENTS;
    }

    @Override
    public UniqueKey<EventsRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_PRIMARY;
    }

    @Override
    public List<UniqueKey<EventsRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsRecord>>asList(Keys.KEY_EVENTS_PRIMARY);
    }

    @Override
    public Events as(String alias) {
        return new Events(DSL.name(alias), this);
    }

    @Override
    public Events as(Name alias) {
        return new Events(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Events rename(String name) {
        return new Events(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Events rename(Name name) {
        return new Events(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}

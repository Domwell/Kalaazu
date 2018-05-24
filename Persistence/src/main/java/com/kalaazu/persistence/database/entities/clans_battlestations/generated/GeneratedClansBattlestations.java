package com.kalaazu.persistence.database.entities.clans_battlestations.generated;

import com.kalaazu.persistence.database.entities.Clans;
import com.kalaazu.persistence.database.entities.ClansBattlestations;
import com.kalaazu.persistence.database.entities.Maps;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.clans_battlestations.ClansBattlestations}-interface
 * representing entities of the {@code clans_battlestations}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansBattlestations {

    /**
     * This Field corresponds to the {@link ClansBattlestations} field that can
     * be obtained using the {@link ClansBattlestations#getId()} method.
     */
    ByteField<ClansBattlestations, Byte>                       ID       = ByteField.create(
            Identifier.ID,
            ClansBattlestations::getId,
            ClansBattlestations::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ClansBattlestations} field that can
     * be obtained using the {@link ClansBattlestations#getClansId()} method.
     */
    IntForeignKeyField<ClansBattlestations, Integer, Clans>    CLANS_ID = IntForeignKeyField.create(
            Identifier.CLANS_ID,
            o -> OptionalUtil.unwrap(o.getClansId()),
            ClansBattlestations::setClansId,
            Clans.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestations} field that can
     * be obtained using the {@link ClansBattlestations#getMapsId()} method.
     */
    ByteForeignKeyField<ClansBattlestations, Byte, Maps>       MAPS_ID  = ByteForeignKeyField.create(
            Identifier.MAPS_ID,
            ClansBattlestations::getMapsId,
            ClansBattlestations::setMapsId,
            Maps.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestations} field that can
     * be obtained using the {@link ClansBattlestations#getName()} method.
     */
    StringField<ClansBattlestations, String>                   NAME     = StringField.create(
            Identifier.NAME,
            ClansBattlestations::getName,
            ClansBattlestations::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestations} field that can
     * be obtained using the {@link ClansBattlestations#getPosition()} method.
     */
    LongField<ClansBattlestations, Long>                       POSITION = LongField.create(
            Identifier.POSITION,
            ClansBattlestations::getPosition,
            ClansBattlestations::setPosition,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansBattlestations} field that can
     * be obtained using the {@link ClansBattlestations#getDate()} method.
     */
    ComparableField<ClansBattlestations, Timestamp, Timestamp> DATE     = ComparableField.create(
            Identifier.DATE,
            o -> OptionalUtil.unwrap(o.getDate()),
            ClansBattlestations::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this ClansBattlestations. The id field corresponds to
     * the database column kalaazu.kalaazu.clans_battlestations.id.
     *
     * @return the id of this ClansBattlestations
     */
    Byte getId();

    /**
     * Returns the clansId of this ClansBattlestations. The clansId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations.clans_id.
     *
     * @return the clansId of this ClansBattlestations
     */
    OptionalInt getClansId();

    /**
     * Returns the mapsId of this ClansBattlestations. The mapsId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations.maps_id.
     *
     * @return the mapsId of this ClansBattlestations
     */
    byte getMapsId();

    /**
     * Returns the name of this ClansBattlestations. The name field corresponds
     * to the database column kalaazu.kalaazu.clans_battlestations.name.
     *
     * @return the name of this ClansBattlestations
     */
    String getName();

    /**
     * Returns the position of this ClansBattlestations. The position field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations.position.
     *
     * @return the position of this ClansBattlestations
     */
    long getPosition();

    /**
     * Returns the date of this ClansBattlestations. The date field corresponds
     * to the database column kalaazu.kalaazu.clans_battlestations.date.
     *
     * @return the date of this ClansBattlestations
     */
    Optional<Timestamp> getDate();

    /**
     * Sets the id of this ClansBattlestations. The id field corresponds to the
     * database column kalaazu.kalaazu.clans_battlestations.id.
     *
     * @param id to set of this ClansBattlestations
     *
     * @return this ClansBattlestations instance
     */
    ClansBattlestations setId(byte id);

    /**
     * Sets the clansId of this ClansBattlestations. The clansId field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations.clans_id.
     *
     * @param clansId to set of this ClansBattlestations
     *
     * @return this ClansBattlestations instance
     */
    ClansBattlestations setClansId(int clansId);

    /**
     * Sets the mapsId of this ClansBattlestations. The mapsId field corresponds
     * to the database column kalaazu.kalaazu.clans_battlestations.maps_id.
     *
     * @param mapsId to set of this ClansBattlestations
     *
     * @return this ClansBattlestations instance
     */
    ClansBattlestations setMapsId(byte mapsId);

    /**
     * Sets the name of this ClansBattlestations. The name field corresponds to
     * the database column kalaazu.kalaazu.clans_battlestations.name.
     *
     * @param name to set of this ClansBattlestations
     *
     * @return this ClansBattlestations instance
     */
    ClansBattlestations setName(String name);

    /**
     * Sets the position of this ClansBattlestations. The position field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_battlestations.position.
     *
     * @param position to set of this ClansBattlestations
     *
     * @return this ClansBattlestations instance
     */
    ClansBattlestations setPosition(long position);

    /**
     * Sets the date of this ClansBattlestations. The date field corresponds to
     * the database column kalaazu.kalaazu.clans_battlestations.date.
     *
     * @param date to set of this ClansBattlestations
     *
     * @return this ClansBattlestations instance
     */
    ClansBattlestations setDate(Timestamp date);

    /**
     * Queries the specified manager for the referenced Clans. If no such Clans
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Optional<Clans> findClansId(Manager<Clans> foreignManager);

    /**
     * Queries the specified manager for the referenced Maps. If no such Maps
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Maps findMapsId(Manager<Maps> foreignManager);

    enum Identifier implements ColumnIdentifier<ClansBattlestations> {

        ID("id"),
        CLANS_ID("clans_id"),
        MAPS_ID("maps_id"),
        NAME("name"),
        POSITION("position"),
        DATE("date");

        private final String                               columnId;

        private final TableIdentifier<ClansBattlestations> tableIdentifier;

        Identifier(String columnId) {
            this.columnId = columnId;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsId(),
                    getSchemaId(),
                    getTableId()
            );
        }

        @Override
        public String getDbmsId() {
            return "kalaazu";
        }

        @Override
        public String getSchemaId() {
            return "kalaazu";
        }

        @Override
        public String getTableId() {
            return "clans_battlestations";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<ClansBattlestations> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
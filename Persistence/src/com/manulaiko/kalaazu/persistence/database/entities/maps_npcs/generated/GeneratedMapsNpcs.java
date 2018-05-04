package com.manulaiko.kalaazu.persistence.database.entities.maps_npcs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Maps;
import com.manulaiko.kalaazu.persistence.database.entities.MapsNpcs;
import com.manulaiko.kalaazu.persistence.database.entities.Npcs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * MapsNpcs}-interface
 * representing entities of the {@code maps_npcs}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMapsNpcs {

    /**
     * This Field corresponds to the {@link MapsNpcs} field that can be obtained
     * using the {@link MapsNpcs#getId()} method.
     */
    ByteField<MapsNpcs, Byte>                 ID      = ByteField.create(
            Identifier.ID,
            MapsNpcs::getId,
            MapsNpcs::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link MapsNpcs} field that can be obtained
     * using the {@link MapsNpcs#getMapsId()} method.
     */
    ByteForeignKeyField<MapsNpcs, Byte, Maps> MAPS_ID = ByteForeignKeyField.create(
            Identifier.MAPS_ID,
            MapsNpcs::getMapsId,
            MapsNpcs::setMapsId,
            Maps.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link MapsNpcs} field that can be obtained
     * using the {@link MapsNpcs#getNpcsId()} method.
     */
    ByteForeignKeyField<MapsNpcs, Byte, Npcs> NPCS_ID = ByteForeignKeyField.create(
            Identifier.NPCS_ID,
            MapsNpcs::getNpcsId,
            MapsNpcs::setNpcsId,
            Npcs.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link MapsNpcs} field that can be obtained
     * using the {@link MapsNpcs#getAmount()} method.
     */
    ByteField<MapsNpcs, Byte>                 AMOUNT  = ByteField.create(
            Identifier.AMOUNT,
            MapsNpcs::getAmount,
            MapsNpcs::setAmount,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this MapsNpcs. The id field corresponds to the database
     * column kalaazu.kalaazu.maps_npcs.id.
     *
     * @return the id of this MapsNpcs
     */
    Byte getId();

    /**
     * Returns the mapsId of this MapsNpcs. The mapsId field corresponds to the
     * database column kalaazu.kalaazu.maps_npcs.maps_id.
     *
     * @return the mapsId of this MapsNpcs
     */
    byte getMapsId();

    /**
     * Returns the npcsId of this MapsNpcs. The npcsId field corresponds to the
     * database column kalaazu.kalaazu.maps_npcs.npcs_id.
     *
     * @return the npcsId of this MapsNpcs
     */
    byte getNpcsId();

    /**
     * Returns the amount of this MapsNpcs. The amount field corresponds to the
     * database column kalaazu.kalaazu.maps_npcs.amount.
     *
     * @return the amount of this MapsNpcs
     */
    byte getAmount();

    /**
     * Sets the id of this MapsNpcs. The id field corresponds to the database
     * column kalaazu.kalaazu.maps_npcs.id.
     *
     * @param id to set of this MapsNpcs
     *
     * @return this MapsNpcs instance
     */
    MapsNpcs setId(byte id);

    /**
     * Sets the mapsId of this MapsNpcs. The mapsId field corresponds to the
     * database column kalaazu.kalaazu.maps_npcs.maps_id.
     *
     * @param mapsId to set of this MapsNpcs
     *
     * @return this MapsNpcs instance
     */
    MapsNpcs setMapsId(byte mapsId);

    /**
     * Sets the npcsId of this MapsNpcs. The npcsId field corresponds to the
     * database column kalaazu.kalaazu.maps_npcs.npcs_id.
     *
     * @param npcsId to set of this MapsNpcs
     *
     * @return this MapsNpcs instance
     */
    MapsNpcs setNpcsId(byte npcsId);

    /**
     * Sets the amount of this MapsNpcs. The amount field corresponds to the
     * database column kalaazu.kalaazu.maps_npcs.amount.
     *
     * @param amount to set of this MapsNpcs
     *
     * @return this MapsNpcs instance
     */
    MapsNpcs setAmount(byte amount);

    /**
     * Queries the specified manager for the referenced Maps. If no such Maps
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Maps findMapsId(Manager<Maps> foreignManager);

    /**
     * Queries the specified manager for the referenced Npcs. If no such Npcs
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Npcs findNpcsId(Manager<Npcs> foreignManager);

    enum Identifier implements ColumnIdentifier<MapsNpcs> {

        ID("id"),
        MAPS_ID("maps_id"),
        NPCS_ID("npcs_id"),
        AMOUNT("amount");

        private final String                    columnName;

        private final TableIdentifier<MapsNpcs> tableIdentifier;

        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsName(),
                    getSchemaName(),
                    getTableName()
            );
        }

        @Override
        public String getDbmsName() {
            return "kalaazu";
        }

        @Override
        public String getSchemaName() {
            return "kalaazu";
        }

        @Override
        public String getTableName() {
            return "maps_npcs";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<MapsNpcs> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
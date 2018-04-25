package com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.generated;

import com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.GalaxygatesWaves;
import com.manulaiko.kalaazu.persistence.database.entities.maps.Maps;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.galaxygates_waves.GalaxygatesWaves}-interface
 * representing entities of the {@code galaxygates_waves}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedGalaxygatesWaves {

    /**
     * This Field corresponds to the {@link GalaxygatesWaves} field that can be
     * obtained using the {@link GalaxygatesWaves#getId()} method.
     */
    ByteField<GalaxygatesWaves, Byte>                 ID      = ByteField.create(
            Identifier.ID,
            GalaxygatesWaves::getId,
            GalaxygatesWaves::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link GalaxygatesWaves} field that can be
     * obtained using the {@link GalaxygatesWaves#getMapsId()} method.
     */
    ByteForeignKeyField<GalaxygatesWaves, Byte, Maps> MAPS_ID = ByteForeignKeyField.create(
            Identifier.MAPS_ID,
            GalaxygatesWaves::getMapsId,
            GalaxygatesWaves::setMapsId,
            Maps.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link GalaxygatesWaves} field that can be
     * obtained using the {@link GalaxygatesWaves#getSeconds()} method.
     */
    ByteField<GalaxygatesWaves, Byte>                 SECONDS = ByteField.create(
            Identifier.SECONDS,
            GalaxygatesWaves::getSeconds,
            GalaxygatesWaves::setSeconds,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link GalaxygatesWaves} field that can be
     * obtained using the {@link GalaxygatesWaves#getNpcs()} method.
     */
    ByteField<GalaxygatesWaves, Byte>                 NPCS    = ByteField.create(
            Identifier.NPCS,
            GalaxygatesWaves::getNpcs,
            GalaxygatesWaves::setNpcs,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this GalaxygatesWaves. The id field corresponds to the
     * database column kalaazu.kalaazu.galaxygates_waves.id.
     *
     * @return the id of this GalaxygatesWaves
     */
    byte getId();

    /**
     * Returns the mapsId of this GalaxygatesWaves. The mapsId field corresponds
     * to the database column kalaazu.kalaazu.galaxygates_waves.maps_id.
     *
     * @return the mapsId of this GalaxygatesWaves
     */
    byte getMapsId();

    /**
     * Returns the seconds of this GalaxygatesWaves. The seconds field
     * corresponds to the database column
     * kalaazu.kalaazu.galaxygates_waves.seconds.
     *
     * @return the seconds of this GalaxygatesWaves
     */
    byte getSeconds();

    /**
     * Returns the npcs of this GalaxygatesWaves. The npcs field corresponds to
     * the database column kalaazu.kalaazu.galaxygates_waves.npcs.
     *
     * @return the npcs of this GalaxygatesWaves
     */
    byte getNpcs();

    /**
     * Sets the id of this GalaxygatesWaves. The id field corresponds to the
     * database column kalaazu.kalaazu.galaxygates_waves.id.
     *
     * @param id to set of this GalaxygatesWaves
     *
     * @return this GalaxygatesWaves instance
     */
    GalaxygatesWaves setId(byte id);

    /**
     * Sets the mapsId of this GalaxygatesWaves. The mapsId field corresponds to
     * the database column kalaazu.kalaazu.galaxygates_waves.maps_id.
     *
     * @param mapsId to set of this GalaxygatesWaves
     *
     * @return this GalaxygatesWaves instance
     */
    GalaxygatesWaves setMapsId(byte mapsId);

    /**
     * Sets the seconds of this GalaxygatesWaves. The seconds field corresponds
     * to the database column kalaazu.kalaazu.galaxygates_waves.seconds.
     *
     * @param seconds to set of this GalaxygatesWaves
     *
     * @return this GalaxygatesWaves instance
     */
    GalaxygatesWaves setSeconds(byte seconds);

    /**
     * Sets the npcs of this GalaxygatesWaves. The npcs field corresponds to the
     * database column kalaazu.kalaazu.galaxygates_waves.npcs.
     *
     * @param npcs to set of this GalaxygatesWaves
     *
     * @return this GalaxygatesWaves instance
     */
    GalaxygatesWaves setNpcs(byte npcs);

    /**
     * Queries the specified manager for the referenced Maps. If no such Maps
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Maps findMapsId(Manager<Maps> foreignManager);

    enum Identifier implements ColumnIdentifier<GalaxygatesWaves> {

        ID("id"),
        MAPS_ID("maps_id"),
        SECONDS("seconds"),
        NPCS("npcs");

        private final String                            columnName;

        private final TableIdentifier<GalaxygatesWaves> tableIdentifier;

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
            return "galaxygates_waves";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<GalaxygatesWaves> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
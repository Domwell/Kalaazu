package com.kalaazu.persistence.database.entities.galaxygates_spawns.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesSpawns;
import com.kalaazu.persistence.database.entities.Manager;
import com.kalaazu.persistence.database.entities.Npcs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * GalaxygatesSpawns}-interface
 * representing entities of the {@code galaxygates_spawns}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedGalaxygatesSpawns {

    /**
     * This Field corresponds to the {@link GalaxygatesSpawns} field that can be
     * obtained using the {@link GalaxygatesSpawns#id()} method.
     */
    IntField<GalaxygatesSpawns, Integer> ID = IntField.create(
            Identifier.ID,
            GalaxygatesSpawns::id,
            GalaxygatesSpawns::id,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link GalaxygatesSpawns} field that can be
     * obtained using the {@link GalaxygatesSpawns#npcsId()} method.
     */
    ByteForeignKeyField<GalaxygatesSpawns, Byte, Npcs> NPCS_ID = ByteForeignKeyField.create(
            Identifier.NPCS_ID,
            GalaxygatesSpawns::npcsId,
            GalaxygatesSpawns::npcsId,
            Npcs.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link GalaxygatesSpawns} field that can be
     * obtained using the {@link GalaxygatesSpawns#amount()} method.
     */
    ByteField<GalaxygatesSpawns, Byte> AMOUNT = ByteField.create(
            Identifier.AMOUNT,
            GalaxygatesSpawns::amount,
            GalaxygatesSpawns::amount,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this GalaxygatesSpawns. The id field corresponds to the
     * database column kalaazu.kalaazu.galaxygates_spawns.id.
     *
     * @return the id of this GalaxygatesSpawns
     */
    Integer id();

    /**
     * Returns the npcsId of this GalaxygatesSpawns. The npcsId field
     * corresponds to the database column
     * kalaazu.kalaazu.galaxygates_spawns.npcs_id.
     *
     * @return the npcsId of this GalaxygatesSpawns
     */
    byte npcsId();

    /**
     * Returns the amount of this GalaxygatesSpawns. The amount field
     * corresponds to the database column
     * kalaazu.kalaazu.galaxygates_spawns.amount.
     *
     * @return the amount of this GalaxygatesSpawns
     */
    byte amount();

    /**
     * Sets the id of this GalaxygatesSpawns. The id field corresponds to the
     * database column kalaazu.kalaazu.galaxygates_spawns.id.
     *
     * @param id to set of this GalaxygatesSpawns
     *
     * @return this GalaxygatesSpawns instance
     */
    GalaxygatesSpawns id(Integer id);

    /**
     * Sets the npcsId of this GalaxygatesSpawns. The npcsId field corresponds
     * to the database column kalaazu.kalaazu.galaxygates_spawns.npcs_id.
     *
     * @param npcsId to set of this GalaxygatesSpawns
     *
     * @return this GalaxygatesSpawns instance
     */
    GalaxygatesSpawns npcsId(byte npcsId);

    /**
     * Sets the amount of this GalaxygatesSpawns. The amount field corresponds
     * to the database column kalaazu.kalaazu.galaxygates_spawns.amount.
     *
     * @param amount to set of this GalaxygatesSpawns
     *
     * @return this GalaxygatesSpawns instance
     */
    GalaxygatesSpawns amount(byte amount);

    /**
     * Queries the specified manager for the referenced Npcs. If no such Npcs
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Npcs findNpcsId(Manager<Npcs> foreignManager);

    enum Identifier implements ColumnIdentifier<GalaxygatesSpawns> {

        ID("id"),
        NPCS_ID("npcs_id"),
        AMOUNT("amount");

        private final String columnName;

        private final TableIdentifier<GalaxygatesSpawns> tableIdentifier;

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
            return "galaxygates_spawns";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<GalaxygatesSpawns> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
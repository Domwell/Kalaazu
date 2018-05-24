package com.kalaazu.persistence.database.entities.galaxygates_stages_spawns.generated;

import com.kalaazu.persistence.database.entities.GalaxygatesSpawns;
import com.kalaazu.persistence.database.entities.GalaxygatesStages;
import com.kalaazu.persistence.database.entities.GalaxygatesStagesSpawns;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.galaxygates_stages_spawns.GalaxygatesStagesSpawns}-interface
 * representing entities of the {@code galaxygates_stages_spawns}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedGalaxygatesStagesSpawns {

    /**
     * This Field corresponds to the {@link GalaxygatesStagesSpawns} field that
     * can be obtained using the {@link GalaxygatesStagesSpawns#getId()} method.
     */
    IntField<GalaxygatesStagesSpawns, Integer>                              ID                    = IntField.create(
            Identifier.ID,
            GalaxygatesStagesSpawns::getId,
            GalaxygatesStagesSpawns::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link GalaxygatesStagesSpawns} field that
     * can be obtained using the {@link
     * GalaxygatesStagesSpawns#getGalaxygatesStagesId()} method.
     */
    IntForeignKeyField<GalaxygatesStagesSpawns, Integer, GalaxygatesStages> GALAXYGATES_STAGES_ID = IntForeignKeyField.create(
            Identifier.GALAXYGATES_STAGES_ID,
            GalaxygatesStagesSpawns::getGalaxygatesStagesId,
            GalaxygatesStagesSpawns::setGalaxygatesStagesId,
            GalaxygatesStages.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link GalaxygatesStagesSpawns} field that
     * can be obtained using the {@link
     * GalaxygatesStagesSpawns#getGalaxygatesSpawnsId()} method.
     */
    IntForeignKeyField<GalaxygatesStagesSpawns, Integer, GalaxygatesSpawns> GALAXYGATES_SPAWNS_ID = IntForeignKeyField.create(
            Identifier.GALAXYGATES_SPAWNS_ID,
            GalaxygatesStagesSpawns::getGalaxygatesSpawnsId,
            GalaxygatesStagesSpawns::setGalaxygatesSpawnsId,
            GalaxygatesSpawns.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this GalaxygatesStagesSpawns. The id field corresponds
     * to the database column kalaazu.kalaazu.galaxygates_stages_spawns.id.
     *
     * @return the id of this GalaxygatesStagesSpawns
     */
    Integer getId();

    /**
     * Returns the galaxygatesStagesId of this GalaxygatesStagesSpawns. The
     * galaxygatesStagesId field corresponds to the database column
     * kalaazu.kalaazu.galaxygates_stages_spawns.galaxygates_stages_id.
     *
     * @return the galaxygatesStagesId of this GalaxygatesStagesSpawns
     */
    int getGalaxygatesStagesId();

    /**
     * Returns the galaxygatesSpawnsId of this GalaxygatesStagesSpawns. The
     * galaxygatesSpawnsId field corresponds to the database column
     * kalaazu.kalaazu.galaxygates_stages_spawns.galaxygates_spawns_id.
     *
     * @return the galaxygatesSpawnsId of this GalaxygatesStagesSpawns
     */
    int getGalaxygatesSpawnsId();

    /**
     * Sets the id of this GalaxygatesStagesSpawns. The id field corresponds to
     * the database column kalaazu.kalaazu.galaxygates_stages_spawns.id.
     *
     * @param id to set of this GalaxygatesStagesSpawns
     *
     * @return this GalaxygatesStagesSpawns instance
     */
    GalaxygatesStagesSpawns setId(int id);

    /**
     * Sets the galaxygatesStagesId of this GalaxygatesStagesSpawns. The
     * galaxygatesStagesId field corresponds to the database column
     * kalaazu.kalaazu.galaxygates_stages_spawns.galaxygates_stages_id.
     *
     * @param galaxygatesStagesId to set of this GalaxygatesStagesSpawns
     *
     * @return this GalaxygatesStagesSpawns instance
     */
    GalaxygatesStagesSpawns setGalaxygatesStagesId(int galaxygatesStagesId);

    /**
     * Sets the galaxygatesSpawnsId of this GalaxygatesStagesSpawns. The
     * galaxygatesSpawnsId field corresponds to the database column
     * kalaazu.kalaazu.galaxygates_stages_spawns.galaxygates_spawns_id.
     *
     * @param galaxygatesSpawnsId to set of this GalaxygatesStagesSpawns
     *
     * @return this GalaxygatesStagesSpawns instance
     */
    GalaxygatesStagesSpawns setGalaxygatesSpawnsId(int galaxygatesSpawnsId);

    /**
     * Queries the specified manager for the referenced GalaxygatesStages. If no
     * such GalaxygatesStages exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    GalaxygatesStages findGalaxygatesStagesId(Manager<GalaxygatesStages> foreignManager);

    /**
     * Queries the specified manager for the referenced GalaxygatesSpawns. If no
     * such GalaxygatesSpawns exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    GalaxygatesSpawns findGalaxygatesSpawnsId(Manager<GalaxygatesSpawns> foreignManager);

    enum Identifier implements ColumnIdentifier<GalaxygatesStagesSpawns> {

        ID("id"),
        GALAXYGATES_STAGES_ID("galaxygates_stages_id"),
        GALAXYGATES_SPAWNS_ID("galaxygates_spawns_id");

        private final String                                   columnId;

        private final TableIdentifier<GalaxygatesStagesSpawns> tableIdentifier;

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
            return "galaxygates_stages_spawns";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<GalaxygatesStagesSpawns> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
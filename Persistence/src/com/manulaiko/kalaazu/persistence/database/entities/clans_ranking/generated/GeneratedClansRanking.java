package com.manulaiko.kalaazu.persistence.database.entities.clans_ranking.generated;

import com.manulaiko.kalaazu.persistence.database.entities.clans.Clans;
import com.manulaiko.kalaazu.persistence.database.entities.clans_ranking.ClansRanking;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.clans_ranking.ClansRanking}-interface
 * representing entities of the {@code clans_ranking}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedClansRanking {

    /**
     * This Field corresponds to the {@link ClansRanking} field that can be
     * obtained using the {@link ClansRanking#getId()} method.
     */
    IntField<ClansRanking, Integer>                  ID          = IntField.create(
            Identifier.ID,
            ClansRanking::getId,
            ClansRanking::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ClansRanking} field that can be
     * obtained using the {@link ClansRanking#getClansId()} method.
     */
    IntForeignKeyField<ClansRanking, Integer, Clans> CLANS_ID    = IntForeignKeyField.create(
            Identifier.CLANS_ID,
            ClansRanking::getClansId,
            ClansRanking::setClansId,
            Clans.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link ClansRanking} field that can be
     * obtained using the {@link ClansRanking#getPoints()} method.
     */
    IntField<ClansRanking, Integer>                  POINTS      = IntField.create(
            Identifier.POINTS,
            ClansRanking::getPoints,
            ClansRanking::setPoints,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link ClansRanking} field that can be
     * obtained using the {@link ClansRanking#getBestPoints()} method.
     */
    IntField<ClansRanking, Integer>                  BEST_POINTS = IntField.create(
            Identifier.BEST_POINTS,
            ClansRanking::getBestPoints,
            ClansRanking::setBestPoints,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this ClansRanking. The id field corresponds to the
     * database column kalaazu.kalaazu.clans_ranking.id.
     *
     * @return the id of this ClansRanking
     */
    int getId();

    /**
     * Returns the clansId of this ClansRanking. The clansId field corresponds
     * to the database column kalaazu.kalaazu.clans_ranking.clans_id.
     *
     * @return the clansId of this ClansRanking
     */
    int getClansId();

    /**
     * Returns the points of this ClansRanking. The points field corresponds to
     * the database column kalaazu.kalaazu.clans_ranking.points.
     *
     * @return the points of this ClansRanking
     */
    int getPoints();

    /**
     * Returns the bestPoints of this ClansRanking. The bestPoints field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_ranking.best_points.
     *
     * @return the bestPoints of this ClansRanking
     */
    int getBestPoints();

    /**
     * Sets the id of this ClansRanking. The id field corresponds to the
     * database column kalaazu.kalaazu.clans_ranking.id.
     *
     * @param id to set of this ClansRanking
     *
     * @return this ClansRanking instance
     */
    ClansRanking setId(int id);

    /**
     * Sets the clansId of this ClansRanking. The clansId field corresponds to
     * the database column kalaazu.kalaazu.clans_ranking.clans_id.
     *
     * @param clansId to set of this ClansRanking
     *
     * @return this ClansRanking instance
     */
    ClansRanking setClansId(int clansId);

    /**
     * Sets the points of this ClansRanking. The points field corresponds to the
     * database column kalaazu.kalaazu.clans_ranking.points.
     *
     * @param points to set of this ClansRanking
     *
     * @return this ClansRanking instance
     */
    ClansRanking setPoints(int points);

    /**
     * Sets the bestPoints of this ClansRanking. The bestPoints field
     * corresponds to the database column
     * kalaazu.kalaazu.clans_ranking.best_points.
     *
     * @param bestPoints to set of this ClansRanking
     *
     * @return this ClansRanking instance
     */
    ClansRanking setBestPoints(int bestPoints);

    /**
     * Queries the specified manager for the referenced Clans. If no such Clans
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Clans findClansId(Manager<Clans> foreignManager);

    enum Identifier implements ColumnIdentifier<ClansRanking> {

        ID("id"),
        CLANS_ID("clans_id"),
        POINTS("points"),
        BEST_POINTS("best_points");

        private final String                        columnName;

        private final TableIdentifier<ClansRanking> tableIdentifier;

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
            return "clans_ranking";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<ClansRanking> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
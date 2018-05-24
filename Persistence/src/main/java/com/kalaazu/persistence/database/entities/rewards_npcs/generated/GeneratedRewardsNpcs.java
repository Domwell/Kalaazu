package com.kalaazu.persistence.database.entities.rewards_npcs.generated;

import com.kalaazu.persistence.database.entities.Npcs;
import com.kalaazu.persistence.database.entities.Rewards;
import com.kalaazu.persistence.database.entities.RewardsNpcs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.rewards_npcs.RewardsNpcs}-interface
 * representing entities of the {@code rewards_npcs}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRewardsNpcs {

    /**
     * This Field corresponds to the {@link RewardsNpcs} field that can be
     * obtained using the {@link RewardsNpcs#getId()} method.
     */
    ShortField<RewardsNpcs, Short>                    ID         = ShortField.create(
            Identifier.ID,
            RewardsNpcs::getId,
            RewardsNpcs::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link RewardsNpcs} field that can be
     * obtained using the {@link RewardsNpcs#getNpcsId()} method.
     */
    ByteForeignKeyField<RewardsNpcs, Byte, Npcs>      NPCS_ID    = ByteForeignKeyField.create(
            Identifier.NPCS_ID,
            RewardsNpcs::getNpcsId,
            RewardsNpcs::setNpcsId,
            Npcs.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link RewardsNpcs} field that can be
     * obtained using the {@link RewardsNpcs#getRewardsId()} method.
     */
    ShortForeignKeyField<RewardsNpcs, Short, Rewards> REWARDS_ID = ShortForeignKeyField.create(
            Identifier.REWARDS_ID,
            RewardsNpcs::getRewardsId,
            RewardsNpcs::setRewardsId,
            Rewards.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this RewardsNpcs. The id field corresponds to the
     * database column kalaazu.kalaazu.rewards_npcs.id.
     *
     * @return the id of this RewardsNpcs
     */
    Short getId();

    /**
     * Returns the npcsId of this RewardsNpcs. The npcsId field corresponds to
     * the database column kalaazu.kalaazu.rewards_npcs.npcs_id.
     *
     * @return the npcsId of this RewardsNpcs
     */
    byte getNpcsId();

    /**
     * Returns the rewardsId of this RewardsNpcs. The rewardsId field
     * corresponds to the database column
     * kalaazu.kalaazu.rewards_npcs.rewards_id.
     *
     * @return the rewardsId of this RewardsNpcs
     */
    short getRewardsId();

    /**
     * Sets the id of this RewardsNpcs. The id field corresponds to the database
     * column kalaazu.kalaazu.rewards_npcs.id.
     *
     * @param id to set of this RewardsNpcs
     *
     * @return this RewardsNpcs instance
     */
    RewardsNpcs setId(short id);

    /**
     * Sets the npcsId of this RewardsNpcs. The npcsId field corresponds to the
     * database column kalaazu.kalaazu.rewards_npcs.npcs_id.
     *
     * @param npcsId to set of this RewardsNpcs
     *
     * @return this RewardsNpcs instance
     */
    RewardsNpcs setNpcsId(byte npcsId);

    /**
     * Sets the rewardsId of this RewardsNpcs. The rewardsId field corresponds
     * to the database column kalaazu.kalaazu.rewards_npcs.rewards_id.
     *
     * @param rewardsId to set of this RewardsNpcs
     *
     * @return this RewardsNpcs instance
     */
    RewardsNpcs setRewardsId(short rewardsId);

    /**
     * Queries the specified manager for the referenced Npcs. If no such Npcs
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Npcs findNpcsId(Manager<Npcs> foreignManager);

    /**
     * Queries the specified manager for the referenced Rewards. If no such
     * Rewards exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Rewards findRewardsId(Manager<Rewards> foreignManager);

    enum Identifier implements ColumnIdentifier<RewardsNpcs> {

        ID("id"),
        NPCS_ID("npcs_id"),
        REWARDS_ID("rewards_id");

        private final String                       columnId;

        private final TableIdentifier<RewardsNpcs> tableIdentifier;

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
            return "rewards_npcs";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<RewardsNpcs> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
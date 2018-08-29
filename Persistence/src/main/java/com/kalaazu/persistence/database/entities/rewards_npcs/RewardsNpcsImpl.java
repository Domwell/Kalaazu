package com.kalaazu.persistence.database.entities.rewards_npcs;

import com.kalaazu.persistence.database.Database;
import com.kalaazu.persistence.database.entities.Npcs;
import com.kalaazu.persistence.database.entities.Rewards;
import com.kalaazu.persistence.database.entities.RewardsNpcs;
import com.kalaazu.persistence.database.entities.rewards_npcs.generated.GeneratedRewardsNpcsImpl;

/**
 * The default implementation of the {@link
 * RewardsNpcs}-interface.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public final class RewardsNpcsImpl
        extends GeneratedRewardsNpcsImpl
        implements RewardsNpcs {
    /**
     * The reward.
     */
    private Rewards reward;

    /**
     * The npc.
     */
    private Npcs npc;

    @Override
    public Rewards reward() {
        if (this.reward != null) {
            return this.reward;
        }

        this.reward = super.findRewardsId(
                Database.instance()
                        .db()
                        .manager(Rewards.class)
        );

        return this.reward;
    }

    @Override
    public Npcs npc() {
        if (this.npc != null) {
            return this.npc;
        }

        this.npc = super.findNpcsId(
                Database.instance()
                        .db()
                        .manager(Npcs.class)
        );

        return this.npc;
    }
}
package com.kalaazu.persistence.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Clans rankings entity.
 * ======================
 *
 * Entity for the `clans_rankings` table.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Table(name = "clans_ranking", schema = "kalaazu")
@Data
public class ClansRankingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "points", nullable = false)
    private int points = 0;

    @Basic
    @Column(name = "best_points", nullable = false)
    private int bestPoints = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clans_id", referencedColumnName = "id", nullable = false)
    private ClansEntity clansByClansId;
}

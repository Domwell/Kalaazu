package com.kalaazu.persistence.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Levels upgrades entity.
 * =======================
 *
 * Entity for the `levels_upgrades` table.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Table(name = "levels_upgrades", schema = "kalaazu")
@Data
public class LevelsUpgradesEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "probability", nullable = false)
    private byte probability;

    @Basic
    @Column(name = "credits", nullable = false)
    private int credits;

    @Basic
    @Column(name = "uridium", nullable = false)
    private short uridium;

    @ManyToOne
    @JoinColumn(name = "levels_id", referencedColumnName = "id", nullable = false)
    private LevelsEntity levelsByLevelsId;
}
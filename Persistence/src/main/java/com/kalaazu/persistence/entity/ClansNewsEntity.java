package com.kalaazu.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Clans news entity.
 * ==================
 *
 * Entity for the `clans_news` table.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Entity
@Table(name = "clans_news", schema = "kalaazu")
@Data
public class ClansNewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "date", nullable = false)
    private Timestamp date;

    @Basic
    @Column(name = "text", nullable = false, length = -1, columnDefinition = "TEXT")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accounts_id", referencedColumnName = "id", nullable = false)
    private AccountsEntity accountsByAccountsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clans_id", referencedColumnName = "id", nullable = false)
    private ClansEntity clansByClansId;
}

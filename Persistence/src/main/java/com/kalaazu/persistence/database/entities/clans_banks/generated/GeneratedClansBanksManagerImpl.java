package com.kalaazu.persistence.database.entities.clans_banks.generated;

import com.kalaazu.persistence.database.entities.ClansBanks;
import com.kalaazu.persistence.database.entities.clans_banks.ClansBanksManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.kalaazu.persistence.database.entities.clans_banks.ClansBanks} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBanksManagerImpl
        extends AbstractManager<ClansBanks>
        implements GeneratedClansBanksManager {

    private final TableIdentifier<ClansBanks> tableIdentifier;

    protected GeneratedClansBanksManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_banks");
    }

    @Override
    public TableIdentifier<ClansBanks> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<ClansBanks>> fields() {
        return ClansBanksManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<ClansBanks>> primaryKeyFields() {
        return Stream.of(
                ClansBanks.ID
        );
    }
}
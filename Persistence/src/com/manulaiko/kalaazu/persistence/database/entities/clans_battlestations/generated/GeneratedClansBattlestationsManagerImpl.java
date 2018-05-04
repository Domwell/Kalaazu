package com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations.generated;

import com.manulaiko.kalaazu.persistence.database.entities.ClansBattlestations;
import com.manulaiko.kalaazu.persistence.database.entities.clans_battlestations.ClansBattlestationsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * ClansBattlestations}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBattlestationsManagerImpl
        extends AbstractManager<ClansBattlestations>
        implements GeneratedClansBattlestationsManager {

    private final TableIdentifier<ClansBattlestations> tableIdentifier;

    protected GeneratedClansBattlestationsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_battlestations");
    }

    @Override
    public TableIdentifier<ClansBattlestations> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<ClansBattlestations>> fields() {
        return ClansBattlestationsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<ClansBattlestations>> primaryKeyFields() {
        return Stream.of(
                ClansBattlestations.ID
        );
    }
}
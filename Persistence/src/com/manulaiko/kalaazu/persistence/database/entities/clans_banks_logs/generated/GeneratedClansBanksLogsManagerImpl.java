package com.manulaiko.kalaazu.persistence.database.entities.clans_banks_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.ClansBanksLogs;
import com.manulaiko.kalaazu.persistence.database.entities.clans_banks_logs.ClansBanksLogsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * ClansBanksLogs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBanksLogsManagerImpl
        extends AbstractManager<ClansBanksLogs>
        implements GeneratedClansBanksLogsManager {

    private final TableIdentifier<ClansBanksLogs> tableIdentifier;

    protected GeneratedClansBanksLogsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_banks_logs");
    }

    @Override
    public TableIdentifier<ClansBanksLogs> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<ClansBanksLogs>> fields() {
        return ClansBanksLogsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<ClansBanksLogs>> primaryKeyFields() {
        return Stream.of(
                ClansBanksLogs.ID
        );
    }
}
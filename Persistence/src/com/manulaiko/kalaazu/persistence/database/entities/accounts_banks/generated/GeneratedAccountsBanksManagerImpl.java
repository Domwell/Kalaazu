package com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.AccountsBanks;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.AccountsBanksManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_banks.AccountsBanks}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsBanksManagerImpl
        extends AbstractManager<AccountsBanks>
        implements GeneratedAccountsBanksManager {

    private final TableIdentifier<AccountsBanks> tableIdentifier;

    protected GeneratedAccountsBanksManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_banks");
    }

    @Override
    public TableIdentifier<AccountsBanks> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<AccountsBanks>> fields() {
        return AccountsBanksManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<AccountsBanks>> primaryKeyFields() {
        return Stream.of(
                AccountsBanks.ID
        );
    }
}
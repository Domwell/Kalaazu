package com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.AccountsConfigurationsAccountsItems;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.AccountsConfigurationsAccountsItemsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * AccountsConfigurationsAccountsItems}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsConfigurationsAccountsItemsManagerImpl
        extends AbstractManager<AccountsConfigurationsAccountsItems>
        implements GeneratedAccountsConfigurationsAccountsItemsManager {

    private final TableIdentifier<AccountsConfigurationsAccountsItems> tableIdentifier;

    protected GeneratedAccountsConfigurationsAccountsItemsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_configurations_accounts_items");
    }

    @Override
    public TableIdentifier<AccountsConfigurationsAccountsItems> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<AccountsConfigurationsAccountsItems>> fields() {
        return AccountsConfigurationsAccountsItemsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<AccountsConfigurationsAccountsItems>> primaryKeyFields() {
        return Stream.of(
                AccountsConfigurationsAccountsItems.ID
        );
    }
}
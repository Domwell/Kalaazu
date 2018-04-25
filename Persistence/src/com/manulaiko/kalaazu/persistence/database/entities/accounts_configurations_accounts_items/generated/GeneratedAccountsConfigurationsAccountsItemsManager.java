package com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.AccountsConfigurationsAccountsItems;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_configurations_accounts_items.AccountsConfigurationsAccountsItems}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsConfigurationsAccountsItemsManager extends Manager<AccountsConfigurationsAccountsItems> {

    List<Field<AccountsConfigurationsAccountsItems>> FIELDS = unmodifiableList(asList(
            AccountsConfigurationsAccountsItems.ID,
            AccountsConfigurationsAccountsItems.ACCOUNTS_CONFIGURATIONS_ID,
            AccountsConfigurationsAccountsItems.ACCOUNTS_ITEMS_ID,
            AccountsConfigurationsAccountsItems.ACCOUNTS_DRONES_ID,
            AccountsConfigurationsAccountsItems.ACCOUNTS_PETS_ID
    ));

    @Override
    default Class<AccountsConfigurationsAccountsItems> getEntityClass() {
        return AccountsConfigurationsAccountsItems.class;
    }
}
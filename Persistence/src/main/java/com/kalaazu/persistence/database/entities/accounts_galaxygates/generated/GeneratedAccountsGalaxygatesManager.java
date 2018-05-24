package com.kalaazu.persistence.database.entities.accounts_galaxygates.generated;

import com.kalaazu.persistence.database.entities.AccountsGalaxygates;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygates}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsGalaxygatesManager extends Manager<AccountsGalaxygates> {

    TableIdentifier<AccountsGalaxygates> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "accounts_galaxygates"
    );

    List<Field<AccountsGalaxygates>>     FIELDS     = unmodifiableList(asList(
            AccountsGalaxygates.ID,
            AccountsGalaxygates.GALAXYGATES_ID,
            AccountsGalaxygates.ACCOUNTS_ID,
            AccountsGalaxygates.PARTS,
            AccountsGalaxygates.LIFES,
            AccountsGalaxygates.WAVE,
            AccountsGalaxygates.TIMES
    ));

    @Override
    default Class<AccountsGalaxygates> getEntityClass() {
        return AccountsGalaxygates.class;
    }
}
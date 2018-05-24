package com.kalaazu.persistence.database.entities.accounts_destroys.generated;

import com.kalaazu.persistence.database.entities.AccountsDestroys;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.accounts_destroys.AccountsDestroys}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsDestroysManager extends Manager<AccountsDestroys> {

    TableIdentifier<AccountsDestroys> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "accounts_destroys"
    );

    List<Field<AccountsDestroys>>     FIELDS     = unmodifiableList(asList(
            AccountsDestroys.ID,
            AccountsDestroys.ACCOUNTS_ID,
            AccountsDestroys.SHIPS_ID,
            AccountsDestroys.POINTS,
            AccountsDestroys.AMOUNT
    ));

    @Override
    default Class<AccountsDestroys> getEntityClass() {
        return AccountsDestroys.class;
    }
}
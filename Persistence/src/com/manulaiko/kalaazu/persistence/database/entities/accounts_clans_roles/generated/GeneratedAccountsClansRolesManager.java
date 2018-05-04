package com.manulaiko.kalaazu.persistence.database.entities.accounts_clans_roles.generated;

import com.manulaiko.kalaazu.persistence.database.entities.AccountsClansRoles;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * AccountsClansRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsClansRolesManager extends Manager<AccountsClansRoles> {

    List<Field<AccountsClansRoles>> FIELDS = unmodifiableList(asList(
            AccountsClansRoles.ID,
            AccountsClansRoles.ACCOUNTS_ID,
            AccountsClansRoles.CLANS_ROLES_ID
    ));

    @Override
    default Class<AccountsClansRoles> getEntityClass() {
        return AccountsClansRoles.class;
    }
}
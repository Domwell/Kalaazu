package com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.AccountsMessages;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.AccountsMessages}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsMessagesManager extends Manager<AccountsMessages> {

    List<Field<AccountsMessages>> FIELDS = unmodifiableList(asList(
            AccountsMessages.ID,
            AccountsMessages.FROM_ACCOUNTS_ID,
            AccountsMessages.FROM_STATUS,
            AccountsMessages.TO_ACCOUNTS_ID,
            AccountsMessages.TO_STATUS,
            AccountsMessages.DATE,
            AccountsMessages.TITLE,
            AccountsMessages.TEXT
    ));

    @Override
    default Class<AccountsMessages> getEntityClass() {
        return AccountsMessages.class;
    }
}
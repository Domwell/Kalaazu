package com.manulaiko.kalaazu.persistence.database.entities.accounts_banks_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.accounts_banks_logs.AccountsBanksLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_banks_logs.AccountsBanksLogs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsBanksLogsManager extends Manager<AccountsBanksLogs> {

    List<Field<AccountsBanksLogs>> FIELDS = unmodifiableList(asList(
            AccountsBanksLogs.ID,
            AccountsBanksLogs.FROM_ACCOUNTS_ID,
            AccountsBanksLogs.TO_ACCOUNTS_ID,
            AccountsBanksLogs.DATE,
            AccountsBanksLogs.TYPE,
            AccountsBanksLogs.AMOUNT,
            AccountsBanksLogs.CURRENCY,
            AccountsBanksLogs.ACCOUNTS_BANKS_ID
    ));

    @Override
    default Class<AccountsBanksLogs> getEntityClass() {
        return AccountsBanksLogs.class;
    }
}
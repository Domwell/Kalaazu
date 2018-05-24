package com.kalaazu.persistence.database.entities.accounts.generated;

import com.kalaazu.persistence.database.entities.*;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * Accounts}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsManager extends Manager<Accounts> {

    TableIdentifier<Accounts> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "accounts"
    );

    List<Field<Accounts>>     FIELDS     = unmodifiableList(asList(
            Accounts.ID,
            Accounts.USERS_ID,
            Accounts.SESSION_ID,
            Accounts.LEVELS_ID,
            Accounts.FACTIONS_ID,
            Accounts.ACCOUNTS_HANGARS_ID,
            Accounts.CLANS_ID,
            Accounts.RANKS_ID,
            Accounts.NAME,
            Accounts.BAN_DATE,
            Accounts.PREMIUM_DATE,
            Accounts.DATE,
            Accounts.LAST_LOGIN,
            Accounts.SKILL_POINTS_TOTAL,
            Accounts.SKILL_POINTS_FREE
    ));

    @Override
    default Class<Accounts> getEntityClass() {
        return Accounts.class;
    }
}
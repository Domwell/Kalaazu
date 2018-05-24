package com.kalaazu.persistence.database.entities.accounts_drones.generated;

import com.kalaazu.persistence.database.entities.AccountsDrones;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.kalaazu.persistence.database.entities.accounts_drones.AccountsDrones}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsDronesManager extends Manager<AccountsDrones> {

    TableIdentifier<AccountsDrones> IDENTIFIER = TableIdentifier.of(
            "database",
            "entities",
            "accounts_drones"
    );

    List<Field<AccountsDrones>>     FIELDS     = unmodifiableList(asList(
            AccountsDrones.ID,
            AccountsDrones.ACCOUNTS_ID,
            AccountsDrones.LEVELS_ID,
            AccountsDrones.EXPERIENCE,
            AccountsDrones.DATE
    ));

    @Override
    default Class<AccountsDrones> getEntityClass() {
        return AccountsDrones.class;
    }
}
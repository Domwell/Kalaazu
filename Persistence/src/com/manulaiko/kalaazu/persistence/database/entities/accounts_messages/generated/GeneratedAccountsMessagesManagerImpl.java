package com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.generated;

import com.manulaiko.kalaazu.persistence.database.entities.AccountsMessages;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_messages.AccountsMessagesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * AccountsMessages}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsMessagesManagerImpl
        extends AbstractManager<AccountsMessages>
        implements GeneratedAccountsMessagesManager {

    private final TableIdentifier<AccountsMessages> tableIdentifier;

    protected GeneratedAccountsMessagesManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_messages");
    }

    @Override
    public TableIdentifier<AccountsMessages> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<AccountsMessages>> fields() {
        return AccountsMessagesManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<AccountsMessages>> primaryKeyFields() {
        return Stream.of(
                AccountsMessages.ID
        );
    }
}
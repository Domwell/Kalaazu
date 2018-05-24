package com.kalaazu.persistence.database.entities.accounts_skills.generated;

import com.kalaazu.persistence.database.entities.AccountsSkills;
import com.kalaazu.persistence.database.entities.accounts_skills.AccountsSkillsManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.kalaazu.persistence.database.entities.accounts_skills.AccountsSkills}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsSkillsManagerImpl
        extends AbstractManager<AccountsSkills>
        implements GeneratedAccountsSkillsManager {

    private final TableIdentifier<AccountsSkills> tableIdentifier;

    protected GeneratedAccountsSkillsManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_skills");
    }

    @Override
    public TableIdentifier<AccountsSkills> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<AccountsSkills>> fields() {
        return AccountsSkillsManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<AccountsSkills>> primaryKeyFields() {
        return Stream.of(
                AccountsSkills.ID
        );
    }
}
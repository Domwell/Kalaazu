package com.kalaazu.persistence.database.entities.accounts_clans_roles.generated;

import com.kalaazu.persistence.database.entities.*;
import com.kalaazu.persistence.database.entities.accounts_clans_roles.AccountsClansRolesImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.accounts_clans_roles.AccountsClansRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsClansRolesSqlAdapter implements SqlAdapter<AccountsClansRoles> {

    private final TableIdentifier<AccountsClansRoles> tableIdentifier;

    protected GeneratedAccountsClansRolesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_clans_roles");
    }

    protected AccountsClansRoles apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getInt(1 + offset))
                .setAccountsId(resultSet.getInt(2 + offset))
                .setClansRolesId(resultSet.getInt(3 + offset))
                ;
    }

    protected AccountsClansRolesImpl createEntity() {
        return new AccountsClansRolesImpl();
    }

    @Override
    public TableIdentifier<AccountsClansRoles> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, AccountsClansRoles> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, AccountsClansRoles> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
package com.kalaazu.persistence.database.entities.accounts_galaxygates.generated;

import com.kalaazu.persistence.database.entities.AccountsGalaxygates;
import com.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygatesImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.accounts_galaxygates.AccountsGalaxygates}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsGalaxygatesSqlAdapter implements SqlAdapter<AccountsGalaxygates> {

    private final TableIdentifier<AccountsGalaxygates> tableIdentifier;

    protected GeneratedAccountsGalaxygatesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "accounts_galaxygates");
    }

    protected AccountsGalaxygates apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getInt(1 + offset))
                .setGalaxygatesId(resultSet.getByte(2 + offset))
                .setAccountsId(resultSet.getInt(3 + offset))
                .setParts(resultSet.getByte(4 + offset))
                .setLifes(resultSet.getByte(5 + offset))
                .setWave(resultSet.getByte(6 + offset))
                .setTimes(resultSet.getShort(7 + offset))
                ;
    }

    protected AccountsGalaxygatesImpl createEntity() {
        return new AccountsGalaxygatesImpl();
    }

    @Override
    public TableIdentifier<AccountsGalaxygates> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, AccountsGalaxygates> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, AccountsGalaxygates> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
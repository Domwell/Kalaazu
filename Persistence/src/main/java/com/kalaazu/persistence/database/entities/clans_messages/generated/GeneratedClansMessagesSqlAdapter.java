package com.kalaazu.persistence.database.entities.clans_messages.generated;

import com.kalaazu.persistence.database.entities.ClansMessages;
import com.kalaazu.persistence.database.entities.clans_messages.ClansMessagesImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getInt;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.clans_messages.ClansMessages}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansMessagesSqlAdapter implements SqlAdapter<ClansMessages> {

    private final TableIdentifier<ClansMessages> tableIdentifier;

    protected GeneratedClansMessagesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_messages");
    }

    protected ClansMessages apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getInt(1 + offset))
                .setClansId(resultSet.getInt(2 + offset))
                .setFromAccountsId(resultSet.getInt(3 + offset))
                .setFromStatus(resultSet.getByte(4 + offset))
                .setToAccountsId(getInt(resultSet, 5 + offset))
                .setToStatus(resultSet.getByte(6 + offset))
                .setTitle(resultSet.getString(7 + offset))
                .setText(resultSet.getString(8 + offset))
                .setDate(resultSet.getTimestamp(9 + offset))
                ;
    }

    protected ClansMessagesImpl createEntity() {
        return new ClansMessagesImpl();
    }

    @Override
    public TableIdentifier<ClansMessages> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, ClansMessages> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, ClansMessages> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
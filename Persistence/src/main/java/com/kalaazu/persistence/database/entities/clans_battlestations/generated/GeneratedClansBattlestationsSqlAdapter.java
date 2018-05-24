package com.kalaazu.persistence.database.entities.clans_battlestations.generated;

import com.kalaazu.persistence.database.entities.ClansBattlestations;
import com.kalaazu.persistence.database.entities.clans_battlestations.ClansBattlestationsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.getInt;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.clans_battlestations.ClansBattlestations}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedClansBattlestationsSqlAdapter implements SqlAdapter<ClansBattlestations> {

    private final TableIdentifier<ClansBattlestations> tableIdentifier;

    protected GeneratedClansBattlestationsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "clans_battlestations");
    }

    protected ClansBattlestations apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getByte(1 + offset))
                .setClansId(getInt(resultSet, 2 + offset))
                .setMapsId(resultSet.getByte(3 + offset))
                .setName(resultSet.getString(4 + offset))
                .setPosition(resultSet.getLong(5 + offset))
                .setDate(resultSet.getTimestamp(6 + offset))
                ;
    }

    protected ClansBattlestationsImpl createEntity() {
        return new ClansBattlestationsImpl();
    }

    @Override
    public TableIdentifier<ClansBattlestations> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, ClansBattlestations> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, ClansBattlestations> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
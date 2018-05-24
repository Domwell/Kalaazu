package com.kalaazu.persistence.database.entities.rewards_galaxygates.generated;

import com.kalaazu.persistence.database.entities.RewardsGalaxygates;
import com.kalaazu.persistence.database.entities.rewards_galaxygates.RewardsGalaxygatesImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.rewards_galaxygates.RewardsGalaxygates}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRewardsGalaxygatesSqlAdapter implements SqlAdapter<RewardsGalaxygates> {

    private final TableIdentifier<RewardsGalaxygates> tableIdentifier;

    protected GeneratedRewardsGalaxygatesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "rewards_galaxygates");
    }

    protected RewardsGalaxygates apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getByte(1 + offset))
                .setGalaxygatesId(resultSet.getByte(2 + offset))
                .setRewardsId(resultSet.getShort(3 + offset))
                ;
    }

    protected RewardsGalaxygatesImpl createEntity() {
        return new RewardsGalaxygatesImpl();
    }

    @Override
    public TableIdentifier<RewardsGalaxygates> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, RewardsGalaxygates> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, RewardsGalaxygates> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
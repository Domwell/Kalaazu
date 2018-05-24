package com.kalaazu.persistence.database.entities.techfactory_items.generated;

import com.kalaazu.persistence.database.entities.TechfactoryItems;
import com.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItemsImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The generated Sql Adapter for a {@link
 * com.kalaazu.persistence.database.entities.techfactory_items.TechfactoryItems}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedTechfactoryItemsSqlAdapter implements SqlAdapter<TechfactoryItems> {

    private final TableIdentifier<TechfactoryItems> tableIdentifier;

    protected GeneratedTechfactoryItemsSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "techfactory_items");
    }

    protected TechfactoryItems apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
                .setId(resultSet.getByte(1 + offset))
                .setName(resultSet.getString(2 + offset))
                .setDescription(resultSet.getString(3 + offset))
                .setEffect(resultSet.getString(4 + offset))
                .setDuration(resultSet.getShort(5 + offset))
                .setCooldown(resultSet.getShort(6 + offset))
                .setTime(resultSet.getInt(7 + offset))
                .setFreeProduction(resultSet.getShort(8 + offset))
                .setInstantProduction(resultSet.getShort(9 + offset))
                ;
    }

    protected TechfactoryItemsImpl createEntity() {
        return new TechfactoryItemsImpl();
    }

    @Override
    public TableIdentifier<TechfactoryItems> identifier() {
        return tableIdentifier;
    }

    @Override
    public SqlFunction<ResultSet, TechfactoryItems> entityMapper() {
        return entityMapper(0);
    }

    @Override
    public SqlFunction<ResultSet, TechfactoryItems> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
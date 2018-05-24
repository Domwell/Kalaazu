package com.kalaazu.persistence.database.entities.techfactory_costs.generated;

import com.kalaazu.persistence.database.entities.Items;
import com.kalaazu.persistence.database.entities.TechfactoryCosts;
import com.kalaazu.persistence.database.entities.TechfactoryItems;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ByteForeignKeyField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.techfactory_costs.TechfactoryCosts}-interface
 * representing entities of the {@code techfactory_costs}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedTechfactoryCosts {

    /**
     * This Field corresponds to the {@link TechfactoryCosts} field that can be
     * obtained using the {@link TechfactoryCosts#getId()} method.
     */
    ByteField<TechfactoryCosts, Byte>                             ID                   = ByteField.create(
            Identifier.ID,
            TechfactoryCosts::getId,
            TechfactoryCosts::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link TechfactoryCosts} field that can be
     * obtained using the {@link TechfactoryCosts#getTechfactoryItemsId()}
     * method.
     */
    ByteForeignKeyField<TechfactoryCosts, Byte, TechfactoryItems> TECHFACTORY_ITEMS_ID = ByteForeignKeyField.create(
            Identifier.TECHFACTORY_ITEMS_ID,
            TechfactoryCosts::getTechfactoryItemsId,
            TechfactoryCosts::setTechfactoryItemsId,
            TechfactoryItems.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link TechfactoryCosts} field that can be
     * obtained using the {@link TechfactoryCosts#getItemsId()} method.
     */
    ShortForeignKeyField<TechfactoryCosts, Short, Items>          ITEMS_ID             = ShortForeignKeyField.create(
            Identifier.ITEMS_ID,
            TechfactoryCosts::getItemsId,
            TechfactoryCosts::setItemsId,
            Items.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link TechfactoryCosts} field that can be
     * obtained using the {@link TechfactoryCosts#getAmount()} method.
     */
    IntField<TechfactoryCosts, Integer>                           AMOUNT               = IntField.create(
            Identifier.AMOUNT,
            TechfactoryCosts::getAmount,
            TechfactoryCosts::setAmount,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this TechfactoryCosts. The id field corresponds to the
     * database column kalaazu.kalaazu.techfactory_costs.id.
     *
     * @return the id of this TechfactoryCosts
     */
    Byte getId();

    /**
     * Returns the techfactoryItemsId of this TechfactoryCosts. The
     * techfactoryItemsId field corresponds to the database column
     * kalaazu.kalaazu.techfactory_costs.techfactory_items_id.
     *
     * @return the techfactoryItemsId of this TechfactoryCosts
     */
    byte getTechfactoryItemsId();

    /**
     * Returns the itemsId of this TechfactoryCosts. The itemsId field
     * corresponds to the database column
     * kalaazu.kalaazu.techfactory_costs.items_id.
     *
     * @return the itemsId of this TechfactoryCosts
     */
    short getItemsId();

    /**
     * Returns the amount of this TechfactoryCosts. The amount field corresponds
     * to the database column kalaazu.kalaazu.techfactory_costs.amount.
     *
     * @return the amount of this TechfactoryCosts
     */
    int getAmount();

    /**
     * Sets the id of this TechfactoryCosts. The id field corresponds to the
     * database column kalaazu.kalaazu.techfactory_costs.id.
     *
     * @param id to set of this TechfactoryCosts
     *
     * @return this TechfactoryCosts instance
     */
    TechfactoryCosts setId(byte id);

    /**
     * Sets the techfactoryItemsId of this TechfactoryCosts. The
     * techfactoryItemsId field corresponds to the database column
     * kalaazu.kalaazu.techfactory_costs.techfactory_items_id.
     *
     * @param techfactoryItemsId to set of this TechfactoryCosts
     *
     * @return this TechfactoryCosts instance
     */
    TechfactoryCosts setTechfactoryItemsId(byte techfactoryItemsId);

    /**
     * Sets the itemsId of this TechfactoryCosts. The itemsId field corresponds
     * to the database column kalaazu.kalaazu.techfactory_costs.items_id.
     *
     * @param itemsId to set of this TechfactoryCosts
     *
     * @return this TechfactoryCosts instance
     */
    TechfactoryCosts setItemsId(short itemsId);

    /**
     * Sets the amount of this TechfactoryCosts. The amount field corresponds to
     * the database column kalaazu.kalaazu.techfactory_costs.amount.
     *
     * @param amount to set of this TechfactoryCosts
     *
     * @return this TechfactoryCosts instance
     */
    TechfactoryCosts setAmount(int amount);

    /**
     * Queries the specified manager for the referenced TechfactoryItems. If no
     * such TechfactoryItems exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    TechfactoryItems findTechfactoryItemsId(Manager<TechfactoryItems> foreignManager);

    /**
     * Queries the specified manager for the referenced Items. If no such Items
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Items findItemsId(Manager<Items> foreignManager);

    enum Identifier implements ColumnIdentifier<TechfactoryCosts> {

        ID("id"),
        TECHFACTORY_ITEMS_ID("techfactory_items_id"),
        ITEMS_ID("items_id"),
        AMOUNT("amount");

        private final String                            columnId;

        private final TableIdentifier<TechfactoryCosts> tableIdentifier;

        Identifier(String columnId) {
            this.columnId = columnId;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsId(),
                    getSchemaId(),
                    getTableId()
            );
        }

        @Override
        public String getDbmsId() {
            return "kalaazu";
        }

        @Override
        public String getSchemaId() {
            return "kalaazu";
        }

        @Override
        public String getTableId() {
            return "techfactory_costs";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<TechfactoryCosts> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
package com.manulaiko.kalaazu.persistence.database.entities.trade_items.generated;

import com.manulaiko.kalaazu.persistence.database.entities.trade_items.TradeItems;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.trade_items.TradeItems}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedTradeItemsManager extends Manager<TradeItems> {

    List<Field<TradeItems>> FIELDS = unmodifiableList(asList(
            TradeItems.ID,
            TradeItems.ITEMS_ID,
            TradeItems.ACCOUNTS_ID,
            TradeItems.PRICE,
            TradeItems.TYPE
    ));

    @Override
    default Class<TradeItems> getEntityClass() {
        return TradeItems.class;
    }
}
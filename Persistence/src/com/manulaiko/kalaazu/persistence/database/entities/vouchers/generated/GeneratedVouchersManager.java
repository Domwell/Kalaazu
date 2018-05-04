package com.manulaiko.kalaazu.persistence.database.entities.vouchers.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Vouchers;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * Vouchers}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedVouchersManager extends Manager<Vouchers> {

    List<Field<Vouchers>> FIELDS = unmodifiableList(asList(
            Vouchers.ID,
            Vouchers.CODE,
            Vouchers.LIMIT
    ));

    @Override
    default Class<Vouchers> getEntityClass() {
        return Vouchers.class;
    }
}
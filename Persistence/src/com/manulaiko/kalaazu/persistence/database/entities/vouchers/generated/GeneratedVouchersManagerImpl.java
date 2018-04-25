package com.manulaiko.kalaazu.persistence.database.entities.vouchers.generated;

import com.manulaiko.kalaazu.persistence.database.entities.vouchers.Vouchers;
import com.manulaiko.kalaazu.persistence.database.entities.vouchers.VouchersManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.vouchers.Vouchers}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedVouchersManagerImpl
        extends AbstractManager<Vouchers>
        implements GeneratedVouchersManager {

    private final TableIdentifier<Vouchers> tableIdentifier;

    protected GeneratedVouchersManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "vouchers");
    }

    @Override
    public TableIdentifier<Vouchers> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<Vouchers>> fields() {
        return VouchersManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<Vouchers>> primaryKeyFields() {
        return Stream.of(
                Vouchers.ID
        );
    }
}
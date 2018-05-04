package com.manulaiko.kalaazu.persistence.database.entities.key_value.generated;

import com.manulaiko.kalaazu.persistence.database.entities.KeyValue;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * KeyValue}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedKeyValueManager extends Manager<KeyValue> {

    List<Field<KeyValue>> FIELDS = unmodifiableList(asList(
            KeyValue.KEY,
            KeyValue.VALUE
    ));

    @Override
    default Class<KeyValue> getEntityClass() {
        return KeyValue.class;
    }
}
package com.manulaiko.kalaazu.persistence.database.mappers;

import com.speedment.runtime.config.Column;
import com.speedment.runtime.typemapper.TypeMapper;

import java.lang.reflect.Type;

/**
 * Type mapper.
 * ============
 *
 * Performs the mapping.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public class CollectableTypeMapper implements TypeMapper<Byte, CollectableType> {
    /**
     * Returns the label for this mapper that should appear to the end user.
     *
     * @return the label
     */
    @Override
    public String getLabel() {
        return "Integer to Collectable type";
    }

    /**
     * Returns a type describing the resulting java type when this mapper is
     * applied to a database result.
     *
     * @param column the column that is being mapped
     *
     * @return the resulting java type
     */
    @Override
    public Type getJavaType(Column column) {
        return CollectableType.class;
    }

    /**
     * Converts a value from the database domain to the java domain.
     *
     * @param column     the column that is being mapped
     * @param entityType the entity type that the mapping is for
     * @param value      the value to convert
     *
     * @return the converted value
     */
    @Override
    public CollectableType toJavaType(Column column, Class<?> entityType, Byte value) {
        if (value == null) {
            return null;
        }

        return CollectableType.values()[value];
    }

    /**
     * Converts a value from the java domain to the database domain.
     *
     * @param value the value to convert
     *
     * @return the converted value
     */
    @Override
    public Byte toDatabaseType(CollectableType value) {
        if (value == null) {
            return null;
        }

        return (byte) value.ordinal();
    }
}

package com.kalaazu.persistence.database.entities.ranks.generated;

import com.kalaazu.persistence.database.entities.Ranks;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.BooleanField;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.DoubleField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.integer.PrimitiveIntegerZeroOneToBooleanMapper;

/**
 * The generated base for the {@link
 * Ranks}-interface
 * representing entities of the {@code ranks}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRanks {

    /**
     * This Field corresponds to the {@link Ranks} field that can be obtained
     * using the {@link Ranks#getId()} method.
     */
    ByteField<Ranks, Byte> ID = ByteField.create(
            Identifier.ID,
            Ranks::getId,
            Ranks::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Ranks} field that can be obtained
     * using the {@link Ranks#getName()} method.
     */
    StringField<Ranks, String> NAME = StringField.create(
            Identifier.NAME,
            Ranks::getName,
            Ranks::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Ranks} field that can be obtained
     * using the {@link Ranks#getPercentaje()} method.
     */
    DoubleField<Ranks, Double> PERCENTAJE = DoubleField.create(
            Identifier.PERCENTAJE,
            Ranks::getPercentaje,
            Ranks::setPercentaje,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Ranks} field that can be obtained
     * using the {@link Ranks#getIsPublic()} method.
     */
    BooleanField<Ranks, Integer> IS_PUBLIC = BooleanField.create(
            Identifier.IS_PUBLIC,
            Ranks::getIsPublic,
            Ranks::setIsPublic,
            new PrimitiveIntegerZeroOneToBooleanMapper(),
            false
    );

    /**
     * Returns the id of this Ranks. The id field corresponds to the database
     * column kalaazu.kalaazu.ranks.id.
     *
     * @return the id of this Ranks
     */
    Byte getId();

    /**
     * Returns the name of this Ranks. The name field corresponds to the
     * database column kalaazu.kalaazu.ranks.name.
     *
     * @return the name of this Ranks
     */
    String getName();

    /**
     * Returns the percentaje of this Ranks. The percentaje field corresponds to
     * the database column kalaazu.kalaazu.ranks.percentaje.
     *
     * @return the percentaje of this Ranks
     */
    double getPercentaje();

    /**
     * Returns the isPublic of this Ranks. The isPublic field corresponds to the
     * database column kalaazu.kalaazu.ranks.is_public.
     *
     * @return the isPublic of this Ranks
     */
    boolean getIsPublic();

    /**
     * Sets the id of this Ranks. The id field corresponds to the database
     * column kalaazu.kalaazu.ranks.id.
     *
     * @param id to set of this Ranks
     *
     * @return this Ranks instance
     */
    Ranks setId(byte id);

    /**
     * Sets the name of this Ranks. The name field corresponds to the database
     * column kalaazu.kalaazu.ranks.name.
     *
     * @param name to set of this Ranks
     *
     * @return this Ranks instance
     */
    Ranks setName(String name);

    /**
     * Sets the percentaje of this Ranks. The percentaje field corresponds to
     * the database column kalaazu.kalaazu.ranks.percentaje.
     *
     * @param percentaje to set of this Ranks
     *
     * @return this Ranks instance
     */
    Ranks setPercentaje(double percentaje);

    /**
     * Sets the isPublic of this Ranks. The isPublic field corresponds to the
     * database column kalaazu.kalaazu.ranks.is_public.
     *
     * @param isPublic to set of this Ranks
     *
     * @return this Ranks instance
     */
    Ranks setIsPublic(boolean isPublic);

    enum Identifier implements ColumnIdentifier<Ranks> {

        ID("id"),
        NAME("name"),
        PERCENTAJE("percentaje"),
        IS_PUBLIC("is_public");

        private final String columnName;

        private final TableIdentifier<Ranks> tableIdentifier;

        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsName(),
                    getSchemaName(),
                    getTableName()
            );
        }

        @Override
        public String getDbmsName() {
            return "kalaazu";
        }

        @Override
        public String getSchemaName() {
            return "kalaazu";
        }

        @Override
        public String getTableName() {
            return "ranks";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<Ranks> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
package com.manulaiko.kalaazu.persistence.database.entities.permissions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Permissions;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * Permissions}-interface
 * representing entities of the {@code permissions}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedPermissions {

    /**
     * This Field corresponds to the {@link Permissions} field that can be
     * obtained using the {@link Permissions#getId()} method.
     */
    ByteField<Permissions, Byte>     ID       = ByteField.create(
            Identifier.ID,
            Permissions::getId,
            Permissions::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Permissions} field that can be
     * obtained using the {@link Permissions#getName()} method.
     */
    StringField<Permissions, String> NAME     = StringField.create(
            Identifier.NAME,
            Permissions::getName,
            Permissions::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Permissions} field that can be
     * obtained using the {@link Permissions#getCategory()} method.
     */
    StringField<Permissions, String> CATEGORY = StringField.create(
            Identifier.CATEGORY,
            Permissions::getCategory,
            Permissions::setCategory,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this Permissions. The id field corresponds to the
     * database column kalaazu.kalaazu.permissions.id.
     *
     * @return the id of this Permissions
     */
    Byte getId();

    /**
     * Returns the name of this Permissions. The name field corresponds to the
     * database column kalaazu.kalaazu.permissions.name.
     *
     * @return the name of this Permissions
     */
    String getName();

    /**
     * Returns the category of this Permissions. The category field corresponds
     * to the database column kalaazu.kalaazu.permissions.category.
     *
     * @return the category of this Permissions
     */
    String getCategory();

    /**
     * Sets the id of this Permissions. The id field corresponds to the database
     * column kalaazu.kalaazu.permissions.id.
     *
     * @param id to set of this Permissions
     *
     * @return this Permissions instance
     */
    Permissions setId(byte id);

    /**
     * Sets the name of this Permissions. The name field corresponds to the
     * database column kalaazu.kalaazu.permissions.name.
     *
     * @param name to set of this Permissions
     *
     * @return this Permissions instance
     */
    Permissions setName(String name);

    /**
     * Sets the category of this Permissions. The category field corresponds to
     * the database column kalaazu.kalaazu.permissions.category.
     *
     * @param category to set of this Permissions
     *
     * @return this Permissions instance
     */
    Permissions setCategory(String category);

    enum Identifier implements ColumnIdentifier<Permissions> {

        ID("id"),
        NAME("name"),
        CATEGORY("category");

        private final String                       columnName;

        private final TableIdentifier<Permissions> tableIdentifier;

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
            return "permissions";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<Permissions> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
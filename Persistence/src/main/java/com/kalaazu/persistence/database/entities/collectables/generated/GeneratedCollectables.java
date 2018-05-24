package com.kalaazu.persistence.database.entities.collectables.generated;

import com.kalaazu.persistence.database.entities.Collectables;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.collectables.Collectables}-interface
 * representing entities of the {@code collectables}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCollectables {

    /**
     * This Field corresponds to the {@link Collectables} field that can be
     * obtained using the {@link Collectables#getId()} method.
     */
    ByteField<Collectables, Byte>     ID   = ByteField.create(
            Identifier.ID,
            Collectables::getId,
            Collectables::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Collectables} field that can be
     * obtained using the {@link Collectables#getGfx()} method.
     */
    ByteField<Collectables, Byte>     GFX  = ByteField.create(
            Identifier.GFX,
            Collectables::getGfx,
            Collectables::setGfx,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Collectables} field that can be
     * obtained using the {@link Collectables#getType()} method.
     */
    ByteField<Collectables, Byte>     TYPE = ByteField.create(
            Identifier.TYPE,
            Collectables::getType,
            Collectables::setType,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Collectables} field that can be
     * obtained using the {@link Collectables#getName()} method.
     */
    StringField<Collectables, String> NAME = StringField.create(
            Identifier.NAME,
            Collectables::getName,
            Collectables::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this Collectables. The id field corresponds to the
     * database column kalaazu.kalaazu.collectables.id.
     *
     * @return the id of this Collectables
     */
    Byte getId();

    /**
     * Returns the gfx of this Collectables. The gfx field corresponds to the
     * database column kalaazu.kalaazu.collectables.gfx.
     *
     * @return the gfx of this Collectables
     */
    byte getGfx();

    /**
     * Returns the type of this Collectables. The type field corresponds to the
     * database column kalaazu.kalaazu.collectables.type.
     *
     * @return the type of this Collectables
     */
    byte getType();

    /**
     * Returns the name of this Collectables. The name field corresponds to the
     * database column kalaazu.kalaazu.collectables.name.
     *
     * @return the name of this Collectables
     */
    String getName();

    /**
     * Sets the id of this Collectables. The id field corresponds to the
     * database column kalaazu.kalaazu.collectables.id.
     *
     * @param id to set of this Collectables
     *
     * @return this Collectables instance
     */
    Collectables setId(byte id);

    /**
     * Sets the gfx of this Collectables. The gfx field corresponds to the
     * database column kalaazu.kalaazu.collectables.gfx.
     *
     * @param gfx to set of this Collectables
     *
     * @return this Collectables instance
     */
    Collectables setGfx(byte gfx);

    /**
     * Sets the type of this Collectables. The type field corresponds to the
     * database column kalaazu.kalaazu.collectables.type.
     *
     * @param type to set of this Collectables
     *
     * @return this Collectables instance
     */
    Collectables setType(byte type);

    /**
     * Sets the name of this Collectables. The name field corresponds to the
     * database column kalaazu.kalaazu.collectables.name.
     *
     * @param name to set of this Collectables
     *
     * @return this Collectables instance
     */
    Collectables setName(String name);

    enum Identifier implements ColumnIdentifier<Collectables> {

        ID("id"),
        GFX("gfx"),
        TYPE("type"),
        NAME("name");

        private final String                        columnId;

        private final TableIdentifier<Collectables> tableIdentifier;

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
            return "collectables";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<Collectables> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
package com.kalaazu.persistence.database.entities.factions.generated;

import com.kalaazu.persistence.database.entities.Factions;
import com.kalaazu.persistence.database.entities.Maps;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.factions.Factions}-interface
 * representing entities of the {@code factions}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFactions {

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getId()} method.
     */
    ByteField<Factions, Byte>                 ID                 = ByteField.create(
            Identifier.ID,
            Factions::getId,
            Factions::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getName()} method.
     */
    StringField<Factions, String>             NAME               = StringField.create(
            Identifier.NAME,
            Factions::getName,
            Factions::setName,
            TypeMapper.identity(),
            true
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getTag()} method.
     */
    StringField<Factions, String>             TAG                = StringField.create(
            Identifier.TAG,
            Factions::getTag,
            Factions::setTag,
            TypeMapper.identity(),
            true
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getDescription()} method.
     */
    StringField<Factions, String>             DESCRIPTION        = StringField.create(
            Identifier.DESCRIPTION,
            Factions::getDescription,
            Factions::setDescription,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getIsPublic()} method.
     */
    IntField<Factions, Integer>               IS_PUBLIC          = IntField.create(
            Identifier.IS_PUBLIC,
            Factions::getIsPublic,
            Factions::setIsPublic,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getLowMapsId()} method.
     */
    ByteForeignKeyField<Factions, Byte, Maps> LOW_MAPS_ID        = ByteForeignKeyField.create(
            Identifier.LOW_MAPS_ID,
            Factions::getLowMapsId,
            Factions::setLowMapsId,
            Maps.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getLowMapsPosition()} method.
     */
    LongField<Factions, Long>                 LOW_MAPS_POSITION  = LongField.create(
            Identifier.LOW_MAPS_POSITION,
            Factions::getLowMapsPosition,
            Factions::setLowMapsPosition,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getHighMapsId()} method.
     */
    ByteForeignKeyField<Factions, Byte, Maps> HIGH_MAPS_ID       = ByteForeignKeyField.create(
            Identifier.HIGH_MAPS_ID,
            Factions::getHighMapsId,
            Factions::setHighMapsId,
            Maps.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link Factions} field that can be obtained
     * using the {@link Factions#getHighMapsPosition()} method.
     */
    LongField<Factions, Long>                 HIGH_MAPS_POSITION = LongField.create(
            Identifier.HIGH_MAPS_POSITION,
            Factions::getHighMapsPosition,
            Factions::setHighMapsPosition,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this Factions. The id field corresponds to the database
     * column kalaazu.kalaazu.factions.id.
     *
     * @return the id of this Factions
     */
    Byte getId();

    /**
     * Returns the name of this Factions. The name field corresponds to the
     * database column kalaazu.kalaazu.factions.name.
     *
     * @return the name of this Factions
     */
    String getName();

    /**
     * Returns the tag of this Factions. The tag field corresponds to the
     * database column kalaazu.kalaazu.factions.tag.
     *
     * @return the tag of this Factions
     */
    String getTag();

    /**
     * Returns the description of this Factions. The description field
     * corresponds to the database column kalaazu.kalaazu.factions.description.
     *
     * @return the description of this Factions
     */
    String getDescription();

    /**
     * Returns the isPublic of this Factions. The isPublic field corresponds to
     * the database column kalaazu.kalaazu.factions.is_public.
     *
     * @return the isPublic of this Factions
     */
    int getIsPublic();

    /**
     * Returns the lowMapsId of this Factions. The lowMapsId field corresponds
     * to the database column kalaazu.kalaazu.factions.low_maps_id.
     *
     * @return the lowMapsId of this Factions
     */
    byte getLowMapsId();

    /**
     * Returns the lowMapsPosition of this Factions. The lowMapsPosition field
     * corresponds to the database column
     * kalaazu.kalaazu.factions.low_maps_position.
     *
     * @return the lowMapsPosition of this Factions
     */
    long getLowMapsPosition();

    /**
     * Returns the highMapsId of this Factions. The highMapsId field corresponds
     * to the database column kalaazu.kalaazu.factions.high_maps_id.
     *
     * @return the highMapsId of this Factions
     */
    byte getHighMapsId();

    /**
     * Returns the highMapsPosition of this Factions. The highMapsPosition field
     * corresponds to the database column
     * kalaazu.kalaazu.factions.high_maps_position.
     *
     * @return the highMapsPosition of this Factions
     */
    long getHighMapsPosition();

    /**
     * Sets the id of this Factions. The id field corresponds to the database
     * column kalaazu.kalaazu.factions.id.
     *
     * @param id to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setId(byte id);

    /**
     * Sets the name of this Factions. The name field corresponds to the
     * database column kalaazu.kalaazu.factions.name.
     *
     * @param name to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setName(String name);

    /**
     * Sets the tag of this Factions. The tag field corresponds to the database
     * column kalaazu.kalaazu.factions.tag.
     *
     * @param tag to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setTag(String tag);

    /**
     * Sets the description of this Factions. The description field corresponds
     * to the database column kalaazu.kalaazu.factions.description.
     *
     * @param description to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setDescription(String description);

    /**
     * Sets the isPublic of this Factions. The isPublic field corresponds to the
     * database column kalaazu.kalaazu.factions.is_public.
     *
     * @param isPublic to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setIsPublic(int isPublic);

    /**
     * Sets the lowMapsId of this Factions. The lowMapsId field corresponds to
     * the database column kalaazu.kalaazu.factions.low_maps_id.
     *
     * @param lowMapsId to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setLowMapsId(byte lowMapsId);

    /**
     * Sets the lowMapsPosition of this Factions. The lowMapsPosition field
     * corresponds to the database column
     * kalaazu.kalaazu.factions.low_maps_position.
     *
     * @param lowMapsPosition to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setLowMapsPosition(long lowMapsPosition);

    /**
     * Sets the highMapsId of this Factions. The highMapsId field corresponds to
     * the database column kalaazu.kalaazu.factions.high_maps_id.
     *
     * @param highMapsId to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setHighMapsId(byte highMapsId);

    /**
     * Sets the highMapsPosition of this Factions. The highMapsPosition field
     * corresponds to the database column
     * kalaazu.kalaazu.factions.high_maps_position.
     *
     * @param highMapsPosition to set of this Factions
     *
     * @return this Factions instance
     */
    Factions setHighMapsPosition(long highMapsPosition);

    /**
     * Queries the specified manager for the referenced Maps. If no such Maps
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Maps findLowMapsId(Manager<Maps> foreignManager);

    /**
     * Queries the specified manager for the referenced Maps. If no such Maps
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Maps findHighMapsId(Manager<Maps> foreignManager);

    enum Identifier implements ColumnIdentifier<Factions> {

        ID("id"),
        NAME("name"),
        TAG("tag"),
        DESCRIPTION("description"),
        IS_PUBLIC("is_public"),
        LOW_MAPS_ID("low_maps_id"),
        LOW_MAPS_POSITION("low_maps_position"),
        HIGH_MAPS_ID("high_maps_id"),
        HIGH_MAPS_POSITION("high_maps_position");

        private final String                    columnId;

        private final TableIdentifier<Factions> tableIdentifier;

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
            return "factions";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<Factions> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
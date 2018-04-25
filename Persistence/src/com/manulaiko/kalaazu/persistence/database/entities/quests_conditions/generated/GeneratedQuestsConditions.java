package com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.quests.Quests;
import com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.QuestsConditions;
import com.manulaiko.kalaazu.persistence.database.mappers.QuestConditionType;
import com.manulaiko.kalaazu.persistence.database.mappers.QuestConditionTypeMapper;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.quests_conditions.QuestsConditions}-interface
 * representing entities of the {@code quests_conditions}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedQuestsConditions {

    /**
     * This Field corresponds to the {@link QuestsConditions} field that can be
     * obtained using the {@link QuestsConditions#getId()} method.
     */
    IntField<QuestsConditions, Integer>                                             ID                   = IntField.create(
            Identifier.ID,
            QuestsConditions::getId,
            QuestsConditions::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link QuestsConditions} field that can be
     * obtained using the {@link QuestsConditions#getQuestsConditionsId()}
     * method.
     */
    ComparableForeignKeyField<QuestsConditions, Integer, Integer, QuestsConditions> QUESTS_CONDITIONS_ID = ComparableForeignKeyField.create(
            Identifier.QUESTS_CONDITIONS_ID,
            o -> OptionalUtil.unwrap(o.getQuestsConditionsId()),
            QuestsConditions::setQuestsConditionsId,
            QuestsConditions.ID,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link QuestsConditions} field that can be
     * obtained using the {@link QuestsConditions#getQuestsId()} method.
     */
    ShortForeignKeyField<QuestsConditions, Short, Quests>                           QUESTS_ID            = ShortForeignKeyField.create(
            Identifier.QUESTS_ID,
            QuestsConditions::getQuestsId,
            QuestsConditions::setQuestsId,
            Quests.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link QuestsConditions} field that can be
     * obtained using the {@link QuestsConditions#getType()} method.
     */
    EnumField<QuestsConditions, Byte, QuestConditionType>                           TYPE                 = EnumField.create(
            Identifier.TYPE,
            QuestsConditions::getType,
            QuestsConditions::setType,
            new QuestConditionTypeMapper(),
            QuestConditionType::name,
            QuestConditionType::valueOf,
            QuestConditionType.class
    );

    /**
     * This Field corresponds to the {@link QuestsConditions} field that can be
     * obtained using the {@link QuestsConditions#getValue()} method.
     */
    StringField<QuestsConditions, String>                                           VALUE                = StringField.create(
            Identifier.VALUE,
            QuestsConditions::getValue,
            QuestsConditions::setValue,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this QuestsConditions. The id field corresponds to the
     * database column kalaazu.kalaazu.quests_conditions.id.
     *
     * @return the id of this QuestsConditions
     */
    int getId();

    /**
     * Returns the questsConditionsId of this QuestsConditions. The
     * questsConditionsId field corresponds to the database column
     * kalaazu.kalaazu.quests_conditions.quests_conditions_id.
     *
     * @return the questsConditionsId of this QuestsConditions
     */
    OptionalInt getQuestsConditionsId();

    /**
     * Returns the questsId of this QuestsConditions. The questsId field
     * corresponds to the database column
     * kalaazu.kalaazu.quests_conditions.quests_id.
     *
     * @return the questsId of this QuestsConditions
     */
    short getQuestsId();

    /**
     * Returns the type of this QuestsConditions. The type field corresponds to
     * the database column kalaazu.kalaazu.quests_conditions.type.
     *
     * @return the type of this QuestsConditions
     */
    QuestConditionType getType();

    /**
     * Returns the value of this QuestsConditions. The value field corresponds
     * to the database column kalaazu.kalaazu.quests_conditions.value.
     *
     * @return the value of this QuestsConditions
     */
    String getValue();

    /**
     * Sets the id of this QuestsConditions. The id field corresponds to the
     * database column kalaazu.kalaazu.quests_conditions.id.
     *
     * @param id to set of this QuestsConditions
     *
     * @return this QuestsConditions instance
     */
    QuestsConditions setId(int id);

    /**
     * Sets the questsConditionsId of this QuestsConditions. The
     * questsConditionsId field corresponds to the database column
     * kalaazu.kalaazu.quests_conditions.quests_conditions_id.
     *
     * @param questsConditionsId to set of this QuestsConditions
     *
     * @return this QuestsConditions instance
     */
    QuestsConditions setQuestsConditionsId(Integer questsConditionsId);

    /**
     * Sets the questsId of this QuestsConditions. The questsId field
     * corresponds to the database column
     * kalaazu.kalaazu.quests_conditions.quests_id.
     *
     * @param questsId to set of this QuestsConditions
     *
     * @return this QuestsConditions instance
     */
    QuestsConditions setQuestsId(short questsId);

    /**
     * Sets the type of this QuestsConditions. The type field corresponds to the
     * database column kalaazu.kalaazu.quests_conditions.type.
     *
     * @param type to set of this QuestsConditions
     *
     * @return this QuestsConditions instance
     */
    QuestsConditions setType(QuestConditionType type);

    /**
     * Sets the value of this QuestsConditions. The value field corresponds to
     * the database column kalaazu.kalaazu.quests_conditions.value.
     *
     * @param value to set of this QuestsConditions
     *
     * @return this QuestsConditions instance
     */
    QuestsConditions setValue(String value);

    /**
     * Queries the specified manager for the referenced QuestsConditions. If no
     * such QuestsConditions exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Optional<QuestsConditions> findQuestsConditionsId(Manager<QuestsConditions> foreignManager);

    /**
     * Queries the specified manager for the referenced Quests. If no such
     * Quests exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Quests findQuestsId(Manager<Quests> foreignManager);

    enum Identifier implements ColumnIdentifier<QuestsConditions> {

        ID("id"),
        QUESTS_CONDITIONS_ID("quests_conditions_id"),
        QUESTS_ID("quests_id"),
        TYPE("type"),
        VALUE("value");

        private final String                            columnName;

        private final TableIdentifier<QuestsConditions> tableIdentifier;

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
            return "quests_conditions";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<QuestsConditions> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
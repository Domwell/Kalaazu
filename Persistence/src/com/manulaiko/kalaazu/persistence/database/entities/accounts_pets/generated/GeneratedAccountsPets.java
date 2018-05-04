package com.manulaiko.kalaazu.persistence.database.entities.accounts_pets.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.AccountsPets;
import com.manulaiko.kalaazu.persistence.database.entities.Levels;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * AccountsPets}-interface
 * representing entities of the {@code accounts_pets}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsPets {

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getId()} method.
     */
    IntField<AccountsPets, Integer>                     ID                         = IntField.create(
            Identifier.ID,
            AccountsPets::getId,
            AccountsPets::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsPets, Integer, Accounts> ACCOUNTS_ID                = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsPets::getAccountsId,
            AccountsPets::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getLevelsId()} method.
     */
    ByteForeignKeyField<AccountsPets, Byte, Levels>     LEVELS_ID                  = ByteForeignKeyField.create(
            Identifier.LEVELS_ID,
            AccountsPets::getLevelsId,
            AccountsPets::setLevelsId,
            Levels.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getName()} method.
     */
    StringField<AccountsPets, String>                   NAME                       = StringField.create(
            Identifier.NAME,
            AccountsPets::getName,
            AccountsPets::setName,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getExperience()} method.
     */
    IntField<AccountsPets, Integer>                     EXPERIENCE                 = IntField.create(
            Identifier.EXPERIENCE,
            AccountsPets::getExperience,
            AccountsPets::setExperience,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getFuel()} method.
     */
    IntField<AccountsPets, Integer>                     FUEL                       = IntField.create(
            Identifier.FUEL,
            AccountsPets::getFuel,
            AccountsPets::setFuel,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getHealth()} method.
     */
    IntField<AccountsPets, Integer>                     HEALTH                     = IntField.create(
            Identifier.HEALTH,
            AccountsPets::getHealth,
            AccountsPets::setHealth,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsLasersTotal()} method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_LASERS_TOTAL         = ByteField.create(
            Identifier.SLOTS_LASERS_TOTAL,
            AccountsPets::getSlotsLasersTotal,
            AccountsPets::setSlotsLasersTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsLasersAvailable()} method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_LASERS_AVAILABLE     = ByteField.create(
            Identifier.SLOTS_LASERS_AVAILABLE,
            AccountsPets::getSlotsLasersAvailable,
            AccountsPets::setSlotsLasersAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsGeneratorsTotal()} method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_GENERATORS_TOTAL     = ByteField.create(
            Identifier.SLOTS_GENERATORS_TOTAL,
            AccountsPets::getSlotsGeneratorsTotal,
            AccountsPets::setSlotsGeneratorsTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsGeneratorsAvailable()}
     * method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_GENERATORS_AVAILABLE = ByteField.create(
            Identifier.SLOTS_GENERATORS_AVAILABLE,
            AccountsPets::getSlotsGeneratorsAvailable,
            AccountsPets::setSlotsGeneratorsAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsProtocolsTotal()} method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_PROTOCOLS_TOTAL      = ByteField.create(
            Identifier.SLOTS_PROTOCOLS_TOTAL,
            AccountsPets::getSlotsProtocolsTotal,
            AccountsPets::setSlotsProtocolsTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsProtocolsAvailable()}
     * method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_PROTOCOLS_AVAILABLE  = ByteField.create(
            Identifier.SLOTS_PROTOCOLS_AVAILABLE,
            AccountsPets::getSlotsProtocolsAvailable,
            AccountsPets::setSlotsProtocolsAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsGearsTotal()} method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_GEARS_TOTAL          = ByteField.create(
            Identifier.SLOTS_GEARS_TOTAL,
            AccountsPets::getSlotsGearsTotal,
            AccountsPets::setSlotsGearsTotal,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsPets} field that can be
     * obtained using the {@link AccountsPets#getSlotsGearsAvailable()} method.
     */
    ByteField<AccountsPets, Byte>                       SLOTS_GEARS_AVAILABLE      = ByteField.create(
            Identifier.SLOTS_GEARS_AVAILABLE,
            AccountsPets::getSlotsGearsAvailable,
            AccountsPets::setSlotsGearsAvailable,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this AccountsPets. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.id.
     *
     * @return the id of this AccountsPets
     */
    Integer getId();

    /**
     * Returns the accountsId of this AccountsPets. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.accounts_id.
     *
     * @return the accountsId of this AccountsPets
     */
    int getAccountsId();

    /**
     * Returns the levelsId of this AccountsPets. The levelsId field corresponds
     * to the database column kalaazu.kalaazu.accounts_pets.levels_id.
     *
     * @return the levelsId of this AccountsPets
     */
    byte getLevelsId();

    /**
     * Returns the name of this AccountsPets. The name field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.name.
     *
     * @return the name of this AccountsPets
     */
    String getName();

    /**
     * Returns the experience of this AccountsPets. The experience field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.experience.
     *
     * @return the experience of this AccountsPets
     */
    int getExperience();

    /**
     * Returns the fuel of this AccountsPets. The fuel field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.fuel.
     *
     * @return the fuel of this AccountsPets
     */
    int getFuel();

    /**
     * Returns the health of this AccountsPets. The health field corresponds to
     * the database column kalaazu.kalaazu.accounts_pets.health.
     *
     * @return the health of this AccountsPets
     */
    int getHealth();

    /**
     * Returns the slotsLasersTotal of this AccountsPets. The slotsLasersTotal
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_total.
     *
     * @return the slotsLasersTotal of this AccountsPets
     */
    byte getSlotsLasersTotal();

    /**
     * Returns the slotsLasersAvailable of this AccountsPets. The
     * slotsLasersAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_available.
     *
     * @return the slotsLasersAvailable of this AccountsPets
     */
    byte getSlotsLasersAvailable();

    /**
     * Returns the slotsGeneratorsTotal of this AccountsPets. The
     * slotsGeneratorsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_total.
     *
     * @return the slotsGeneratorsTotal of this AccountsPets
     */
    byte getSlotsGeneratorsTotal();

    /**
     * Returns the slotsGeneratorsAvailable of this AccountsPets. The
     * slotsGeneratorsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_available.
     *
     * @return the slotsGeneratorsAvailable of this AccountsPets
     */
    byte getSlotsGeneratorsAvailable();

    /**
     * Returns the slotsProtocolsTotal of this AccountsPets. The
     * slotsProtocolsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_total.
     *
     * @return the slotsProtocolsTotal of this AccountsPets
     */
    byte getSlotsProtocolsTotal();

    /**
     * Returns the slotsProtocolsAvailable of this AccountsPets. The
     * slotsProtocolsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_available.
     *
     * @return the slotsProtocolsAvailable of this AccountsPets
     */
    byte getSlotsProtocolsAvailable();

    /**
     * Returns the slotsGearsTotal of this AccountsPets. The slotsGearsTotal
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_total.
     *
     * @return the slotsGearsTotal of this AccountsPets
     */
    byte getSlotsGearsTotal();

    /**
     * Returns the slotsGearsAvailable of this AccountsPets. The
     * slotsGearsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_available.
     *
     * @return the slotsGearsAvailable of this AccountsPets
     */
    byte getSlotsGearsAvailable();

    /**
     * Sets the id of this AccountsPets. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.id.
     *
     * @param id to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setId(int id);

    /**
     * Sets the accountsId of this AccountsPets. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.accounts_id.
     *
     * @param accountsId to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setAccountsId(int accountsId);

    /**
     * Sets the levelsId of this AccountsPets. The levelsId field corresponds to
     * the database column kalaazu.kalaazu.accounts_pets.levels_id.
     *
     * @param levelsId to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setLevelsId(byte levelsId);

    /**
     * Sets the name of this AccountsPets. The name field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.name.
     *
     * @param name to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setName(String name);

    /**
     * Sets the experience of this AccountsPets. The experience field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.experience.
     *
     * @param experience to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setExperience(int experience);

    /**
     * Sets the fuel of this AccountsPets. The fuel field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.fuel.
     *
     * @param fuel to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setFuel(int fuel);

    /**
     * Sets the health of this AccountsPets. The health field corresponds to the
     * database column kalaazu.kalaazu.accounts_pets.health.
     *
     * @param health to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setHealth(int health);

    /**
     * Sets the slotsLasersTotal of this AccountsPets. The slotsLasersTotal
     * field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_total.
     *
     * @param slotsLasersTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsLasersTotal(byte slotsLasersTotal);

    /**
     * Sets the slotsLasersAvailable of this AccountsPets. The
     * slotsLasersAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_lasers_available.
     *
     * @param slotsLasersAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsLasersAvailable(byte slotsLasersAvailable);

    /**
     * Sets the slotsGeneratorsTotal of this AccountsPets. The
     * slotsGeneratorsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_total.
     *
     * @param slotsGeneratorsTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsGeneratorsTotal(byte slotsGeneratorsTotal);

    /**
     * Sets the slotsGeneratorsAvailable of this AccountsPets. The
     * slotsGeneratorsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_generators_available.
     *
     * @param slotsGeneratorsAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsGeneratorsAvailable(byte slotsGeneratorsAvailable);

    /**
     * Sets the slotsProtocolsTotal of this AccountsPets. The
     * slotsProtocolsTotal field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_total.
     *
     * @param slotsProtocolsTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsProtocolsTotal(byte slotsProtocolsTotal);

    /**
     * Sets the slotsProtocolsAvailable of this AccountsPets. The
     * slotsProtocolsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_protocols_available.
     *
     * @param slotsProtocolsAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsProtocolsAvailable(byte slotsProtocolsAvailable);

    /**
     * Sets the slotsGearsTotal of this AccountsPets. The slotsGearsTotal field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_total.
     *
     * @param slotsGearsTotal to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsGearsTotal(byte slotsGearsTotal);

    /**
     * Sets the slotsGearsAvailable of this AccountsPets. The
     * slotsGearsAvailable field corresponds to the database column
     * kalaazu.kalaazu.accounts_pets.slots_gears_available.
     *
     * @param slotsGearsAvailable to set of this AccountsPets
     *
     * @return this AccountsPets instance
     */
    AccountsPets setSlotsGearsAvailable(byte slotsGearsAvailable);

    /**
     * Queries the specified manager for the referenced Accounts. If no such
     * Accounts exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Accounts findAccountsId(Manager<Accounts> foreignManager);

    /**
     * Queries the specified manager for the referenced Levels. If no such
     * Levels exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Levels findLevelsId(Manager<Levels> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsPets> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        LEVELS_ID("levels_id"),
        NAME("name"),
        EXPERIENCE("experience"),
        FUEL("fuel"),
        HEALTH("health"),
        SLOTS_LASERS_TOTAL("slots_lasers_total"),
        SLOTS_LASERS_AVAILABLE("slots_lasers_available"),
        SLOTS_GENERATORS_TOTAL("slots_generators_total"),
        SLOTS_GENERATORS_AVAILABLE("slots_generators_available"),
        SLOTS_PROTOCOLS_TOTAL("slots_protocols_total"),
        SLOTS_PROTOCOLS_AVAILABLE("slots_protocols_available"),
        SLOTS_GEARS_TOTAL("slots_gears_total"),
        SLOTS_GEARS_AVAILABLE("slots_gears_available");

        private final String                        columnName;

        private final TableIdentifier<AccountsPets> tableIdentifier;

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
            return "accounts_pets";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<AccountsPets> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
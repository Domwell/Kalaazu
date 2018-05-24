package com.kalaazu.persistence.database.entities.accounts_ships.generated;

import com.kalaazu.persistence.database.entities.Accounts;
import com.kalaazu.persistence.database.entities.AccountsShips;
import com.kalaazu.persistence.database.entities.Maps;
import com.kalaazu.persistence.database.entities.Ships;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.accounts_ships.AccountsShips}-interface
 * representing entities of the {@code accounts_ships}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedAccountsShips {

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getId()} method.
     */
    IntField<AccountsShips, Integer>                     ID          = IntField.create(
            Identifier.ID,
            AccountsShips::getId,
            AccountsShips::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getAccountsId()} method.
     */
    IntForeignKeyField<AccountsShips, Integer, Accounts> ACCOUNTS_ID = IntForeignKeyField.create(
            Identifier.ACCOUNTS_ID,
            AccountsShips::getAccountsId,
            AccountsShips::setAccountsId,
            Accounts.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getShipsId()} method.
     */
    ByteForeignKeyField<AccountsShips, Byte, Ships>      SHIPS_ID    = ByteForeignKeyField.create(
            Identifier.SHIPS_ID,
            AccountsShips::getShipsId,
            AccountsShips::setShipsId,
            Ships.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getMapsId()} method.
     */
    ByteForeignKeyField<AccountsShips, Byte, Maps>       MAPS_ID     = ByteForeignKeyField.create(
            Identifier.MAPS_ID,
            AccountsShips::getMapsId,
            AccountsShips::setMapsId,
            Maps.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getPosition()} method.
     */
    LongField<AccountsShips, Long>                       POSITION    = LongField.create(
            Identifier.POSITION,
            AccountsShips::getPosition,
            AccountsShips::setPosition,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getHealth()} method.
     */
    IntField<AccountsShips, Integer>                     HEALTH      = IntField.create(
            Identifier.HEALTH,
            AccountsShips::getHealth,
            AccountsShips::setHealth,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getNanohull()} method.
     */
    IntField<AccountsShips, Integer>                     NANOHULL    = IntField.create(
            Identifier.NANOHULL,
            AccountsShips::getNanohull,
            AccountsShips::setNanohull,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link AccountsShips} field that can be
     * obtained using the {@link AccountsShips#getGfx()} method.
     */
    ByteField<AccountsShips, Byte>                       GFX         = ByteField.create(
            Identifier.GFX,
            AccountsShips::getGfx,
            AccountsShips::setGfx,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this AccountsShips. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_ships.id.
     *
     * @return the id of this AccountsShips
     */
    Integer getId();

    /**
     * Returns the accountsId of this AccountsShips. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_ships.accounts_id.
     *
     * @return the accountsId of this AccountsShips
     */
    int getAccountsId();

    /**
     * Returns the shipsId of this AccountsShips. The shipsId field corresponds
     * to the database column kalaazu.kalaazu.accounts_ships.ships_id.
     *
     * @return the shipsId of this AccountsShips
     */
    byte getShipsId();

    /**
     * Returns the mapsId of this AccountsShips. The mapsId field corresponds to
     * the database column kalaazu.kalaazu.accounts_ships.maps_id.
     *
     * @return the mapsId of this AccountsShips
     */
    byte getMapsId();

    /**
     * Returns the position of this AccountsShips. The position field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_ships.position.
     *
     * @return the position of this AccountsShips
     */
    long getPosition();

    /**
     * Returns the health of this AccountsShips. The health field corresponds to
     * the database column kalaazu.kalaazu.accounts_ships.health.
     *
     * @return the health of this AccountsShips
     */
    int getHealth();

    /**
     * Returns the nanohull of this AccountsShips. The nanohull field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_ships.nanohull.
     *
     * @return the nanohull of this AccountsShips
     */
    int getNanohull();

    /**
     * Returns the gfx of this AccountsShips. The gfx field corresponds to the
     * database column kalaazu.kalaazu.accounts_ships.gfx.
     *
     * @return the gfx of this AccountsShips
     */
    byte getGfx();

    /**
     * Sets the id of this AccountsShips. The id field corresponds to the
     * database column kalaazu.kalaazu.accounts_ships.id.
     *
     * @param id to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setId(int id);

    /**
     * Sets the accountsId of this AccountsShips. The accountsId field
     * corresponds to the database column
     * kalaazu.kalaazu.accounts_ships.accounts_id.
     *
     * @param accountsId to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setAccountsId(int accountsId);

    /**
     * Sets the shipsId of this AccountsShips. The shipsId field corresponds to
     * the database column kalaazu.kalaazu.accounts_ships.ships_id.
     *
     * @param shipsId to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setShipsId(byte shipsId);

    /**
     * Sets the mapsId of this AccountsShips. The mapsId field corresponds to
     * the database column kalaazu.kalaazu.accounts_ships.maps_id.
     *
     * @param mapsId to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setMapsId(byte mapsId);

    /**
     * Sets the position of this AccountsShips. The position field corresponds
     * to the database column kalaazu.kalaazu.accounts_ships.position.
     *
     * @param position to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setPosition(long position);

    /**
     * Sets the health of this AccountsShips. The health field corresponds to
     * the database column kalaazu.kalaazu.accounts_ships.health.
     *
     * @param health to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setHealth(int health);

    /**
     * Sets the nanohull of this AccountsShips. The nanohull field corresponds
     * to the database column kalaazu.kalaazu.accounts_ships.nanohull.
     *
     * @param nanohull to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setNanohull(int nanohull);

    /**
     * Sets the gfx of this AccountsShips. The gfx field corresponds to the
     * database column kalaazu.kalaazu.accounts_ships.gfx.
     *
     * @param gfx to set of this AccountsShips
     *
     * @return this AccountsShips instance
     */
    AccountsShips setGfx(byte gfx);

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
     * Queries the specified manager for the referenced Ships. If no such Ships
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Ships findShipsId(Manager<Ships> foreignManager);

    /**
     * Queries the specified manager for the referenced Maps. If no such Maps
     * exists, an {@code NullPointerException} will be thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Maps findMapsId(Manager<Maps> foreignManager);

    enum Identifier implements ColumnIdentifier<AccountsShips> {

        ID("id"),
        ACCOUNTS_ID("accounts_id"),
        SHIPS_ID("ships_id"),
        MAPS_ID("maps_id"),
        POSITION("position"),
        HEALTH("health"),
        NANOHULL("nanohull"),
        GFX("gfx");

        private final String                         columnId;

        private final TableIdentifier<AccountsShips> tableIdentifier;

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
            return "accounts_ships";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<AccountsShips> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
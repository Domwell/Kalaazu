package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.accounts_ships.generated.GeneratedAccountsShips;

/**
 * The main interface for entities of the {@code accounts_ships}-table in the
 * database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface AccountsShips extends GeneratedAccountsShips, Entity<Integer> {
    /**
     * Returns the account.
     *
     * @return The account.
     */
    Accounts getAccount();

    /**
     * Returns the ship.
     *
     * @return The ship.
     */
    Ships getShip();

    /**
     * Returns the map where the ship is located.
     *
     * @return The map.
     */
    Maps getMap();
}
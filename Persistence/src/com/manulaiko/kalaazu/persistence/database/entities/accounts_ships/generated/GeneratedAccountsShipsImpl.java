package com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.generated;

import com.manulaiko.kalaazu.math.Vector2;
import com.manulaiko.kalaazu.persistence.database.entities.accounts.Accounts;
import com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShips;
import com.manulaiko.kalaazu.persistence.database.entities.maps.Maps;
import com.manulaiko.kalaazu.persistence.database.entities.ships.Ships;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.accounts_ships.AccountsShips}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAccountsShipsImpl implements AccountsShips {

    private int     id;

    private int     accountsId;

    private byte    shipsId;

    private byte    mapsId;

    private Vector2 position;

    private int     health;

    private int     nanohull;

    private byte    gfx;

    protected GeneratedAccountsShipsImpl() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public int getAccountsId() {
        return accountsId;
    }

    @Override
    public byte getShipsId() {
        return shipsId;
    }

    @Override
    public byte getMapsId() {
        return mapsId;
    }

    @Override
    public Vector2 getPosition() {
        return position;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getNanohull() {
        return nanohull;
    }

    @Override
    public byte getGfx() {
        return gfx;
    }

    @Override
    public AccountsShips setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountsShips setAccountsId(int accountsId) {
        this.accountsId = accountsId;
        return this;
    }

    @Override
    public AccountsShips setShipsId(byte shipsId) {
        this.shipsId = shipsId;
        return this;
    }

    @Override
    public AccountsShips setMapsId(byte mapsId) {
        this.mapsId = mapsId;
        return this;
    }

    @Override
    public AccountsShips setPosition(Vector2 position) {
        this.position = position;
        return this;
    }

    @Override
    public AccountsShips setHealth(int health) {
        this.health = health;
        return this;
    }

    @Override
    public AccountsShips setNanohull(int nanohull) {
        this.nanohull = nanohull;
        return this;
    }

    @Override
    public AccountsShips setGfx(byte gfx) {
        this.gfx = gfx;
        return this;
    }

    @Override
    public Accounts findAccountsId(Manager<Accounts> foreignManager) {
        return foreignManager.stream()
                             .filter(Accounts.ID.equal(getAccountsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Ships findShipsId(Manager<Ships> foreignManager) {
        return foreignManager.stream()
                             .filter(Ships.ID.equal(getShipsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public Maps findMapsId(Manager<Maps> foreignManager) {
        return foreignManager.stream()
                             .filter(Maps.ID.equal(getMapsId()))
                             .findAny()
                             .orElse(null);
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("accountsId = " + Objects.toString(getAccountsId()));
        sj.add("shipsId = " + Objects.toString(getShipsId()));
        sj.add("mapsId = " + Objects.toString(getMapsId()));
        sj.add("position = " + Objects.toString(getPosition()));
        sj.add("health = " + Objects.toString(getHealth()));
        sj.add("nanohull = " + Objects.toString(getNanohull()));
        sj.add("gfx = " + Objects.toString(getGfx()));
        return "AccountsShipsImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof AccountsShips)) {
            return false;
        }
        final AccountsShips thatAccountsShips = (AccountsShips) that;
        if (this.getId() != thatAccountsShips.getId()) {
            return false;
        }
        if (this.getAccountsId() != thatAccountsShips.getAccountsId()) {
            return false;
        }
        if (this.getShipsId() != thatAccountsShips.getShipsId()) {
            return false;
        }
        if (this.getMapsId() != thatAccountsShips.getMapsId()) {
            return false;
        }
        if (!Objects.equals(this.getPosition(), thatAccountsShips.getPosition())) {
            return false;
        }
        if (this.getHealth() != thatAccountsShips.getHealth()) {
            return false;
        }
        if (this.getNanohull() != thatAccountsShips.getNanohull()) {
            return false;
        }
        if (this.getGfx() != thatAccountsShips.getGfx()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Integer.hashCode(getAccountsId());
        hash = 31 * hash + Byte.hashCode(getShipsId());
        hash = 31 * hash + Byte.hashCode(getMapsId());
        hash = 31 * hash + Objects.hashCode(getPosition());
        hash = 31 * hash + Integer.hashCode(getHealth());
        hash = 31 * hash + Integer.hashCode(getNanohull());
        hash = 31 * hash + Byte.hashCode(getGfx());
        return hash;
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.kalaazu.persistence.database.entities.tables.records;


import com.kalaazu.persistence.database.entities.tables.SkylabModules;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Different skylab modules.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SkylabModulesRecord extends UpdatableRecordImpl<SkylabModulesRecord> implements Record10<Byte, String, Byte, Short, Short, Short, Byte, Short, Byte, Byte> {

    private static final long serialVersionUID = 1201967233;

    /**
     * Setter for <code>kalaazu.skylab_modules.id</code>. Primary Key.
     */
    public void setId(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.id</code>. Primary Key.
     */
    public Byte getId() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.name</code>. Module name.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.name</code>. Module name.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.production_factor</code>. Production factor.
     */
    public void setProductionFactor(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.production_factor</code>. Production factor.
     */
    public Byte getProductionFactor() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.production_base</code>. Production base.
     */
    public void setProductionBase(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.production_base</code>. Production base.
     */
    public Short getProductionBase() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.storage_factor</code>. Storage factor.
     */
    public void setStorageFactor(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.storage_factor</code>. Storage factor.
     */
    public Short getStorageFactor() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.storage_base</code>. Storage base.
     */
    public void setStorageBase(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.storage_base</code>. Storage base.
     */
    public Short getStorageBase() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.upgrade_factor</code>. Upgrade costs factor.
     */
    public void setUpgradeFactor(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.upgrade_factor</code>. Upgrade costs factor.
     */
    public Byte getUpgradeFactor() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.upgrade_base</code>. Upgrade costs base.
     */
    public void setUpgradeBase(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.upgrade_base</code>. Upgrade costs base.
     */
    public Short getUpgradeBase() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.energy_factor</code>. Energy consumption factor.
     */
    public void setEnergyFactor(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.energy_factor</code>. Energy consumption factor.
     */
    public Byte getEnergyFactor() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>kalaazu.skylab_modules.energy_base</code>. Energy consumption base.
     */
    public void setEnergyBase(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>kalaazu.skylab_modules.energy_base</code>. Energy consumption base.
     */
    public Byte getEnergyBase() {
        return (Byte) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Byte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Byte, String, Byte, Short, Short, Short, Byte, Short, Byte, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Byte, String, Byte, Short, Short, Short, Byte, Short, Byte, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Byte> field1() {
        return SkylabModules.SKYLAB_MODULES.ID;
    }

    @Override
    public Field<String> field2() {
        return SkylabModules.SKYLAB_MODULES.NAME;
    }

    @Override
    public Field<Byte> field3() {
        return SkylabModules.SKYLAB_MODULES.PRODUCTION_FACTOR;
    }

    @Override
    public Field<Short> field4() {
        return SkylabModules.SKYLAB_MODULES.PRODUCTION_BASE;
    }

    @Override
    public Field<Short> field5() {
        return SkylabModules.SKYLAB_MODULES.STORAGE_FACTOR;
    }

    @Override
    public Field<Short> field6() {
        return SkylabModules.SKYLAB_MODULES.STORAGE_BASE;
    }

    @Override
    public Field<Byte> field7() {
        return SkylabModules.SKYLAB_MODULES.UPGRADE_FACTOR;
    }

    @Override
    public Field<Short> field8() {
        return SkylabModules.SKYLAB_MODULES.UPGRADE_BASE;
    }

    @Override
    public Field<Byte> field9() {
        return SkylabModules.SKYLAB_MODULES.ENERGY_FACTOR;
    }

    @Override
    public Field<Byte> field10() {
        return SkylabModules.SKYLAB_MODULES.ENERGY_BASE;
    }

    @Override
    public Byte component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Byte component3() {
        return getProductionFactor();
    }

    @Override
    public Short component4() {
        return getProductionBase();
    }

    @Override
    public Short component5() {
        return getStorageFactor();
    }

    @Override
    public Short component6() {
        return getStorageBase();
    }

    @Override
    public Byte component7() {
        return getUpgradeFactor();
    }

    @Override
    public Short component8() {
        return getUpgradeBase();
    }

    @Override
    public Byte component9() {
        return getEnergyFactor();
    }

    @Override
    public Byte component10() {
        return getEnergyBase();
    }

    @Override
    public Byte value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Byte value3() {
        return getProductionFactor();
    }

    @Override
    public Short value4() {
        return getProductionBase();
    }

    @Override
    public Short value5() {
        return getStorageFactor();
    }

    @Override
    public Short value6() {
        return getStorageBase();
    }

    @Override
    public Byte value7() {
        return getUpgradeFactor();
    }

    @Override
    public Short value8() {
        return getUpgradeBase();
    }

    @Override
    public Byte value9() {
        return getEnergyFactor();
    }

    @Override
    public Byte value10() {
        return getEnergyBase();
    }

    @Override
    public SkylabModulesRecord value1(Byte value) {
        setId(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value3(Byte value) {
        setProductionFactor(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value4(Short value) {
        setProductionBase(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value5(Short value) {
        setStorageFactor(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value6(Short value) {
        setStorageBase(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value7(Byte value) {
        setUpgradeFactor(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value8(Short value) {
        setUpgradeBase(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value9(Byte value) {
        setEnergyFactor(value);
        return this;
    }

    @Override
    public SkylabModulesRecord value10(Byte value) {
        setEnergyBase(value);
        return this;
    }

    @Override
    public SkylabModulesRecord values(Byte value1, String value2, Byte value3, Short value4, Short value5, Short value6, Byte value7, Short value8, Byte value9, Byte value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SkylabModulesRecord
     */
    public SkylabModulesRecord() {
        super(SkylabModules.SKYLAB_MODULES);
    }

    /**
     * Create a detached, initialised SkylabModulesRecord
     */
    public SkylabModulesRecord(Byte id, String name, Byte productionFactor, Short productionBase, Short storageFactor, Short storageBase, Byte upgradeFactor, Short upgradeBase, Byte energyFactor, Byte energyBase) {
        super(SkylabModules.SKYLAB_MODULES);

        set(0, id);
        set(1, name);
        set(2, productionFactor);
        set(3, productionBase);
        set(4, storageFactor);
        set(5, storageBase);
        set(6, upgradeFactor);
        set(7, upgradeBase);
        set(8, energyFactor);
        set(9, energyBase);
    }
}

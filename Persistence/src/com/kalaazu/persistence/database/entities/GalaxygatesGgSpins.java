package com.kalaazu.persistence.database.entities;

import com.kalaazu.persistence.database.entities.galaxygates_gg_spins.generated.GeneratedGalaxygatesGgSpins;

/**
 * The main interface for entities of the {@code galaxygates_gg_spins}-table in
 * the database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface GalaxygatesGgSpins extends GeneratedGalaxygatesGgSpins, Entity<Short> {
    /**
     * Returns the galaxygate.
     *
     * @return The galaxygate.
     */
    Galaxygates getGalaxygate();

    /**
     * Returns the spin.
     *
     * @return The spin.
     */
    GalaxygatesSpins getSpin();
}
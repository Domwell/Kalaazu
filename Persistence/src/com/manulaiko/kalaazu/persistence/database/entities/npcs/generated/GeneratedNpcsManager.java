package com.manulaiko.kalaazu.persistence.database.entities.npcs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.npcs.Npcs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.npcs.Npcs} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedNpcsManager extends Manager<Npcs> {

    List<Field<Npcs>> FIELDS = unmodifiableList(asList(
            Npcs.ID,
            Npcs.NAME,
            Npcs.HEALTH,
            Npcs.SHIELD,
            Npcs.SHIELD_ABSORPTION,
            Npcs.DAMAGE,
            Npcs.SPEED,
            Npcs.GFX,
            Npcs.AI
    ));

    @Override
    default Class<Npcs> getEntityClass() {
        return Npcs.class;
    }
}
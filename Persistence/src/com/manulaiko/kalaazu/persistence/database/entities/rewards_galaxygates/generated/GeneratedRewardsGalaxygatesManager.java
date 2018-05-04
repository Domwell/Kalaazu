package com.manulaiko.kalaazu.persistence.database.entities.rewards_galaxygates.generated;

import com.manulaiko.kalaazu.persistence.database.entities.RewardsGalaxygates;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * RewardsGalaxygates}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRewardsGalaxygatesManager extends Manager<RewardsGalaxygates> {

    List<Field<RewardsGalaxygates>> FIELDS = unmodifiableList(asList(
            RewardsGalaxygates.ID,
            RewardsGalaxygates.GALAXYGATES_ID,
            RewardsGalaxygates.REWARDS_ID
    ));

    @Override
    default Class<RewardsGalaxygates> getEntityClass() {
        return RewardsGalaxygates.class;
    }
}
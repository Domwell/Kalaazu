package com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.generated;

import com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.moderators_roles.ModeratorsRoles}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedModeratorsRolesManager extends Manager<ModeratorsRoles> {

    List<Field<ModeratorsRoles>> FIELDS = unmodifiableList(asList(
            ModeratorsRoles.ID,
            ModeratorsRoles.NAME,
            ModeratorsRoles.MODERATORS_ROLES_ID,
            ModeratorsRoles.PRIORITY
    ));

    @Override
    default Class<ModeratorsRoles> getEntityClass() {
        return ModeratorsRoles.class;
    }
}
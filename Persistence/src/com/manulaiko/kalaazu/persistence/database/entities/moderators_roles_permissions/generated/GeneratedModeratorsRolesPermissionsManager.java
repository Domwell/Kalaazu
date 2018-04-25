package com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.generated;

import com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.ModeratorsRolesPermissions;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.moderators_roles_permissions.ModeratorsRolesPermissions}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedModeratorsRolesPermissionsManager extends Manager<ModeratorsRolesPermissions> {

    List<Field<ModeratorsRolesPermissions>> FIELDS = unmodifiableList(asList(
            ModeratorsRolesPermissions.ID,
            ModeratorsRolesPermissions.MODERATORS_ROLES_ID,
            ModeratorsRolesPermissions.PERMISSIONS_ID,
            ModeratorsRolesPermissions.IS_ENABLED
    ));

    @Override
    default Class<ModeratorsRolesPermissions> getEntityClass() {
        return ModeratorsRolesPermissions.class;
    }
}
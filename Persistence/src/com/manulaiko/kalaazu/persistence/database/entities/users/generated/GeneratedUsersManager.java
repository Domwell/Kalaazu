package com.manulaiko.kalaazu.persistence.database.entities.users.generated;

import com.manulaiko.kalaazu.persistence.database.entities.Users;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUsersManager extends Manager<Users> {

    List<Field<Users>> FIELDS = unmodifiableList(asList(
            Users.ID,
            Users.DATE,
            Users.INVITATION_CODES_ID,
            Users.NAME,
            Users.PASSWORD,
            Users.EMAIL,
            Users.EMAIL_VERIFICATION_CODE,
            Users.EMAIL_VERIFICATION_DATE,
            Users.IP
    ));

    @Override
    default Class<Users> getEntityClass() {
        return Users.class;
    }
}
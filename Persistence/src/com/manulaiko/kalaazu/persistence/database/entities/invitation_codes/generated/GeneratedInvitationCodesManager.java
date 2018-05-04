package com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.generated;

import com.manulaiko.kalaazu.persistence.database.entities.InvitationCodes;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * InvitationCodes}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedInvitationCodesManager extends Manager<InvitationCodes> {

    List<Field<InvitationCodes>> FIELDS = unmodifiableList(asList(
            InvitationCodes.ID,
            InvitationCodes.CODE,
            InvitationCodes.LIMIT
    ));

    @Override
    default Class<InvitationCodes> getEntityClass() {
        return InvitationCodes.class;
    }
}
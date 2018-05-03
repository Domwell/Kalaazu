package com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.InvitationCodesRedeemLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.InvitationCodesRedeemLogs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedInvitationCodesRedeemLogsManager extends Manager<InvitationCodesRedeemLogs> {

    List<Field<InvitationCodesRedeemLogs>> FIELDS = unmodifiableList(asList(
            InvitationCodesRedeemLogs.ID,
            InvitationCodesRedeemLogs.INVITATION_CODES_ID,
            InvitationCodesRedeemLogs.IP,
            InvitationCodesRedeemLogs.DATE
    ));

    @Override
    default Class<InvitationCodesRedeemLogs> getEntityClass() {
        return InvitationCodesRedeemLogs.class;
    }
}
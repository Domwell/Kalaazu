package com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.InvitationCodes;
import com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.InvitationCodesRedeemLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.ReferenceField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.other.BinaryToByteArrayMapper;

import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.invitation_codes_redeem_logs.InvitationCodesRedeemLogs}-interface
 * representing entities of the {@code invitation_codes_redeem_logs}-table in
 * the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedInvitationCodesRedeemLogs {

    /**
     * This Field corresponds to the {@link InvitationCodesRedeemLogs} field
     * that can be obtained using the {@link InvitationCodesRedeemLogs#getId()}
     * method.
     */
    IntField<InvitationCodesRedeemLogs, Integer>                            ID                  = IntField.create(
            Identifier.ID,
            InvitationCodesRedeemLogs::getId,
            InvitationCodesRedeemLogs::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link InvitationCodesRedeemLogs} field
     * that can be obtained using the {@link
     * InvitationCodesRedeemLogs#getInvitationCodesId()} method.
     */
    ShortForeignKeyField<InvitationCodesRedeemLogs, Short, InvitationCodes> INVITATION_CODES_ID = ShortForeignKeyField.create(
            Identifier.INVITATION_CODES_ID,
            InvitationCodesRedeemLogs::getInvitationCodesId,
            InvitationCodesRedeemLogs::setInvitationCodesId,
            InvitationCodes.ID,
            TypeMapper.primitive(),
            false
    );

    /**
     * This Field corresponds to the {@link InvitationCodesRedeemLogs} field
     * that can be obtained using the {@link InvitationCodesRedeemLogs#getIp()}
     * method.
     */
    ReferenceField<InvitationCodesRedeemLogs, Object, byte[]>               IP                  = ReferenceField.create(
            Identifier.IP,
            InvitationCodesRedeemLogs::getIp,
            InvitationCodesRedeemLogs::setIp,
            new BinaryToByteArrayMapper(),
            false
    );

    /**
     * This Field corresponds to the {@link InvitationCodesRedeemLogs} field
     * that can be obtained using the {@link
     * InvitationCodesRedeemLogs#getDate()} method.
     */
    ComparableField<InvitationCodesRedeemLogs, Timestamp, Timestamp>        DATE                = ComparableField.create(
            Identifier.DATE,
            InvitationCodesRedeemLogs::getDate,
            InvitationCodesRedeemLogs::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this InvitationCodesRedeemLogs. The id field
     * corresponds to the database column
     * kalaazu.kalaazu.invitation_codes_redeem_logs.id.
     *
     * @return the id of this InvitationCodesRedeemLogs
     */
    Integer getId();

    /**
     * Returns the invitationCodesId of this InvitationCodesRedeemLogs. The
     * invitationCodesId field corresponds to the database column
     * kalaazu.kalaazu.invitation_codes_redeem_logs.invitation_codes_id.
     *
     * @return the invitationCodesId of this InvitationCodesRedeemLogs
     */
    short getInvitationCodesId();

    /**
     * Returns the ip of this InvitationCodesRedeemLogs. The ip field
     * corresponds to the database column
     * kalaazu.kalaazu.invitation_codes_redeem_logs.ip.
     *
     * @return the ip of this InvitationCodesRedeemLogs
     */
    byte[] getIp();

    /**
     * Returns the date of this InvitationCodesRedeemLogs. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.invitation_codes_redeem_logs.date.
     *
     * @return the date of this InvitationCodesRedeemLogs
     */
    Timestamp getDate();

    /**
     * Sets the id of this InvitationCodesRedeemLogs. The id field corresponds
     * to the database column kalaazu.kalaazu.invitation_codes_redeem_logs.id.
     *
     * @param id to set of this InvitationCodesRedeemLogs
     *
     * @return this InvitationCodesRedeemLogs instance
     */
    InvitationCodesRedeemLogs setId(int id);

    /**
     * Sets the invitationCodesId of this InvitationCodesRedeemLogs. The
     * invitationCodesId field corresponds to the database column
     * kalaazu.kalaazu.invitation_codes_redeem_logs.invitation_codes_id.
     *
     * @param invitationCodesId to set of this InvitationCodesRedeemLogs
     *
     * @return this InvitationCodesRedeemLogs instance
     */
    InvitationCodesRedeemLogs setInvitationCodesId(short invitationCodesId);

    /**
     * Sets the ip of this InvitationCodesRedeemLogs. The ip field corresponds
     * to the database column kalaazu.kalaazu.invitation_codes_redeem_logs.ip.
     *
     * @param ip to set of this InvitationCodesRedeemLogs
     *
     * @return this InvitationCodesRedeemLogs instance
     */
    InvitationCodesRedeemLogs setIp(byte... ip);

    /**
     * Sets the date of this InvitationCodesRedeemLogs. The date field
     * corresponds to the database column
     * kalaazu.kalaazu.invitation_codes_redeem_logs.date.
     *
     * @param date to set of this InvitationCodesRedeemLogs
     *
     * @return this InvitationCodesRedeemLogs instance
     */
    InvitationCodesRedeemLogs setDate(Timestamp date);

    /**
     * Queries the specified manager for the referenced InvitationCodes. If no
     * such InvitationCodes exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    InvitationCodes findInvitationCodesId(Manager<InvitationCodes> foreignManager);

    enum Identifier implements ColumnIdentifier<InvitationCodesRedeemLogs> {

        ID("id"),
        INVITATION_CODES_ID("invitation_codes_id"),
        IP("ip"),
        DATE("date");

        private final String                                     columnName;

        private final TableIdentifier<InvitationCodesRedeemLogs> tableIdentifier;

        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsName(),
                    getSchemaName(),
                    getTableName()
            );
        }

        @Override
        public String getDbmsName() {
            return "kalaazu";
        }

        @Override
        public String getSchemaName() {
            return "kalaazu";
        }

        @Override
        public String getTableName() {
            return "invitation_codes_redeem_logs";
        }

        @Override
        public String getColumnName() {
            return this.columnName;
        }

        @Override
        public TableIdentifier<InvitationCodesRedeemLogs> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
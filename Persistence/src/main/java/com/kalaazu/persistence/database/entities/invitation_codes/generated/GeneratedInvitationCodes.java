package com.kalaazu.persistence.database.entities.invitation_codes.generated;

import com.kalaazu.persistence.database.entities.InvitationCodes;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.field.ByteField;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.invitation_codes.InvitationCodes}-interface
 * representing entities of the {@code invitation_codes}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedInvitationCodes {

    /**
     * This Field corresponds to the {@link InvitationCodes} field that can be
     * obtained using the {@link InvitationCodes#getId()} method.
     */
    ShortField<InvitationCodes, Short>   ID    = ShortField.create(
            Identifier.ID,
            InvitationCodes::getId,
            InvitationCodes::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link InvitationCodes} field that can be
     * obtained using the {@link InvitationCodes#getCode()} method.
     */
    StringField<InvitationCodes, String> CODE  = StringField.create(
            Identifier.CODE,
            InvitationCodes::getCode,
            InvitationCodes::setCode,
            TypeMapper.identity(),
            true
    );

    /**
     * This Field corresponds to the {@link InvitationCodes} field that can be
     * obtained using the {@link InvitationCodes#getLimit()} method.
     */
    ByteField<InvitationCodes, Byte>     LIMIT = ByteField.create(
            Identifier.LIMIT,
            InvitationCodes::getLimit,
            InvitationCodes::setLimit,
            TypeMapper.primitive(),
            false
    );

    /**
     * Returns the id of this InvitationCodes. The id field corresponds to the
     * database column kalaazu.kalaazu.invitation_codes.id.
     *
     * @return the id of this InvitationCodes
     */
    Short getId();

    /**
     * Returns the code of this InvitationCodes. The code field corresponds to
     * the database column kalaazu.kalaazu.invitation_codes.code.
     *
     * @return the code of this InvitationCodes
     */
    String getCode();

    /**
     * Returns the limit of this InvitationCodes. The limit field corresponds to
     * the database column kalaazu.kalaazu.invitation_codes.limit.
     *
     * @return the limit of this InvitationCodes
     */
    byte getLimit();

    /**
     * Sets the id of this InvitationCodes. The id field corresponds to the
     * database column kalaazu.kalaazu.invitation_codes.id.
     *
     * @param id to set of this InvitationCodes
     *
     * @return this InvitationCodes instance
     */
    InvitationCodes setId(short id);

    /**
     * Sets the code of this InvitationCodes. The code field corresponds to the
     * database column kalaazu.kalaazu.invitation_codes.code.
     *
     * @param code to set of this InvitationCodes
     *
     * @return this InvitationCodes instance
     */
    InvitationCodes setCode(String code);

    /**
     * Sets the limit of this InvitationCodes. The limit field corresponds to
     * the database column kalaazu.kalaazu.invitation_codes.limit.
     *
     * @param limit to set of this InvitationCodes
     *
     * @return this InvitationCodes instance
     */
    InvitationCodes setLimit(byte limit);

    enum Identifier implements ColumnIdentifier<InvitationCodes> {

        ID("id"),
        CODE("code"),
        LIMIT("limit");

        private final String                           columnId;

        private final TableIdentifier<InvitationCodes> tableIdentifier;

        Identifier(String columnId) {
            this.columnId = columnId;
            this.tableIdentifier = TableIdentifier.of(
                    getDbmsId(),
                    getSchemaId(),
                    getTableId()
            );
        }

        @Override
        public String getDbmsId() {
            return "kalaazu";
        }

        @Override
        public String getSchemaId() {
            return "kalaazu";
        }

        @Override
        public String getTableId() {
            return "invitation_codes";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<InvitationCodes> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
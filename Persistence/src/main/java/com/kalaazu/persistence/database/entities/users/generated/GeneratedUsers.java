package com.kalaazu.persistence.database.entities.users.generated;

import com.kalaazu.persistence.database.entities.InvitationCodes;
import com.kalaazu.persistence.database.entities.Users;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.*;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.kalaazu.persistence.database.entities.users.Users}-interface representing
 * entities of the {@code users}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUsers {

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getId()} method.
     */
    IntField<Users, Integer>                                        ID                      = IntField.create(
            Identifier.ID,
            Users::getId,
            Users::setId,
            TypeMapper.primitive(),
            true
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getDate()} method.
     */
    ComparableField<Users, Timestamp, Timestamp>                    DATE                    = ComparableField.create(
            Identifier.DATE,
            Users::getDate,
            Users::setDate,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getInvitationCodesId()} method.
     */
    ComparableForeignKeyField<Users, Short, Short, InvitationCodes> INVITATION_CODES_ID     = ComparableForeignKeyField.create(
            Identifier.INVITATION_CODES_ID,
            o -> OptionalUtil.unwrap(o.getInvitationCodesId()),
            Users::setInvitationCodesId,
            InvitationCodes.ID,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getName()} method.
     */
    StringField<Users, String>                                      NAME                    = StringField.create(
            Identifier.NAME,
            Users::getName,
            Users::setName,
            TypeMapper.identity(),
            true
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getPassword()} method.
     */
    StringField<Users, String>                                      PASSWORD                = StringField.create(
            Identifier.PASSWORD,
            Users::getPassword,
            Users::setPassword,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getEmail()} method.
     */
    StringField<Users, String>                                      EMAIL                   = StringField.create(
            Identifier.EMAIL,
            Users::getEmail,
            Users::setEmail,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getEmailVerificationCode()} method.
     */
    StringField<Users, String>                                      EMAIL_VERIFICATION_CODE = StringField.create(
            Identifier.EMAIL_VERIFICATION_CODE,
            Users::getEmailVerificationCode,
            Users::setEmailVerificationCode,
            TypeMapper.identity(),
            true
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getEmailVerificationDate()} method.
     */
    ComparableField<Users, Timestamp, Timestamp>                    EMAIL_VERIFICATION_DATE = ComparableField.create(
            Identifier.EMAIL_VERIFICATION_DATE,
            o -> OptionalUtil.unwrap(o.getEmailVerificationDate()),
            Users::setEmailVerificationDate,
            TypeMapper.identity(),
            false
    );

    /**
     * This Field corresponds to the {@link Users} field that can be obtained
     * using the {@link Users#getIp()} method.
     */
    ReferenceField<Users, Object, Object>                           IP                      = ReferenceField.create(
            Identifier.IP,
            Users::getIp,
            Users::setIp,
            TypeMapper.identity(),
            false
    );

    /**
     * Returns the id of this Users. The id field corresponds to the database
     * column kalaazu.kalaazu.users.id.
     *
     * @return the id of this Users
     */
    Integer getId();

    /**
     * Returns the date of this Users. The date field corresponds to the
     * database column kalaazu.kalaazu.users.date.
     *
     * @return the date of this Users
     */
    Timestamp getDate();

    /**
     * Returns the invitationCodesId of this Users. The invitationCodesId field
     * corresponds to the database column
     * kalaazu.kalaazu.users.invitation_codes_id.
     *
     * @return the invitationCodesId of this Users
     */
    Optional<Short> getInvitationCodesId();

    /**
     * Returns the name of this Users. The name field corresponds to the
     * database column kalaazu.kalaazu.users.name.
     *
     * @return the name of this Users
     */
    String getName();

    /**
     * Returns the password of this Users. The password field corresponds to the
     * database column kalaazu.kalaazu.users.password.
     *
     * @return the password of this Users
     */
    String getPassword();

    /**
     * Returns the email of this Users. The email field corresponds to the
     * database column kalaazu.kalaazu.users.email.
     *
     * @return the email of this Users
     */
    String getEmail();

    /**
     * Returns the emailVerificationCode of this Users. The
     * emailVerificationCode field corresponds to the database column
     * kalaazu.kalaazu.users.email_verification_code.
     *
     * @return the emailVerificationCode of this Users
     */
    String getEmailVerificationCode();

    /**
     * Returns the emailVerificationDate of this Users. The
     * emailVerificationDate field corresponds to the database column
     * kalaazu.kalaazu.users.email_verification_date.
     *
     * @return the emailVerificationDate of this Users
     */
    Optional<Timestamp> getEmailVerificationDate();

    /**
     * Returns the ip of this Users. The ip field corresponds to the database
     * column kalaazu.kalaazu.users.ip.
     *
     * @return the ip of this Users
     */
    Object getIp();

    /**
     * Sets the id of this Users. The id field corresponds to the database
     * column kalaazu.kalaazu.users.id.
     *
     * @param id to set of this Users
     *
     * @return this Users instance
     */
    Users setId(int id);

    /**
     * Sets the date of this Users. The date field corresponds to the database
     * column kalaazu.kalaazu.users.date.
     *
     * @param date to set of this Users
     *
     * @return this Users instance
     */
    Users setDate(Timestamp date);

    /**
     * Sets the invitationCodesId of this Users. The invitationCodesId field
     * corresponds to the database column
     * kalaazu.kalaazu.users.invitation_codes_id.
     *
     * @param invitationCodesId to set of this Users
     *
     * @return this Users instance
     */
    Users setInvitationCodesId(Short invitationCodesId);

    /**
     * Sets the name of this Users. The name field corresponds to the database
     * column kalaazu.kalaazu.users.name.
     *
     * @param name to set of this Users
     *
     * @return this Users instance
     */
    Users setName(String name);

    /**
     * Sets the password of this Users. The password field corresponds to the
     * database column kalaazu.kalaazu.users.password.
     *
     * @param password to set of this Users
     *
     * @return this Users instance
     */
    Users setPassword(String password);

    /**
     * Sets the email of this Users. The email field corresponds to the database
     * column kalaazu.kalaazu.users.email.
     *
     * @param email to set of this Users
     *
     * @return this Users instance
     */
    Users setEmail(String email);

    /**
     * Sets the emailVerificationCode of this Users. The emailVerificationCode
     * field corresponds to the database column
     * kalaazu.kalaazu.users.email_verification_code.
     *
     * @param emailVerificationCode to set of this Users
     *
     * @return this Users instance
     */
    Users setEmailVerificationCode(String emailVerificationCode);

    /**
     * Sets the emailVerificationDate of this Users. The emailVerificationDate
     * field corresponds to the database column
     * kalaazu.kalaazu.users.email_verification_date.
     *
     * @param emailVerificationDate to set of this Users
     *
     * @return this Users instance
     */
    Users setEmailVerificationDate(Timestamp emailVerificationDate);

    /**
     * Sets the ip of this Users. The ip field corresponds to the database
     * column kalaazu.kalaazu.users.ip.
     *
     * @param ip to set of this Users
     *
     * @return this Users instance
     */
    Users setIp(Object ip);

    /**
     * Queries the specified manager for the referenced InvitationCodes. If no
     * such InvitationCodes exists, an {@code NullPointerException} will be
     * thrown.
     *
     * @param foreignManager the manager to query for the entity
     *
     * @return the foreign entity referenced
     */
    Optional<InvitationCodes> findInvitationCodesId(Manager<InvitationCodes> foreignManager);

    enum Identifier implements ColumnIdentifier<Users> {

        ID("id"),
        DATE("date"),
        INVITATION_CODES_ID("invitation_codes_id"),
        NAME("name"),
        PASSWORD("password"),
        EMAIL("email"),
        EMAIL_VERIFICATION_CODE("email_verification_code"),
        EMAIL_VERIFICATION_DATE("email_verification_date"),
        IP("ip");

        private final String                 columnId;

        private final TableIdentifier<Users> tableIdentifier;

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
            return "users";
        }

        @Override
        public String getColumnId() {
            return this.columnId;
        }

        @Override
        public TableIdentifier<Users> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}
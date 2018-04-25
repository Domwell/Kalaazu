package com.manulaiko.kalaazu.persistence.database.entities.users.generated;

import com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.InvitationCodes;
import com.manulaiko.kalaazu.persistence.database.entities.users.Users;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.manulaiko.kalaazu.persistence.database.entities.users.Users}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersImpl implements Users {

    private int       id;

    private Timestamp date;

    private Short     invitationCodesId;

    private String    name;

    private String    password;

    private String    email;

    private String    emailVerificationCode;

    private Timestamp emailVerificationDate;

    private byte[]    ip;

    protected GeneratedUsersImpl() {

    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Timestamp getDate() {
        return date;
    }

    @Override
    public Optional<Short> getInvitationCodesId() {
        return Optional.ofNullable(invitationCodesId);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getEmailVerificationCode() {
        return emailVerificationCode;
    }

    @Override
    public Optional<Timestamp> getEmailVerificationDate() {
        return Optional.ofNullable(emailVerificationDate);
    }

    @Override
    public byte[] getIp() {
        return ip;
    }

    @Override
    public Users setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public Users setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    @Override
    public Users setInvitationCodesId(Short invitationCodesId) {
        this.invitationCodesId = invitationCodesId;
        return this;
    }

    @Override
    public Users setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Users setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Users setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Users setEmailVerificationCode(String emailVerificationCode) {
        this.emailVerificationCode = emailVerificationCode;
        return this;
    }

    @Override
    public Users setEmailVerificationDate(Timestamp emailVerificationDate) {
        this.emailVerificationDate = emailVerificationDate;
        return this;
    }

    @Override
    public Users setIp(byte... ip) {
        this.ip = ip;
        return this;
    }

    @Override
    public Optional<InvitationCodes> findInvitationCodesId(Manager<InvitationCodes> foreignManager) {
        if (getInvitationCodesId().isPresent()) {
            return foreignManager.stream()
                                 .filter(InvitationCodes.ID.equal(getInvitationCodesId().get()))
                                 .findAny();
        } else {
            return Optional.empty();
        }
    }

    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = " + Objects.toString(getId()));
        sj.add("date = " + Objects.toString(getDate()));
        sj.add("invitationCodesId = " + Objects.toString(OptionalUtil.unwrap(getInvitationCodesId())));
        sj.add("name = " + Objects.toString(getName()));
        sj.add("password = " + Objects.toString(getPassword()));
        sj.add("email = " + Objects.toString(getEmail()));
        sj.add("emailVerificationCode = " + Objects.toString(getEmailVerificationCode()));
        sj.add("emailVerificationDate = " + Objects.toString(OptionalUtil.unwrap(getEmailVerificationDate())));
        sj.add("ip = " + Objects.toString(getIp()));
        return "UsersImpl " + sj.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (!(that instanceof Users)) {
            return false;
        }
        final Users thatUsers = (Users) that;
        if (this.getId() != thatUsers.getId()) {
            return false;
        }
        if (!Objects.equals(this.getDate(), thatUsers.getDate())) {
            return false;
        }
        if (!Objects.equals(this.getInvitationCodesId(), thatUsers.getInvitationCodesId())) {
            return false;
        }
        if (!Objects.equals(this.getName(), thatUsers.getName())) {
            return false;
        }
        if (!Objects.equals(this.getPassword(), thatUsers.getPassword())) {
            return false;
        }
        if (!Objects.equals(this.getEmail(), thatUsers.getEmail())) {
            return false;
        }
        if (!Objects.equals(this.getEmailVerificationCode(), thatUsers.getEmailVerificationCode())) {
            return false;
        }
        if (!Objects.equals(this.getEmailVerificationDate(), thatUsers.getEmailVerificationDate())) {
            return false;
        }
        if (!Objects.equals(this.getIp(), thatUsers.getIp())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getDate());
        hash = 31 * hash + Objects.hashCode(getInvitationCodesId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getPassword());
        hash = 31 * hash + Objects.hashCode(getEmail());
        hash = 31 * hash + Objects.hashCode(getEmailVerificationCode());
        hash = 31 * hash + Objects.hashCode(getEmailVerificationDate());
        hash = 31 * hash + Objects.hashCode(getIp());
        return hash;
    }
}
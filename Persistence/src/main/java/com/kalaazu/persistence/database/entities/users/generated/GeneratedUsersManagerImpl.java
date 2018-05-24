package com.kalaazu.persistence.database.entities.users.generated;

import com.kalaazu.persistence.database.entities.Users;
import com.kalaazu.persistence.database.entities.users.UsersManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.kalaazu.persistence.database.entities.users.Users} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedUsersManagerImpl
        extends AbstractManager<Users>
        implements GeneratedUsersManager {

    private final TableIdentifier<Users> tableIdentifier;

    protected GeneratedUsersManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "users");
    }

    @Override
    public TableIdentifier<Users> getTableIdentifier() {
        return tableIdentifier;
    }

    @Override
    public Stream<Field<Users>> fields() {
        return UsersManager.FIELDS.stream();
    }

    @Override
    public Stream<Field<Users>> primaryKeyFields() {
        return Stream.of(
                Users.ID
        );
    }
}
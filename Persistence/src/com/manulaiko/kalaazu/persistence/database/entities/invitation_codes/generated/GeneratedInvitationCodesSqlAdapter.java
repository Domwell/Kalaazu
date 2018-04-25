package com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.generated;

import com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.InvitationCodes;
import com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.InvitationCodesImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.manulaiko.kalaazu.persistence.database.entities.invitation_codes.InvitationCodes}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedInvitationCodesSqlAdapter {

    private final TableIdentifier<InvitationCodes> tableIdentifier;

    protected GeneratedInvitationCodesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("kalaazu", "kalaazu", "invitation_codes");
    }

    @ExecuteBefore(RESOLVED)
    void installMethodName(
            @WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent
    ) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }

    protected InvitationCodes apply(ResultSet resultSet) throws SpeedmentException {
        final InvitationCodes entity = createEntity();
        try {
            entity.setId(resultSet.getShort(1));
            entity.setCode(resultSet.getString(2));
            entity.setLimit(resultSet.getByte(3));
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }

    protected InvitationCodesImpl createEntity() {
        return new InvitationCodesImpl();
    }
}
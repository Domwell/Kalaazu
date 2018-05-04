package com.manulaiko.kalaazu.persistence.database.entities.moderators_logs.generated;

import com.manulaiko.kalaazu.persistence.database.entities.ModeratorsLogs;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * ModeratorsLogs}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedModeratorsLogsManager extends Manager<ModeratorsLogs> {

    List<Field<ModeratorsLogs>> FIELDS = unmodifiableList(asList(
            ModeratorsLogs.ID,
            ModeratorsLogs.MODERATORS_ID,
            ModeratorsLogs.DATE,
            ModeratorsLogs.TYPE,
            ModeratorsLogs.TEXT
    ));

    @Override
    default Class<ModeratorsLogs> getEntityClass() {
        return ModeratorsLogs.class;
    }
}
package com.kalaazu.persistence.database.entities;


import com.kalaazu.persistence.database.entities.clans_roles.generated.GeneratedClansRoles;
import com.kalaazu.persistence.database.entities.roles.Role;

/**
 * The main interface for entities of the {@code clans_roles}-table in the
 * database.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
public interface ClansRoles extends GeneratedClansRoles, Entity<Integer>, Role {
}
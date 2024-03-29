package com.example.demo.c04cinema.c04cinema.c04cinema.role.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.role.Role;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.role.Role} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRoleManager extends Manager<Role> {
    
    TableIdentifier<Role> IDENTIFIER = TableIdentifier.of("c04cinema", "c04cinema", "role");
    List<Field<Role>> FIELDS = unmodifiableList(asList(
        Role.ID,
        Role.NAME
    ));
    
    @Override
    default Class<Role> getEntityClass() {
        return Role.class;
    }
}
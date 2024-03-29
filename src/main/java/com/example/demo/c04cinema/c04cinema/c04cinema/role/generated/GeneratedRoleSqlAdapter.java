package com.example.demo.c04cinema.c04cinema.c04cinema.role.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.role.Role;
import com.example.demo.c04cinema.c04cinema.c04cinema.role.RoleImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.role.Role} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRoleSqlAdapter implements SqlAdapter<Role> {
    
    private final TableIdentifier<Role> tableIdentifier;
    
    protected GeneratedRoleSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "role");
    }
    
    protected Role apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(   resultSet.getInt(1 + offset))
            .setName( resultSet.getString(2 + offset))
            ;
    }
    
    protected RoleImpl createEntity() {
        return new RoleImpl();
    }
    
    @Override
    public TableIdentifier<Role> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Role> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Role> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
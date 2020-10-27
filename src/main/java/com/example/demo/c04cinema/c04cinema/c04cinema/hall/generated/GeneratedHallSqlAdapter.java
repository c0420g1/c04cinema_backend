package com.example.demo.c04cinema.c04cinema.c04cinema.hall.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall;
import com.example.demo.c04cinema.c04cinema.c04cinema.hall.HallImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.util.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.hall.Hall} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedHallSqlAdapter implements SqlAdapter<Hall> {
    
    private final TableIdentifier<Hall> tableIdentifier;
    
    protected GeneratedHallSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "hall");
    }
    
    protected Hall apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(         resultSet.getInt(1 + offset))
            .setName(       resultSet.getString(2 + offset))
            .setHallTypeId( getInt(resultSet, 3 + offset))
            .setTheatreId(  getInt(resultSet, 4 + offset))
            ;
    }
    
    protected HallImpl createEntity() {
        return new HallImpl();
    }
    
    @Override
    public TableIdentifier<Hall> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Hall> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Hall> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
package com.example.demo.c04cinema.c04cinema.c04cinema.staff.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.staff.Staff;
import com.example.demo.c04cinema.c04cinema.c04cinema.staff.StaffImpl;
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
 * com.example.demo.c04cinema.c04cinema.c04cinema.staff.Staff} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStaffSqlAdapter implements SqlAdapter<Staff> {
    
    private final TableIdentifier<Staff> tableIdentifier;
    
    protected GeneratedStaffSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "staff");
    }
    
    protected Staff apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(         resultSet.getInt(1 + offset))
            .setName(       resultSet.getString(2 + offset))
            .setAddress(    resultSet.getString(3 + offset))
            .setAccountId(  getInt(resultSet, 4 + offset))
            .setTheatreId(  getInt(resultSet, 5 + offset))
            .setEmail(      resultSet.getString(6 + offset))
            .setPhone(      resultSet.getString(7 + offset))
            .setCardid(     resultSet.getString(8 + offset))
            .setBirthday(   resultSet.getTimestamp(9 + offset))
            .setSalary(     getDouble(resultSet, 10 + offset))
            .setPositionId( getInt(resultSet, 11 + offset))
            .setIsactive(   getByte(resultSet, 12 + offset))
            .setCode(       resultSet.getString(13 + offset))
            .setImageUrl(   resultSet.getString(14 + offset))
            ;
    }
    
    protected StaffImpl createEntity() {
        return new StaffImpl();
    }
    
    @Override
    public TableIdentifier<Staff> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Staff> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Staff> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
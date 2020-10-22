package com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPointImpl;
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
 * com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedPromoPointSqlAdapter implements SqlAdapter<PromoPoint> {
    
    private final TableIdentifier<PromoPoint> tableIdentifier;
    
    protected GeneratedPromoPointSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "promo_point");
    }
    
    protected PromoPoint apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(          resultSet.getInt(1 + offset))
            .setName(        resultSet.getString(2 + offset))
            .setBonusPoint(  getInt(resultSet, 3 + offset))
            .setDescription( resultSet.getString(4 + offset))
            ;
    }
    
    protected PromoPointImpl createEntity() {
        return new PromoPointImpl();
    }
    
    @Override
    public TableIdentifier<PromoPoint> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, PromoPoint> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, PromoPoint> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
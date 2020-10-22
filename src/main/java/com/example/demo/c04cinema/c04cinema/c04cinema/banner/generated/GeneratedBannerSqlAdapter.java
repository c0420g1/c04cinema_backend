package com.example.demo.c04cinema.c04cinema.c04cinema.banner.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.banner.Banner;
import com.example.demo.c04cinema.c04cinema.c04cinema.banner.BannerImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.banner.Banner} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBannerSqlAdapter implements SqlAdapter<Banner> {
    
    private final TableIdentifier<Banner> tableIdentifier;
    
    protected GeneratedBannerSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "banner");
    }
    
    protected Banner apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(          resultSet.getInt(1 + offset))
            .setTitle(       resultSet.getString(2 + offset))
            .setUrl(         resultSet.getString(3 + offset))
            .setDescription( resultSet.getString(4 + offset))
            ;
    }
    
    protected BannerImpl createEntity() {
        return new BannerImpl();
    }
    
    @Override
    public TableIdentifier<Banner> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Banner> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Banner> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
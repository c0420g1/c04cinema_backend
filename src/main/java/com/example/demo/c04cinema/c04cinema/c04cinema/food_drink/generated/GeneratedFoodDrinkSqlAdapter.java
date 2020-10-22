package com.example.demo.c04cinema.c04cinema.c04cinema.food_drink.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.food_drink.FoodDrink;
import com.example.demo.c04cinema.c04cinema.c04cinema.food_drink.FoodDrinkImpl;
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
 * com.example.demo.c04cinema.c04cinema.c04cinema.food_drink.FoodDrink} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFoodDrinkSqlAdapter implements SqlAdapter<FoodDrink> {
    
    private final TableIdentifier<FoodDrink> tableIdentifier;
    
    protected GeneratedFoodDrinkSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "food_drink");
    }
    
    protected FoodDrink apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(          resultSet.getInt(1 + offset))
            .setName(        resultSet.getString(2 + offset))
            .setPrice(       getDouble(resultSet, 3 + offset))
            .setDescription( resultSet.getString(4 + offset))
            .setImageUrl(    resultSet.getString(5 + offset))
            ;
    }
    
    protected FoodDrinkImpl createEntity() {
        return new FoodDrinkImpl();
    }
    
    @Override
    public TableIdentifier<FoodDrink> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, FoodDrink> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, FoodDrink> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
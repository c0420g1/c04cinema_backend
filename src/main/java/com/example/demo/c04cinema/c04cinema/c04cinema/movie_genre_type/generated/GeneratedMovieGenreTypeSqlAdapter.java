package com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_type.MovieGenreType;
import com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_type.MovieGenreTypeImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.movie_genre_type.MovieGenreType}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieGenreTypeSqlAdapter implements SqlAdapter<MovieGenreType> {
    
    private final TableIdentifier<MovieGenreType> tableIdentifier;
    
    protected GeneratedMovieGenreTypeSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "movie_genre_type");
    }
    
    protected MovieGenreType apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(          resultSet.getInt(1 + offset))
            .setName(        resultSet.getString(2 + offset))
            .setDescription( resultSet.getString(3 + offset))
            ;
    }
    
    protected MovieGenreTypeImpl createEntity() {
        return new MovieGenreTypeImpl();
    }
    
    @Override
    public TableIdentifier<MovieGenreType> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, MovieGenreType> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, MovieGenreType> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}
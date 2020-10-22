package com.example.demo.c04cinema.c04cinema.c04cinema.movie_rated_age.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.movie_rated_age.MovieRatedAge;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.movie_rated_age.MovieRatedAge}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieRatedAgeImpl implements MovieRatedAge {
    
    private int id;
    private String name;
    private String description;
    
    protected GeneratedMovieRatedAgeImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public MovieRatedAge setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public MovieRatedAge setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public MovieRatedAge setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "          + Objects.toString(getId()));
        sj.add("name = "        + Objects.toString(OptionalUtil.unwrap(getName())));
        sj.add("description = " + Objects.toString(OptionalUtil.unwrap(getDescription())));
        return "MovieRatedAgeImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof MovieRatedAge)) { return false; }
        final MovieRatedAge thatMovieRatedAge = (MovieRatedAge)that;
        if (this.getId() != thatMovieRatedAge.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatMovieRatedAge.getName())) { return false; }
        if (!Objects.equals(this.getDescription(), thatMovieRatedAge.getDescription())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getDescription()));
        return hash;
    }
}
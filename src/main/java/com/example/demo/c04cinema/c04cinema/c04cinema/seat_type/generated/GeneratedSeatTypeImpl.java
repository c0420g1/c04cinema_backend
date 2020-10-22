package com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.promo_point.PromoPoint;
import com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.seat_type.SeatType}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSeatTypeImpl implements SeatType {
    
    private int id;
    private String name;
    private Integer promoPointId;
    
    protected GeneratedSeatTypeImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    @Override
    public OptionalInt getPromoPointId() {
        return OptionalUtil.ofNullable(promoPointId);
    }
    
    @Override
    public SeatType setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public SeatType setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public SeatType setPromoPointId(Integer promoPointId) {
        this.promoPointId = promoPointId;
        return this;
    }
    
    @Override
    public Optional<PromoPoint> findPromoPointId(Manager<PromoPoint> foreignManager) {
        if (getPromoPointId().isPresent()) {
            return foreignManager.stream().filter(PromoPoint.ID.equal(getPromoPointId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "           + Objects.toString(getId()));
        sj.add("name = "         + Objects.toString(OptionalUtil.unwrap(getName())));
        sj.add("promoPointId = " + Objects.toString(OptionalUtil.unwrap(getPromoPointId())));
        return "SeatTypeImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof SeatType)) { return false; }
        final SeatType thatSeatType = (SeatType)that;
        if (this.getId() != thatSeatType.getId()) { return false; }
        if (!Objects.equals(this.getName(), thatSeatType.getName())) { return false; }
        if (!Objects.equals(this.getPromoPointId(), thatSeatType.getPromoPointId())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getPromoPointId()));
        return hash;
    }
}
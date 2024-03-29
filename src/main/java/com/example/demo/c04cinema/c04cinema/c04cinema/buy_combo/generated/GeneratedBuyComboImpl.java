package com.example.demo.c04cinema.c04cinema.c04cinema.buy_combo.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.buy_combo.BuyCombo;
import com.example.demo.c04cinema.c04cinema.c04cinema.combo.Combo;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.buy_combo.BuyCombo}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBuyComboImpl implements BuyCombo {
    
    private int id;
    private Integer comboId;
    private Integer quantity;
    
    protected GeneratedBuyComboImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public OptionalInt getComboId() {
        return OptionalUtil.ofNullable(comboId);
    }
    
    @Override
    public OptionalInt getQuantity() {
        return OptionalUtil.ofNullable(quantity);
    }
    
    @Override
    public BuyCombo setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public BuyCombo setComboId(Integer comboId) {
        this.comboId = comboId;
        return this;
    }
    
    @Override
    public BuyCombo setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    @Override
    public Optional<Combo> findComboId(Manager<Combo> foreignManager) {
        if (getComboId().isPresent()) {
            return foreignManager.stream().filter(Combo.ID.equal(getComboId().getAsInt())).findAny();
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "       + Objects.toString(getId()));
        sj.add("comboId = "  + Objects.toString(OptionalUtil.unwrap(getComboId())));
        sj.add("quantity = " + Objects.toString(OptionalUtil.unwrap(getQuantity())));
        return "BuyComboImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof BuyCombo)) { return false; }
        final BuyCombo thatBuyCombo = (BuyCombo)that;
        if (this.getId() != thatBuyCombo.getId()) { return false; }
        if (!Objects.equals(this.getComboId(), thatBuyCombo.getComboId())) { return false; }
        if (!Objects.equals(this.getQuantity(), thatBuyCombo.getQuantity())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getComboId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getQuantity()));
        return hash;
    }
}
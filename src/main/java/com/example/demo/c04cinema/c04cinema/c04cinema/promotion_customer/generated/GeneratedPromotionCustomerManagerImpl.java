package com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.generated;

import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomer;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomerManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomer}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedPromotionCustomerManagerImpl 
extends AbstractManager<PromotionCustomer> 
implements GeneratedPromotionCustomerManager {
    
    private final TableIdentifier<PromotionCustomer> tableIdentifier;
    
    protected GeneratedPromotionCustomerManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("c04cinema", "c04cinema", "promotion_customer");
    }
    
    @Override
    public PromotionCustomer create() {
        return new PromotionCustomerImpl();
    }
    
    @Override
    public TableIdentifier<PromotionCustomer> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<PromotionCustomer>> fields() {
        return PromotionCustomerManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<PromotionCustomer>> primaryKeyFields() {
        return Stream.of(
            PromotionCustomer.ID
        );
    }
}
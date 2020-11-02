package com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.Promotion;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.generated.GeneratedPromotionCustomerController;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromotionCustomerController extends GeneratedPromotionCustomerController {
    @Autowired
    JoinComponent joinComponent;

    @Autowired
    CustomerManager customerManager;

    @GetMapping("/promotionDiscount")
    public double getpromotionDiscount(@RequestParam int accId, @RequestParam String proCode){
      int tmp=  customerManager.stream().filter(Customer.ACCOUNT_ID.equal(accId)).mapToInt(Customer.ID.asInt()).findFirst().getAsInt();

        Join<Tuple2<PromotionCustomer, Promotion>> join= joinComponent.from(PromotionCustomerManager.IDENTIFIER).where(PromotionCustomer.CUSTOMER_ID.equal(tmp))
                .where(PromotionCustomer.PROMOTION_CODE.equal(proCode))
                .innerJoinOn(Promotion.ID).equal(PromotionCustomer.PROMOTION_ID).build(Tuples::of);

        if(join.stream().count()>0){
             return join.stream().findFirst().get().get1().getDiscount().getAsDouble();
        }
        return -1;
    }
}

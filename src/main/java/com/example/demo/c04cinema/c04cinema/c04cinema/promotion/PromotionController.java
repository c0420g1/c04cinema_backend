package com.example.demo.c04cinema.c04cinema.c04cinema.promotion;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.generated.GeneratedPromotionController;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomer;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion_customer.PromotionCustomerManager;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PromotionController extends GeneratedPromotionController {

    @Autowired
    PromotionCustomerManager promotionCustomerManager;

    @Autowired
    CustomerManager customerManager;
//    CẬP NHẬT LẠI ĐIỂM CUSTOMERPOINT
    @PatchMapping ("/updatePointPC")
    public void updatePoint (@RequestParam int id,
                             @RequestParam int point){
//        TÌM RA CUSTOMER ĐỂ UPDATE POINT
        Customer customer = customerManager.stream().filter(Customer.ID.equal(id)).findFirst().get();
//        UPDATE POINT CỦA CUSTOMER
        customer.setCurrentBonusPoint(point);
        customerManager.update(customer);
    }

    @PostMapping("/createProCus")
    public void  createProCustomer(@RequestParam int cusId, @RequestParam int proId, @RequestParam String code){
        PromotionCustomer promotionCustomer = new PromotionCustomerImpl();
        promotionCustomer.setCustomerId(cusId);
        promotionCustomer.setPromotionId(proId);
        promotionCustomer.setPromotionCode(code);
        promotionCustomerManager.persist(promotionCustomer);
    }
    @GetMapping("/findCustomer/{accountID}")
    public Customer findCustomer(@PathVariable int accountID){
        return customerManager.stream().filter(Customer.ACCOUNT_ID.equal(accountID)).findFirst().get();
    }
}

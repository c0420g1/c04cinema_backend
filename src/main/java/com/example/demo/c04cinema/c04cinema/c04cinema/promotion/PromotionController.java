package com.example.demo.c04cinema.c04cinema.c04cinema.promotion;

import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.promotion.generated.GeneratedPromotionController;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PromotionController extends GeneratedPromotionController {
    @Autowired
    CustomerManager customerManager;
//    CẬP NHẬT LẠI ĐIỂM CU  STOMERPOINT
    @PatchMapping ("/abc")
    public void updatePoint (@RequestParam String id,
                             @RequestParam String point){
//        TÌM RA CUSTOMER ĐỂ UPDATE POINT
        Customer customer = customerManager.stream().filter(Customer.ID.equal(Integer.parseInt(id))).findFirst().get();
//        UPDATE POINT CỦA CUSTOMER
        customer.setCurrentBonusPoint(Integer.parseInt(point));
        customerManager.update(customer);
    }
}

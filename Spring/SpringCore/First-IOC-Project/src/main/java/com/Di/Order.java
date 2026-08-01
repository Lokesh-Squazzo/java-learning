package com.Di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Order {
    Payment pay;

    public Order(@Qualifier("card") Payment pay) {
        this.pay = pay;
    }

//    public void setPay(Payment pay) {
//        this.pay = pay;
//    }

    void orderPlaced(){
        pay.checkPay();
        System.out.println("Payment Successful");
    }

}

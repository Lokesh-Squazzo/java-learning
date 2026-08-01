package com.Di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upi")
//@Primary
public class UpiPayment implements Payment{
    @Override
    public void checkPay() {
        System.out.println("Upi Payment done");
    }
}

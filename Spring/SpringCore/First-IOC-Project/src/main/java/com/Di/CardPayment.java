package com.Di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("card")
public class CardPayment implements Payment{
    @Override
    public void checkPay() {
        System.out.println("Card payment done");
    }
}

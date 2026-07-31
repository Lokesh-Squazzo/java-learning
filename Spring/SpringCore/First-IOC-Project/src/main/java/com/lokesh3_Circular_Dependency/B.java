package com.lokesh3_Circular_Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
    private A a;
//    public B(A a) {
//        this.a = a;
//    }

    void doSomething(){
        a.doAgainSomething();
        System.out.println("Yeah B did something");
    }

    void beforeMeUDoSomething(){
        System.out.println("Ya B did something before A");
    }

}

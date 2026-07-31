package com.lokesh3_Circular_Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    private B b;
//    public A(B b) {
//        this.b = b;
//    }

    void doAgainSomething(){
        b.beforeMeUDoSomething();
        System.out.println("A did something");
    }

    /*
    Here what happening is Class A is depended on B
    and B is depended on A.
    So IOC container not able to handle this, because
    it can't create obj of A because it needs B but when
    IOC tries to make obj of B then it requires A.
    So a circular ref. exception occur for Spring.
     */

    /*
    We resolve this by doing feild injection.
    Although this type of circular dependency type of code
    is considered as bad practice. So we actually avoid
    these types of scenarios.
    we simply add @Autowired to feild, and it creates empty
    reference, and do the dependency thing.
     */
}

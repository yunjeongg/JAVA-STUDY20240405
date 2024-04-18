package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {

    D() {
        super(100);

        super.f1 = 100;
//        super.f2 = 200;

        m1();
//        m2();
    }

    void test() {
        A a = new A();
//        f1 = 10; f2 = 30;
//        m1(); m2();
    }
}

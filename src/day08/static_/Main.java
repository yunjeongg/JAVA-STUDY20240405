package day08.static_;


import util.SimpleInput;

import static day08.static_.Count.*;
import static java.lang.System.*;
import static util.SimpleInput.input;
import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {


        // static 데이터는 객체생성 없이 접근 가능
        x = 20;

        m1();

        Count c1 = new Count();
        Count c2 = new Count();
        c1.m2();
        c2.m2();

        c1.y = 10;
        c2.y = 20;

        x = 99;
        x = 50;

        out.println("c1.x = " + x);
        out.println("c2.x = " + x);
        out.println("==================");
        out.println("c1.y = " + c1.y);
        out.println("c2.y = " + c2.y);


        Calculator redCal = new Calculator();
        Calculator blueCal = new Calculator();

        Calculator.calcArea(5);

        redCal.paint("빨강");
        blueCal.paint("파랑");


//        String name = input("이름:");

        double random = random();

        out.println();

        m1();


        out.println("=========================");

        out.println("국가: " + Person.nation);

        Person gap = new Person("갑돌리", 20);
        out.println(gap.name);
        out.println(gap.age);
        out.println(gap.nation);



    }
}

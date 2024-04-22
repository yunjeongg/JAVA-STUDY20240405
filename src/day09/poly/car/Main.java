package day09.poly.car;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};
        for (Car car : cArr) {
            car.accelerate();
        }

        Object[] sArr = {"abc", "def", 100, false, new Tucson()};

        System.out.println("=====================");

        Driver driver = new Driver();
        driver.drive(new Mustang());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("================");

        CarShop shop = new CarShop();

        double x = 10;
        int y = (int)x;


        // 객체타입에서 다운캐스팅의 전제조건:
        // 반드시 상속관계가 있어야 하며
        // 자식객체가 부모타입으로 업캐스팅 된 것만 내릴 수 있음
        // 즉, 부모객체를 자식타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        System.out.println("======================");

//        Mustang ccc = (Mustang) new Car();

//        Sonata mmm = (Sonata) new Mustang();

        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

        System.out.println("=================");

        driver.drive(new Sonata());


        Sonata sonata = new Sonata();
        sonata.accelerate();
    }
}

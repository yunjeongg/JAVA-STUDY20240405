package day07.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

        myCar.startStop();

        // 속도 0~200km 로만 제한
//        myCar.speed = 100;
        myCar.setSpeed(180);

        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        myCar.setMode('N');
        System.out.println("현재 변속 모드: " + myCar.getMode());

    }
}

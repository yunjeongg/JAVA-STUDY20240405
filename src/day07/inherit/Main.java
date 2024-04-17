package day07.inherit;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Computer com = new Computer();

        System.out.println("계산기로 구한 원의넓이: " + cal.calcAreaCircle(5));
        System.out.println("컴퓨터로 구한 원의넓이: " + com.calcAreaCircle(5));
    }
}

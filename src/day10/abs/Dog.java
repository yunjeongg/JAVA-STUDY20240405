package day10.abs;

public class Dog extends Pet {

    @Override
    public void walk() {

    }

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 먹어요~~");
    }

    public void sleep() {
        System.out.println("강아지는 마당에서 낮잠을 자요~~");
    }
}

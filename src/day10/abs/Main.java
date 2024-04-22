package day10.abs;

public class Main {

    public static void main(String[] args) {


        Pet myDog = new Dog();
        Dog myDog2 = new Dog();
        Pet myDog3 = new Dog();

        Pet myCat = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();
        Cat myCat4 = new Cat();

        GoldFish goldFish = new GoldFish();

        Pet[] petList = {myDog, myDog2, myCat, myCat2, myCat3, goldFish};

        for (Pet pet : petList) {
            pet.eat();
            pet.sleep();
        }
    }
}

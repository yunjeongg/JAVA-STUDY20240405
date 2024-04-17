package day04;

public class DogMain {

    public static void main(String[] args) {

        /*
            const choco = {
                dogName: '초코',
                age: 2,
                injection: true
            };
         */
        Dog choco = new Dog("초코");
        Dog poppy = new Dog("뽀삐");

        System.out.println("choco = " + choco);
        System.out.println("poppy = " + poppy);

        choco.petInfo();
        System.out.println("==================");
        poppy.inject();
        poppy.petInfo();
    }
}

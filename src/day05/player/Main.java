package day05.player;

public class Main {

    public static void main(String[] args) {

        Player parking = new Player("주차왕파킹");
        Player insultKing = new Player("욕설왕뻐킹");

        System.out.println("parking = " + parking);
        System.out.println("insultKing = " + insultKing);

        insultKing.attack(parking);
        parking.attack(insultKing);
        parking.attack(insultKing);
        parking.attack(insultKing);


        Player p1 = new Player("하하호호");
    }
}

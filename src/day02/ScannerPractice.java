package day02;


import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("- 상품의 가격: ");
        int price = Integer.parseInt(scanner.nextLine());

        System.out.print("- 상품의 수: ");
        int amount = Integer.parseInt(scanner.nextLine());

        int total = price * amount;

        System.out.println("------------------------");
        System.out.printf("상품 재고 총액: %d원\n", total);


    }
}

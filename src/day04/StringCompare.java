package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();
        String myName = "홍길동";

//        char[] nickName = {'축', '구', '감', '상'};
//        String nick = new String(nickName);
//        System.out.println("nick = " + nick);

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        if (myName.equals(inputName)) {
            System.out.println("두 문자열이 같다!");
        } else {
            System.out.println("두 문자열이 다르다!");
        }

        int a = 10;
        int b = 10;
        System.out.println(a == b);

        char c = 'A';
        char d = 'A';
        System.out.println(c == d);

        Dog e = new Dog();
        Dog f = new Dog();
        System.out.println(e == f);

    }
}

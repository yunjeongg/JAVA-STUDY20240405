package day01;


public class DataType {

    public static void main(String[] args) {

        // 1byte == 8bit
        // 1bit == 숫자 0이나 1을 저장할 수 있음
        // 0 1111111 =>   64 + 32 + 16 + 8 + 4 + 2 + 1 == 127
        // 1024byte == 1kb
        // 1024kb == 1mb
        byte a = 127;      // 1byte
        short b = 32767;   // 2byte
        int c = 2147483647;// 4byte
        long d = 214748364784328747L;// 8byte
        System.out.println(d);

        float e = 3.14328463235427F; // 4byte
        double f = 3.143274923742974;// 8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        boolean flag1 = false;
        boolean flag2 = 10 > 5;

        double random = Math.random();

        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

//        문자형 char : 2byte 0~65536
        char text = '하';
        System.out.println("text = " + text);

        // 문자열 : 문자 배열
        char[] hello = {'안', '녕', '하', '세', '요', '!'};
        System.out.println("hello = " + new String(hello));

        String hello2 = "안녕하세요";
    }
}

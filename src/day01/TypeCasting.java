package day01;

public class TypeCasting {

    public static void main(String[] args) {

        byte a = 100;  // 1byte
        int b = a;     // 4byte

        // 암묵적 형 변환
        System.out.println("b = " + b);

        // c: 0 0000000 00000000 00000011 11101000
        int c = 1000; // 4
        // 명시적 형 변환
        // d: 1 1101000
        // 0010111
        // -> 1의보수 : + 1
        // 0000001
        // 0011000  => 16 + 8 = 24
        byte d = (byte) c;   // 1
        System.out.println("d = " + d);

        int k = 50;   // 4byte
        double j = k; // 8byte
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int) m;
        System.out.println("n = " + n);

        // 암묵적 형변환 -> upcasting (promotion)
        // 명시적 형변환 -> downcasting
        // => 데이터 손실을 일으킬 수 있음.
        int v = 100;
        double z = 5.5;

        // 타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅한다.
        double result = v * z;

        float f1 = 3.14F;
        double f2 = 5.5;
        double v1 = f1 - f2;

        int s = 10;
        double o = 5;
        int r2 = (int) (s * o);
        System.out.println("r2 = " + r2);


        // int보다 작은 사이즈를 가진 타입은 연산시 결과가 자동으로 int로 캐스팅됨
//        char b1 = 'A'; // 65
//        char b2 = 'C'; // 67

        byte b1 = 100;
        byte b2 = 50;

        int r3 = b1 + b2;
        System.out.println(b1 + b2);

        char cc = 'A';
        int plusNum = 3;
        char r4 = (char) (cc + plusNum); // D
        System.out.println("r4 = " + r4);

    }
}

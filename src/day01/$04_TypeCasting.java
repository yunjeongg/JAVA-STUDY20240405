package day01;

public class $04_TypeCasting {
    public static void main(String[] args) {

        // 두 변수의 타입이 동일할 경우 한쪽 변수값을 다른쪽 변수에 복사해서 저장할 수 있다.
        int a = 10; // int 타입 변수 a 에 정수 10 저장
        int b = a; // int 타입 변수 b에 int 타입 a 의 값을 복사해서 저장


        // 만약 두 변수의 타입이 다르다면 어떻게 해야 할까?
        /* - 타입은 마치 그릇과 같다.
        큰 그릇에 작은 그릇의 물을 모두 옮겨담을 수 있지만
        작은 그릇에는 큰 그릇의 물을 모두 옮겨담지 못하고 넘쳐버린다.

        변수의 타입도 큰 타입에는 작은 타입의 값을 손쉽게 옮겨담을 수 있지만
        작은타입에 큰 타입의 값을 모두 넣으려고 하면 손실이 생기게 된다.
        */

        // 1. 자동 타입 변환 , 암묵적 형 변환 (upcasting, promotion)
        // 자동 타입 변환은 값의 허용범위가 큰 타입의 변수에 허용범위가 작은 타입이 저장될 때 발생한다.

        // 타입 허용 범위
        // byte < short < int < long < float < double

        // 큰 허용 범위 타입 = 작은 허용 범우 타입

        byte c = 100;  //
        int d = c;     // int 타입에 byte 타입의 값 저장 -> 자동 타입 변환

        // 정수타입이 실수타입으로 저장될 경우에는 무조건 자동 타입 변환이 일어난다.
        // 실수타입은 정수타입보다 허용범위가 더 크기 때문이다.
        long longValue = 50000000000000000L;
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println("floatValue: " + floatValue); // 4.9999999E16
        System.out.println("doubleValue: " + doubleValue); // 5.0E16

        // char 타입의 경우 int 타입으로 자동 타입 변환되면 유니코드 값이 저장된다.
        char charValue = 'A';
        int intValue = charValue;
        short shortValue = (short) charValue;

        System.out.println("intValue: " + intValue); // 65

        // char 타입은 byte 타입으로 자동 타입 변환될 수 없다.
        // 왜냐하면 char 타입의 허용범위는 음수를 포함하지 않지만 byte 는 음수를 포함하기 때문이다.


        // 강제 타입 변환 , 명시적 형 변환 (downcasting)
        // 작은 허용 범위 타입의 변수에는 큰 허용 범위 타입의 값을 자동 타입 변환할 수 없다.
        // 그렇다면 큰 허용 범위 타입을 작은 허용 범위타입으로 나눠서 담을 수 있는 만큼만 강제로 저장해야 되는데
        // 이것을 강제타입변환(casting) 이라고 한다.

        // 타입 허용 범위
        // byte < short < int < long < float < double

        // 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용범위 타입
        int intNum = 10;
        byte byteNum = (byte) intNum;

        System.out.println("byteNum = " + byteNum); // 10

        // 실수타입을 정수타입으로 변환할 때는 자동변환되지 않기 때문에 강제 타입변환을 해야한다.
        // 이 경우 소숫점은 버려지고 정수만 저장된다.
        double doubleNumber = 3.14;
        int intNumber = (int) doubleNumber;

        System.out.println("intNumber : " + intNumber); // 3

        // 정수 연산에서의 자동 타입 변환
        // int 타입보다 작은 타입(byte, short)은 연산결과가 int 로 나오기 때문에
        // 연산결과를 변수에 저장할 때는 int 변수에 저장해야 한다.
        byte byteA = 10;
        byte byteB = 20;

        int result = byteA + byteB;

        System.out.println("result : " + result);

        // 정수 연산식에서 모든 변수가 int 타입으로 변하는 것은 아니다. 연산되는 타입 중
        // 허용범위가 큰 타입으로 변환되어 연산이 수행된다.
        byte byteC = 10;
        int intC = 20;
        long longC = 30;

        long longResult = byteC + intC + longC;
        // 연산되는 세 타입의 변수 타입 중 long 이 가장 크기 때문에
        // byte 와 int 타입 변수가 먼저 long 으로 변환된 후 연산이 시작된다.
        System.out.println("longResult = " + longResult); // 60

        // 실수 연산에서의 자동 타입 변환
        // 실수 타입 변수(float, double) 끼리 연산할 경우 연산결과가 double 로 나오기 때문에
        // 연산결과를 변수로 저장할 때 double 에 저장해야 한다.
        float floatA = 1.5f;
        double doubleA = 2.5;

        double doubleResult1 = floatA + doubleA;
        System.out.println("doubleResult1 : " + doubleResult1);
        
        // 실수타입과 정수타입을 연산해도 결과는 double 로 나온다.
        int intB = 10;
        double doubleB = 1.5;

        double doubleResult2 = intB + doubleB;
        // intB 의 타입이 double 로 먼저 변환된 후 doubleB 와 연산됨
        System.out.println("doubleResult2 = " + doubleResult2); // 11.5
        
        // 만일 꼭 작은타입으로 연산을 해야 한다면?
        // 먼저 큰 타입을 강제변환시킨 후 연산을 해야한다.
        int intD = 20;
        double doubleD = 3.5;

        int intResult = intD + (int)doubleD;
        System.out.println("intResult = " + intResult); // 23
        
        // 정수타입과 정수타입을 나누기 해서 소숫점이 나오는 경우는?
        // 정수타입은 연산결과가 정수타입만 나오기 때문에 소수점은 버려진다.
        int intE = 10;
        int intF = 3;

        int intResult1 = intE / intF;
        System.out.println("intResult1 = " + intResult1); // 3

    }
}

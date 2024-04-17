package day02;

import java.util.Arrays;

public class ArrayBasic01 {

    public static void main(String[] args) {
        // 배열 (Array)
        // 배열은 같은 타입의 데이터를 하나의 변수에 저장하는 자료구조이다.
        // 같은 데이터 유형의 변수를 여러 개 선언해야 하는 불편함을 줄이기 위해 사용한다.

        // 1. 배열은 동종모음 구조이다. 같은 데이터 타입끼리만 모여있을 수 있다.
        // (자바스크립트와 달리 한 배열안에 숫자, 문자, 논리 등등 혼합할 수 없음)
        // (숫자는 숫자끼리배열, 문자는 문자끼리 배열)

        // 2. Java 에서 배열은 고정된 크기로 선언되며, 크기를 변경할 수 없다.

        // 배열의 선언과 초기화
        // 배열 변수를 선언하는 방법은 다음과 같다.
        // 타입[] 변수이름;
        int[] number; // 숫자타입 배열 number 선언


        // 배열변수를 선언한 후 배열객체를 생성해서 실제 값이 저장될 공간을 형성한다.
        int[] arr = new int[5]; // 배열객체의 크기 5

        // 배열객체가 생성된 후 내부를 보면 배열이 비어있는 것이 아닌
        // 그 배열타입의 기본값으로 초기화가 이미 진행되어 있다.
        System.out.println(Arrays.toString(arr)); //[0, 0, 0, 0, 0];

        // 배열을 생성만 하고 값을 넣지 않으면
        // Java 가 각 타입의 기본값으로 미리 값을 넣어놓는다.
        // 기본값: 정수 0, 실수 0.0, 논리 false, 문자(char): 공백, 기타: null
        byte[] bArr = new byte[3];
        double[] dArr = new double[6];
        boolean[] blArr = new boolean[4];
        String[] sArr = new String[5];

        System.out.println(Arrays.toString(bArr));
        System.out.println(Arrays.toString(dArr));
        System.out.println(Arrays.toString(blArr));
        System.out.println(Arrays.toString(sArr));
        System.out.println(bArr.length);

        // 배열객체 생성 후 값을 저장할 수 있다.
        // 값을 저장할 때는 인덱스를 통해 저장할 수 있다.
        arr[0] = 65;
        arr[1] = 88;
        arr[2] = arr[0];
        arr[3] = (int) 3.14;
        arr[4] = 100;
        // arr[5] = 77; // 배열의 인덱스를 초과하기 때문에 에러뜸

        // 위와 같이 선언, 생성, 값 지정을 따로 할 수도 있지만 한번에 저장할 수도 있다.
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열변수명.length
        // length 를 사용해 배열의 길이를 파악할 수 있다.
        System.out.println(arr.length); // 5


        // 배열의 사용
        // 배열에 값을 저장할 때 인덱스를 사용했는데, 값을 꺼낼 때도 인덱스를 사용한다.
        System.out.println(numbers[0]); // 1
        System.out.println(numbers[1]); // 2

        // 인덱스를 사용하지 않고 배열변수 자체를 출력하면 배열변수의 주소값이 나온다.
        System.out.println(numbers);

        // 배열은 객체타입이기 때문이다.
        // Java 에서 변수는 Stack(스택)영역에 저장되고 해당 변수의 배열은 Heap(힙)영역에 저장된다.
        // Stack 영역은 작기 때문에 배열의 변수이름을 저장하고
        // 넓은 Heap 영역에 해당 변수의 배열들을 저장한다.

        // 그리고 Stack 에 저장된 변수에 해당 배열의 Heap 주소값을 적어주어
        // 주소를 통해 Heap 영역의 배열에 접근할 수 있도록 구성된다.

        // 해당 배열의 내부를 문자열 형태로 확인하고 싶을 때 Arrays.toString() 사용한다.
        System.out.println(Arrays.toString(numbers));
        System.out.println("======================");


        // 배열의 순회
        // 배열의 요소를 반복적으로 처리해야 할 때 for 문을 사용할 수 있다.
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("배열의 %d번째 데이터: %d\n", i + 1, numbers[i]);
        }

        // for-each 문 (향상된 for 문)
        // 인덱스를 사용하지 않고 배열 내부의 요소를 전체참조할 수 있게 도와준다.
        String[] week = {"월", "화", "수", "목", "금", "토", "일"};

        // for 문
        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
        }
        System.out.println("======================");

        // for-each 문 // 단축키 : iter
        // 변수 day 로 week 의 요소들이 하나씩 전달되며 반복문 실행
        // 더 이상 전달될 요소가 없을경우 반복문 종료
        for (String day : week) {
            System.out.println(day);
        }

        // for-each 문의 장점
        // 반복문의 제어변수와 인덱스변수의 선언이 필요없어 코드가 간결해진다.
        // 반복문을 돌리는 동안 요소의 추가나 삭제와 같은 구조적 변화가 없다면
        // for 문보다 빠르다.

        // for-each 문의 단점
        // 요소에 접근할 수는 있지만 인덱스 정보는 알 수 없다.
        // 범위를 세밀하게 지정할 수 없다.
        // 요소를 삭제할 수 없다. (이건 컬렉션 자료형에서 파악 예정)


        // 여기부터 다시보기


        // 만약 배열변수 선언과 동시에 값을 초기화한다면
        // new Type[] 생략 가능
//        String[] pets = {"멍멍이", "짹짹이", "콩수니"};
//        pets = new String[]{"zzz", "fff"};
//
//        static int[] getNumbers () {
//            return new int[]{50, 30, 10};
//        }



    }
}

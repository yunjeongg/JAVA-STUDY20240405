package day02;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {
        // 배열의 삽입
        // 기본 배열이 있고
        int[] arr = {10, 50, 90, 100, 150};

        // 그 배열에 66을 추가하고 싶은데
        int newNumber = 66;

        // 2번 인덱스 위치에 삽입하고 싶다면?
        int targetIndex = 2;

        // 50 과 90 사이에 66을 삽입!

        // 1. 기존 배열보다 사이즈가 1개 더 큰 배열 생성한다.
        int[] temp = new int[arr.length + 1];

        // 2. for 문을 사용해 기존데이터를 새 배열에 복사한다.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 삽입이라는 것은 삽입 위치에 위치한 데이터부터 뒤로 1칸씩 이동하는 것이다.
        // 이동 순서는 끝에서부터 시작해야 한다.
        // 10, 50, 90, 100, 150,0 // 복사 후 temp 배열 상태
        // 10, 50, 90, 100, 150, 150
        // 10, 50, 90, 100, 100, 150
        // 10, 50, 90, 90, 100, 150

        // temp[5] = arr[4];
        // temp[4] = arr[3];
        // temp[3] = arr[2];

        // temp[i] = arr[i-1];

        // i는 기존배열의 길이 5; i는 삽입하고 싶은 인덱스보다 크다
        for (int i = arr.length; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

        // 4. 새로운 데이터를 새로운 배열 삽입하고 싶은 인덱스자리에 저장
        // 새 배열 2인덱스에 66을 넣겠다
        temp[targetIndex] = newNumber;

        // 5. 주소값 이전
        arr = temp; temp = null;

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("temp: " + Arrays.toString(temp));

    }
}

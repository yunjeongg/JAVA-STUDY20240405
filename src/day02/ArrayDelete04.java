package day02;

import java.util.Arrays;

public class ArrayDelete04 {

    public static void main(String[] args) {
        // 배열의 삭제
        // 자바의 배열은 크기가 고정이기 때문에 자체적으로 줄일 수 없고
        // 삭제기능을 지원하지 않는다.

        // 단, 알고리즘을 통해 삭제를 구현할 수 있다.
        int[] numbers = {1, 3, 5, 7, 9};

        // 1. 일단 삭제 될 데이터가 몇 번째 인덱스인지를 구한다.
        int targerIndex = 2; // 2번째 인덱스를 삭제하겠다.

        // 삭제하고자 하는 인덱스를 기준으로 잡고
        // 뒤에 있는 값을 앞으로 한 칸씩 땡긴다.
        // arr[2] = arr [3];
        // arr[3] = arr [4];

        // 반복작업이기 때문에 반복문을 사용할 수도 있다.
        for (int i = targerIndex; i <numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        // 여기까지 진행하면 현재 배열의 상태를 이렇다
        System.out.println(Arrays.toString(numbers)); // [1, 3, 7, 9, 9]

        // 이제 새로운 배열을 생성하는데
        // 기존 배열의 크기 5에서 삭제할 1개를 제외한 4개짜리로 생성한다.
        int[] temp = new int[numbers.length - 1];

        // 그리고 원본의 배열의 값을 새 배열의 인덱스에 맞춰 그대로 대입하면 된다.
        // temp[0] = numbers[0];
        // temp[1] = numbers[1];
        // temp[2] = numbers[2];
        // temp[3] = numbers[3];

        // 또는 반복작업이기 때문에 반복문을 사용해 한번에 대입할 수도 있다.
        for (int j = 0; j < temp.length; j++) {
            temp[j] = numbers[j];
        }

        // numbers 배열
        System.out.println("numbers 배열 " + Arrays.toString(numbers));
        // temp 배열
        System.out.println("temp 배열 " + Arrays.toString(temp));

        // 최종적으로 내가 원하는 것은
        // numbers 배열에서 2번째 인덱스만 삭제한 배열이었기 때문에
        // temp 배열의 주소값을 number 배열에 넘긴다.
        numbers = temp;
        System.out.println("numbers 배열 최종 " + Arrays.toString(numbers));

        // 할 일을 다 해 쓸모없게 된 temp 를 비워준다.
        temp = null;
        System.out.println("temp 배열 최종 " + Arrays.toString(temp));

    }
}

package day02;

import java.util.Arrays;

public class ArrayEdit03 {
    public static void main(String[] args) {
        // 배열의 수정
        // 배열 내부의 데이터를 수정할 때는 해당 인덱스에 접근하여 값을 적어주면 된다.
        String[] foods =  {"삼겹살", "족발", "피자", "햄버거"};
        foods[0] = "치킨";
        foods[2] = "탕수육";
        System.out.println(Arrays.toString(foods)); // [치킨, 족발, 탕수육, 햄버거]


        // 배열 인덱스 탐색
        // 수정하려는 데이터가 어디에 있는지 알아야 수정을 할 수 있다.
        // 예를들어 입력받은 데이터를 수정할 때,
        // 입력받는 값이 배열의 몇 번째에 위치하는지를 탐색할 수 있어야 수정이 가능하다.

        // 배열을 처음부터 끝까지 순회하면서 일치하는 값이 나올 때 까지 확인하면 된다.
        String[] fruits = {"바나나", "사과", "복숭아"};

        // 1번 방법
        boolean flag = false; // true 유무를 평가할 변수 생성

        for (int i = 0; i < fruits.length; i++) {
            if ("사과".equals(fruits[i])) {
                System.out.println("1번째 방법 " + i + "번에 있습니다.");
                flag = true; // 맞다면 flag true 로 변경
                break;
            }
        }
        if (!flag) { // flag 가 true 가 아니라면
            System.out.println("1번째 방법 " + "없는 과일입니다.");
        }

        // 2번 방법
        int i;
        for (i = 0; i <fruits.length; i++) {
            if ("사과".equals(fruits[i])) {
                System.out.println("2번째 방법 " + i + "번에 있습니다.");
                break;
            }
        }
        if (i == fruits.length) { // 마지막 인덱스 다음 까지 갔는데도 없다 == 없다
            System.out.println("2번째 방법 " + "없는 과일입니다.");
        }
    }
}

package day03;

import java.util.Arrays;
import java.util.Stack;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

//        pop();
        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();

    } // end main

    static void insert(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;
        String[] temp = copy(1);
        for (int i = temp.length; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
        temp[targetIndex] = newFoodName;
        foods = temp;
    }

    static void modify(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;
        foods[targetIndex] = newFoodName;
    }

    static boolean isOutOfBounds(int targetIndex) {
        return targetIndex < 0 || targetIndex > foods.length - 1;
    }

    static boolean include(String searchTarget) {
        return indexOf(searchTarget) != -1;
    }

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 사이즈를 조절해서 새 배열을 만드는 함수
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    // 기존 데이터를 복사하는 함수
    static String[] copy(int size) {
        // size를 조절한 배열 생성
        String[] temp = makeNewArray(size);

        int loopCount = (size >= 0) ? foods.length : temp.length;

        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }

    // foods배열에 데이터를 끝에 추가하는 함수
    static void push(String newFood) {
        String[] temp = copy(1);
        // 새 배열의 끝인덱스에 새 데이터 추가
        temp[temp.length - 1] = newFood;
        foods = temp;
    }

    // foods배열에서 특정 데이터의 인덱스를 반환
    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // foods배열에서 맨 끝데이터를 삭제하는 함수
    static void pop() {
        foods = copy(-1);
    }

    static void remove(String deleteTarget) {
        int index = indexOf(deleteTarget);
        if (index == -1) return;

        for (int i = index; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }


}

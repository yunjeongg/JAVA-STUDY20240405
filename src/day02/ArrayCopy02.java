package day02;

import java.util.Arrays;

public class ArrayCopy02 {

    public static void main(String[] args) {
        // 배열의 복사
        // 새 배열을 만든 후 이전 배열을 바로 대입하는 것은
        // 안의 내용을 복사하는 것이 아닌 그 배열의 주소만 복사하는 것이다.
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};
        // String[] petsCopy = pets; // 배열 복사가 아니라 배열 주소복사

        // 그렇기 때문에 배열의 복사를 하고자 한다면
        // 새 배열을 만든 후 그 배열의 크기를 복사하고자 하는 원본의 크기로 만들어준 후
        String[] petsCopy = new String[pets.length];

        // for 문을 돌려서 각각의 인덱스로 대입해줘야 복사가 된다.
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        System.out.println("원본 pets = " + Arrays.toString(pets));
        System.out.println("복사본 petsCopy = " + Arrays.toString(petsCopy));
        System.out.println("==============================================");
        // 복사 후 원본에 수정을 가해도 원본만 수정되고 복사본에는 적용되지 않는다.
        pets[1] = "냥냥이"; // 복사 후 원본 수정

        System.out.println("수정한 원본 pets = " + Arrays.toString(pets));
        System.out.println("복사본 petsCopy = " + Arrays.toString(petsCopy));
    }
}

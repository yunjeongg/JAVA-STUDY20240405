package day03;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int korScore = 77;
        int engScore = 100;
        int mathScore = 99;

        int[] scoresKim = {korScore, engScore, mathScore};
        int[] scoresPark = {100, 22, 56};
        int[] scoresHong = {40, 90, 80};

        // 2차원 배열 : 배열 안의 요소가 또다시 배열인 형태
        int[][] classScores = { scoresKim, scoresPark, scoresHong };

        /*
            {
                {77, 100, 99},
                {100, 22, 56},
                {40, 90, 80}
            }
         */
        System.out.println(classScores.length);
        System.out.println(classScores[0] == scoresKim);
        System.out.println(Arrays.toString(classScores[1]));
        System.out.println(classScores[2][1]);

        System.out.println(Arrays.toString(classScores));
        System.out.println(Arrays.deepToString(classScores));

        System.out.println("=====================");

        System.out.println("2차원배열의 2번 인덱스 주소: " + classScores[2]);
        System.out.println("scoresHong의 주소: " + scoresHong);

        System.out.println("=============================");
        // 2차원 배열의 순회
        for (int i = 0; i < classScores.length; i++) {
            for (int j = 0; j < classScores[i].length; j++) {
                System.out.printf("%d ", classScores[i][j]);
            }
            System.out.println();
        }

        // js: for ~ of, java : enhanced for loop, iteration, foreach
        System.out.println("=====================");

        for (int[] scores : classScores) {
            for (int n : scores) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }

        System.out.println("================");

        int[][] arr2by3 = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][] arr4by5 = new int[4][5];
        for (int[] ints : arr4by5) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }


    }
}

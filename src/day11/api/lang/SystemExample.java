package day11.api.lang;

public class SystemExample {

    public static void main(String[] args) {

        // 프로그램의 실행시간 체크
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);

        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "abc";
        }

        long end = System.currentTimeMillis();
        long time = end - start; // 실행에 걸린 시간
        System.out.println("time = " + time / 1000.0 + "초");
    }
}

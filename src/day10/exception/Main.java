package day10.exception;

public class Main {

    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

//        try {
//            int n = te.convert("550!@");
//            System.out.println("n = " + n * 20);
//        } catch (NumberFormatException e) {
//            System.out.println("djfskfdsjkfjsf");
//        }


        LoginUser user = new LoginUser("abc1234", "1234");

        try {
            user.loginValidate("abc12343", "1234");
        } catch (InvalidLoginInputException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력
        }


    }
}

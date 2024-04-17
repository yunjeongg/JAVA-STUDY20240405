package day07;

class 심장 {
    String 좌심실;
    String 좌심방;
}
class 개인정보 {
    public int 나이;
    double 양안시력;
    double 키;
    private String 카드비밀번호;
}

class 사회 {
    사람[] 사람들;

    void 사회생활() {
        사람들 = new 사람[] {new 사람(), new 사람()};
//        사람들[0].심장 = new 심장();
    }
}

public class 사람 {

    private 심장 내심장;
    개인정보 내정보;
}

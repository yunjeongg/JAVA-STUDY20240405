package day05.player;

import day04.Dancer;

public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자는 생성자 내부에서 또다른 생성자를 호출할 수 있다.
    public Player() {
        this("이름없는캐릭터", 1, 50);
        System.out.println("1번 생성자 호출!");
    }

    // 생성자: 객체가 만들어질때 초기에 어떤값을 가질지를 정하는 곳
    Player(String nickName) {
        // this()로 다른 생성자를 부를때는 생성자당 1번씩만 가능
        // 그리고 가장 첫줄에 써야 함
        this(nickName, 1, 50);
        System.out.println("2번 생성자 호출!");
    }

    public Player(String nickName, int level) {
        this(nickName, level, 999);
        System.out.println("3번 생성자 호출!");
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("4번 생성자 호출!");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
        this.info();
    }

    void info(Player this) {

    }

    // 메서드
    void attack(Player target) {

        System.out.println("this = " + this);
        System.out.println("target = " + target);

        // 맞은 player의 체력을 10 감소시킬 것임
        target.hp -= 10;
        // 때린 player의 체력을 3 감소시킴
        this.hp -= 3;

        System.out.printf("%s님이 %s님을 공격했습니다\n", this.nickName, target.nickName);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);
    }
}

package day09.poly.casting;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 100;
        child.p1 = 200;

        child.method1();
        child.method2();

        Parent parent = new Parent();
        parent.p1 = 500;
        parent.method1();


        Child castingChild = new Child();
        castingChild.p1 = 100;
        castingChild.c1 = 300;
        castingChild.method1();
        castingChild.method2();

        Parent[] pArr = {castingChild};
        Parent pp = castingChild;
    }
}

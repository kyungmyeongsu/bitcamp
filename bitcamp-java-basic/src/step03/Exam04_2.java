package step03;

class A {}

public class Exam04_2 {
    class B {}

    public static void main(String[] args) {
        class C {}
    }

    public void m1() {
        A ref1;
        B ref2;
        Car ref3;  //컴파일 오류!
    }
}
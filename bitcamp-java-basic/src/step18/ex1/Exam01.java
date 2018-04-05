// Reflection API : 클래스 로딩
package step18.ex1;

class A {
    static int i;
    static void m() {i = 100;}
    static {
        System.out.println("A 클래스 로딩!");
    }
}

public class Exam01 {

    public static void main(String[] args) throws Exception {
        // 클래스 로딩
        // => 클래스가 로딩 되어 있지 않다는 조건
        // 1) 클래스의 스태틱 멤버를 사용할 때
        // 2) new 명령을 사용하여 인스턴스를 생성하려 할때
        // 3) Class.forName()을 이용하여 임으로 클래스를 로딩 할때
        //
        // 클래스 로딩과정에서 하는 일
        // => static 변수를 준비한다.
        // => 스태틱 블록을 실행한다.

        //A.i = 100; // 클래스 로딩 확인!
        //A.m(); // 클래스 로딩 확인!
        //new A(); // 클래스 로딩 확인!
        Class.forName("step18.ex1.A");
        
        //A obj = null; // 레퍼런스 선언은 클래스 로딩과 상관 없다.
        //A[] arr;
        //arr = new A[100];
    }

}

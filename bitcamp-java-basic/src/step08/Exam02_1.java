package step08;

public class Exam02_1 {
    static class A {
        static void m1() {
            System.out.println("m1()");
        }
        void m2() {
            System.out.println("m2()");
        }
    }
    
    public static void main(String[] args) {
        A.m1(); //OK!
        
        //A.m2(); //컴파일 오류!
        
        A obj1 = new A();
        
        obj1.m1(); // OK! 그런데, 이렇게 하지 말라!
                   // 물론 "클래스 메서드"를 인스턴스 주소를 사용하여 호출할 수 있지만,
                   // 다른 개발자가 그냥 "인스턴스 메서드"인 줄 착각할수 있기 때문에,
                   // 이렇게 호출하지 말기를 권고한다.
        obj1.m2(); // OK!
        
        A obj2 = null;
        obj2.m2(); // 컴파일은 OK! 실행은 오류!
                   // 왜? obj2 변수에 들어있는 인스턴스 주소가 무효하기 때문이다.
    }
}

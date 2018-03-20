package step08;

public class Exam03_1 {
    static class A {
        int value;
        
        static void m1() {
            // 클래스 메서드는 인스턴스 주소 없이 호출되기 떄문에
            // 인스턴스 주소를 받는 내장 변수가 없다.
            //this.value = 100; //컴파일 오류!
        }
        void m2() {
            // 인스턴스 메서드는 인스턴스 주소가 있어야 호출되기 때문에
            // 인스턴스 주소를 받을 변수가 내장 되어야 한다.
            this.value = 100;
        }
        
        void m3() {
            // 인스턴스 변수를 사용할때 this를 생략할 수 있다.
            //this.value = 200;
            value = 200;
        }
        
        void m4(int value) {
            // 로컬 변수의 이름이 인스턴스 이름과 같을 경우
            // this를 붙이지 않으면 로컬 변수를 가리킨다.
            value = 200; // 로컬 변수이다.
            this.value = 300; // 인스턴스 변수이다.
            // 따라서 로컬변수가 아닌 인스턴스 변수를 가리 키고 싶으면  this를 붙여야한다.
        }
    }
    public static void main(String[] args) {
        A.m1();
        
        A obj1 = new A();
        
        obj1.m2();
        
        obj1.m1();
        
        A obj2 = new A();
        
        obj2.m2();

    }

}

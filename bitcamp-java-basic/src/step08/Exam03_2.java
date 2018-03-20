// 인스턴스와 인스턴스 변수, 인스턴스 메서드
package step08;

public class Exam03_2 {
    static class Calculator {
        // new 명령을 실행하면, 다음 변수 선언이 실행되어 Heap에 메모리를 만든다.
        int result;
        
        public void plus(int value) {
            this.result += value;
        }
        
        public void minus(int value) {
            this.result -= value;
        }
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        
        c1.plus(123);
        
        c2.minus(30);
    }

}

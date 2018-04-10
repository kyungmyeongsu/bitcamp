// 예외 처리 문법을 적용하기 전 - 리턴값을 이용한 오류 알림
package step21.ex1;

public class Exam01_1 {
    public static void main(String[] args) {
        int result = Calculator.compute("+", 100, 200);
        System.out.println(result);
    }
}

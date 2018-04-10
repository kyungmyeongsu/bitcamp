// 예외처리 문법을 적용하기 전 - 리턴 값으로 오류여부를 알려준다.
package step21.ex1;

public class Calculator {
    public static int compute(String op, int a, int b) {
        switch (op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default:
            return -1;
        }
    }
}

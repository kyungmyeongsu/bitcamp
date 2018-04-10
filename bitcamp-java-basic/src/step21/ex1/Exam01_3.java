// 예외 처리 문법을 적용하기 전
package step21.ex1;

public class Exam01_3 {
    public static void main(String[] args) {
        int result = Calculator2.compute("#", 100, 200);
        
        if (result == -1212121212) {
            System.out.println("유효하지 않은 연산자 입니다!");
        } else {
            System.out.println(result);
        }
        
        result = Calculator.compute("-", 6, 7);
        
        if (result == -1212121212) {
            System.out.println("유효하지 않은 연산자 입니다!");
        } else {
            System.out.println(result);
        }
        
        result = Calculator2.compute("+", -2078654356, 866533144);
        if (result == -1212121212) {
            System.out.println("유효하지 않은 연산자 입니다!");
        } else {
            System.out.println(result);
        }
        
    }
}

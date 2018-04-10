// 예외 처리 문법을 적용한 후 - 메서드가 던지는 정보를 받는다.
package step21.ex2;

public class Exam01_4 {
    public static void main(String[] args) {
        
        try {
            // 예외를 던질 수고 있는 메서드를 호출할 때는 try 블록 안에서 호출한다.
            int result = Calculator3.compute("#", 100, 200);
            System.out.println(result);
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        
        try {
            int result = Calculator3.compute("+", -2078654356, 866533144);
            System.out.println(result);
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

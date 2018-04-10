// 예외처리 - 개념
// => 메서드를 실행하는 중에 예외가 발생했을 때 호출자에게 알려주는 문법
// => 메세드를 호출하는 중에 예외를 받았을 떄 처리하는 문법
// => 예외 처리 문법의 의미
//    1) 메서드 실행중에 예외 상황을 만났을 떄 리턴 값으로 알려주는 방식으로 한계를 극복하기 위해
//    2) 예외가 발생하더라도 시스템을 멈추지 않고 적절한 조치를 취한 후 계속 실행하기 위해
package step21.ex3;

public class Exam01 {
    
    static void m() {
        throw new RuntimeException("예외가 발생했습니다!");
    }
    
    public static void main(String[] args) {
        
        // 예외를 받았을 때 처리하는 문법
        try {
            m();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("시스템을 종료합니다.");
    }
}

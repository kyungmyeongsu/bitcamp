// RuntimeException 예외 던지고 받기
package step21.ex4;

public class Exam03 {
    static void m1() {
        // RuntimeException 예외를 받을 경우
        // try ~ catch ~ 예외를 처리하지 않으면
        // 자동으로 상위 호출자에게 던진다.
        m2();
    }
    static void m2() {
        // RuntimeException 예외를 받을 경우
        // try ~ catch ~ 예외를 처리하지 않으면
        // 자동으로 상위 호출자에게 던진다.
        m3();
    }
    static void m3() {
        // RuntimeException 예외를 받을 경우
        // try ~ catch ~ 예외를 처리하지 않으면
        // 자동으로 상위 호출자에게 던진다.
        m4();
    }
    static void m4() {
        // RuntimException을 상위 호출자에게 전달할 때는 
        // 굳이 메서드 선언부에 지정하지 않아도 된다.
        throw new RuntimeException("m4()에서 예외 발생!");
    }
    
    public static void main(String[] args) {
        try {
            m1();
            
        } catch (RuntimeException e) {
            // m4()에서 발생된 예외가 여기까지 도달한다.
            System.out.println(e.getMessage());
        }
        
        // RuntimeException 계열의 예외를 던지를 메서드를 사용할 때는
        // 그 호출 경로에 있는 모든 메서드에 굳이 throws 문장을 선언할 필요가 없다.
        // 예외를 처리하고 싶은 곳에서
        // catch 블록으로 받아 처리하면 된다.
        // 즉 중간에 끼어 있는 메서드를 만들때 throws문장을 선언하지 않아서 편하다!
        // => 스텔스처럼 조용히 예외를 전달한다.
    }

}
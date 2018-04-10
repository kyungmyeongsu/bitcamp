// 예외 던지기 - 예외 상황을 호출자에게 알려주기
package step21.ex3;

public class Exam02_2 {
    
    static void m() throws Throwable {
        throw new RuntimeException();
    }
    
    static void m2() {
        throw new RuntimeException(); 
    }
    
    public static void main(String[] args) {
        
    }
}

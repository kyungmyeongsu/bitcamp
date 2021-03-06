// 예외 처리 후 마무리 작업 - try-with-resources
package step21.ex3;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam06_4 {
    
    static class A {}
    
    static class B implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("B 클래스의 자원을 해제하였습니다.");
        }
    }
    
    static void m() throws Exception{
        try (
                // A 클래스는 AutoCloseable 구현체가 아니기 때문에 여기에 선언할 수 없다.
                //A obj = new A(); // 컴파일 오류!
                
                B obj2 = new B();
            ) {
            System.out.println("try 블록 실행...");
            
        }
        
    }
    
    public static void main(String[] args) throws Exception{
        m();
    }
}

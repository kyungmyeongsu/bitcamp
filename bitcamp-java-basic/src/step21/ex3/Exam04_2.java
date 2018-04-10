// 던지는 예외 받기 - 책임을 상위 호출자에게 위임
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_2 {
    
    static void m(int i) throws Exception, RuntimeException, SQLException, IOException {
        if (i < 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2)
            throw new SQLException();
        else 
            throw new IOException();
    }
    
    public static void main(String[] args) throws Exception {
        // 예외를 처리하고 싶지 않다면 이전 호출자에게 책임을 떠넘길 수 있다.
        m(1);
    }
}

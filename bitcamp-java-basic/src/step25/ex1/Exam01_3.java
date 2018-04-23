// JDBC 프로그래밍 개요 - JDBC 드라이버 타입과 준비
package step25.ex1;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드 및 설정
// 1) 직접 설정하기
// - java-basic/lib 폴더 생성
// - c:\Program Files (x86)\MySQL\Connector J x.x\mysql-connect-java-x.x.jar 복사
// - java-basic\lib 폴더에 붙여넣기
public class Exam01_3 {
    public static void main(String[] args) throws Exception{
        // 1) JDBC 드라이버 로딩
        new com.mysql.cj.jdbc.Driver();
        
        java.sql.Driver driver = DriverManager.getDriver("jdbc:mysql:");
        
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
        // 등록 되지 않은 드라이버를 요구해봐라!
        //driver = DriverManager.getDriver("jdbc:oracle:"); //예외 발생!
    }
}

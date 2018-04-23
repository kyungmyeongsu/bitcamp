// JDBC 프로그래밍 개요 - JDBC 드라이버 타입과 준비
package step25.ex1;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드 및 설정
// 1) 직접 설정하기
// - java-basic/lib 폴더 생성
// - c:\Program Files (x86)\MySQL\Connector J x.x\mysql-connect-java-x.x.jar 복사
// - java-basic\lib 폴더에 붙여넣기
public class Exam01_2 {
    public static void main(String[] args) throws Exception{
        // 1) JDBC 드라이버 로딩
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
        // MySQL 최근 드라이버는 위의 클래스응 사용하라고 권고 하고있다.
    }
}

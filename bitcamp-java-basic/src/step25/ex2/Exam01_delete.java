// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : delete
package step25.ex2;

import java.sql.DriverManager;

public class Exam01_delete {
    public static void main(String[] args) throws Exception{
        // 1) JDBC 드라이버 로딩
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        
        // 2) DBM에 연결하기
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106","1111");
        System.out.println("DBMS와 연결됨!");
        
        // 3) SQL문을 서버에 보낼 객치를 얻는다.
        //    - 리턴 값
        java.sql.Statement stmt = con.createStatement();
        
        // 4) Statement 객체를 사용하여 DBMS에 SQL문을 보낸다.
        int count = stmt.executeUpdate(
                "delete from ex_board where bno=12");
        System.out.printf("%d 개 삭제 성공!", count);
        
        stmt.close();
        con.close();
    }
}

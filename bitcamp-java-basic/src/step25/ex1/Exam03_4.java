// JDBC 프로그래밍 개요 - DBMS에 SQL문 보내기 : select
package step25.ex1;

import java.sql.DriverManager;

public class Exam03_4 {
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
        java.sql.ResultSet rs = stmt.executeQuery(
                "select bno,titl,cont,rdt from ex_board");
        
        // 5) ResultSet 객체를 사용하여 서버에서 select의 결과 한 레코드(row)를 가져온다.
        while (rs.next()) {
            System.out.printf("%d,%s,%s,%s\n", 
                    rs.getInt("bno"), 
                    rs.getString("titl"), 
                    rs.getString("cont"), 
                    rs.getDate("rdt"));
        }
            
        rs.close();
        stmt.close();
        con.close();
    }
}

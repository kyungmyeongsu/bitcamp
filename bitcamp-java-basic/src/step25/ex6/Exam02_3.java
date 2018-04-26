// Mybatis - SQL에 파라미터로 일반 객체 전달하기
package step25.ex6;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Exam02_3 {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex6/mybatis-config06.xml");
        
        SqlSessionFactory factory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        
        SqlSession sqlSession = factory.openSession();
        
        // Board 객체에 값을 저장하여 전달하기
        Board board = new Board();
        board.setTitle("제목이래요!");
        board.setContent("내용이래요!");
        
        int count = sqlSession.insert("BoardMapper.insertBoard", board);
        System.out.println(count);
        
        // mybatis에서는 autocommit이 기본으로 false이다.
        sqlSession.commit();
        
        sqlSession.close();
    }

}








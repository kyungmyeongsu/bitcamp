// Mybatis - 클래스 별명 지정하기
package step25.ex5;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// mybatis 설정 파일에서 fully-qualified class name을 사용하는 대신에
// 짧은 이름
public class Exam02_1 {

    public static void main(String[] args) throws Exception {
        // mybatis 설정 파일을 읽을 도구를 준비한다. 
        // => Resources의 getResourceAsStream() 메서드는
        //    파라미터에 지정한 파일 경로를 CLASSPATH에서 찾는다.
        //    그리고 그 파일을 읽을 수 있는 InputStream 도구를 리턴한다.
        // => 개발자가 mybatis-config.xml 파일의 전체 경로를 지정하지 않아도 되기 때문에
        //    매우 편리하다. 
        // => 단 해당 파일은 CLASSPATH에 있어야 한다.
        InputStream inputStream = Resources.getResourceAsStream(
                "step25/ex5/mybatis-config02.xml");
        
        // mybatis 설정 파일을 가지고 Builder를 이용하여 
        // SqlSession 공장 객체를 생성한다.
        SqlSessionFactory factory = 
                new SqlSessionFactoryBuilder().build(inputStream);
        
        // SqlSession 공작 객체로부터 SqlSession 객체를 얻는다.
        SqlSession sqlSession = factory.openSession();
        
        // SqlSession 객체를 이용하여 SQL 맵퍼 파일에 작성한 SQL 문을 실행한다.
        // => SQL 문장 = 그룹명 + "." + SQL문장 아이디 
        List<Board> list = 
                sqlSession.selectList("BoardMapper.selectBoard");
        
        for (Board board : list) {
            System.out.printf("%d, %s, %s, %s\n", 
                    board.getNo(), 
                    board.getTitle(), 
                    board.getContent(),
                    board.getRegisteredDate());
        }
        
        sqlSession.close();
    }

}








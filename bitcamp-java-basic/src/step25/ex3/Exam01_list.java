// 게시물 관리 - 목록
package step25.ex3;

import java.util.List;

public class Exam01_list {
    public static void main(String[] args) throws Exception{
        BoardDao boardDao = new BoardDao();
        
        try {
            List<Board> list = boardDao.list();
            
            for (Board board : list) {
                System.out.printf("%d,%s,%s\n", 
                        board.getNo(), 
                        board.getTitle(),
                        board.getRegisteredtDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

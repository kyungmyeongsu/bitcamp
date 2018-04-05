package step16.ex1;

import java.io.File;

public class Exam03_3 {

    public static void main(String[] args) throws Exception {
        File dir = new File("temp");
        
        if (dir.delete()) {
            System.out.println("temp디렉토리를 삭제하였습니다.");
        } else {
            System.out.println("temp디렉토리를 삭제할수 없습니다.");
        }
        
    }

}

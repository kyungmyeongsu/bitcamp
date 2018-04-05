package step16.ex1;

import java.io.File;

public class Exam03_2 {

    public static void main(String[] args) throws Exception {
        File dir = new File("temp2/a/b/c");
        if (dir.mkdir()) {
            System.out.println("temp2/a디렉토리를 생성하였습니다.");
        } else {
            System.out.println("temp2/a디렉토리를 생성할수 없습니다.");
        }
        
        if (dir.mkdirs()) {
            System.out.println("temp2/a디렉토리를 생성하였습니다.");
        } else {
            System.out.println("temp2/a디렉토리를 생성할수 없습니다.");
        }
    }

}

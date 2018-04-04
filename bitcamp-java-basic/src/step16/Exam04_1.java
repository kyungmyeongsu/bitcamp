package step16;

import java.io.File;

public class Exam04_1 {

    public static void main(String[] args) throws Exception {
        File file = new File("temp2/a/test.txt");
        
        if (file.createNewFile()) {
            System.out.println("test.txt파일을 생성하였습니다.");
        } else {
            System.out.println("test.txt파일을생성할수 없습니다.");
        }
        
    }

}

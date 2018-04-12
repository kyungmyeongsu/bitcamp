//  - 파일 복사 및 시간 측정
package step22.ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam03_2 {
    public static void main(String[] args) throws Exception{
        BufferdInputStream in = new BufferdInputStream("temp/jls8.pdf");
        BufferdOutputStream out = new BufferdOutputStream("temp/jls8_4.pdf");
        
        int b;
        
        long startTime = System.currentTimeMillis(); // 밀리초
        
        while ((b = in.read()) != -1) {
            out.write(b);
        }
        
        long endTime = System.currentTimeMillis();
        
        System.out.println(endTime - startTime);
        
        in.close();
        out.close();
    }
}

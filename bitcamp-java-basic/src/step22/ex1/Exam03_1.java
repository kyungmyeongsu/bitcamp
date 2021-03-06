// Byte Stream - 바이트 배열의 특정 부분을 출력하기
package step22.ex1;

import java.io.FileOutputStream;

public class Exam03_1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream out = new FileOutputStream("temp/test1.data");
        
        byte[] bytes = new byte[] {0x7a, 0x6b, 0x5c, 0x4d, 0x3e, 0x2f, 0x30};
        
        out.write(bytes, 2, 3); // 2번 데이터 부터 3 바이트를 출력한다.
        
        out.close();
        
        System.out.println("데이터 출력 완료!");
    }
}

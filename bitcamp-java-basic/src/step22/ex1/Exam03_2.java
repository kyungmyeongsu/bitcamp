// Byte Stream - 바이트 배열의 특정 위치에 저장하기
package step22.ex1;

import java.io.FileInputStream;

public class Exam03_2 {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("temp/test1.data");
        
        // 바이트들을 저장할 배열을 준비한다.
        // => 이렇게 임시 데이터를 저장하기 위해 만든 바이트 배열을 보통 "버퍼(buffer)"라 한다.
        byte[] buf = new byte[100];
        
        // read(버퍼의 주소, 저장할 위치, 읽을 바이트 개수)
        // => 리턴값은 실제 읽은 바이트의 개수이다.
        int count = in.read(buf, 10, 4); // 4바이트를 읽어 10번 방부터 저장한다.
        
        in.close();
        
        System.out.printf("%d\n", count);
        for (int i = 10; i < (count + 10); i++) 
            System.out.printf("%x ", buf[i]);
        
        System.out.println();
    }
}

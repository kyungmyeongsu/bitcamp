// Java I/O API 사용하기 - Serializable
package step22.ex9;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam04_1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test9_5.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufOut);
        
        
        Score s = new Score();
        s.name = "홍길동";
        s.kor = 99;
        s.eng = 80;
        s.math = 92;
        s.compute();
        
        out.writeObject(s);
        // Member3 객체를 serialize 하여 바이트 배열로 출력할 때 
        // 버전 번호도 함께 출력된다. 
        // Member3의 버전 번호는 100이다. 
        
        out.close();
    }

}

// 용어 정리!
// Serialize   : 객체 ===> 바이트 배열   (marshalling 이라고도 부른다.)
// Deserialize : 바이트 배열 ===> 객체   (unmarshalling 이라고도 부른다.)
// 










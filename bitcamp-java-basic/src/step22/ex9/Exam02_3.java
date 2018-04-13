package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam02_3 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test9_3.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        
        Member2 member = (Member2)in.readObject();
        
        
        in.close();
        
        System.out.println(member);

    }

}

// 용어 정리!
// Serialize : 객체 ===> 바이트 배열      (marshalling 이라고도 부른다.)
// Deserialize : 바이트 배열 ===> 객체  (unmarshalling 이라고도 부른다.)
//
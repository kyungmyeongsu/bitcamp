package step22.ex9;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Exam02_2 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test9_3.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufOut);
        
        Member2 member = new Member2();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        out.writeObject(member);
        
        out.close();
        
    }

}

// 용어 정리!
// Serialize : 객체 ===> 바이트 배열      (marshalling 이라고도 부른다.)
// Deserialize : 바이트 배열 ===> 객체  (unmarshalling 이라고도 부른다.)
//
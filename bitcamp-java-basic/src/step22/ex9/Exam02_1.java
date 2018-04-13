package step22.ex9;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Exam02_1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("temp/test9_3.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufOut);
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        
        out.writeObject(member);
        
        
        out.close();
        
    }

}

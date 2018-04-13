package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam03_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test9_4.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
        
        // 실행하기 전 해야할 일:
        // 1) test9_4.data 파일을 읽기 전에
        //    Member3 클래스에 전화번호를 저장할수 있는 인스턴스 변수를 추가하라!
        Member3 member = (Member3)in.readObject();
        
        in.close();
        
        System.out.println(member);

    }

}


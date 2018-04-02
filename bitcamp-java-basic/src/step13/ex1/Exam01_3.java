// 제네릭 - 문법 정리
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_3 {
    public static void main(String[] args) {
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("홍길동", 20));
        
        //list.add(new String("Hello"));
        //list.add(new Integer(100));
        //list.add(new HashSet());
        
        ArrayList<Member> list2 = new ArrayList<>();
        
        ArrayList<Member> list3;
        list3 = new ArrayList<>();
        
        //ArrayList<> List4; //컴파일 오류!
    }
    
}

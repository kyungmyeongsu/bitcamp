// 제네릭 - 사용 후
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_2 {
    public static void main(String[] args) {
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("홍길동", 20));
        
        //list.add(new String("Hello"));
        //list.add(new Integer(100));
        //list.add(new HashSet());
        
        Member member = list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
    }
    
}

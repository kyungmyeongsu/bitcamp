// indexOf()의 사용
package step12.ex1;

import java.util.ArrayList;

import step12.ex1.Exam02_3.Member;

public class Exam03_3 {

    public static void main(String[] args) {
        Member s1 = new Member("홍길동", 20);
        Member s2 = new Member("임꺽정", 30);
        Member s3 = new Member("유관순", 16);
        Member s4 = new Member("임꺽정", 30);

        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        
        //Member 클래스는 equals()를 오버라이딩 하지 않았다.
        // 따라서 같은 값을 갖더라고 인스턴스가 다르면 equals()의 검사 결과도 false가 될것이다.
        System.out.println(list.indexOf(s4)); // -1
    }
    
    static void print(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}

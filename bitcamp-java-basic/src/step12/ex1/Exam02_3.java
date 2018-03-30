// java.util.ArrayList의 contains()의 동작원리 
package step12.ex1;

import java.util.ArrayList;

public class Exam02_3 {
    // hashCode()와 equals()를 오버라이딩하지 않는다.
    static class Member {
        String name;
        int age;
        
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public String toString() {
            return String.format("[%s,%d]", this.name, this.age);
        }
    }

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
        
        // Member클래스느 hashCode()와 equals()를 오버라이딩하지 않았다.
        // 따라서 같은 값을 갖더라고 인스턴스가 다르면 equals()의 검사 결과도 false가 될것이다.
        // 그래서 contains()로 s4객체와 같은 객체가 잇는지 검사해보면,
        // 같은 객체가 없다고 나온다.
        System.out.println(list.contains(s4));
    }
    
    static void print(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}

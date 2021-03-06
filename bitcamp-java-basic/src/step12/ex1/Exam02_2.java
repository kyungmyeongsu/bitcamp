// java.util.ArrayList와 비교 : contain() 와 hashCode(), equals()관계
package step12.ex1;

import java.util.ArrayList;

public class Exam02_2 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("bbb"); // s2 != s4

        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        
        // java.util.ArrayList의 contains()메서드는
        // 목록에 들어있는 객체를 찾을 때 equals()로 두 객체가같은지 비교한다.
        // equals()리턴 값이 true라면
        // 같은 객체가 있다면 뜻으로 true를 리턴하고, 못찾았다면 false
        System.out.println(list.contains(s4));
    }
    
    static void print(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}

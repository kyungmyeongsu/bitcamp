// 제네릭 - 사용전
package step13.ex1;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Member("홍길동", 20));
        list.add(new String("Hello"));
        list.add(new Integer(100));
        list.add(new HashSet());
        
        // 값 꺼내기
        // 객체의 값을 꺼낼때는 보통 해당 클래스로 형변환 한다음에 사용한다.
        // 왜? get() 메서그의 리턴 타입이 Object이기 때문이다.
        Member member = (Member) list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
        // => 이렇게 값을 꺼낼 때마다 그 객체의 원래 클래스로 형변환해야하는 것은 매우번거롭다.
    }
    
}

// java.util.HashMap - 사용자 정의 데이터 타입을 key로 사용할 경우
package step12.ex6;

import java.util.HashMap;

public class Exam01_2 {
    
    static class MyKey {
        String major;
        int no;
        
        public MyKey(String major, int no) {
            this.major = major;
            this.no = no;
        }

        @Override
        public String toString() {
            return "MyKey [major=" + major + ", no=" + no + "]";
        }
        
    }
    
    public static void main(String[] args) {
        Member v1 = new Member("홍길동", 20);
        Member v2 = new Member("임꺽정", 30);
        Member v3 = new Member("유관순", 16);
        Member v4 = new Member("안중근", 30);
        Member v5 = new Member("윤봉길", 25);
        
        MyKey k1 = new MyKey("컴공", 1);
        MyKey k2 = new MyKey("컴공", 2);
        MyKey k3 = new MyKey("컴공", 3);
        MyKey k4 = new MyKey("컴공", 4);
        MyKey k5 = new MyKey("컴공", 5);
        
        HashMap map = new HashMap();
        
        // 값을 저장할 떄 key로 사용할 객체를 지정한다.
        // 보통 key객체로 String 객체를 많이 사용한다.
        // => 물론 어떤 객체라도 key로 사용할 수 있다.
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        
        System.out.println(map.get(k1));
        System.out.println(map.get(k2));
        System.out.println(map.get(k3));
        System.out.println(map.get(k4));
        System.out.println(map.get(k5));
        
        // 같은 값은 갖지만 인스턴스가 다른 key
        MyKey k6 = new MyKey("컴공", 3); // k3와 같은 값을 갖는다.
                                         // 하지만 인스턴스는 다르다!
        
        System.out.println(map.get(k6));
        // k6로 값을 찾으면 없다고 나온다.
        // 이유?
        // => HashMap에서 값을 찾을 떄 key가 같아야 한다.
        //    key객체가 다르더라도  hashCode()의 리턴 값이 같고,
        //    equals()의 리턴 값이 true이면 두개의 key는 같다고 간주한다.
        //
        
    }

}

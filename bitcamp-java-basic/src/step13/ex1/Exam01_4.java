// 제네릭 - 응용
package step13.ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exam01_4 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("aaa", "문자열");
        map.put(new Integer(100), new Member("홍길동", 20));
        
        HashMap<Object,Object> map2 = new HashMap<>();
        map2.put("aaa", "문자열");
        map2.put(new Integer(100), new Member("홍길동", 20));
        
        HashMap<String,Member> map3 = new HashMap<>();
        //map3.put("aaa", "문자열"); // 컴파일 오류!
        //map3.put(new Integer(100), new Member("홍길동", 20)); // 컴파일 오류!
        map3.put("aaa", new Member("홍길동", 20));
        
        // 제네릭을 지정하면 값을 꺼냏 때 형변환할 필요가 없다.
        Member m = map3.get("aaa");
    }
    
}

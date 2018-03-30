// HashMap vs Hashtable
package step12.ex6;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class Exam03_1 {
    
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(null, "홍길동"); // null을 key로 사용할수 있다.
        map.put("s01", null);
        
        Hashtable table = new Hashtable();
        //table.put(null, "홍길동"); // 실행오류! key가 null이 될수 없다.
        //table.put("s02", null);
    }

}

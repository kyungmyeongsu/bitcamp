package step05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam04_4 {
    
    public static void main(String[] args) {
        //배열은 같은 타입의 값만 보관 할수있지만
        //컬렉션은 다른 타입의 값도 보관할 수 있다.
        //
        //배열은 크기가 고정 되지만,
        //컬렉션은 크기가 가변적이다.
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(3.14f);
        list.add(true);
        list.add(365);

        for (int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i));

        System.out.println("--------------------------------");

        //for 문에 컬렉션도 적용 할 수 있다.
        //for (변수선언 : 컬렉션객체) 문장;
        for (Object value : list)
            System.out.println(value);
    }
}
package step12.ex5;

import java.util.Iterator;
import java.util.Stack;

public class Exam02_3 {

 public static void main(String[] args) {
     String s1 = new String("aaa");
     String s2 = new String("bbb");
     String s3 = new String("ccc");
     String s4 = new String("ddd");
     String s5 = new String("eee");
     
     Stack stack = new Stack();
     stack.add(s1);
     stack.add(s2);
     stack.add(s3);
     stack.add(s4);
     stack.add(s5); 
     
     Iterator 컬렉션에서값을꺼내주는객체 = stack.iterator();
     
     // => 값을 꺼내주는 객체를 통해 값을 꺼낸다.
     while (컬렉션에서값을꺼내주는객체.hasNext()) {
         // => 꺼낼 데이터가 있다면 값을 꺼내달라소 명령한다.
         System.out.print(컬렉션에서값을꺼내주는객체.next() + ", ");
     }
 }
 
 
 
}


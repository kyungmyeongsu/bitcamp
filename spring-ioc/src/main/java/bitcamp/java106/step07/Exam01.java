// 프로퍼티 에디터 - 
package bitcamp.java106.step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step07/application-context-01.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        // 실행오류 발생!
        // 이유?
        // java.lang.String 값을 java.lang.Date 객체로 변환할 수 없어서
    }

}

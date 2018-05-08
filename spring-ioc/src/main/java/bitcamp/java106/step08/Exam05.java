// 의존 객체 주입 자동화하기 - 생성자를 이용하여 의존 객체 주입
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam05 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-05.xml");
        
        System.out.println(iocContainer.getBean("c1"));
    }

}

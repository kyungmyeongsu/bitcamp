// IoC 컨테이너
package bitcamp.java106.step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = null;
        
        iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step01/application-context.xml");
        
        Car car = (Car)iocContainer.getBean("c1");
        System.out.println(car);
        
        // 존재하지 않는 자바 객체를 꺼내려한다면?
        // => 예외발생!
        car = (Car)iocContainer.getBean("c2");

    }

}

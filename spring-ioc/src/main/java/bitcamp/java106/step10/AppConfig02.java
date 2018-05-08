package bitcamp.java106.step10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // AppConfig02 클래스가 스프링 설정 정보를 갖고 있는 클래스임을 선포한다.
               // 그러면 AnnotationConfigApplicationContext 에서
               // 이 클래스
public class AppConfig02 {
    @Bean 
    public Car car2() {
        Car c = new Car(null);
        c.setMaker("비트 자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    
    public Car car3() {
        Car c = new Car(null);
        c.setMaker("비트 자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
}

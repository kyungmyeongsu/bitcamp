package bitcamp.java106.step11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="bitcamp.java106.step11")
public class AppConfig01 {
    @Bean 
    public Car car2() {
        Car c = new Car(null);
        c.setMaker("비트 자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
}

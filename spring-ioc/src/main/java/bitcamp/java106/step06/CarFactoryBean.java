package bitcamp.java106.step06;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {
    String model;
    
    public CarFactoryBean() {
        System.out.println("CarFactoryBean() 호출됨.");
    }
    
    public void setModel(String model) {
        System.out.println("CarFactoryBean.setModel() 호출됨.");
        this.model = model;
    }
    
    @Override
    public Car getObject() throws Exception {
        System.out.println("CarFactoryBean.getObject() 호출됨.");
        Car c = new Car();
        switch (model) {
        case "티코":
            c.setMaker("대우자동차");
            c.setModel("Tico");
            c.setCc(890);
            return c;
        case "소나타":
            c.setMaker("현대자동차");
            c.setModel("Sonata");
            c.setCc(1980);
            return c;
        case "SM5":
            c.setMaker("르노삼성자동차");
            c.setModel("SM5");
            c.setCc(1990);
            return c;
        default:
            c.setMaker("비트자동차");
            c.setModel("자바휘웅");
            c.setCc(5000);
            return c;
        }
    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("CarFactoryBean.getObjectType() 호출됨.");
        return Car.class;
    }
    
    
}

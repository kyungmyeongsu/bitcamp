package step11.ex13;

public class Car {
    String model;
    String maker;
    int cc;
    int valve;
    
    // 외부에서 직접 인스턴스를 생성하는 것을 막기위해 생성자를 private으로 선언
    private Car() {}
    
    //
    public static Car create(String name) {
        Car c = new Car();
        
        switch (name) {
        case "티코" :
            c.model = "티코";
            c.maker = "대우";
            c.cc = 800;
            c.valve = 16;
            break;
        case "소나타":
            c.model = "소나타";
            c.maker = "현대자동차";
            c.cc = 1980;
            c.valve = 16;
            break;
         default:
             c.model = "모델S";
             c.maker = "테슬라";
             c.cc = 0;
             c.valve = 0;
        }
        return c;
    }
}

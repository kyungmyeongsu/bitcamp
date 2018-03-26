// 다형성 - 다형적 변수의 활용
package step11.ex09;

public class Exam04 {
    
    // Sedan과 Truck의 모델명과 cc를 출력하라!
    
    // 다형적 변수가 없다면?
    public static void printSedan(Sedan sedan) {
        System.out.printf("모델명: %s\n", sedan.model);
        System.out.printf("cc: %d\n", sedan.cc);
        System.out.println("-----------------------------");
    }
    
    public static void printTruck(Truck truck) {
        System.out.printf("모델명: %s\n", truck.model);
        System.out.printf("cc: %d\n", truck.cc);
        System.out.println("-----------------------------");
    }
    
    public static void printCar(Car car) {
        System.out.printf("모델명: %s\n", car.model);
        System.out.printf("cc: %d\n", car.cc);
        System.out.println("-----------------------------");
    }
    

    public static void main(String[] args) {
        Sedan car1 = new Sedan();
        car1.model = "티코";
        car1.cc = 800;
        
        Truck car2 = new Truck();
        car2.model = "타이탄II";
        car2.cc = 10000;
        
        printSedan(car1);
        
        //printSedan(car2); //컴파일 오류!
        
        printTruck(car2);
        
        printCar(car1);
        printCar(car2);
    }
}

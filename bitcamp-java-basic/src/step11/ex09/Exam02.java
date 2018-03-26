// 다형성 - 다형적 변수와 형번환
package step11.ex09;

public class Exam02 {

    public static void main(String[] args) {
        Vehicle v1 = new Sedan();
        
        // model과 capacity 변수는 원래 Vehicle 설계도에 있는 변수 이기 때문에
        // 당연히 레퍼런스를 통해 사용할 수 있다.
        v1.model = "티코";
        v1.capacity = 5;
        
        // 자바 컴파일러는 레퍼런스의 클래스를 보고 사용할 수있는 변수/메섣 인지 아닌지
        // 판단한다. 비록 v1 변수에 Sedan 객체의 주소가 들어있다 할지라도,
        // 실제들어있는 객체의 주소로 판단하지 않고 레퍼런스가 어떤 클래스냐에 따라 판단한다.
        /*
        v1.cc = 1980;
        v1.valve = 16;
        v1.sunroof = true;
        v1.auto = true;
        */
        
        // 그럼에도 불구하고 레퍼런스가 실제 가리키는 객체의 모든 메모리에 접근하고 싶은가?
        // => 형변환 하라!
        ((Sedan)v1).cc = 1980;
        ((Sedan)v1).valve = 16;
        ((Sedan)v1).sunroof = true;
        ((Sedan)v1).auto = true;
        System.out.printf("%s, %d, %d, %d, %b, %b\n", 
                v1.model, v1.capacity, 
                ((Sedan)v1).cc, ((Sedan)v1).valve, 
                ((Sedan)v1).sunroof, ((Sedan)v1).auto);
        
        
        Sedan s = (Sedan)v1;
        s.cc = 1980;
        s.valve = 16;
        s.sunroof = true;
        s.auto = true;
        System.out.printf("%s, %d, %d, %d, %b, %b\n", 
                v1.model, v1.capacity, 
                s.cc, s.valve, 
                s.sunroof, s.auto);
    }

}

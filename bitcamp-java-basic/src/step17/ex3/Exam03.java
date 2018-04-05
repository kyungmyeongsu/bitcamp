// non-static nested class == inner class 객체 생성
package step17.ex3;

public class Exam03 {
    
    int value;
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void test() {
        // 같은 인스턴스 메서드 안에서는 인스턴스 중첩 클래스(non-static 중첩 클래스, 
        // inner class)를 마음대로 사용할수 있다.
        Inner innerObj = new Inner();
        innerObj.m();
    }
    
    class Inner {
        public void m() {
            System.out.println(Exam03.this.value);
        }
    }
    
    
    public static void main(String[] args) {
        // 문제는 같은 클래스라도 스태틱 메서드에서 inner 클래스를 사용하려하거나,
        // 또는 다른 클래스에서 inner 클래스를 사용하려 할 때 문제가 발생한다.
        
        //Inner innerObj = new Inner(); // 컴파일 오류!
        // 왜 Inner 클래스를 사용 할수 없는가?
        // => 다음 메서드를 왜 사용할 수없는가를 따져봐라!
        
        //setValue(100); // 컴파일 오류!
        // => setValue()는 Exam03의 인스턴스 주소가 있어야 하기 때문이다.
        
        // 인스턴스 멤버(변수, 메서드, 중첩클래스) 사용법
        Exam03 obj = new Exam03();
        
        obj.setValue(200);
        
        Inner obj2 = obj.new Inner();
    }
}

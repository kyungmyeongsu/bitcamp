// non-static nested class == inner class
package step17.ex3;

public class Exam01 {
    
    int value;
    
    // => 인스턴스 메서드에서는 인스턴스 변수에 접근하할 수있다.
    // => 인스턴스 메서드는 this라는 내장 변수에 호출할때 받은
    public void setValue(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public static void main(String[] args) {
        Exam01 obj = new Exam01();
        obj.setValue(100);
        
        System.out.println(obj.getValue());
    }
}

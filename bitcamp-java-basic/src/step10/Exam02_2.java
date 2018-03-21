// Wrapper 클래스 - auto-boxing/auto-unboxing
package step10;

public class Exam02_2 {
    public static void main(String[] args) {
        int i1 = 100;
        
        Integer obj1 = new Integer(i1);
        
        Integer obj2 = new Integer(200);
        int i2 = obj2.intValue();
        
        Integer obj3 = i1;
        
        Integer obj4 = new Integer(300);
        int i3 = obj4;
    }
}

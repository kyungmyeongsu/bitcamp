package step18.ex3;

import java.lang.reflect.Method;

public class Exam05 {
    public static void plus(int a, int b) {
        System.out.printf("합계: %d\n", a + b);
    }
    
    public void minus(int a, int b) {
        System.out.printf("빼기: %d\n", a - b);
    }
    
    public static void main(String[] args) throws Exception{
        Class clazz = Exam05.class;
        
        Method m = clazz.getMethod("plus", int.class, int.class);
        
        m.invoke(null, 10, 20);
        
        m = clazz.getMethod("minus" , int.class, int.class);
        
        //m.invoke(null, 10, 20);
        Exam05 obj = new Exam05();
        m.invoke(obj, 10, 20);
    }
}

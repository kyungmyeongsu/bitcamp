// 캡슐화 - 응용
package step11.ex13;

import java.util.Calendar;

import step11.ex13.sub.C;

public class Exam02_3 extends C{
    

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal1 == cal2);
    }
}
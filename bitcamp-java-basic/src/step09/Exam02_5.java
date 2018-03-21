// 인스턴스 메서드와 클래스 메서드 활용 - Calender 클래스
package step09;

import java.util.Calendar;

public class Exam02_5 {

    public static void main(String[] args) throws Exception{
        
        //Calendar c = new Calendar();
        
        // 오늘 날짜 및 시간 정보를 저장한 객체를 만들어 리턴한다.
        // 그래고리안 달력을 사용한다.
        Calendar c = Calendar.getInstance();
        
        // 인스턴스 메서드 활용
        System.out.println(c.get(1)); //년도
        System.out.println(c.get(2) + 1); //월 (0 ~ 11)
        System.out.println(c.get(5)); //일
        System.out.println(c.get(7)); //요일
        System.out.println(c.get(4)); //그 달의 몇 번째 주
        System.out.println(c.get(10)); //시 (0~11)
        System.out.println(c.get(11)); //시 (24시)
        System.out.println(c.get(12)); //분
        System.out.println(c.get(13)); //초
        
        // 상수의  활용
        System.out.println(c.get(Calendar.YEAR)); //년도
        System.out.println(c.get(Calendar.MONTH) + 1); //월 (0 ~ 11)
        System.out.println(c.get(Calendar.DATE)); //일
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); //요일
        System.out.println(c.get(Calendar.WEEK_OF_MONTH)); //그 달의 몇 번째 주
        System.out.println(c.get(Calendar.HOUR)); //시 (0~11)
        System.out.println(c.get(Calendar.HOUR_OF_DAY)); //시 (24시)
        System.out.println(c.get(Calendar.MINUTE)); //분
        System.out.println(c.get(Calendar.SECOND)); //초
    }

}

// 스레드 그룹
package step24.ex2;

public class Exam02 {

    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        
        // 스레드는 그룹으로 묶일 수 있다.
        // 그룹 단위로 스레드를 시작시키고 멈출 수 있다.
        // 현재 스레드가 소속된 그룹을 알고 싶다면?
        ThreadGroup group = main.getThreadGroup();
        System.out.println("그룹명 = " + group.getName());
        
        //
    }

}

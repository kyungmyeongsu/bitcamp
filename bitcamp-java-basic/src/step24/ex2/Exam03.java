// 스레드 그룹에 소속된 스레드들
package step24.ex2;

public class Exam03 {

    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        
        // 스레드 그룹에 소속된 스레드 목록을 알고 싶다면?
        Thread[] arr = new Thread[100];
        int count = mainGroup.enumerate(arr, false);
        
        System.out.println("main 그룹에 소속된 스레드들:");
        for (int i = 0; i < count; i++) 
            System.out.println("   => " + arr[i].getName());
        
    }

}
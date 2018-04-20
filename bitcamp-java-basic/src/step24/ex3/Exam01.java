// 스레드 만들기 I - Thread를 상속 받기
package step24.ex3;

public class Exam01 {

    public static void main(String[] args) {
        // 스레드 정의하기
        // => java.lang.Thread
        class MyThread extends Thread {
            // 기존의 스레드에서 분기해서 새 스레드에서 실행하고 픈 코드가 있다면,
            // run()을 재정의하여 그 메서드에 해당 코드를 두어라!
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("===> " + i);
                }
            }
        }
        // 스레드 호출하기
        // => start()를 호출하여 기존 스레드에서 분리하여 스레드를 실행 시킨다.
        MyThread t = new MyThread();
        t.start();
        
        for (int i = 0; i <1000; i++) {
            System.out.println(">>>> " + i);
        }
    }
    
    

}

// 스레드 만들기 I - Thread를 상속 받기
package step24.ex3;

public class Exam02 {

    public static void main(String[] args) {
        
        class MyRunnable implements Runnable {
            
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("===> " + i);
                }
            }
        }
        
        Thread t = new Thread(new MyRunnable());
        t.start();
        
        for (int i = 0; i <1000; i++) {
            System.out.println(">>>> " + i);
        }
    }
    
    

}

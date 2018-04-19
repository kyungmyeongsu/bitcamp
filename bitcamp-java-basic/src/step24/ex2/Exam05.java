// 스레드 그룹의 부모 그룹
package step24.ex2;

public class Exam05 {

    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        ThreadGroup mainGroup = main.getThreadGroup();
        
        // 스레드 그룹의 부모 그룹을 알고 싶다면?
        ThreadGroup parentGroup = mainGroup.getParent();
        System.out.println(parentGroup.getName());
        
    }

}

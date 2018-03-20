// 초기화 블록 - 인스턴스 블록의 활용
package step08;

public class Exam06_2 {
    
    public static void main(String[] args) {
        Object obj1 = new Object();
            {
                System.out.println("인스턴스 블록...");
            }
    }
}

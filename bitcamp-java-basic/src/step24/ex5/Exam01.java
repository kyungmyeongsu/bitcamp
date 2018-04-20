// 동기화 처리 전
package step24.ex5;

public class Exam01 {

    public static void main(String[] args) {
        Account account = new Account("111-11-1111-111", 100_0000);
        
        ATM 강남 = new ATM("강남", account);
        ATM 서초 = new ATM("서초", account);
        ATM 부산 = new ATM("부산", account);
        ATM 대전 = new ATM("대전", account);
        ATM 광주 = new ATM("광주", account);
        
        강남.start();
        서초.start();
        부산.start();
        대전.start();
        광주.start();
        
        // 강남, 서초 등 여러개의 스레드가 
        // 같은 객체에 대해 메서드를 호출하여 동시에 값을 변경하려할 때
        // 서로 그 메모리의 값을 덮어 쓰는 문제 가 발생한다.
        // 이처럼 여러 스레드가 동시에 실행할 떄 문제가 발생하는 코드들을
        // "임계 구역(Critical Section; Critical Region)"이라 부른다.
        // 이 예제에서는 여러 스레드가 동시에 호출하고,
        // 같은 인스턴스의 변수 값을 변경하는 메서드인 "withdraw()"가
        // critical section이다.
        //
        // 해결책?
        // => 한번에 한 쓰레드만이 변수의 값을 변경하도록 접근을 제한하면 된다.
        // 주의!
        // => 동시에 여러 스레드가 같은 메모리에 대해 값을 조회할 때는 문제가 발생하지 않는다.
    }

}

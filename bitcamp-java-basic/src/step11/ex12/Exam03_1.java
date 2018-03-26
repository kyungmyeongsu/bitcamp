// 오버라이딩(overriding) - 응용 예 : equals()
package step11.ex12;

public class Exam03_1 {
    static class Member /*extends Object*/{
        String name;
        int age;
        public Member(String name, int age) {
            this.name = name;
            this.age =age;
        }
    }
    
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);
        
        if (m1 == m2) {
            System.out.println("m1 == m2");
        } else {
            System.out.println("m1 != m2");
        }
        
        System.out.println(m1.equals(m2));
        // 어? Member 클래스에 equals()를 정의한 적이 없는데 컴파일 오류가 발생하지 않네?
        // => 클래스를 만들 때 수퍼 클래스를 지정하지 않으면,
        //    자동으로 Object 를 상속받게 된다.
        //    따라서 자바의 모든 클래스는 Object의 자손이다.
        // => 그래서 자바의 모든 클래스는 Object의 모든 메서드를 사용할 수 있다.
        //    equals()는 Object로부터 상속받은 메서드중 하나이다.
        //
        // equals()는 String클래스에서 문자열 비교에 사용했던 메서드 이다.
        // 두문자 열이 같으면 true를 리턴했다.
        // 그런데 위의 실행 결과를 보면 m1과 m2가 비록 인스턴스는 다르지만
        // 내용이 같기 떄문에 true를 리턴할 것이라 예상했는데
        // 실제 리턴 갑슬 확인해보면 false 를 리턴한다.
        
    }
}
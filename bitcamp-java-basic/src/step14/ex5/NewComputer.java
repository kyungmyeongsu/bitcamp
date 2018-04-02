package step14.ex5;

public class NewComputer implements Computer{
    // 새 컴퓨터를 만들 떄는 기존 규칙만 따라도 되고,
    // => 즉 computer() 메서드만 구현해도 되고
    public void compute() {
        System.out.println("새 컴퓨터...");
    }
    
    public void touch() {
        System.out.println("오호라.. 터치가 되네. 이거 서피스 프로인가?");
    }
}

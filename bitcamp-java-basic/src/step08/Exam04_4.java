//생성자 - 생성자 호출 막기
package step08;

class X {
    // 생성자의 접근 범위를 private으로 설정라면 외부에서 접근 할 수 없기 때문에
    // 결국은 생성자를 호출 하지 못하는 상채로 만들 수 있다.
    private X() {
        System.out.println("X()");
    }
}

public class Exam04_4 {
    
    public static void main(String[] args) {
        X obj1;
        
        // 생성자의 접근이 막혀있기 때문에 생성자를 호출 할수 없다.
        // 따라서 new 명령으로 객체를 생성할수 없도록 만든다.
        //obj1 = new X(); //컴파일 오류!
    }
}


// 생성자?
// => 인스턴스(객체)를 생성한 후에 사용하기 전에 유요한 값으로 초기화 시킬 작업을 수행한다.
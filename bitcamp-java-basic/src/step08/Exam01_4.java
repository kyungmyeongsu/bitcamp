// 클래스 변수
package step08;

public class Exam01_4 {
    static class A {
        
        static int v1; 
        static boolean v2; 
    }

    public static void main(String[] args) {
        
        // 클래스 변수 사용법
        // 클래스명.스태틱변수명 = 값;
        A.v1 = 100;
        A.v2 = true;
        
        System.out.printf("%d %b\n",  A.v1,  A.v2);
    }

}


// 클래스 변수는 클래스가 로딩 될떄 딱 한 번 자동으로 생성되기 때문에
// 각각 구분되는 개별 데이터를 저장할 수 없다.
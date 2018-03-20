//특별한 인스턴스 메서드 - 생성자
package step08;

public class Exam04_1 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        Score() {
            System.out.println("Score()");
        }
        
        
        public void compute() {
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum / 3f;
        }
    }
    
    public static void main(String[] args) {
        // 생성자를 자동 호출하는 방법
        // => 인스턴스를 생성하는 new 명령에서 호출할 생성자의 파라미터 값을 지정하면 된다.
        // => 다음과 같이 파암터 값을 주지 않으면 기본 생성자를 호출하라는 뜻이 된다.
        Score s1 = new Score();
        
        // 생성자를 호출하지 않을 수 있는가?
        // => 컴파일 오류!
        //Score s2 = new Score;
        
        Score s3 = new Score();
    }
}

//생성자 - 파라미터를 받는 생성자
package step08;

public class Exam04_2 {
    
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        //생성자가 한 개라도 있으면 컴파일러는 기본 생성자를 만들어주지 않는다.
        Score(String name, int kor, int eng, int math) {
            System.out.println("Score(String,int,int,int)호출!");
            
            // 파라미터로 받은 값으 새로 만든 인스턴스 변수에 저장한다.
            // => 이렇게 생성자는 새로 만든 인스턴스 변수를 초기화 시키는 일을 한다.
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.compute();
        }
        
        
        public void compute() {
            this.sum = this.kor + this.eng + this.math;
            this.average = this.sum / 3f;
        }
    }
    
    public static void main(String[] args) {
        // Score 클래스에는 기본 생성자가 없기떄문에
        // 다음 문장은 컴파일 오류!
        //Score s0 = new Score();
        
        // Score 인스턴스를 만든 후에는 
        // 생성자를 호출할 때 그생성자의 파라미터 값을 주어야한다.
        Score s1 = new Score("홍길동", 100, 90, 77);
        Score s2 = new Score("임꺽정", 80, 88, 87);
        
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);
    }
}


// 생성자?
// => 인스턴스(객체)를 생성한 후에 사용하기 전에 유요한 값으로 초기화 시킬 작업을 수행한다.
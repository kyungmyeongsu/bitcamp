//생성자 - 파라미터를 받는 생성자
package step08;

public class Exam04_3 {
    
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
        
        Score(String name) {
            System.out.println("Score(String)");
            this.name = name;
        }
        
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
        Score s1 = new Score();
        Score s2 = new Score("유관순");
        Score s3 = new Score("홍길동", 100, 90, 77);
        
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.average);
    }
}


// 생성자?
// => 인스턴스(객체)를 생성한 후에 사용하기 전에 유요한 값으로 초기화 시킬 작업을 수행한다.
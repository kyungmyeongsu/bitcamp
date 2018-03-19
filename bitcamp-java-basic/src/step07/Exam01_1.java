//클래스 용도 - 사용자 정의 데이터 타입을 만들때 사용
package step07;

public class Exam01_1 {
    public static void main(String[] args) {
        Score score = new Score();

        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;

        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                score.name, score.kor, score.eng, score.math,
                score.sum, score.average);
    }
}

// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들때
//    - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
//    - 서로 관련된 기능을 
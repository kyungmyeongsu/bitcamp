//사용자 정의 데이터 타입 - 인스턴스 메서드

package step07;

public class ExamX_3 {
    public static void main(String[] args) {
        // 사용자 정의 데이터 타입의 값을 연산자를 사용하여 다뤄 보자!
        Score3 score = new Score3();

        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        
        //다음은 Score의 값을 다루는 연산자가 없을 때의 예이다.
        /*
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;
        */
        
        //다음은 Score의 값을 다루기위해 non-instance 메서드를 호출하는 예이다.
        // => non-instance 메서드 = static 메서드 = 클래스 메서드
        /*
        Score2.calculate(score);
        */
        
        score.calculate();

        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", 
                score.name, score.kor, score.eng, score.math,
                score.sum, score.average);
    }
}



// 사용자 정의 데이터 타입에서
// 인스턴스의 값을 다루는 연사나를 정의할 때는 
// 인스턴스 메서드로 만드는 거이 사용하기 편하다.

package step04;

public class Exam05_1 {
    public static void main(String[] args) {
        int age = 20;
        // (age > 18) ? System.out.println("성인이다."):System.out.println("미성년자이다.");  //컴파일 오류!

        String message = (age > 18) ? "성년" : "미성년";
        System.out.printf("나이 %d는(은) %s이다.\n", age, message);
       
    }
}
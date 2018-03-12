package step05;

public class Exam01_4 {
    public static void main(String[] args) {
        int age = 17;

        if (age < 19)
            System.out.println("미성년입니다.");

        if (age >= 19)
            System.out.println("성인입니다.");
        else
            System.out.println("미성년입니다.");

        /*
        else 
            System.out.println("컴파일 오류!");
        */

        /*
        if (age >= 19)
            System.out.println("성인입니다.");
        System.out.println("------------------------");
        else
            System.out.println("미성년입니다.");
        */

        if (age >= 19) {
            System.out.println("성인입니다.");
            System.out.println("------------------------");
        }
        else
            System.out.println("미성년입니다.");
    }
}
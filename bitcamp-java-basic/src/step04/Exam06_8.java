package step04;

public class Exam06_8 {
    public static void main(String[] args) {
        int i = 2;
        
        int result = ++i + ++i * ++i;

        System.out.println(result);

        // int x = ++100;  //컴파일 오류!
        // x = 100++;  //컴파일 오류!

        int y = 100;
        // ++y++;  //컴파일 오류!
        // (++y)++;  //컴파일 오류!
        // ++(y++);  //컴파일 오류!

        // 내가 해본거!!!
        int a = y++;
        a = a++;
        System.out.println(a);
    }
}
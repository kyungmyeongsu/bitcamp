// String - 문자열 비교
package step10;

public class Exam01_2 {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        
        if (s1.equals(s2)) 
            System.out.println("s1과 s2는 같다.");
        else
            System.out.println("s1과 s2는 다르다.");
        
        if (s1.equals(s3)) 
            System.out.println("s1과 s3는 같다.");
        else
            System.out.println("s1과 s3는 다르다.");

    }

}

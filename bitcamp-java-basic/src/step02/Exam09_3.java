package step02;

public class Exam09_3 {
    public static void main(String[] args) {
        
        int[] arr1;

        arr1 = new int[5];

        arr1[0] = 100;
        arr1[1] = 200;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        int a;
        // System.out.println(a); //컴파일 오류!

        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    }
}
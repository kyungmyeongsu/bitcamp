package step06;

public class Exam04_6 {

    static int sum(int value) {
        /*
        if (value == 1)
            return 1;
        */
        long a1, a2, a3, a4, a5, a6, a7, a8, a9,
             a11, a12, a13, a14, a15, a16, a17, a18, a19,
             a111, a112, a113, a114, a115, a116, a117, a118, a119;
        System.out.println(value);
        return value + sum(value -1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
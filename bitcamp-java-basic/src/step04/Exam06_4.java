package step04;

public class Exam06_4 {
    public static void main(String[] args) {
        int i = 2;
        int result = i++ + i++ * i++;

        System.out.printf("%d, %d\n", i, result);

    }
}
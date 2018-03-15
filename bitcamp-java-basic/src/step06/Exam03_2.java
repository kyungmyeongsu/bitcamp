package step06;

import java.util.Scanner;

public class Exam03_2 {

    static void swap(int[] arr) {
        System.out.printf("swap(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.printf("swap(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
    }
    public static void main(String[] args) {
        int[] arr = new int[] {100, 200};
        swap(arr);
        System.out.printf("main(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
    }
}
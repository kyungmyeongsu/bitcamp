package step05;

import java.util.Scanner;

public class Exam04_3 {
    
    public static void main(String[] args) {
        /*
        String[] names = new String[]
        names[1] = "홍길동";
        names[2] = "임꺽정";
        names[3] = "유관순";
        names[4] = "윤봉길";
        names[5] = "안중근";
        */
        // String[] names = new String[] {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
        String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};

        for (int i = 0; i < names.length; i++) 
            System.out.println(names[i]);

        System.out.println("--------------------------------");

        for (String name : names)
            System.out.println(name);

        /*
        String name2;
        for (name2 : names)  //컴파일 오류!
        System.out.println(name);
        */

    }
}
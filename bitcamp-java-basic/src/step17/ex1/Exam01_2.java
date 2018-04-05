package step17.ex1;

import java.io.File;
import java.io.FilenameFilter;


public class Exam01_2 {
    
    // 클래스 안에 정의 된 클래스를 "중첩 클래스(nested class)"라 한다.
    static class JavaFilter implements FilenameFilter{
        public boolean accept(File dir, String name) {
            if (name.endsWith(".java"))
                return true;
            return false;
        }
    }

    public static void main(String[] args) throws Exception{
        File dir = new File(".");
        
        JavaFilter javaFilter = new JavaFilter();
        String[] names = dir.list(javaFilter);
        
        for (String name : names) {
            System.out.println(name);
        }
    }

}

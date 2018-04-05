// 디렉토리에 들어있는 파일이나 하위 디렉토리 정보 알아내기
package step16.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Exam06_2 {
    
    static class JavaFilter implements FilenameFilter {

        @Override
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

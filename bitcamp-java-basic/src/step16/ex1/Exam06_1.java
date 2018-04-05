// 디렉토리에 들어있는 파일이나 하위 디렉토리 정보 알아내기
package step16.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Exam06_1 {
    
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
        
        File[] files = dir.listFiles(javaFilter);
        
        for (File file : files) {
            System.out.printf("%s %12d %s\n", file.isDirectory() ? "d" : "-", file.length(), file.getName());
        }
    }

}

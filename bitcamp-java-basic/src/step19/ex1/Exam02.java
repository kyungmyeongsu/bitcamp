// IoC 컨테이너 만들기 - 1) 특정 패키지의 파일 목록 알아내기
package step19.ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exam02 {

    public static void main(String[] args) {
        // 1) 패키지 경로 준비
        File packageDir = new File("C:\\Users\\MyeongSu\\git\\bitcamp\\bitcamp-java-basic\\bin\\step19\\ex1");
        
        // 2) 해당디렉토리에서 파일 목록을 가져오기
        List<File> files = findFiles(packageDir);
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("d %s\n", f.getName());
            } else {
                System.out.printf("- %s\n", f.getName());
            }
        }
    }
    
    static List<File> findFiles(File dir) {
        ArrayList<File> list = new ArrayList<>();
        File[] files = dir.listFiles();
        for (File f : files) {
            list.add(f);
        }
        return list;
    }

}

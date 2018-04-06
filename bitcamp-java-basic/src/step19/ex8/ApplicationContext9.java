// 객체를 저장 할때 클래스 이름으로 저장하고 클래스 이름으로 꺼낼수 있다.
package step19.ex8;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ApplicationContext9 {
    // 클래스 이름으로 객체를 저장할 수 있도록 Map을 사용한다.
    private HashMap<String,Object> objPool = new HashMap<>();
    
    public ApplicationContext9(String packageName) throws Exception{
        String path = packageName.replace(".", "/");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(path);
        File dir = new File(url.getPath());
        if (!dir.isDirectory())
            return;
        findClasses(dir, packageName);
    }
    
    private void findClasses(File dir, String packageName) throws Exception{
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || // 디렉토리 이거나
                        (pathname.getName().endsWith(".class") && // .class 파일인 경우 
                        !pathname.getName().contains("$"))) { // 단 중첩클래스는 제외
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            if (f.isDirectory()) {
                findClasses(f, packageName + "." + f.getName());
                continue;
            }
            
            String classname = f.getName();
            Class clazz = Class.forName(packageName + "." + classname.substring(0, classname.length() - 6));
            Object obj = createObject(clazz);
            if (obj != null)
                this.objPool.put(clazz.getName(), obj);
        }
    }
    
    private Object createObject(Class clazz){
        try {
            clazz.getConstructor();
            return clazz.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
    
    public Object getBean(String name) {
        return objPool.get(name);
    }
}





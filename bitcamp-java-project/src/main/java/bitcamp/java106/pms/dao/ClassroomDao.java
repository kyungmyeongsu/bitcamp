package bitcamp.java106.pms.dao;

import java.util.LinkedList;

import bitcamp.java106.pms.domain.Classroom;

public class ClassroomDao {
    private LinkedList<Classroom> collection = new LinkedList<Classroom>();
    
    public void insert(Classroom classroom) {
        this.collection.add(classroom);
    }
    
    public Classroom[] list() {
        Classroom[] arr = new Classroom[this.collection.size()];
        return this.collection.toArray(arr);
    }
    
//    private int count(String teamName) {
//        int cnt = 0;
//        for (int i = 0; i < this.collection.size(); i++) {
//            Classroom classroom = collection.get(i);
//            if (classroom.getTeam().getName().toLowerCase().equals(teamName.toLowerCase())) {
//                cnt++;
//            }
//        }
//        return cnt;
//    }
    
    
    public Classroom get(int classroomNo) {
        int index = this.getClassroomIndex(classroomNo);
        if (index < 0) {
            return null;
        }
        return collection.get(index);
    }
    
    public void update(Classroom classroom) {
        int index = this.getClassroomIndex(classroom.getNo());
        if (index < 0) {
            return;
        }
        collection.set(index, classroom);
    }
    
    
    public void delete(int classroomNo) {
        int index = this.getClassroomIndex(classroomNo);
        if (index < 0) {
            return;
        }
        collection.remove(index);
    }
     
    
    private int getClassroomIndex(int classroomNo) {
        for (int i = 0 ; i < collection.size() ; i++) {
            if (collection.get(i).getNo() == classroomNo) {
                return i;
            }
        }
        return -1;
    }
}

// ver 17 - 클래스 생성






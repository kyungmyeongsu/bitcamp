package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Task;

public class TaskDao {
    Task[] tasks = new Task[1000];
    int taskIndex = 0;
    
    public void insert(Task task) {
        task.setNo(taskIndex);
        this.tasks[this.taskIndex++] = task;
    }
    
    private int count(String teamName) {
        int cnt = 0;
        for (int i = 0; i < taskIndex; i++) {
            if (tasks[i] == null) continue;
            if (tasks[i].getTeam().getName().toLowerCase().equals(teamName)) {
                cnt++;
            }
        }
        return cnt;
    }
    
    public Task[] list(String teamName) {
        Task[] arr = new Task[this.count(teamName)];
        for (int i = 0, x = 0; i < taskIndex; i++) {
            if (tasks[i] == null) continue;
            if (tasks[i].getTeam().getName().toLowerCase().equals(teamName)) {
                arr[x++] = tasks[i];
            }
        }
        return arr;
    }
    
    public Task get(int i) {
        if (i < 0 || i >= taskIndex)
            return null;
        return tasks[i];
    }
    
    public void update(Task task) {
        tasks[task.getNo()] = task;
    }
    
    public void delete(int i) {
        tasks[i] = null;
    }
}

// ver 17 - 클래스 생성


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projects;

import java.util.HashSet;

/**
 *
 * @author ASUS
 */
public class Project {
    private int id;
    private String name;
    private HashSet<Task>tasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getTask() {
        return task;
    }
    
      public void AddTask(Task tasks){
        this.task.add(tasks);
        
    }

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new HashSet<>();
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", tasks=" + tasks + '}';
    }
      
      
}
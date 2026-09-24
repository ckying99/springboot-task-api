package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.Task;

@RestController
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public List<Task> getTasks(){
        return tasks;
    }
    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
      tasks.add(task);
      return task;
    }
    @PutMapping("/tasks/{id}")
    public Task editTask(@PathVariable("id") String id, @RequestBody Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = 
            if (tasks.get(i).getId().equals(id)){
                tasks.get(i).setTitle(task.title);
                break;
            }
        }
        task.setId(id);
        tasks.add(task);
        return task;
    }
    
}
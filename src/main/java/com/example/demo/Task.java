package com.example.demo;

public class Task {
    String id;
    String title;
    boolean done;
	public Task() {}

	public Task(String id, String title, boolean done){
        this.id = id;
        this.title = title;
        this.done = done;
    }
    // Getter
    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getStatus() {
        return this.done;
    }
    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setStatus(boolean status) {
        this.done = status;
    }

    
}

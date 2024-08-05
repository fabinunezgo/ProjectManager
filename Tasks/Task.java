/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import Comments.Comment;
import Users.User;
import java.util.ArrayList;

/**
 *
 * @author fabia
 */
public class Task {
    private int id;
    private String description;
    private boolean complete;
    private User user;
    private ArrayList<Comment>comment;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }
    
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Task(int id, String description,User user) {
        this.id = id;
        this.description = description;
        this.complete = false;
        this.user = user;
        this.comment = new ArrayList<>();
    }

    public Task() {
    this.complete = false;
    this.comment = new ArrayList<>();
    }
}

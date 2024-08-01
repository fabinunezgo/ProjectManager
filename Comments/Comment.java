/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import Users.User;

/**
 *
 * @author ASUS
 */
public class Comment {
    private int id;
    private User User;
    private String Comment;

    public Comment(int id, User User, String Comment) {
        this.id = id;
        this.User = User;
        this.Comment = Comment;
    }

    public Comment() {
    }
    
    

    public int getId() {
        return id;
    }

    public User getUser() {
        return User;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
    
    
}

package Entities;

import javax.persistence.*;

/**
 * Created by NickVeremeichyk on 8/1/15.
 */
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="age")
    private String age;

    public User(String username, String password) {
        this.username = username;
        this.age = password;
    }

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.age = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return age;
    }

    public void setPassword(String password) {
        this.age = password;
    }
}

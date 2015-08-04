package Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by NickVeremeichyk on 8/3/15.
 */
@Entity
@Table(name="workers")
public class Worker {
    @Id
    @Column(name="worker_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="worker_name")
    private String workerName;

    @ManyToOne
    @JoinColumn(name="department")
    private Department department;

    @ManyToMany
    @JoinTable(name="assossiations")
    private List<Worker> friendsList;

    public List<Worker> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<Worker> workerList) {
        this.friendsList = workerList;
    }

    public Worker() {

    }

    public Worker(String workerName, Department department) {
        this.workerName = workerName;
        this.department = department;
    }

    public Worker(String workerName) {
        this.workerName = workerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }
}

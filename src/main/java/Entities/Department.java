package Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by NickVeremeichyk on 8/3/15.
 */
@Entity
@Table(name="departments")
public class Department {
    @Id
    @Column(name="department_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<Worker> workerList;

    @Column(name="dep_address")
    private String departmentAddress;


    public Department() {
    }

    public Department(List<Worker> workerList, String departmentAddress) {
        this.workerList = workerList;
        this.departmentAddress = departmentAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }
}

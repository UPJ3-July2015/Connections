package Entities;

import javax.persistence.*;

/**
 * Created by NickVeremeichyk on 8/3/15.
 */
@Entity
@Table(name="spouse")
public class Spouse {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="sex")
    private String sex;

    @OneToOne
    @JoinColumn(name="spouse_id")
    private Spouse spouse;

    public Spouse(String name, String sex, Spouse spouse) {
        this.name = name;
        this.sex = sex;
        this.spouse = spouse;
    }

    public Spouse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Spouse getSpouse_id() {
        return spouse;
    }

    public void setSpouse_id(Spouse spouse_id) {
        this.spouse = spouse_id;
    }
}

package Main;

import Entities.Department;
import Entities.Spouse;
import Entities.Worker;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by NickVeremeichyk on 8/3/15.
 */
public class Connections {
    public static void main(String[] args) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("entityManager").createEntityManager();
        entityManager.getTransaction().begin();
//        Spouse spouse_1 = new Spouse("Nick", "mas", null);
//        Spouse spouse_2 = new Spouse("Sasha", "fem", spouse_1);
//        spouse_1.setSpouse_id(spouse_2);
//        entityManager.persist(spouse_1);
//        entityManager.persist(spouse_2);
        Department department = new Department(null, "Address1");
        Worker worker_1 = new Worker("Basic", department);
        Worker worker_2 = new Worker("Doddy", department);
        Worker worker_3 = new Worker("Ncik", department);
        Worker worker_4 = new Worker("Sasha", department);
        List<Worker> workerList = new ArrayList<Worker>();
        workerList.add(worker_1);
        workerList.add(worker_2);
        workerList.add(worker_3);
        worker_4.setFriendsList(workerList);
        entityManager.persist(department);

        entityManager.persist(worker_1);
        entityManager.persist(worker_2);
        entityManager.persist(worker_3);
        entityManager.persist(worker_4);

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}

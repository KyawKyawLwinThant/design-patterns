package demo.ee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory= Persistence.createEntityManagerFactory("defult");
        EntityManager entityManager=factory.createEntityManager();
    }
}

package hospital.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Hibernate {

    private Hibernate() {
    }

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null)
            entityManagerFactory = Persistence.createEntityManagerFactory("clinic");
        return entityManagerFactory;
    }

}

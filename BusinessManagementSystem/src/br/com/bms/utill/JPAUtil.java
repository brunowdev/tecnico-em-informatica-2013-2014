package br.com.bms.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Fábrica de conexões.
 *
 * @since 15/07/2014
 * @version v1.0 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public final class JPAUtil {

    private static final String UNIT_NAME = "BusinessManagementSystemPU";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public EntityManager getEntityManager() {

        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }

}

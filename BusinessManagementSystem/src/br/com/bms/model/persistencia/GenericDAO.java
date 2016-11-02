package br.com.bms.model.persistencia;

import java.util.List;
import javax.persistence.EntityManager;

/**
 * Interface que declara os métodos da classe genérica de persistência.
 *
 * @param <T>
 * @param <I>
 * @since 15/07/2014
 * @version v1.0 19/04/2014
 * @author Bruno Bitencourt Luiz
 */
public interface GenericDAO<T, I> {

    T save(T entity);

    boolean remove(Class<T> classe, I PK);

    T getById(Class<T> classe, I pk);

    List<T> getAll(Class<T> classe);

    EntityManager getEntityManager();
}

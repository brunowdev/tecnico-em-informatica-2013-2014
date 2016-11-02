package br.com.bms.model.persistencia.dao;

import br.com.bms.model.persistencia.GenericDAO;
import br.com.bms.utill.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;

/**
 * Classe genérica de persistência.
 *
 * @version v1.0
 * @param <T>
 * @param <I>
 * @since 15/07/2014
 * @author Bruno Bitencourt Luiz
 */
public abstract class GenericDAOJPA<T, I> implements GenericDAO<T, I> {
    private JPAUtil conexao;

    @Override
    public T save(T entity) {

        T saved = null;

        try {

            getEntityManager().getTransaction().begin();
            saved = getEntityManager().merge(entity);
            getEntityManager().getTransaction().commit();

            JOptionPane.showMessageDialog(null, entity.getClass().getSimpleName() + " salvo(a) com sucesso!");

        } catch (Exception e) {

            if (getEntityManager().getTransaction().isActive() == false) {
                getEntityManager().getTransaction().begin();
            }

            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao salvar elemento na "
                    + "base de dados!\nNenhuma alteração foi feita.\n"
                    + "ERRO: " + e.getMessage(),
                    "Erro de Inserção", JOptionPane.ERROR_MESSAGE);
        }
        return saved;
    }

    @Override
    public boolean remove(Class<T> classe, I pk) {
        boolean estado = false;
        try {
            getEntityManager().getTransaction().begin();
            getEntityManager().remove(getEntityManager().getReference(classe, pk));
            getEntityManager().getTransaction().commit();
            JOptionPane.showMessageDialog(null, classe.getClass().getSimpleName() + " salvo(a) com sucesso!");
            estado = true;
        } catch (Exception e) {
            if (getEntityManager().getTransaction().isActive() == false) {
                getEntityManager().getTransaction().begin();
            }
            getEntityManager().getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro ao remover "
                    + classe.getSimpleName() + " na base de dados!\nERRO: " + e.getMessage());
        }
        return estado;

    }

    @Override
    public T getById(Class<T> classe, I pk) {
        try {
            return getEntityManager().find(classe, pk);

        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<T> getAll(Class<T> classe) {
        return getEntityManager().createQuery("select x from " + classe.getSimpleName() + " x").getResultList();
    }

    @Override
    public EntityManager getEntityManager() {
        if (conexao == null) {
            conexao = new JPAUtil();
        }
        return conexao.getEntityManager();
    }

}

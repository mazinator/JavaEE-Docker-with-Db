package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class Dao<T> {

    @PersistenceContext
    EntityManager em;

    public void create(T item){
        em.persist(item);
    }

    public void update(T item){
        em.merge(item);
    }

    public void delete(T item){
        em.remove(item);
    }

    public abstract List<T> getAll();
    public abstract T getById(Long id);
    public abstract void delete(Long id);
}

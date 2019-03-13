package dao;

import entities.Classroom;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClassroomDao extends Dao<Classroom> {
    @Override
    public List<Classroom> getAll() {
        return em.createNamedQuery("Classroom.getAll", Classroom.class).getResultList();
    }

    @Override
    public Classroom getById(Long id) {
        return em.createNamedQuery("Classroom.getById", Classroom.class).setParameter("id", id).getSingleResult();
    }

    @Override
    public void delete(Long id) {
        Classroom classroom = getById(id);
        delete(classroom);
    }
}
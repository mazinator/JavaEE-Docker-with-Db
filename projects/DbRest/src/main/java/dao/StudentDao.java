package dao;

import entities.Student;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class StudentDao extends Dao<Student>{
    @Override
    public List<Student> getAll() {
        return em.createNamedQuery("Student.getAll", Student.class).getResultList();
    }

    @Override
    public Student getById(Long id) {
        return em.createNamedQuery("Student.getById", Student.class).setParameter("id", id).getSingleResult();
    }

    @Override
    public void delete(Long id) {
        Student student = getById(id);
        delete(student);
    }
}

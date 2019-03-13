package dao;

import entities.Student;

import javax.ejb.Stateless;

@Stateless
public class StudentDao extends Dao<Student> {
    @Override
    public Student update(Student item) {
        itemList.stream()
                .filter(it -> it.getId().equals(item.getId()))
                .forEach(it -> {
                    it.setFirstName(item.getFirstName());
                    it.setLastName(item.getLastName());
                    it.setClassroom(item.getClassroom());
                });
        return item;
    }

    @Override
    public Student getById(Long id) {
        return itemList.stream()
                .filter(it -> it.getId().equals(id))
                .findAny()
                .orElse(null);
    }

    @Override
    public void delete(Long id) {
        itemList.stream()
                .filter(it -> it.getId().equals(id))
                .forEach(it -> itemList.remove(it));
    }
}

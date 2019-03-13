package dao;

import entities.Classroom;

import javax.ejb.Stateless;
import java.util.Optional;

@Stateless
public class ClassroomDao extends Dao<Classroom> {
    @Override
    public Classroom update(Classroom item) {
        itemList.stream()
                .filter(it -> it.getId().equals(item.getId()))
                .forEach(it -> {
                    it.setName(item.getName());
                });
        return item;
    }

    @Override
    public Classroom getById(Long id) {
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

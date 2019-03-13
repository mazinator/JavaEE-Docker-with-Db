package dao;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

public abstract class Dao<T> {
    List<T> itemList = new ArrayList<>();

    public T create(T item){
        itemList.add(item);
        return item;
    }

    public T delete(T item){
        itemList.remove(item);
        return item;
    }

    public List<T> getAll(){
        return itemList;
    }

    public abstract T update(T item);
    public abstract T getById(Long id);
    public abstract void delete(Long id);
}

package org.manager.DAO;

import org.manager.model.Person;
import java.util.List;

public interface PersonDao {
    public void add(Person entity);
    public void update(Person entity);
    public void remove(Person entity);
    public Person getById(int id);
    public List personList();
}

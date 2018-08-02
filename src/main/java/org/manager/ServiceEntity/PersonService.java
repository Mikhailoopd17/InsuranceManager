package org.manager.ServiceEntity;

import org.manager.model.Person;
import org.springframework.stereotype.Service;
import java.util.List;


public interface PersonService {
    public void add(Person person);
    public void update(Person person);
    public void remove(Person person);
    public Person getById(int id);
    public List personList();
}

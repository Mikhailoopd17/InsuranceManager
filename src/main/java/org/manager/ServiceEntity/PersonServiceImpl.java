package org.manager.ServiceEntity;


import org.manager.DAO.PersonDao;
import org.manager.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao){
        this.personDao = personDao;
    }

    @Override
    @Transactional
    public void add(Person entity) {
        this.personDao.add(entity);
    }

    @Override
    @Transactional
    public void update(Person entity) {
        this.personDao.update(entity);
    }

    @Override
    @Transactional
    public void remove(Person entity) {
        personDao.remove(entity);
    }

    @Override
    @Transactional
    public Person getById(int id) {
        return personDao.getById(id);
    }

    @Override
    @Transactional
    public List personList(){
        return personDao.personList();
    }
}

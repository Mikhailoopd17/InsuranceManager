package org.manager.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.manager.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public void add(Person person) {
        currentSession().save(person);
    }

    @Override
    public void update(Person person) {
        currentSession().saveOrUpdate(person);
    }

    @Override
    public void remove(Person person) {
            if(person != null){
                currentSession().delete(person);
            }
    }

    @Override
    public Person getById(int id) {
        return currentSession().get(Person.class, id);
    }

    @Override
    public List personList() {
        return currentSession().createQuery("from Person").list();
    }

}

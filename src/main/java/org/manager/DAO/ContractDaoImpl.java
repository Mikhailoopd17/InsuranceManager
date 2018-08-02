package org.manager.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.manager.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ContractDaoImpl implements ContractDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    public ContractDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void add(Contract entity) {
        currentSession().save(entity);
    }

    @Override
    public void update(Contract entity) {
        currentSession().update(entity);
    }

    @Override
    public void remove(Contract entity) {
        if (entity != null) {
            currentSession().delete(entity);
        }
    }

    @Override
    public Contract getById(int id) {
        return null;
    }

    @Override
    public List contractList() {
        return currentSession().createQuery("from Contract").list();
    }


}

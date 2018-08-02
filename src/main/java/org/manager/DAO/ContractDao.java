package org.manager.DAO;


import org.manager.model.Contract;

import java.util.List;

public interface ContractDao {
    public void add(Contract entity);
    public void update(Contract entity);
    public void remove(Contract entity);
    public Contract getById(int id);
    public List contractList();
}
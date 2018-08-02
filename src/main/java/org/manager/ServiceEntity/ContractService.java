package org.manager.ServiceEntity;


import org.manager.model.Contract;


import java.util.List;

public interface ContractService {
    public void add(Contract entity);
    public void update(Contract entity);
    public void remove(Contract entity);
    public Contract getById(int id);
    public List contractList();
}

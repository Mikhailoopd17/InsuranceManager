package org.manager.ServiceEntity;

import org.manager.DAO.ContractDao;
import org.manager.DAO.ContractDaoImpl;
import org.manager.model.Contract;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class ContractServiceImpl implements ContractService {
    private ContractDaoImpl contractDao;

    public void setContractDao(ContractDaoImpl contractDao){
        this.contractDao = contractDao;
    }

    @Override
    @Transactional
    public void add(Contract entity) {
        this.contractDao.add(entity);
    }

    @Override
    @Transactional
    public void update(Contract entity) {
        this.contractDao.update(entity);
    }

    @Override
    @Transactional
    public void remove(Contract entity) {
        contractDao.remove(entity);
    }

    @Override
    @Transactional
    public Contract getById(int id) {
        return contractDao.getById(id);
    }

    @Override
    @Transactional
    public List contractList(){
        return contractDao.contractList();
    }


}

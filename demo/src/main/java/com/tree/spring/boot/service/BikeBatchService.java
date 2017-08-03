package com.tree.spring.boot.service;

import com.tree.spring.boot.dao.BikeBatchDao;
import com.tree.spring.boot.model.BikeBatchDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tree on 17-8-3.
 */
@Service
public class BikeBatchService {
    @Autowired
    private BikeBatchDao bikeBatchDao;

    public int save(BikeBatchDO bikeBatch){
        return bikeBatchDao.save(bikeBatch);
    }

    public BikeBatchDO getById(int id){
        return bikeBatchDao.getById(id);
    }
}

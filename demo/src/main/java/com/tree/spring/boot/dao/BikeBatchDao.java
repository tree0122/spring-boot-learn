package com.tree.spring.boot.dao;

import com.tree.spring.boot.model.BikeBatchDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by tree on 17-8-3.
 */
@Repository
public class BikeBatchDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(BikeBatchDO bikeBatch){
        int ret = jdbcTemplate.update("INSERT INTO mbk_bike_batch( bike_id ,type) VALUES (?, ?)",
                bikeBatch.getBikeId(),
                bikeBatch.getType());
        return ret;
    }

    public BikeBatchDO getById(int id){
        String sql = "SELECT * FROM mbk_bike_batch where id = " + id;
        BikeBatchDO bikeBatch = jdbcTemplate.queryForObject(sql, BikeBatchDO.class);
        return bikeBatch;
    }
}

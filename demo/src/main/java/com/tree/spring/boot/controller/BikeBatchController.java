package com.tree.spring.boot.controller;

import com.tree.spring.boot.model.BikeBatchDO;
import com.tree.spring.boot.service.BikeBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tree on 17-8-3.
 */
@RestController
@RequestMapping("bikeBatch")
public class BikeBatchController {
    @Autowired
    private BikeBatchService bikeBatchService;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(BikeBatchDO bikeBatch){
        int ret = bikeBatchService.save(bikeBatch);
        return ret + "";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(int id){
        BikeBatchDO bikeBatch = bikeBatchService.getById(id);
        return bikeBatch.toString();
    }
}

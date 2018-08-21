package com.xx.service;

import com.xx.dao.Flower;
import com.xx.mapper.FlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {

    @Autowired
    FlowerMapper flowerMapper;

    public void add(Flower flower){
        flowerMapper.insertSelective(flower);
    }

}

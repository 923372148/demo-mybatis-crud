package com.example.mybatis.crud.demo.service.Impl;

import com.example.mybatis.crud.demo.dao.HouseDao;
import com.example.mybatis.crud.demo.domain.House;
import com.example.mybatis.crud.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseServiceImpl  implements HouseService {

private final HouseDao houseDao;

@Autowired
    public HouseServiceImpl(HouseDao houseDao) {
        this.houseDao = houseDao;
    }

    @Override
    public House findById(Long id) {
  return  houseDao.findById(id);
    }

    @Override
    public House deleteById(Long id) {
        return null;
    }

    @Override
    public House addOneHouse(int numOfRoom, String direction) {
        return null;
    }

    @Override
    public House modifyHouseDirection(Long id, String direction) {
        return null;
    }


}

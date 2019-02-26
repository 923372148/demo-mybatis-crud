package com.example.mybatis.crud.demo.service.Impl;

import com.example.mybatis.crud.demo.dao.HouseDao;
import com.example.mybatis.crud.demo.domain.House;
import com.example.mybatis.crud.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//实现房屋逻辑服务接口
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
    public     boolean deleteById(Long id) {
        return houseDao.deleteById(id);
    }

    @Override
    public     boolean  addOneHouse(int numOfRoom, String direction) {
        return houseDao.addOneHouse(numOfRoom,direction);

    }

    @Override
    public     boolean  modifyHouseDirectionById(Long id, String direction) {
        return houseDao.modifyHouseDirectionById(id,direction);
    }
@Override
public List<House> selestAll(){
    return  houseDao.selestAll();
}

}

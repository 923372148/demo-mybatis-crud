package com.example.mybatis.crud.demo.service;

import com.example.mybatis.crud.demo.domain.House;
import org.springframework.stereotype.Service;

import java.util.List;

/**
@Autor zhuoyj[hopnetworks]
@Date 2019/2/25
@function 房屋管理业务逻辑服务类
@Description

*/

public interface HouseService {


    House findById(Long id);
    boolean  deleteById(Long id);
    boolean  addOneHouse(int numOfRoom,String direction);
    boolean  modifyHouseDirectionById(Long id,String direction);
    List<House> selestAll();

}

package com.example.mybatis.crud.demo.service;

import com.example.mybatis.crud.demo.domain.House;
import org.springframework.stereotype.Service;

/**
@Autor zhuoyj[hopnetworks]
@Date 2019/2/25
@function 房屋管理业务逻辑服务类
@Description

*/

public interface HouseService {


    House findById(Long id);
    House deleteById(Long id);
    House addOneHouse(int numOfRoom,String direction);
    House modifyHouseDirection(Long id,String direction);


}

package com.example.mybatis.crud.demo.dao;

import com.example.mybatis.crud.demo.domain.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface  HouseDao {

    House findById(@Param("id")Long id);
    House deleteById(@Param("id")Long id);
    House addOneHouse(@Param("numOfRoom")int numOfRoom,@Param("direction")String direction);
    House modifyHouseDirection(@Param("id")Long id,@Param("direction")String direction);

}

package com.example.mybatis.crud.demo.dao;

import com.example.mybatis.crud.demo.domain.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  HouseDao {

    House findById(@Param("id")Long id);
    boolean  deleteById(@Param("id")Long id);
    boolean addOneHouse(@Param("numOfRoom")int numOfRoom,@Param("direction")String direction);
  boolean modifyHouseDirectionById(@Param("id")Long id,@Param("direction")String direction);
    List<House> selestAll();

}

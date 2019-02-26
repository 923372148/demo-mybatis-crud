package com.example.mybatis.crud.demo.controller;


import com.example.mybatis.crud.demo.dao.HouseDao;
import com.example.mybatis.crud.demo.domain.House;
import com.example.mybatis.crud.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
@Autor zhuoyj[hopnetworks]
@Date 2019/2/25
@function 用于处理 CRUDAPI的控制类
@Description

*/
@Controller
public class houseController {
    @Autowired
    public houseController(HouseService houseService, HouseDao dao) {
        this.houseService = houseService;
        this.dao = dao;
    }

    private HouseService houseService;
private final HouseDao dao;
    @RequestMapping(value = "/findOneHouse")
    @ResponseBody
    public House findOnehouse(@RequestParam(value = "id", required = true) long id ){
        System.out.println("连接成功"+id);
        return houseService.findById(id);
    }

    @RequestMapping(value = "/addOneHouse")
    @ResponseBody
    public boolean  addOnehouse(int numOfRoom,String direction){
       houseService.addOneHouse(numOfRoom,direction);
        return true;
    }

    @RequestMapping(value = "/mofifyHouse")
    @ResponseBody
    public boolean  mofifyOnehouse(Long id,String direction){
        System.out.println(direction);
        houseService.modifyHouseDirectionById(id,direction);
        return true;
    }
    @RequestMapping(value = "/deleteHouse")
    @ResponseBody
    public boolean deleteHouse(Long id){
        houseService.deleteById(id);
        return true;
    }
    @RequestMapping(value = "/selectAll")
    @ResponseBody
    public List<House> allHouse(){
      return houseService.selestAll();

    }
}

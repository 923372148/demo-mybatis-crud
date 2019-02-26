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
@function 用于处理 CRUDAPI的API控制类
@Description

*/
@Controller
public class houseController {
    //装载房屋服务
    @Autowired
    public houseController(HouseService houseService) {
        this.houseService = houseService;

    }

    private HouseService houseService;

    @RequestMapping(value = "/findOneHouse")
    @ResponseBody
    public House findOnehouse(@RequestParam(value = "id", required = true) long id ){
        /**
         *
         * 功能描述:
         *
         * @param: [id]
         * @return: com.example.mybatis.crud.demo.domain.House
         * @auther: hopnetworks
         * @function: 根据ID寻找房屋
         */
        System.out.println("连接成功"+id);
        return houseService.findById(id);
    }

    @RequestMapping(value = "/addOneHouse")
    @ResponseBody
    public boolean  addOnehouse(int numOfRoom,String direction){
        /**
         *
         * 功能描述:
         *
         * @param: [numOfRoom, direction]
         * @return: boolean
         * @auther: hopnetworks
         * @function: 增加一个房屋
         */
       houseService.addOneHouse(numOfRoom,direction);
        return true;
    }

    @RequestMapping(value = "/mofifyHouse")
    @ResponseBody
    public boolean  mofifyOnehouse(Long id,String direction){
        /**
         *
         * 功能描述:
         *
         * @param: [id, direction]
         * @return: boolean
         * @auther: hopnetworks
         * @function: 更新
         */
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

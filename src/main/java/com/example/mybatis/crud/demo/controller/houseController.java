package com.example.mybatis.crud.demo.controller;


import com.example.mybatis.crud.demo.domain.House;
import com.example.mybatis.crud.demo.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
@Autor zhuoyj[hopnetworks]
@Date 2019/2/25
@function 用于处理 CRUDAPI的控制类
@Description

*/
@Controller
public class houseController {
    @Autowired
    public houseController(HouseService houseService) {
        this.houseService = houseService;
    }

    private HouseService houseService;

    @RequestMapping(value = "/findOneHouse")
    @ResponseBody
    public House findOnehouse(@RequestParam(value = "id", required = true) long id ){
        System.out.println("连接成功"+id);
        return houseService.findById(id);
    }

}

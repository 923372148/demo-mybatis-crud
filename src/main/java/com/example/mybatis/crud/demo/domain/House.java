package com.example.mybatis.crud.demo.domain;


import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
@Autor zhuoyj[hopnetworks]
@Date 2019/2/25
@function 房屋实体类
@Description

*/
@Entity
public class House {

    //房屋id

    public House( String direction, int numOfRoom) {

        this.direction = direction;
        this.numOfRoom = numOfRoom;
    }
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    //房屋位置
    private String direction;
    //房屋室数量


    public House() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getnumOfRoom() {
        return numOfRoom;
    }

    public void setnumOfRoom(int numOfRoom) {
        this.numOfRoom = numOfRoom;
    }

    private int numOfRoom;








}

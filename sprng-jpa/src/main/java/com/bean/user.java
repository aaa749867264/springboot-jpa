package com.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Entity
@Component
public class user {
 
    /**
     * 自增主键id
     */
	@Id
    @GeneratedValue
    private Integer id;
 

    private String lastname;
 
    /**
     * 省略默认列名就是属性名
     */

 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 

}

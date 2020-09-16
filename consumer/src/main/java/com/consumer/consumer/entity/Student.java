package com.consumer.consumer.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZFW
 * @create 2020-09-09 9:13
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Double score;
    private Date birthday;
}

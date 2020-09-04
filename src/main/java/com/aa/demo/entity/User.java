package com.aa.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private Date birthday;
}

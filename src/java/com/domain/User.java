package com.domain;
// Generated 20-Feb-2019 6:51:05 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="webapp"
)
public class User  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String pwd;
     private String sex;
     private String home;
     private String info;

    public User() {
    }

    public User(String name, String pwd, String sex, String home, String info) {
       this.name = name;
       this.pwd = pwd;
       this.sex = sex;
       this.home = home;
       this.info = info;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="pwd", nullable=false)
    public String getPwd() {
        return this.pwd;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    
    @Column(name="sex", nullable=false)
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }

    
    @Column(name="home", nullable=false)
    public String getHome() {
        return this.home;
    }
    
    public void setHome(String home) {
        this.home = home;
    }

    
    @Column(name="info", nullable=false)
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }




}



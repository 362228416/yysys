package com.sgl.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 医疗卫生机构
 * @author: john
 * @version: 1.0 2014-06-09 下午11:04
 */
@Entity
public class BasisHispotal {
    @Id
    @GenericGenerator(name="uuid", strategy="uuid", parameters = {@Parameter(name = "separator", value = "-")})
    @GeneratedValue(generator = "uuid")
    private String id;
    private String name;
    private String sname;
    private String code;
    private String area;
    private String belong;
    private String grade;
    private String users;
    private boolean isBuild;
    private String haveEP;
    private String addr;
    private Date initialDate;
    private String centerSupport;
    private String purchase;
    private String existingCA;
    private String caDispatchNum;
    private String caBackNum;
    private Date fdate1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public boolean isBuild() {
        return isBuild;
    }

    public void setBuild(boolean isBuild) {
        this.isBuild = isBuild;
    }

    public String getHaveEP() {
        return haveEP;
    }

    public void setHaveEP(String haveEP) {
        this.haveEP = haveEP;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public String getCenterSupport() {
        return centerSupport;
    }

    public void setCenterSupport(String centerSupport) {
        this.centerSupport = centerSupport;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getExistingCA() {
        return existingCA;
    }

    public void setExistingCA(String existingCA) {
        this.existingCA = existingCA;
    }

    public String getCaDispatchNum() {
        return caDispatchNum;
    }

    public void setCaDispatchNum(String caDispatchNum) {
        this.caDispatchNum = caDispatchNum;
    }

    public String getCaBackNum() {
        return caBackNum;
    }

    public void setCaBackNum(String caBackNum) {
        this.caBackNum = caBackNum;
    }

    public Date getFdate1() {
        return fdate1;
    }

    public void setFdate1(Date fdate1) {
        this.fdate1 = fdate1;
    }
}

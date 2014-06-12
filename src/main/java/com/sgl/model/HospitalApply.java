package com.sgl.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 医疗机构建设
 * @author: john
 * @version: 1.0 2014-06-09 下午11:04
 */
@Entity
public class HospitalApply {
    @Id
    @GenericGenerator(name="uuid", strategy="uuid", parameters = {@Parameter(name = "separator", value = "-")})
    @GeneratedValue(generator = "uuid")
    private String id;
    private String hospitalArea;
    private String homePhone;
    private String applyHospital;
    private String caCompany;
    private String contactPerson;
    private String mobilePhone;
    private String email;
    private Integer caNum;
    private Date finishDate;
    private String confirmState;
    private String hospitalCode;
    private String proposal;
    private String annex;
    private String author;
    private Date createDate;
    private String statelabel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospitalArea() {
        return hospitalArea;
    }

    public void setHospitalArea(String hospitalArea) {
        this.hospitalArea = hospitalArea;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getApplyHospital() {
        return applyHospital;
    }

    public void setApplyHospital(String applyHospital) {
        this.applyHospital = applyHospital;
    }

    public String getCaCompany() {
        return caCompany;
    }

    public void setCaCompany(String caCompany) {
        this.caCompany = caCompany;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCaNum() {
        return caNum;
    }

    public void setCaNum(Integer caNum) {
        this.caNum = caNum;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getConfirmState() {
        return confirmState;
    }

    public void setConfirmState(String confirmState) {
        this.confirmState = confirmState;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getStatelabel() {
        return statelabel;
    }

    public void setStatelabel(String statelabel) {
        this.statelabel = statelabel;
    }
}

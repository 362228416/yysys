package com.sgl.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 认证机构表
 * @author: john
 * @version: 1.0 2014-06-09 下午11:04
 */
@Entity
public class CAApplay {
    @Id
    @GenericGenerator(name="uuid", strategy="uuid", parameters = {@Parameter(name = "separator", value = "-")})
    @GeneratedValue(generator = "uuid")
    private String id;
    private String confirmState;
    private String caCompany;
    private String orgCode;
    private String caArea;
    private String caAddress;
    private String postcode;
    private String homePage;
    private String contactPerson;
    private String contactPhone;
    private String email;
    private String faxNumber;
    private String caCode;
    private String annex;
    private String author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConfirmState() {
        return confirmState;
    }

    public void setConfirmState(String confirmState) {
        this.confirmState = confirmState;
    }

    public String getCaCompany() {
        return caCompany;
    }

    public void setCaCompany(String caCompany) {
        this.caCompany = caCompany;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getCaArea() {
        return caArea;
    }

    public void setCaArea(String caArea) {
        this.caArea = caArea;
    }

    public String getCaAddress() {
        return caAddress;
    }

    public void setCaAddress(String caAddress) {
        this.caAddress = caAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getCaCode() {
        return caCode;
    }

    public void setCaCode(String caCode) {
        this.caCode = caCode;
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
}

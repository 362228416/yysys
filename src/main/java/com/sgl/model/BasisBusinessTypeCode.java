package com.sgl.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 业务类型编码
 * @author: john
 * @version: 1.0 2014-06-09 下午11:04
 */
@Entity
public class BasisBusinessTypeCode {
    @Id
    @GenericGenerator(name="uuid", strategy="uuid", parameters = {@Parameter(name = "separator", value = "-")})
    @GeneratedValue(generator = "uuid")
    private String id;
    private String name;
    private String code;
    private String remark;
    private String author;
    private Date createDate;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}

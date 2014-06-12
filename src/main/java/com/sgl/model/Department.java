package com.sgl.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 部门
 * @author: john
 * @version: 1.0 2014-06-09 下午10:55
 */
@Entity
public class Department {

    @Id
    @GenericGenerator(name="uuid", strategy="uuid", parameters = {@Parameter(name = "separator", value = "-")})
    @GeneratedValue(generator = "uuid")
    private String id;
    private String name;
    private String superIor;

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

    public String getSuperIor() {
        return superIor;
    }

    public void setSuperIor(String superIor) {
        this.superIor = superIor;
    }
}

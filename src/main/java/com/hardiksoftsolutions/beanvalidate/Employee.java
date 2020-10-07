package com.hardiksoftsolutions.beanvalidate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Employee {
    @NotEmpty(message = "Enter name")
    String name;

    @NotNull(message = "Please enter phone number")
    Long phNumber;

    @NotEmpty(message = "Please enter zipCode")
    String zipCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(Long phNumber) {
        this.phNumber = phNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

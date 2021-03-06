package com.github.yuweiguocn.demo.greendao.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TEST_DATA2".
 */
@Entity
public class TestData2 {

    @Id(autoincrement = true)
    private Long id;
    private String testString;
    private String md5String;
    private Long testLong;
    private java.util.Date testDate;
    private Integer testInt;
    private Integer ageInt;
    private Boolean favorBoolean;
    private Boolean hahaBoolean;
    private Boolean bbBoolean;
    private Boolean ccBoolean;
    private Boolean testBoolean;

    @Generated
    public TestData2() {
    }

    public TestData2(Long id) {
        this.id = id;
    }

    @Generated
    public TestData2(Long id, String testString, String md5String, Long testLong, java.util.Date testDate, Integer testInt, Integer ageInt, Boolean favorBoolean, Boolean hahaBoolean, Boolean bbBoolean, Boolean ccBoolean, Boolean testBoolean) {
        this.id = id;
        this.testString = testString;
        this.md5String = md5String;
        this.testLong = testLong;
        this.testDate = testDate;
        this.testInt = testInt;
        this.ageInt = ageInt;
        this.favorBoolean = favorBoolean;
        this.hahaBoolean = hahaBoolean;
        this.bbBoolean = bbBoolean;
        this.ccBoolean = ccBoolean;
        this.testBoolean = testBoolean;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public String getMd5String() {
        return md5String;
    }

    public void setMd5String(String md5String) {
        this.md5String = md5String;
    }

    public Long getTestLong() {
        return testLong;
    }

    public void setTestLong(Long testLong) {
        this.testLong = testLong;
    }

    public java.util.Date getTestDate() {
        return testDate;
    }

    public void setTestDate(java.util.Date testDate) {
        this.testDate = testDate;
    }

    public Integer getTestInt() {
        return testInt;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }

    public Integer getAgeInt() {
        return ageInt;
    }

    public void setAgeInt(Integer ageInt) {
        this.ageInt = ageInt;
    }

    public Boolean getFavorBoolean() {
        return favorBoolean;
    }

    public void setFavorBoolean(Boolean favorBoolean) {
        this.favorBoolean = favorBoolean;
    }

    public Boolean getHahaBoolean() {
        return hahaBoolean;
    }

    public void setHahaBoolean(Boolean hahaBoolean) {
        this.hahaBoolean = hahaBoolean;
    }

    public Boolean getBbBoolean() {
        return bbBoolean;
    }

    public void setBbBoolean(Boolean bbBoolean) {
        this.bbBoolean = bbBoolean;
    }

    public Boolean getCcBoolean() {
        return ccBoolean;
    }

    public void setCcBoolean(Boolean ccBoolean) {
        this.ccBoolean = ccBoolean;
    }

    public Boolean getTestBoolean() {
        return testBoolean;
    }

    public void setTestBoolean(Boolean testBoolean) {
        this.testBoolean = testBoolean;
    }

}

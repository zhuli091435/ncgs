package com.sky.pushdata.pojo;

import java.util.Date;

public class GS_USER_B {
    private String ID;

    private String USER;

    private String PASSWORD;

    private String NAME;

    private String AD_CD;

    private String TYPE;

    private String PHONE;

    private String TEL;

    private String EMAIL;

    private Date TS;

    private String NT;

    private Integer ISSEND;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER == null ? null : USER.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getAD_CD() {
        return AD_CD;
    }

    public void setAD_CD(String AD_CD) {
        this.AD_CD = AD_CD == null ? null : AD_CD.trim();
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE == null ? null : PHONE.trim();
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL == null ? null : TEL.trim();
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL == null ? null : EMAIL.trim();
    }

    public Date getTS() {
        return TS;
    }

    public void setTS(Date TS) {
        this.TS = TS;
    }

    public String getNT() {
        return NT;
    }

    public void setNT(String NT) {
        this.NT = NT == null ? null : NT.trim();
    }

    public Integer getISSEND() {
        return ISSEND;
    }

    public void setISSEND(Integer ISSEND) {
        this.ISSEND = ISSEND;
    }
}
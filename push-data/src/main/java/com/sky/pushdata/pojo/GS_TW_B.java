package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;
import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_TW_B {
    private String TW_CD;

    private String TWNW;

    private String AD_CD;

    private String ADDR;

    private String w_ADDR;

    private BigDecimal TW_WU;

    private String e_MAIL;

    private String REL;

    private Date TS;

    private String NT;

    private Integer ISSEND;

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
    }

    public String getTWNW() {
        return TWNW;
    }

    public void setTWNW(String TWNW) {
        this.TWNW = TWNW == null ? null : TWNW.trim();
    }

    public String getAD_CD() {
        return AD_CD;
    }

    public void setAD_CD(String AD_CD) {
        this.AD_CD = AD_CD == null ? null : AD_CD.trim();
    }

    public String getADDR() {
        return ADDR;
    }

    public void setADDR(String ADDR) {
        this.ADDR = ADDR == null ? null : ADDR.trim();
    }

    public String getW_ADDR() {
        return w_ADDR;
    }

    public void setW_ADDR(String w_ADDR) {
        this.w_ADDR = w_ADDR == null ? null : w_ADDR.trim();
    }

    public BigDecimal getTW_WU() {
        return TW_WU;
    }

    public void setTW_WU(BigDecimal TW_WU) {
        this.TW_WU = TW_WU;
    }

    public String getE_MAIL() {
        return e_MAIL;
    }

    public void setE_MAIL(String e_MAIL) {
        this.e_MAIL = e_MAIL == null ? null : e_MAIL.trim();
    }

    public String getREL() {
        return REL;
    }

    public void setREL(String REL) {
        this.REL = REL == null ? null : REL.trim();
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
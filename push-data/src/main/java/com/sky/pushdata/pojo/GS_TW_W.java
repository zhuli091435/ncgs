package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;
import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_TW_W {
    private String TW_CD;

    private Date TM;

    private String AD_CD;

    private BigDecimal DAY_CW;

    private BigDecimal DAY_JW;

    private String NT;

    private Date TS;

    private Integer ISSEND;

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
    }

    public Date getTM() {
        return TM;
    }

    public void setTM(Date TM) {
        this.TM = TM;
    }

    public String getAD_CD() {
        return AD_CD;
    }

    public void setAD_CD(String AD_CD) {
        this.AD_CD = AD_CD == null ? null : AD_CD.trim();
    }

    public BigDecimal getDAY_CW() {
        return DAY_CW;
    }

    public void setDAY_CW(BigDecimal DAY_CW) {
        this.DAY_CW = DAY_CW;
    }

    public BigDecimal getDAY_JW() {
        return DAY_JW;
    }

    public void setDAY_JW(BigDecimal DAY_JW) {
        this.DAY_JW = DAY_JW;
    }

    public String getNT() {
        return NT;
    }

    public void setNT(String NT) {
        this.NT = NT == null ? null : NT.trim();
    }

    public Date getTS() {
        return TS;
    }

    public void setTS(Date TS) {
        this.TS = TS;
    }

    public Integer getISSEND() {
        return ISSEND;
    }

    public void setISSEND(Integer ISSEND) {
        this.ISSEND = ISSEND;
    }
}
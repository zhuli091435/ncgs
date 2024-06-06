package com.sky.pushdata.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GS_MP_D {
    private String STCD;

    private Date TM;

    private String AD_CD;

    private String TW_CD;

    private BigDecimal DAY_W;

    private BigDecimal FL_RT;

    private Date TS;

    private String NT;

    private Integer ISSEND;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
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

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
    }

    public BigDecimal getDAY_W() {
        return DAY_W;
    }

    public void setDAY_W(BigDecimal DAY_W) {
        this.DAY_W = DAY_W;
    }

    public BigDecimal getFL_RT() {
        return FL_RT;
    }

    public void setFL_RT(BigDecimal FL_RT) {
        this.FL_RT = FL_RT;
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
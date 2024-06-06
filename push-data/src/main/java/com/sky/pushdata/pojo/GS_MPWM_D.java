package com.sky.pushdata.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GS_MPWM_D {
    private String STCD;

    private Date TM;

    private String AD_CD;

    private String TW_CD;

    private Integer PRE_JV;

    private Integer PRE_CV;

    private BigDecimal q_JV;

    private BigDecimal q_CV;

    private BigDecimal f_RE;

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

    public Integer getPRE_JV() {
        return PRE_JV;
    }

    public void setPRE_JV(Integer PRE_JV) {
        this.PRE_JV = PRE_JV;
    }

    public Integer getPRE_CV() {
        return PRE_CV;
    }

    public void setPRE_CV(Integer PRE_CV) {
        this.PRE_CV = PRE_CV;
    }

    public BigDecimal getQ_JV() {
        return q_JV;
    }

    public void setQ_JV(BigDecimal q_JV) {
        this.q_JV = q_JV;
    }

    public BigDecimal getQ_CV() {
        return q_CV;
    }

    public void setQ_CV(BigDecimal q_CV) {
        this.q_CV = q_CV;
    }

    public BigDecimal getF_RE() {
        return f_RE;
    }

    public void setF_RE(BigDecimal f_RE) {
        this.f_RE = f_RE;
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
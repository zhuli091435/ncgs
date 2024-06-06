package com.sky.pushdata.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class GS_AT_D {
    private String TW_CD;

    private String BDATE;

    private String ATN;

    private Date SE_TM;

    private String AD_CD;

    private BigDecimal YSDJ;

    private BigDecimal CT_W;

    private BigDecimal PP_W;

    private BigDecimal m_W;

    private BigDecimal ATD;

    private BigDecimal WSF;

    private Date TS;

    private Integer ISSEND;

    private String NT;

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
    }

    public String getBDATE() {
        return BDATE;
    }

    public void setBDATE(String BDATE) {
        this.BDATE = BDATE == null ? null : BDATE.trim();
    }

    public String getATN() {
        return ATN;
    }

    public void setATN(String ATN) {
        this.ATN = ATN == null ? null : ATN.trim();
    }

    public Date getSE_TM() {
        return SE_TM;
    }

    public void setSE_TM(Date SE_TM) {
        this.SE_TM = SE_TM;
    }

    public String getAD_CD() {
        return AD_CD;
    }

    public void setAD_CD(String AD_CD) {
        this.AD_CD = AD_CD == null ? null : AD_CD.trim();
    }

    public BigDecimal getYSDJ() {
        return YSDJ;
    }

    public void setYSDJ(BigDecimal YSDJ) {
        this.YSDJ = YSDJ;
    }

    public BigDecimal getCT_W() {
        return CT_W;
    }

    public void setCT_W(BigDecimal CT_W) {
        this.CT_W = CT_W;
    }

    public BigDecimal getPP_W() {
        return PP_W;
    }

    public void setPP_W(BigDecimal PP_W) {
        this.PP_W = PP_W;
    }

    public BigDecimal getM_W() {
        return m_W;
    }

    public void setM_W(BigDecimal m_W) {
        this.m_W = m_W;
    }

    public BigDecimal getATD() {
        return ATD;
    }

    public void setATD(BigDecimal ATD) {
        this.ATD = ATD;
    }

    public BigDecimal getWSF() {
        return WSF;
    }

    public void setWSF(BigDecimal WSF) {
        this.WSF = WSF;
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

    public String getNT() {
        return NT;
    }

    public void setNT(String NT) {
        this.NT = NT == null ? null : NT.trim();
    }
}
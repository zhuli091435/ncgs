package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;
import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_STAT_B {
    private String STCD;

    private String ST_NM;

    private String AD_CD;

    private String TW_CD;

    private String ST_MPWM;

    private String ST_WQM;

    private String ST_MP;

    private String MON_TP;

    private BigDecimal TH_D;

    private BigDecimal LGTD;

    private BigDecimal LTTD;

    private String LOC;

    private String STBK;

    private String ADAG;

    private String MNAG;

    private Date TS;

    private String NT;

    private Integer ISSEND;

    public String getSTCD() {
        return STCD;
    }

    public void setSTCD(String STCD) {
        this.STCD = STCD == null ? null : STCD.trim();
    }

    public String getST_NM() {
        return ST_NM;
    }

    public void setST_NM(String ST_NM) {
        this.ST_NM = ST_NM == null ? null : ST_NM.trim();
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

    public String getST_MPWM() {
        return ST_MPWM;
    }

    public void setST_MPWM(String ST_MPWM) {
        this.ST_MPWM = ST_MPWM == null ? null : ST_MPWM.trim();
    }

    public String getST_WQM() {
        return ST_WQM;
    }

    public void setST_WQM(String ST_WQM) {
        this.ST_WQM = ST_WQM == null ? null : ST_WQM.trim();
    }

    public String getST_MP() {
        return ST_MP;
    }

    public void setST_MP(String ST_MP) {
        this.ST_MP = ST_MP == null ? null : ST_MP.trim();
    }

    public String getMON_TP() {
        return MON_TP;
    }

    public void setMON_TP(String MON_TP) {
        this.MON_TP = MON_TP == null ? null : MON_TP.trim();
    }

    public BigDecimal getTH_D() {
        return TH_D;
    }

    public void setTH_D(BigDecimal TH_D) {
        this.TH_D = TH_D;
    }

    public BigDecimal getLGTD() {
        return LGTD;
    }

    public void setLGTD(BigDecimal LGTD) {
        this.LGTD = LGTD;
    }

    public BigDecimal getLTTD() {
        return LTTD;
    }

    public void setLTTD(BigDecimal LTTD) {
        this.LTTD = LTTD;
    }

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC == null ? null : LOC.trim();
    }

    public String getSTBK() {
        return STBK;
    }

    public void setSTBK(String STBK) {
        this.STBK = STBK == null ? null : STBK.trim();
    }

    public String getADAG() {
        return ADAG;
    }

    public void setADAG(String ADAG) {
        this.ADAG = ADAG == null ? null : ADAG.trim();
    }

    public String getMNAG() {
        return MNAG;
    }

    public void setMNAG(String MNAG) {
        this.MNAG = MNAG == null ? null : MNAG.trim();
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
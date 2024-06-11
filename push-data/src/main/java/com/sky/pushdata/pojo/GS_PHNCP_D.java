package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_PHNCP_D {
    private String RP_CD;

    private String TW_CD;

    private Date SPT;

    private String AD_CD;

    private String TYPE;

    private String ST_TP;

    private String VLPH;

    private String BENF;

    private String ERLBF24;

    private String SLBF246;

    private String WLF;

    private String SXJBF246;

    private Date TEST_COM_TM;

    private Date TS;

    private Integer ISSEND;

    private String NT;

    public String getRP_CD() {
        return RP_CD;
    }

    public void setRP_CD(String RP_CD) {
        this.RP_CD = RP_CD == null ? null : RP_CD.trim();
    }

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
    }

    public Date getSPT() {
        return SPT;
    }

    public void setSPT(Date SPT) {
        this.SPT = SPT;
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

    public String getST_TP() {
        return ST_TP;
    }

    public void setST_TP(String ST_TP) {
        this.ST_TP = ST_TP == null ? null : ST_TP.trim();
    }

    public String getVLPH() {
        return VLPH;
    }

    public void setVLPH(String VLPH) {
        this.VLPH = VLPH == null ? null : VLPH.trim();
    }

    public String getBENF() {
        return BENF;
    }

    public void setBENF(String BENF) {
        this.BENF = BENF == null ? null : BENF.trim();
    }

    public String getERLBF24() {
        return ERLBF24;
    }

    public void setERLBF24(String ERLBF24) {
        this.ERLBF24 = ERLBF24 == null ? null : ERLBF24.trim();
    }

    public String getSLBF246() {
        return SLBF246;
    }

    public void setSLBF246(String SLBF246) {
        this.SLBF246 = SLBF246 == null ? null : SLBF246.trim();
    }

    public String getWLF() {
        return WLF;
    }

    public void setWLF(String WLF) {
        this.WLF = WLF == null ? null : WLF.trim();
    }

    public String getSXJBF246() {
        return SXJBF246;
    }

    public void setSXJBF246(String SXJBF246) {
        this.SXJBF246 = SXJBF246 == null ? null : SXJBF246.trim();
    }

    public Date getTEST_COM_TM() {
        return TEST_COM_TM;
    }

    public void setTEST_COM_TM(Date TEST_COM_TM) {
        this.TEST_COM_TM = TEST_COM_TM;
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
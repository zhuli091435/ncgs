package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_WBHP_D {
    private String RP_CD;

    private String TW_CD;

    private Date SPT;

    private String AD_CD;

    private String TYPE;

    private String ST_TP;

    private String BCTC;

    private String TCG;

    private String FCG;

    private String FAG;

    private String FS;

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

    public String getBCTC() {
        return BCTC;
    }

    public void setBCTC(String BCTC) {
        this.BCTC = BCTC == null ? null : BCTC.trim();
    }

    public String getTCG() {
        return TCG;
    }

    public void setTCG(String TCG) {
        this.TCG = TCG == null ? null : TCG.trim();
    }

    public String getFCG() {
        return FCG;
    }

    public void setFCG(String FCG) {
        this.FCG = FCG == null ? null : FCG.trim();
    }

    public String getFAG() {
        return FAG;
    }

    public void setFAG(String FAG) {
        this.FAG = FAG == null ? null : FAG.trim();
    }

    public String getFS() {
        return FS;
    }

    public void setFS(String FS) {
        this.FS = FS == null ? null : FS.trim();
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
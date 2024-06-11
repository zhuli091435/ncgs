package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_AT_W {
    private String ATN;

    private String ATNM;

    private String TW_CD;

    private String AD_CD;

    private String TYPE;

    private String LOC;

    private String TEL;

    private Date TS;

    private String NT;

    private Integer ISSEND;

    public String getATN() {
        return ATN;
    }

    public void setATN(String ATN) {
        this.ATN = ATN == null ? null : ATN.trim();
    }

    public String getATNM() {
        return ATNM;
    }

    public void setATNM(String ATNM) {
        this.ATNM = ATNM == null ? null : ATNM.trim();
    }

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
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

    public String getLOC() {
        return LOC;
    }

    public void setLOC(String LOC) {
        this.LOC = LOC == null ? null : LOC.trim();
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL == null ? null : TEL.trim();
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
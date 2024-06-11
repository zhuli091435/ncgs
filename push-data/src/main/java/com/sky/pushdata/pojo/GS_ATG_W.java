package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_ATG_W {
    private String TW_CD;

    private Date STARTTM;

    private Date ENDTM;

    private String AD_CD;

    private String TW_TYPE;

    private String TEL;

    private Date TS;

    private Integer ISSEND;

    private String TITLE;

    private String ADDR;

    private String CONTENT;

    private String NT;

    public String getTW_CD() {
        return TW_CD;
    }

    public void setTW_CD(String TW_CD) {
        this.TW_CD = TW_CD == null ? null : TW_CD.trim();
    }

    public Date getSTARTTM() {
        return STARTTM;
    }

    public void setSTARTTM(Date STARTTM) {
        this.STARTTM = STARTTM;
    }

    public Date getENDTM() {
        return ENDTM;
    }

    public void setENDTM(Date ENDTM) {
        this.ENDTM = ENDTM;
    }

    public String getAD_CD() {
        return AD_CD;
    }

    public void setAD_CD(String AD_CD) {
        this.AD_CD = AD_CD == null ? null : AD_CD.trim();
    }

    public String getTW_TYPE() {
        return TW_TYPE;
    }

    public void setTW_TYPE(String TW_TYPE) {
        this.TW_TYPE = TW_TYPE == null ? null : TW_TYPE.trim();
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

    public Integer getISSEND() {
        return ISSEND;
    }

    public void setISSEND(Integer ISSEND) {
        this.ISSEND = ISSEND;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE == null ? null : TITLE.trim();
    }

    public String getADDR() {
        return ADDR;
    }

    public void setADDR(String ADDR) {
        this.ADDR = ADDR == null ? null : ADDR.trim();
    }

    public String getCONTENT() {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT) {
        this.CONTENT = CONTENT == null ? null : CONTENT.trim();
    }

    public String getNT() {
        return NT;
    }

    public void setNT(String NT) {
        this.NT = NT == null ? null : NT.trim();
    }
}
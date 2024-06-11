package com.sky.pushdata.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;
import java.util.Date;
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GS_PCP_D {
    private String RP_CD;

    private String TW_CD;

    private Date SPT;

    private String AD_CD;

    private String TYPE;

    private String ST_TP;

    private String w_TP;

    private String FILE_CD;

    private String ADDR;

    private String JYR_NM;

    private BigDecimal AIRT;

    private Integer ATM;

    private Short ILMT;

    private Integer ILMI;

    private BigDecimal WT;

    private BigDecimal PH;

    private Integer COND;

    private BigDecimal REDOX;

    private String CHROMA;

    private String SMELL;

    private String NEOBJ;

    private String TURB;

    private String CLARITY;

    private String SS;

    private String MNDG;

    private String ACID;

    private String TALKY;

    private String HCO3;

    private String CO3;

    private String DSCO2;

    private String AGCO2;

    private String TSOLID;

    private String TDS;

    private String TALATV;

    private String TBTATV;

    private String SH_TYPE;

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

    public String getW_TP() {
        return w_TP;
    }

    public void setW_TP(String w_TP) {
        this.w_TP = w_TP == null ? null : w_TP.trim();
    }

    public String getFILE_CD() {
        return FILE_CD;
    }

    public void setFILE_CD(String FILE_CD) {
        this.FILE_CD = FILE_CD == null ? null : FILE_CD.trim();
    }

    public String getADDR() {
        return ADDR;
    }

    public void setADDR(String ADDR) {
        this.ADDR = ADDR == null ? null : ADDR.trim();
    }

    public String getJYR_NM() {
        return JYR_NM;
    }

    public void setJYR_NM(String JYR_NM) {
        this.JYR_NM = JYR_NM == null ? null : JYR_NM.trim();
    }

    public BigDecimal getAIRT() {
        return AIRT;
    }

    public void setAIRT(BigDecimal AIRT) {
        this.AIRT = AIRT;
    }

    public Integer getATM() {
        return ATM;
    }

    public void setATM(Integer ATM) {
        this.ATM = ATM;
    }

    public Short getILMT() {
        return ILMT;
    }

    public void setILMT(Short ILMT) {
        this.ILMT = ILMT;
    }

    public Integer getILMI() {
        return ILMI;
    }

    public void setILMI(Integer ILMI) {
        this.ILMI = ILMI;
    }

    public BigDecimal getWT() {
        return WT;
    }

    public void setWT(BigDecimal WT) {
        this.WT = WT;
    }

    public BigDecimal getPH() {
        return PH;
    }

    public void setPH(BigDecimal PH) {
        this.PH = PH;
    }

    public Integer getCOND() {
        return COND;
    }

    public void setCOND(Integer COND) {
        this.COND = COND;
    }

    public BigDecimal getREDOX() {
        return REDOX;
    }

    public void setREDOX(BigDecimal REDOX) {
        this.REDOX = REDOX;
    }

    public String getCHROMA() {
        return CHROMA;
    }

    public void setCHROMA(String CHROMA) {
        this.CHROMA = CHROMA == null ? null : CHROMA.trim();
    }

    public String getSMELL() {
        return SMELL;
    }

    public void setSMELL(String SMELL) {
        this.SMELL = SMELL == null ? null : SMELL.trim();
    }

    public String getNEOBJ() {
        return NEOBJ;
    }

    public void setNEOBJ(String NEOBJ) {
        this.NEOBJ = NEOBJ == null ? null : NEOBJ.trim();
    }

    public String getTURB() {
        return TURB;
    }

    public void setTURB(String TURB) {
        this.TURB = TURB == null ? null : TURB.trim();
    }

    public String getCLARITY() {
        return CLARITY;
    }

    public void setCLARITY(String CLARITY) {
        this.CLARITY = CLARITY == null ? null : CLARITY.trim();
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS == null ? null : SS.trim();
    }

    public String getMNDG() {
        return MNDG;
    }

    public void setMNDG(String MNDG) {
        this.MNDG = MNDG == null ? null : MNDG.trim();
    }

    public String getACID() {
        return ACID;
    }

    public void setACID(String ACID) {
        this.ACID = ACID == null ? null : ACID.trim();
    }

    public String getTALKY() {
        return TALKY;
    }

    public void setTALKY(String TALKY) {
        this.TALKY = TALKY == null ? null : TALKY.trim();
    }

    public String getHCO3() {
        return HCO3;
    }

    public void setHCO3(String HCO3) {
        this.HCO3 = HCO3 == null ? null : HCO3.trim();
    }

    public String getCO3() {
        return CO3;
    }

    public void setCO3(String CO3) {
        this.CO3 = CO3 == null ? null : CO3.trim();
    }

    public String getDSCO2() {
        return DSCO2;
    }

    public void setDSCO2(String DSCO2) {
        this.DSCO2 = DSCO2 == null ? null : DSCO2.trim();
    }

    public String getAGCO2() {
        return AGCO2;
    }

    public void setAGCO2(String AGCO2) {
        this.AGCO2 = AGCO2 == null ? null : AGCO2.trim();
    }

    public String getTSOLID() {
        return TSOLID;
    }

    public void setTSOLID(String TSOLID) {
        this.TSOLID = TSOLID == null ? null : TSOLID.trim();
    }

    public String getTDS() {
        return TDS;
    }

    public void setTDS(String TDS) {
        this.TDS = TDS == null ? null : TDS.trim();
    }

    public String getTALATV() {
        return TALATV;
    }

    public void setTALATV(String TALATV) {
        this.TALATV = TALATV == null ? null : TALATV.trim();
    }

    public String getTBTATV() {
        return TBTATV;
    }

    public void setTBTATV(String TBTATV) {
        this.TBTATV = TBTATV == null ? null : TBTATV.trim();
    }

    public String getSH_TYPE() {
        return SH_TYPE;
    }

    public void setSH_TYPE(String SH_TYPE) {
        this.SH_TYPE = SH_TYPE == null ? null : SH_TYPE.trim();
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
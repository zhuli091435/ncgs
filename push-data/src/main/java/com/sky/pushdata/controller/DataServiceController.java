package com.sky.pushdata.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sky.pushdata.pojo.*;
import com.sky.pushdata.service.*;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@RestController
public class DataServiceController {

    @Resource
    private GS_STAT_BService gsStatBService;

    @Resource
    private GS_AT_WService gsAtWService;

    @Resource
    private GS_USER_BService gsUserBService;

    @Resource
    private GS_TW_WService gsTwWService;

    @Resource
    private GS_MP_DService gsMpDService;

    @Resource
    private GS_MPWM_DService gsMpwmDService;

    @Resource
    private GS_AWQMD_DService gsAwqmdDService;

    @Resource
    private GS_PCP_DService gsPcpDService;

    @Resource
    private GS_NMISP_DService gsNmispDService;

    @Resource
    private GS_MISP_DService gsMispDService;

    @Resource
    private GS_PHNCP_DService gsPhncpDService;

    @Resource
    private GS_OPCP_DService gsOpcpDService;

    @Resource
    private GS_BCP_DService gsBcpDService;

    @Resource
    private GS_AAACP_DService gsAaacpDService;

    @Resource
    private GS_MOOOP_DService gsMooopDService;

    @Resource
    private GS_WBHP_DService gsWbhpDService;

    @Resource
    private GS_ATG_WService gsAtgWService;

    @Resource
    private GS_AT_DService gsAtDService;

    @RequestMapping("/push/gs_at_d")
    public HashMap<String, Object> handleGS_AT_D(@RequestBody List<GS_AT_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_AT_D item : list) {


            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getBDATE() == null || item.getBDATE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "BDATE不能为空");
                return stringObjectHashMap;
            }

            if (item.getATN() == null || item.getATN().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ATN不能为空");
                return stringObjectHashMap;
            }

            if (item.getSE_TM() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SE_TM不能为空");
                return stringObjectHashMap;
            }

            if (item.getYSDJ() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "YSDJ不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_AT_D mode = gsAtDService.getByPrimaryKey(item.getTW_CD(), item.getBDATE(), item.getATN());
            if (mode != null) {
                int res = gsAtDService.modifyByPrimaryKey(item);
            } else {
                int res = gsAtDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_atg_w")
    public HashMap<String, Object> handleGS_ATG_W(@RequestBody List<GS_ATG_W> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_ATG_W item : list) {
            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getSTARTTM() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "STARTTM不能为空");
                return stringObjectHashMap;
            }

            if (item.getENDTM() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ENDTM不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_ATG_W mode = gsAtgWService.getByPrimaryKey(item.getTW_CD(), item.getSTARTTM(), item.getENDTM());
            if (mode != null) {
                int res = gsAtgWService.modifyByPrimaryKey(item);
            } else {
                int res = gsAtgWService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_wbhp_d")
    public HashMap<String, Object> handleGS_WBHP_D(@RequestBody List<GS_WBHP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_WBHP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_WBHP_D mode = gsWbhpDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsWbhpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsWbhpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_mooop_d")
    public HashMap<String, Object> handleGS_MOOOP_D(@RequestBody List<GS_MOOOP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_MOOOP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_MOOOP_D mode = gsMooopDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsMooopDService.modifyByPrimaryKey(item);
            } else {
                int res = gsMooopDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_aaacp_d")
    public HashMap<String, Object> handleGS_AAACP_D(@RequestBody List<GS_AAACP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_AAACP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_AAACP_D mode = gsAaacpDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsAaacpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsAaacpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_bcp_d")
    public HashMap<String, Object> handleGS_BCP_D(@RequestBody List<GS_BCP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_BCP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_BCP_D mode = gsBcpDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsBcpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsBcpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_opcp_d")
    public HashMap<String, Object> handleGS_OPCP_D(@RequestBody List<GS_OPCP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_OPCP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_OPCP_D mode = gsOpcpDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsOpcpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsOpcpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_phncp_d")
    public HashMap<String, Object> handleGS_PHNCP_D(@RequestBody List<GS_PHNCP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_PHNCP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_PHNCP_D mode = gsPhncpDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsPhncpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsPhncpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_misp_d")
    public HashMap<String, Object> handleGS_MISP_D(@RequestBody List<GS_MISP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_MISP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_MISP_D mode = gsMispDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsMispDService.modifyByPrimaryKey(item);
            } else {
                int res = gsMispDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    //2.6水质抽检非金属无机物检测项目数据表
    @RequestMapping("/push/gs_nmisp_d")
    public HashMap<String, Object> handleGS_NMISP_D(@RequestBody List<GS_NMISP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_NMISP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }


            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            GS_PCP_D gsPcpD = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (!(gsPcpD != null && gsPcpD.getTW_CD().equals(item.getTW_CD()))) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不存在");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_NMISP_D mode = gsNmispDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsNmispDService.modifyByPrimaryKey(item);
            } else {
                int res = gsNmispDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    //2.5水质抽检理化指标项目数据表
    @RequestMapping("/push/gs_pcp_d")
    public HashMap<String, Object> handleGS_PCP_D(@RequestBody List<GS_PCP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_PCP_D item : list) {
            if (item.getRP_CD() == null || item.getRP_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "RP_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TYPE不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_TP() == null || item.getST_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_TP不能为空");
                return stringObjectHashMap;
            }

            if (item.getW_TP() == null || item.getW_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "W_TP不能为空");
                return stringObjectHashMap;
            }

            if (item.getADDR() == null || item.getADDR().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ADDR不能为空");
                return stringObjectHashMap;
            }

            if (item.getAIRT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AIRT不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_PCP_D mode = gsPcpDService.getByPrimaryKey(item.getRP_CD());
            if (mode != null) {
                int res = gsPcpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsPcpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_awqmd_d")
    public HashMap<String, Object> handleGS_AWQMD_D(@RequestBody List<GS_AWQMD_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_AWQMD_D item : list) {
            if (item.getSTCD() == null || item.getSTCD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "STCD不能为空");
                return stringObjectHashMap;
            }

            if (item.getSPT() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "SPT不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_AWQMD_D mode = gsAwqmdDService.getByPrimaryKey(item.getSTCD(), item.getSPT());
            if (mode != null) {
                int res = gsAwqmdDService.modifyByPrimaryKey(item);
            } else {
                int res = gsAwqmdDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_mpwm_d")
    public HashMap<String, Object> handleGS_MPWM_D(@RequestBody List<GS_MPWM_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_MPWM_D item : list) {
            if (item.getSTCD() == null || item.getSTCD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "STCD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTM() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "USER不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_MPWM_D mode = gsMpwmDService.getByPrimaryKey(item.getSTCD(), item.getTM());
            if (mode != null) {
                int res = gsMpwmDService.modifyByPrimaryKey(item);
            } else {
                int res = gsMpwmDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_mp_d")
    public HashMap<String, Object> handleGS_MP_D(@RequestBody List<GS_MP_D> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_MP_D item : list) {
            if (item.getSTCD() == null || item.getSTCD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "STCD不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTM() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "USER不能为空");
                return stringObjectHashMap;
            }

            if (item.getDAY_W() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "DAY_W不能为空");
                return stringObjectHashMap;
            }


            item.setTS(new Date());
            item.setISSEND(200);

            GS_MP_D mode = gsMpDService.getByPrimaryKey(item.getSTCD(), item.getTM());
            if (mode != null) {
                int res = gsMpDService.modifyByPrimaryKey(item);
            } else {
                int res = gsMpDService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_tw_w")
    public HashMap<String, Object> handleGS_TW_W(@RequestBody List<GS_TW_W> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_TW_W item : list) {
            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTM() == null) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "USER不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_TW_W mode = gsTwWService.getByPrimaryKey(item.getTW_CD(), item.getTM());
            if (mode != null) {
                int res = gsTwWService.modifyByPrimaryKey(item);
            } else {
                int res = gsTwWService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_user_b")
    public HashMap<String, Object> handleGS_USER_B(@RequestBody List<GS_USER_B> list) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_USER_B item : list) {
            if (item.getID() == null || item.getID().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ID不能为空");
                return stringObjectHashMap;
            }

            if (item.getUSER() == null || item.getUSER().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "USER不能为空");
                return stringObjectHashMap;
            }

            if (item.getPASSWORD() == null || item.getPASSWORD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "PASSWORD不能为空");
                return stringObjectHashMap;
            }

            if (item.getNAME() == null || item.getNAME().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "NAME不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTYPE() == null || item.getTYPE().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "NAME不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_USER_B mode = gsUserBService.getByPrimaryKey(item.getID());
            if (mode != null) {
                int res = gsUserBService.modifyByPrimaryKey(item);
            } else {
                int res = gsUserBService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_at_w")
    public HashMap<String, Object> handleGS_AT_W(@RequestBody List<GS_AT_W> list) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_AT_W item : list) {
            if (item.getATN() == null || item.getATN().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ATN不能为空");
                return stringObjectHashMap;
            }

            if (item.getATNM() == null || item.getATNM().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "tATNM不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_AT_W mode = gsAtWService.getByPrimaryKey(item.getATN());
            if (mode != null) {
                gsAtWService.modifyByPrimaryKey(item);
            } else {
                gsAtWService.add(item);
            }
        }
        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/push/gs_stat_b")
    public HashMap<String, Object> handleGS_STAT_B(@RequestBody List<GS_STAT_B> list) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        for (GS_STAT_B item : list) {
            if (item.getSTCD() == null || item.getSTCD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "STCD不能为空");
                return stringObjectHashMap;
            }

            if (item.getST_NM() == null || item.getST_NM().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "ST_NM不能为空");
                return stringObjectHashMap;
            }

            if (item.getAD_CD() == null || item.getAD_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "AD_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getMON_TP() == null || item.getMON_TP().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "MON_TP不能为空");
                return stringObjectHashMap;
            }

            item.setTS(new Date());
            item.setISSEND(200);

            GS_STAT_B mode = gsStatBService.getByPrimaryKey(item.getSTCD(), item.getST_NM());
            if (mode != null) {
                gsStatBService.modifyByPrimaryKey(item);
            } else {
                gsStatBService.add(item);
            }
        }

        stringObjectHashMap.put("code", 0);
        stringObjectHashMap.put("message", "");
        return stringObjectHashMap;
    }

    @RequestMapping("/query/gs_stat_b")
    public List<GS_STAT_B> getGS_STAT_B() {
        return gsStatBService.getAll();
    }
}

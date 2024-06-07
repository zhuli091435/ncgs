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
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class DataServiceController {

    @Resource
    private GS_STAT_BService gsStatBService;

    @Resource
    private GS_AT_WService gsAtWService;

    @Resource
    private GS_USER_BService gsUserBService;

    @Resource
    private GS_TW_WService gsTwWService;

    //GS_MP_D
    @Resource
    private GS_MP_DService gsMpDService;

    //GS_MPWM_D
    @Resource
    private GS_MPWM_DService gsMpwmDService;
    @Resource
    private GS_AWQMD_DService gsAwqmdDService;

    //GS_PCP_D
    @Resource
    private GS_PCP_DService gsPcpDService;

    //GS_NMISP_D
    @Resource
    private GS_NMISP_DService gsNmispDService;

    //GS_MISP_D
    @Resource
    private GS_MISP_DService gsMispDService;

    //GS_PHNCP_D
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

    @RequestMapping("/push/data")
    public void pushData(String content, String tableName) {

        try {
            switch (tableName) {
                case "GS_STAT_B":
                    //1.3测站基本信息表
                    handleGS_STAT_B(content);
                    break;
                case "GS_AT_W":
                    //1.4用水户基础信息表
                    handleGS_AT_W(content);
                    break;
                case "GS_USER_B":
                    //1.6监管用户基础信息表
                    handleGS_USER_B(content);
                    break;
                case "GS_TW_W":
                    //2.1自来水公司每日水量数据表
                    handleGS_TW_W(content);
                    break;
                case "GS_MP_D":
                    //2.2测站水量自动监测表
                    handleGS_MP_D(content);
                    break;
                case "GS_MPWM_D":
                    //2.3测站水压自动监测表
                    handleGS_MPWM_D(content);
                    break;
                case "GS_AWQMD_D":
                    //2.4测站水质自动监测表
                    handleGS_AWQMD_D(content);
                    break;
                case "GS_PCP_D":
                    //2.5水质抽检理化指标项目数据表
                    handleGS_PCP_D(content);
                    break;
                case "GS_NMISP_D":
                    //2.6水质抽检非金属无机物检测项目数据表
                    handleGS_NMISP_D(content);
                    break;
                case "GS_MISP_D":
                    //2.7 水质抽检金属无机物检测项目数据表
                    handleGS_MISP_D(content);
                    break;
                case "GS_PHNCP_D":
                    //2.8 水质抽检酚类有机物检测项目数据表
                    handleGS_PHNCP_D(content);
                    break;
                case "GS_OPCP_D":
                    //2.9 水质抽检有机农药类检测项目数据表
                    handleGS_OPCP_D(content);
                    break;
                case "GS_BCP_D":
                    //2.10 水质抽检苯类有机物检测项目数据表
                    handleGS_BCP_D(content);
                    break;
                case "GS_AAACP_D":
                    //2.11 水质抽检卤代烷醛胺类有机物检测项目数据表
                    handleGS_AAACP_D(content);
                    break;
                case "GS_MOOOP_D":
                    //2.12 水质抽检金属有机物及其他有机物检测项目数据表
                    handleGS_MOOOP_D(content);
                    break;
                case "GS_WBHP_D":
                    //2.13 水质抽检水体卫生检测项目数据表
                    handleGS_WBHP_D(content);
                    break;
                case "GS_ATG_W":
                    //2.14停水公告数据表
                    handleGS_ATG_W(content);
                    break;
                case "GS_AT_D":
                    //2.15用水户用水信息数据表
                    handleGS_AT_D(content);
                    break;
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private HashMap<String, Object> handleGS_AT_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_AT_D.class);
        List<GS_AT_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_ATG_W(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_ATG_W.class);
        List<GS_ATG_W> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_WBHP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_WBHP_D.class);
        List<GS_WBHP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_MOOOP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_MOOOP_D.class);
        List<GS_MOOOP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_AAACP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_AAACP_D.class);
        List<GS_AAACP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_BCP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_BCP_D.class);
        List<GS_BCP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_OPCP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_OPCP_D.class);
        List<GS_OPCP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_PHNCP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_PHNCP_D.class);
        List<GS_PHNCP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_MISP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_MISP_D.class);
        List<GS_MISP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_NMISP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_NMISP_D.class);
        List<GS_NMISP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_PCP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_PCP_D.class);
        List<GS_PCP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_AWQMD_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_AWQMD_D.class);
        List<GS_AWQMD_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_MPWM_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_MPWM_D.class);
        List<GS_MPWM_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_MP_D(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_MP_D.class);
        List<GS_MP_D> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_TW_W(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_TW_W.class);
        List<GS_TW_W> list = objectMapper.readValue(content, javaType);
        for (GS_TW_W item : list) {
            if (item.getTW_CD() == null || item.getTW_CD().equals("")) {
                stringObjectHashMap.put("code", 1);
                stringObjectHashMap.put("message", "TW_CD不能为空");
                return stringObjectHashMap;
            }

            if (item.getTM() == null || item.getTM().equals("")) {
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

    private HashMap<String, Object> handleGS_USER_B(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_USER_B.class);
        List<GS_USER_B> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_AT_W(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_AT_W.class);
        List<GS_AT_W> list = objectMapper.readValue(content, javaType);
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

    private HashMap<String, Object> handleGS_STAT_B(String content) throws JsonProcessingException {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, GS_STAT_B.class);
        List<GS_STAT_B> list = objectMapper.readValue(content, javaType);
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
}

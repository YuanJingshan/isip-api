package com.jyyy.isip.api.dzpj.controller;

import com.alibaba.fastjson.JSONObject;
import com.jyyy.isip.common.utils.HttpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.BASE64Encoder;

/**
 * @author YuanJingshan
 * @version 1.0
 * @date 2020/9/25
 */
@Slf4j
@RestController
@RequestMapping("/api/person")
public class DZPJController {

    @Value("${interface.outside.dzpj}")
    private String DZPJ_URL;

    /**
     * 失败代码
     */
    private final String CODE_FAIL = "ISIP0001";

    //方法
    private final String DZPJ_TYPE_OUTPATIENT = "门诊电子票据";
    private final String DZPJ_TYPE_HOSPITALIZED = "住院电子票据";
    private final String DZPJ_TYPE_REGISTRATION = "挂号电子票据";
    private final String DZPJ_TYPE_CHECKUP = "体检电子票据";
    private final String DZPJ_TYPE_OFFBILL = "电子票据冲红";
    private final String DZPJ_TYPE_STATTE = "电子票据查询";
    private final String DZPJ_METHOD_OUTPATIENT = "invoiceEBillOutpatient";
    private final String DZPJ_METHOD_HOSPITALIZED = "invEBillHospitalized";
    private final String DZPJ_METHOD_REGISTRATION = "invEBillRegistration";
    private final String DZPJ_METHOD_CHECKUP = "invEBillCheckUp";
    private final String DZPJ_METHOD_OFFBILL = "writeOffEBill ";
    private final String DZPJ_METHOD_STATTE = "getEBillStatesByBillInfo ";

    private BASE64Encoder base64Encoder;

    public DZPJController() {
        this.base64Encoder = new BASE64Encoder();
    }

    @RequestMapping(value = "invoiceEBillOutpatient")
    @ResponseBody
    public JSONObject invoiceEBillOutpatient(@RequestBody JSONObject params) {
        try {
            log.info("method: {}, params: {}", DZPJ_TYPE_OUTPATIENT, params);
            String result = HttpUtils.post(DZPJ_URL.replace("{method}", DZPJ_METHOD_OUTPATIENT), params.toJSONString());
            return JSONObject.parseObject(result);
        } catch (Exception e) {
            log.error("method: {}, exception: {}", DZPJ_TYPE_OUTPATIENT, e);
            JSONObject eJson = new JSONObject();
            eJson.put("result", CODE_FAIL);
            eJson.put("message", base64Encoder.encode("信息集成平台请求电子票据异常!".getBytes()));
            return eJson;
        }
    }

    @RequestMapping(value = "invEBillHospitalized")
    @ResponseBody
    public JSONObject invEBillHospitalized(@RequestBody JSONObject params) {
        try {
            log.info("method: {}, params: {}", DZPJ_TYPE_HOSPITALIZED, params);
            String result = HttpUtils.post(DZPJ_URL.replace("{method}", DZPJ_METHOD_HOSPITALIZED), params.toJSONString());
            return JSONObject.parseObject(result);
        } catch (Exception e) {
            log.error("method: {}, exception: {}", DZPJ_TYPE_HOSPITALIZED, e);
            JSONObject eJson = new JSONObject();
            eJson.put("result", CODE_FAIL);
            eJson.put("message", base64Encoder.encode("信息集成平台请求电子票据异常!".getBytes()));
            return eJson;
        }
    }

//    @RequestMapping(value = "invEBillHospitalized")
//    @ResponseBody
//    public JSONObject invEBillHospitalized(@RequestBody JSONObject params) {
//        try {
//            log.info("method: {}, params: {}", DZPJ_TYPE_HOSPITALIZED, params);
//            String result = HttpUtils.post(DZPJ_URL.replace("{method}", DZPJ_METHOD_HOSPITALIZED), params.toJSONString());
//            return JSONObject.parseObject(result);
//        } catch (Exception e) {
//            log.error("method: {}, exception: {}", DZPJ_TYPE_HOSPITALIZED, e);
//            JSONObject eJson = new JSONObject();
//            eJson.put("result", CODE_FAIL);
//            eJson.put("message", base64Encoder.encode("信息集成平台请求电子票据异常!".getBytes()));
//            return eJson;
//        }
//    }
}

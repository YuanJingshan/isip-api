package com.jyyy.isip.app.api.company.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuanJingshan
 * @version 1.0
 * @description 企业信息相关接口
 * @date Create in 2019/8/30 11:28
 */
@RestController
@RequestMapping(value = "/api/company")
@Api(value = "/api/company", tags = "企业信息")
public class CompanyController {

//    @Autowired
//    private BaseInfoService baseInfoService;
//
//    @Autowired
//    private ESBaseInfoService esBaseInfoService;
//
//    @ApiOperation(value = "输入企业名称查询企业基础信息", notes = "企业基础信息")
//    @ApiImplicitParam(name = "content", value = "企业名称", dataType = "String", defaultValue = " ")
//    @RequestMapping(value = "find", method = RequestMethod.POST)
//    @ResponseBody
//    public MapResult find(String content) {
//        List<ESBaseInfo> esBaseInfos = esBaseInfoService.findByContent(content);
//        List<String> ids = new ArrayList<>();
//        for (ESBaseInfo esBaseInfo : esBaseInfos) {
//            ids.add(esBaseInfo.getId());
//        }
//        List<BaseInfo> baseInfos = baseInfoService.findByIds(ids);
//        return new MapResult().ok().put("data", baseInfos);
//    }
}

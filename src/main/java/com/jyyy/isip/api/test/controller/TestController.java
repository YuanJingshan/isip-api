package com.jyyy.isip.api.test.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanJingshan
 * @version 1.0
 * @description swagger测试
 * @date Create in 2019/8/29 16:49
 */
@RestController
@RequestMapping("/api/test")
@Api(tags = "测试接口")
public class TestController {
    /**
     * @return
     * @ApiOperation：用在请求的方法上，说明方法的用途、作用 value="说明方法的用途、作用"
     * notes="方法的备注说明"
     * @ApiImplicitParams：用在请求的方法上，表示一组参数说明
     * @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面 name：参数名
     * value：参数的汉字说明、解释
     * required：参数是否必须传
     * paramType：参数放在哪个地方
     * · header --> 请求参数的获取：@RequestHeader
     * · query --> 请求参数的获取：@RequestParam
     * · path（用于restful接口）--> 请求参数的获取：@PathVariable
     * · body（不常用）
     * · form（不常用）
     * dataType：参数类型，默认String，其它值dataType="Integer"
     * defaultValue：参数的默认值
     * @ApiResponses：用在请求的方法上，表示一组响应
     * @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息 code：数字，例如400
     * message：信息，例如"请求参数没填好"
     * response：抛出异常的类
     * @ApiModel：用于响应类上，表示一个返回响应数据的信息 （这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）
     * @ApiModelProperty：用在属性上，描述响应类的属性
     */
    @ApiOperation(value = "测试接口", notes = "测试接口")
    @ApiImplicitParam(name = "name", value = "名称", dataType = "String", defaultValue = " ")
    @RequestMapping(value = "show", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> showInfo(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("welcome", "hello word!");
        return map;
    }


    @ApiOperation(value = "测试JSON")
    @PostMapping(value = "/json", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> json(@RequestBody JSONObject jsonParam) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "袁景山");
        map.put("welcome", "hello word!");
        return map;
    }
}

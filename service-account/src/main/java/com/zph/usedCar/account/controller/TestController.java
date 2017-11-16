package com.zph.usedCar.account.controller;

import com.zph.usedCar.account.service.TestService;
import com.zph.usedCar.entity.test.TestEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @notes 测试接口
 * @autho zph
 * @createTime 2017/11/16 12:08
 */
@RestController
@RequestMapping("/test")
@Api(value = "tests", description = "测试接口", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "test接口", notes = "测试专用")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public TestEntity test(){
        return testService.getTestEntityBy(1);
    }
}

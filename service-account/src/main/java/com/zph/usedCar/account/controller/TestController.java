package com.zph.usedCar.account.controller;

import com.zph.usedCar.entity.test.TestEntity;
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
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public TestEntity test(){
        TestEntity testEntity = new TestEntity();
        testEntity.setCode("test");
        testEntity.setId(1);
        testEntity.setName("test");
        return testEntity;
    }
}

package com.zph.usedCar.account.service.impl;

import com.zph.usedCar.account.dao.TestDao;
import com.zph.usedCar.account.service.TestService;
import com.zph.usedCar.entity.test.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @notes
 * @autho zph
 * @createTime 2017/11/16 16:07
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;
    @Override
    public TestEntity getTestEntityBy(Integer id) {
        return testDao.getTestEntityById(id);
    }
}

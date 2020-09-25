package com.jyyy.isip.app.api.company.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/9/4.
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseInfoMapperTest {

    @Autowired
    private BaseInfoMapper baseInfoMapper;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void selectById() throws Exception {
        log.info("{}", baseInfoMapper.selectById("62340017C99C11E9B93904D4C4593FEF"));
    }

    @Test
    public void selectByIdS() {
        List<String> ids = new ArrayList<>();
        ids.add("62340017C99C11E9B93904D4C4593FEF");
        log.info("{}", baseInfoMapper.selectByIds(ids).toString());
    }

}
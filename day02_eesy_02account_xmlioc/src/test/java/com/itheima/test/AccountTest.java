package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import com.itheima.service.impl.AccountServiceImpl;
import config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: SongJunHui
 * email:1097772818@qq.com
 * blog: https://blog.csdn.net/s4742488
 * @Date: 2019/5/26 18:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:Spring/bean*.xml",classes = SpringConfig.class)
public class AccountTest {
    String sql;
    @Autowired
    private AccountServiceImpl as;
    @Test
    public void test1(){
        List<Account> allAccount = as.findAllAccount();
        System.out.println(allAccount);
        System.out.println(sql);
    }
    @Test
    public void test2(){
        User user = new User();
    }
}

package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.impl.AccountServiceImpl;
import config.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Author: SongJunHui
 * email:1097772818@qq.com
 * blog: https://blog.csdn.net/s4742488
 * @Date: 2019/5/26 18:17
 */

public class AccountTest1 {
    @Test
    public void test2(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountServiceImpl bean = ac.getBean(AccountServiceImpl.class);
        List<Account> allAccount = bean.findAllAccount();
        System.out.println(allAccount);
    }

}

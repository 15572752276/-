package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用Junit单元测试：测试我们的配置
 */
public class AccountServiceTest {


    @Test
    public void testFindAll() {
        //3.执行方法
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean-service.xml");
        IAccountService as = ac.getBean(IAccountService.class);
        List<Account> accounts = as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //3.执行方法
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean-service.xml");
        IAccountService as = ac.getBean(IAccountService.class);
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean-service.xml");
        IAccountService as = ac.getBean(IAccountService.class);

        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        //3.执行方法
        as.saveAccount(account);

    }

    @Test
    public void testUpdate() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean-service.xml");
        IAccountService as = ac.getBean(IAccountService.class);



        //3.执行方法
        Account account = as.findAccountById(4);
        account.setMoney(23456f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean-service.xml");
        IAccountService as = ac.getBean(IAccountService.class);


        //3.执行方法
        as.deleteAccount(4);
    }


    @Test
    public void test1(){

    }
}

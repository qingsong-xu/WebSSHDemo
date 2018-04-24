package com.xuqingsong.ssh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class HibernateTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        //创建配置对象
        Configuration configuration = new Configuration().configure();
        //通过配置对象创建服务注册对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        //创建会话工厂对象
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        //获得会话对象
        session = sessionFactory.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    @After
    public void destory() {
        //提交事务
        transaction.commit();
        //关闭会话
        session.close();
        //关闭会话工厂
        sessionFactory.close();
    }

    @Test
    public void testSaveStudents() {
        Student s = new Student("1", "张三峰", "19", new Date());
        session.save(s);
    }


}

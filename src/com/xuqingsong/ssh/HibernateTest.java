package com.xuqingsong.ssh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class HibernateTest {

    @Test
    public void query(){

        Configuration config = new Configuration().configure(); // Hibernate框架加载hibernate.cfg.xml文件
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession(); // 相当于得到一个Connection
        // 开启事务
        session.beginTransaction();

        // 根据业务来编写代码
        StudentEntity c = session.load(StudentEntity.class, 1);

        System.out.println(c.getName());

        // 事务提交
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}

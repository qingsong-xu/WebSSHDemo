package com.xuqingsong.ssh.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @Author: xuqingsong
 * @Date: 2018/4/25 0025 上午 11:10
 */
public class HelloworldStruts2 extends ActionSupport {
    private String message;

    @Override
    public String execute() throws Exception {
        message = "Hello world,Struts2";
        System.out.println("execute 执行了？.......");
        return SUCCESS;
    }

    public String sayHello(){
        message = "Hello world,Struts2";
        System.out.println("execute 执行了？.......");
        return SUCCESS;
    }

    public String getMessage(){
        return message;
    }
}

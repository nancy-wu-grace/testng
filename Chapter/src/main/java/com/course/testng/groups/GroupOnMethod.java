package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "service")
    public void service1(){
        System.out.println("这是服务端执行的方法1111");
    }

    @Test(groups = "service")
    public void service2(){
        System.out.println("这是服务端执行的方法2222");
    }

    @Test(groups = "client")
    public void client1(){
        System.out.println("这是客户端执行的方法3333");
    }

    @Test(groups = "client")
    public void client2(){
        System.out.println("这是客户端执行的方法4444");
    }

    @BeforeGroups("service")
    public void beforeServicea(){
        System.out.println("这是服务端之前执行的方法");
    }
    @AfterGroups("service")
    public void afterServicev(){
        System.out.println("这是服务端之后执行的方法");
    }

}

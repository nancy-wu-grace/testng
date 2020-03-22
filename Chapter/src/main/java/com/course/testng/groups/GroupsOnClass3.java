package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void test1(){
        System.out.println("这是GroupsOnClass333的测试方法111");
    }

    public void test2(){
        System.out.println("这是GroupsOnClass333的测试方法222");
    }
}

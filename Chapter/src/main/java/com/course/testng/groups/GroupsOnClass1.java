package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void test1(){
        System.out.println("这是GroupsOnClass1的方法11111");
    }

    public void test2(){
        System.out.println("这是GroupsOnClass1的方法222222");
    }
}

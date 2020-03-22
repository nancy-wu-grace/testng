package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void test1(){
        System.out.println("这是GroupsOnClass22222的方法1111");
    }

    public void test2(){
        System.out.println("这是GroupsOnClass2222的方法2222");
    }
}

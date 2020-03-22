package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test这是基本的testng测试1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是基本的测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMthod这是在测试方法之前运行的方法");
    }
    @AfterMethod
    public void afterMathod(){
        System.out.println("afterMathod这是在测试方法之后运行的方法");
    }
    @BeforeClass
    public  void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类之后运行的方法");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforetest运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行啦");
    }
}

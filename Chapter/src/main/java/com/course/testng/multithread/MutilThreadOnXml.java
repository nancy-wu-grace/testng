package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MutilThreadOnXml {

    @Test
    public void test01(){
        System.out.println("这是test01:"+Thread.currentThread().getId());
    }
    @Test
    public void test02(){
        System.out.println("这是test02:"+Thread.currentThread().getId());
    }
    @Test
    public void test03(){
        System.out.println("这是test03:"+Thread.currentThread().getId());
    }
}

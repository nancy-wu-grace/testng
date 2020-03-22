package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

public class ParamterTest {

    @Test
    @Parameters({"name","age"})
    public void test1(String name,int age){
        System.out.println("姓名："+name+","+"年龄："+age);
    }
}

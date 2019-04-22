package com.testCase;
//初始化浏览器

import com.base.DriverBase;

public class CaseBase {
    public DriverBase InitDriverBase(String browser) {

        return new DriverBase(browser);
    }
}
//1.初始化DriverBase类
//2.内部定义一个InitDriverBase方法,返回类型为DriverBase类型,参数类型是浏览器驱动名称
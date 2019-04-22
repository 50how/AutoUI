package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.page.LoginPage;
//浏览器的基类
public class DriverBase {
    public WebDriver driver;

    //构造方法
    public DriverBase(String browser) {
        //初始化浏览器选择类
        SelectDriver selectDriver=new SelectDriver();
        //把确定之后的浏览器实例赋值给当前的Webdriver
        this.driver=selectDriver.driverName(browser);
    }

    /*
     * 获取driver
     * */
    public WebDriver getDriver() {
        return driver;
    }

    //关闭浏览器驱动方法
    public void stopDriver() {
        System.out.println("Stop Driver!");
        driver.close();
    }


    /*
     * 封装Element方法
     * 
     * */
    public WebElement findElement(By by) {
        WebElement element=driver.findElement(by);
        return element;
    }

    /*
     * get封装
     * */
    public void get(String url) {
        driver.get(url);
    }
}

/*
1.确定当前的浏览器类型
2.封装浏览器的关闭,查找元素,跳转页面等功能
3.实例化SelectDriver类,并且传入浏览器驱动类型
*/
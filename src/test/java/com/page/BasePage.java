package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.DriverBase;
//基本页面的类
public class BasePage {
    public DriverBase driverBase;
    //构造方法
    public BasePage(DriverBase driverBase) {
        //把初始化传入的DriverBase赋值给当前BasePage类的DriverBase的变量
        this.driverBase=driverBase;
    }

    /*
     * 定位Element
     * 
     * @param By by
     * 
     * */
    public WebElement element(By by) {
        WebElement ele=driverBase.findElement(by);
        return ele;
    }

    /*
     * 封装click（点击）方法
     * 需要传入一个WebElement类型的元素
     * 
     * */
    public void click(WebElement element) {
        if(element!=null) {
            element.click();
        }else {
            System.out.println("元素未定位到,定位失败");
        }
    }

    /*
     * 封装输入方法
     * 
     * */
    public void sendKeys(WebElement element,String value) {
        if(element!=null) {
            element.sendKeys(value);
        }else {
            System.out.println(element+"元素没有定位到,输入失败"+value);
        }
    }

    /*
     * 判断元素是否显示方法
     * 
     * */
    public boolean assertElementIs(WebElement element) {
        return element.isDisplayed();
    }

}

//1.充当测试类的基类，比如登录，购物车等功能，参数是一个DriverBase类对象
//2.封装浏览器驱动的查找,点击，输入，是否显示等方法
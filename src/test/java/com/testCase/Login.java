package com.testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.DriverBase;
import com.business.LoginPro;

public class Login extends CaseBase{
    public DriverBase driverBase;
    public LoginPro loginPro;
    //构造方法
    public Login() {
        //确定运行脚本的为chrome浏览器，并且赋值给当前类的DriverBase
        this.driverBase=InitDriverBase("chrome");
        loginPro=new LoginPro(driverBase);
    }
    @Test
    public void getLoginHome() {
        driverBase.get("http://www.imooc.com");
        driverBase.getDriver().manage().window().maximize();
        driverBase.findElement(By.id("js-signin-btn")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test(dependsOnMethods={"getLoginHome"})
    public void testLogin() {
        loginPro.login("m13031155057@163.com", "1111");
    }
}

//1.构造方法中确定DriverBase的类型为chrome,并且把它赋值给了实例化的LoginPro类
//2.testLogin方法依赖getLoginHome方法运行
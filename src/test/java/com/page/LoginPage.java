package com.page;

import org.openqa.selenium.WebElement;

import com.base.DriverBase;
import com.util.GetByLocator;

public class LoginPage extends BasePage{

    public LoginPage(DriverBase driverBase) {
        super(driverBase);
        // TODO Auto-generated constructor stub
    }
    /*
     * 获取用户名输入框Element
     * 
     * */
    public WebElement getUserElement() {
        //找到properties中的userName变量
        return element(GetByLocator.getLocator("userName"));
    }

    /*
     * 获取密码输入框Element
     * 
     * */
    public WebElement getPasswordElement() {
        return element(GetByLocator.getLocator("userPass"));
    }

    /*
     * 获取登录按钮输入框
     * 
     * */
    public WebElement getLoginButtonElement() {
        return element(GetByLocator.getLocator("buttonElement"));
    }

    /*
     * 获取自动登录Element
     * 
     * */
    public WebElement getAutoLoginElement() {
        return element(GetByLocator.getLocator("autoSigin"));
    }
}

//.得到properties类中的变量,并且根据变量得到相应的值，拿到该元素,如:用户名输入框,密码输入框,自动登录,登录等按钮
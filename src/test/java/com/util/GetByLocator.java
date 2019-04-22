package com.util;

import org.openqa.selenium.By;

public class GetByLocator {
    public static By getLocator(String key) {
        ProUtil proUtil=new ProUtil("element.properties");
        String locator=proUtil.getPro(key);
        String locatorType=locator.split(">")[0];
        String locatorValue=locator.split(">")[1];
        if(locatorType.equals("id"))
        {
            return By.id(locatorValue);
        }else if(locatorType.equals("name"))
        {
            return By.name(locatorValue);
        }else if(locatorType.equals("className"))
        {
            return By.className(locatorValue);
        }else
        {
            return By.xpath(locatorValue);
        }

    }
}

/*
1.确定properties配置文件,并且识别并读取配置文件的信息
2.根据配置文件的信息返回特定的By类型,By.id或name，xpath等
*/
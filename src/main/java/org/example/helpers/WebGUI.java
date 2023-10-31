package org.example.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebGUI {

    private WebDriver webDriver;

    public WebElement findElementById(String id){
        return webDriver.findElement(By.id(id));
    }

    public WebElement findElementByXpath(String xpath){
        return webDriver.findElement(By.xpath(xpath));
    }




}

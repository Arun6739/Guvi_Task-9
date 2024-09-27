package com.WDB2.Selenium_Task;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {
    public static void main(String[] args) {

		WebDriver driver= new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();
        
        try {
            Thread.sleep(5000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.quit();
    }
}

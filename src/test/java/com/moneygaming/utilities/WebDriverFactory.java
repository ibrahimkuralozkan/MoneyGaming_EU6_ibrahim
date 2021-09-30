package com.moneygaming.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {



    public static WebDriver getDriver(String browserType){
        WebDriver driver = null;

        switch (browserType.toLowerCase()){

            case "chrome":

                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().window().maximize();

                    break;
            case "firefox":

                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                break;


        }

        return driver;
    }





}

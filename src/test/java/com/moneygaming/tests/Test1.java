package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {


    @BeforeMethod
    public void setup(){
    WebDriver driver = WebDriverFactory.getDriver("chrome");


    }

    @Test
    public void Test1(){


    }

    @AfterMethod
    public void tearDowm(){


    }



}

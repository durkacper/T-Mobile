package utils;

import pageObjects.PageObjectManager;

public class TestContextSetup {

    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public TestContextSetup(){
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.initializeWebDriver());
    }
}

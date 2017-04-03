package com.syn.tfs.stepdef;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import bsh.This;

import com.syn.tfs.Repository.LoggerRepo;

public class Test {

	public static void method()  
	{
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		Logger log ;
		String className=String.class.getName();
		LoggerRepo.setLogger(className);
		log=LoggerRepo.getLogger();
		driver.get("http://www.google.com");					
		WebElement element = driver.findElement(By.name("q"));	
        element.sendKeys("Guru99");	
        log.error("Value entred");
        element.submit();	
        log.info("Clicked on submit button");
        System.out.println("Page title is: " + driver.getTitle());
        log.debug("title printed");
       
       driver.quit();
	}
	public static void main(String[] args) throws IOException
	{
		Test t=new Test();
		t.method();
	}
}
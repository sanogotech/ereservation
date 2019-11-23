package com.formation.ereservation;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginTest {
	
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @BeforeAll
  public  static void init() {
	  System.setProperty("webdriver.chrome.driver","driverselenium/chromedriver.exe");
  }
  
  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void login() {
    driver.get("http://localhost:8080/login");
    //driver.manage().window().setSize(new Dimension(1038, 728));
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.cssSelector(".form-signin")).click();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("admin");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.cssSelector(".active > #home-section .row")).click();
  }
}

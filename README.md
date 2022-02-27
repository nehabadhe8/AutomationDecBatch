# AutomationDecBatch
This is my 1st file
package com.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	
	@BeforeMethod
	public void login() {
		System.out.println("Application Login");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Application Logout");
	}
	
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is opened");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser Closed");
	}
	@Test
	public void TC01() {
		System.out.println("TC01 is executed");

package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Payment extends BaseClass {

	public Payment paymentMode()
	{
		driver.findElement(By.xpath("//input[@id='razorpay']")).click();
		return this;}
	public Payment confirmOrder()
	{
		driver.findElement(By.xpath("//button[text()='Confirm Order']")).click();
		return this;
	}
	
	
}

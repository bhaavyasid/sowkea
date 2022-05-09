package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Register extends BaseClass {

	
	public Register continuee()
	{
		
	driver.findElement(By.xpath("//a[text()='Continue']")).click();
	return this;
	}
	
	public Register firstname()
	{
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("bhavya");
		return this;
		}
	public Register lastname()
	{
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("sree");
		return this;
		}
	public Register email() {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("bhavya@gmail.com");
		return this;
		}
	public Register telephone()
	{
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9972890491");
		return this;}
	public Register sendotp() throws InterruptedException
	{
			driver.findElement(By.xpath("//button[@id='send_otp']")).click();
			Thread.sleep(2000);
			return this;
			}
	
	public Register password() {
			driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("bhavisid");
			return this;}
	public Register conifrmpassword()
	{
			driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("bhavisid");
			return this;}
	public Checkout agree() {
			driver.findElement(By.xpath("//input[@name='agree']")).click();
			return new Checkout();}
	
	
	
	
	
	
	
	
	
	
}


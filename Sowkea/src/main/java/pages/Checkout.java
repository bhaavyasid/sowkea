package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class Checkout extends BaseClass  {

	public Checkout paymentfirstname()
	{
		driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("bhavisid");
		return this;
		}
	public Checkout paymentlastname()
	{
		driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("sid");
		return this;
		}
	public Checkout paymentcompany() {
		driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys("plot36");
		return this;
		}
	public Checkout paymentaddress1() {
		
		driver.findElement(By.xpath("////input[@id=input-payment-address-1")).sendKeys("vgp 3rd st");
		return this;
		}
	public Checkout paymentaddress2() {
		driver.findElement(By.xpath("//input[@id=input-payment-address-2")).sendKeys("temple");
		return this;
		}
	public Checkout paymentcity()
	{
		driver.findElement(By.xpath("//input[@id=input-payment-city")).sendKeys("chennai");
		return this;
		}
	
	public Checkout shippingFirstname()
	{
		driver.findElement(By.xpath("//input[@id='input-shipping-firstname']")).sendKeys("bhavisid");
		return this;
		}
	public Checkout shippinglastname()
	{
		driver.findElement(By.xpath("//input[@id='input-shipping-lastname']")).sendKeys("sid");
		return this;
		}
	public Checkout shippingcompay()
	{driver.findElement(By.xpath("//input[@id='input-shipping-company']")).sendKeys("plot36");
	 return this;
	}
	public Checkout shippingAddress1()
	{driver.findElement(By.xpath("//input[@id='input-shipping-address-1']")).sendKeys("vgp 3rd st");
	return this;}
	public Checkout shippingAddress2()
	{
		driver.findElement(By.xpath("//input[@id='input-shipping-address-2']")).sendKeys("temple");
		return this;}
	public Payment shippingcity()
	{
		driver.findElement(By.xpath("//input[@id='input-shipping-city']")).sendKeys("chennai");
	return new Payment();
	}
	}
	
	
	


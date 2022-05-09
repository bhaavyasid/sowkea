package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import base.BaseClass;

public class Navigate extends BaseClass  {

	public Navigate pinCode()
	{
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys("600064",Keys.ARROW_DOWN,Keys.ENTER);

		return this;}
	public Navigate pinSelection()
	{
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li")).click();
		return this;}
	public Navigate clickCartbutton()
	{
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		return this;}
	public Navigate addedproducttoclick()
	{
		driver.findElement(By.xpath("//div[@id='cart']")).click();
		return this;}
	public Navigate refresh()
	{
		driver.navigate().refresh();
		return this;
	}
	
	
	public Register carttoclick()
	{
		
		
		driver.findElement(By.xpath("//div[@id='cart']")).click();
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		return new Register();
		}
}


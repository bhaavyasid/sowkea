package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class Search extends BaseClass {

	public Search search() {
		
		WebElement fe1 = driver.findElement(By.xpath("//button[@id='search_toggle']"));
		fe1.click();
		return this;
	        }
		public Search passInput() {
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Coconut Water Combo (each 330ml)",Keys.ENTER);	
		return this;
	        }
		public Search selectProduct() {
			driver.findElement(By.xpath("//img[@class='img-responsive second-img']")).click();
			return this;
			}
		public Search addProduct() {
			driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
            driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-plus']")).click();
            return this;
            }
		public Navigate clickProduct()
		{
			driver.findElement(By.xpath("//span[@class='productlocbutton']")).click();
		return new Navigate();
		}
		
		
}
		


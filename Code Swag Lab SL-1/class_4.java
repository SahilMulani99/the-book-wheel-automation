package swag_labs_project_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class_4 extends class_3{
	
	@Test(priority=4)
	void cart_checkout() throws InterruptedException
	{
		//this for click to cart button
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span")).click();
		
		//for checkout button
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]")).click();
		
		//this line of code for find first name box and provide first name into the box
		Thread.sleep(500);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[1]")).sendKeys("Sahil");
		
		//this line of code for find last name box and provide last name into the box
		Thread.sleep(500);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[2]")).sendKeys("Mulani");
		
		//this line of code for find zip code box and provide zip code into the box
		Thread.sleep(500);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[1]/input[3]")).sendKeys("412802");
		
		//click on continue button
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input")).click();
		
		//cancel the checkout
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[1]")).click();
		
	}

}

package swag_labs_project_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class_3 extends class_2 {
	
	@Test(priority=3)
	void add6items() throws InterruptedException
	{
		//add 6 items into the cart
		
		//item (1)
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
		
		//item (2)
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")).click();
		
		//item (3)
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button")).click();
		
		//item (4)
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[4]/div[3]/button")).click();
		
		//item (5)
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[5]/div[3]/button")).click();
		
		//item (6)
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[6]/div[3]/button")).click();
		
		//this for click to cart button
		Thread.sleep(2000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span")).click();
		
		//for checkout button
		Thread.sleep(2000);
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
		
		//cancel the checkout of product
		Thread.sleep(2000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/a")).click();
		
		//go to continue shopping
		Thread.sleep(2000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[1]")).click();
		
	}

}

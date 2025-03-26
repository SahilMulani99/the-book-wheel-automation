package swag_labs_project_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class_2 extends class_1 {
	
	@Test(priority=2)
	void add_item_to_the_cart() throws InterruptedException
	{
		//add one item to cart
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
		
		//click on cart button
		Thread.sleep(2000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span")).click();
		
		//click remove button
		Thread.sleep(2000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
		
		//click on continue shopping button
		Thread.sleep(1000);
		gg.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[1]")).click();
		
	}

}

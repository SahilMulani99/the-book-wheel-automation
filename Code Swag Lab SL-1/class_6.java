package swag_labs_project_1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class class_6 extends class_5 {
	
	@Test(priority=6)
	void logout() throws InterruptedException
	{
		//click menu button
		Thread.sleep(1500);
		gg.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/button")).click();
		
		//then click logout
		Thread.sleep(1500);
		gg.findElement(By.id("logout_sidebar_link")).click();
		
		//and final line of code is for close quit testing
		Thread.sleep(2000);
		gg.quit();
	}

}

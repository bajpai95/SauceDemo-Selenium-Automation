package pra_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("inventory_item_name")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		String product=driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("Product in cart : " + product);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Anjali");
		driver.findElement(By.id("last-name")).sendKeys("Bajpai");
		driver.findElement(By.id("postal-code")).sendKeys("209728");
		driver.findElement(By.id("continue")).click();
		String checkoutProduct=driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("checkoutProduct : " + checkoutProduct);
		if(checkoutProduct.equals("Sauce Labs Backpack")) {
			System.out.println("Product Verification Passed");
		}
		else {
			System.out.println("Product Verification Failed");
		}
		String total=driver.findElement(By.className("summary_total_label")).getText();
		System.out.println("checkout : " + total);
		driver.findElement(By.id("finish")).click();
		String message=driver.findElement(By.className("complete-header")).getText();
		System.out.println("order status : " + message);
		if(message.equals("Thank you for your order!")) {
			System.out.println("Order Verification Passed");
		}
		else {
			System.out.println("Order Verification Failed");
		}
		
		driver.quit();
		
//		if(product.equals("Sauce Labs Backpack")) {
//			System.out.println("Verification is Passed");
//		}
//		else {
//			System.out.println("Verification is Failed");
//		}
//		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
//		int count=driver.findElements(By.className("cart_item")).size();
//		if(count==0) {
//			System.out.println("Cart is empty - Verification passed");
//		}
//		else {
//			System.out.println("Cart is not empty - Verification failed");
//		}
		

		

	    
	}

}


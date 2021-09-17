package user_authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.getDriver();

		// Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,850);");
		Thread.sleep(1000);

		// click on login button
		WebElement read_more = driver.findElement(By.xpath("//a[@href='/job/software-engineer-php-laravel']"));
		read_more.click();
		Thread.sleep(2000);

		// click on Apply Now button.
		jse.executeScript("window.scrollBy(0,2500);");
		Thread.sleep(1000);
		WebElement apply = driver.findElement(By.xpath("//a[@href='/job/software-engineer-php-laravel/apply']"));
		apply.click();
		Thread.sleep(2000);

		// login
		WebElement full_name = driver.findElement(By.id("full_name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement phone = driver.findElement(By.id("phone"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement rePassword = driver.findElement(By.id("re-password"));
		WebElement resume = driver.findElement(By.id("resume"));

		Thread.sleep(2000);

		// set the element input
		full_name.sendKeys("Md Mostafa Munna");
		email.sendKeys("testermunna12@mailinator.com");
		phone.sendKeys("1584587854");
		password.sendKeys("332211");
		rePassword.sendKeys("332211");
		resume.sendKeys("C:\\Users\\Mediusware\\Downloads\\JD Writing.pdf");

		Thread.sleep(5000);

//		// find the button and click on it
//		WebElement submit = driver.findElement(By.className("login-btn"));
//		submit.click();
//		Thread.sleep(5000);

//		WebElement account = driver.findElement(By.xpath("//header/ul[2]/li[1]/a[1]"));
//		account.click();
//
//		WebElement logout = driver.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/a[2]"));
//		logout.click();
		driver.close();

	}

}

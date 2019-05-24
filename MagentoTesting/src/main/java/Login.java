

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
WebDriver driver;
By email = By.id("email");
By pass = By.id("pass");
By login = By.id("send2");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("priyankavijaykumar555@gmail.com");
	}
	public void typepassword()
	{
		driver.findElement(pass).sendKeys("Welcome123");
	}
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
	

}

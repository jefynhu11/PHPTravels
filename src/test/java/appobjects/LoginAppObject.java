package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {

	private WebDriver driver;
	
	public LoginAppObject (WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getAcessButtonLogin() {
//		return driver.findElement(By.id("dropdownCurrency"));
		return driver.findElement(By.xpath("//*[contains(@class,'dropdown-login')]"));
	}
	
	public WebElement getAcessLogin() {
		return driver.findElement(By.xpath("//*[contains(@class,'active tr')]"));
	}
	
	public WebElement getName() {
//		return driver.findElement(By.className("username"));
		return driver.findElement(By.xpath("//*[contains(@name,'username')]"));
	}
	
	public WebElement getPassword() {
//		return driver.findElement(By.className("password"));
		return driver.findElement(By.xpath("//*[contains(@name,'password')]"));
	}
	
	public WebElement getEntraLogin() {
		return driver.findElement(By.xpath("//*[contains(@class,'loginbtn')]"));		
	}
	
	public WebElement getBarraTours() {
//		return driver.findElement(By.xpath("//*[contains(@class,'tours')]"));
//		return driver.findElement(By.xpath("//*[@id='mobileMenuMain']/nav/ul/li[4]/a"));
		return driver.findElement(By.cssSelector("#mobileMenuMain > nav > ul > li:nth-child(4) > a"));
	}
	public WebElement getTiraPropaganda() {
		return driver.findElement(By.cssSelector("#cookyGotItBtnBox button"));
	}
	
	public WebElement getEscolhaImagem() {
//		return driver.findElement(By.xpath("//*[contains(@src,'nile')]"));
		return driver.findElement(By.cssSelector(".gap-xl-30 div:nth-child(1) figure a"));
	}
	
	public WebElement clicaButtonBookNow() {
		return driver.findElement(By.cssSelector("aside div > form > button"));
//		return driver.findElement(By.cssSelector("body  form > button"));
//		return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[4]/div/div[1]/aside/div/form/div/form/button"));
	}
	
	public WebElement getOpcao() {
//		return driver.findElement(By.id("8"));
		return driver.findElement(By.cssSelector("#bookingdetails  tr:nth-child(2)  span.slider.round"));
	}
}

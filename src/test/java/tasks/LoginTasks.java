package tasks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import appobjects.LoginAppObject;
import frameworks.utils.WaitElementFw;

public class LoginTasks {
	private WebDriver driver;
	private LoginAppObject loginAppObject;
	
	
	public LoginTasks (WebDriver driver) {
		this.driver = driver;
		this.loginAppObject = new LoginAppObject(driver);
	}
	
	public void clicaButtonLogin() {
		loginAppObject.getAcessButtonLogin().click();
	}
	
	public void clicaAcessLogin() {
		loginAppObject.getAcessLogin().click();
	}
	
	public void textEmail(String text) {
		loginAppObject.getName().sendKeys(text);
	}
	
	public void textPassword(String text) {
		loginAppObject.getPassword().sendKeys(text);
	}
	
	public void clicaEntraLogin() {
		loginAppObject.getEntraLogin().click();
	}
	
	public void clicaBarraTours() {
		loginAppObject.getBarraTours().click();
		loginAppObject.getBarraTours().click();
	}
	
	public void clicaImagem() {
		loginAppObject.getEscolhaImagem().click();
	}
	
	public void clicaGotIt() {
		WaitElementFw.visibilityOf(driver, loginAppObject.getTiraPropaganda());
		loginAppObject.getTiraPropaganda().click();
	}

	public void clicaButtonBookNow() {
		WaitElementFw.visibilityOf(driver, loginAppObject.clicaButtonBookNow());
		loginAppObject.clicaButtonBookNow().click();
		loginAppObject.clicaButtonBookNow().click();
	}
	
	public void clicaButtonOpcao() {
		WaitElementFw.visibilityOf(driver, loginAppObject.getOpcao());
		loginAppObject.getOpcao().click();
	}
}

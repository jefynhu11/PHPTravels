package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frameworks.utils.BaseTestFw;
import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LoginTasks;

public class TestCase extends BaseTestFw {

	private WebDriver driver;
	private LoginTasks loginTasks;
	
	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("https://www.phptravels.net/");
		this.loginTasks = new LoginTasks(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
	loginTasks.clicaButtonLogin();
	loginTasks.clicaAcessLogin();
	loginTasks.textEmail("jefersonzidane@hotmail.com");
	loginTasks.textPassword("0123456789");
	loginTasks.clicaEntraLogin();
	loginTasks.clicaBarraTours();
	loginTasks.clicaGotIt();
	loginTasks.clicaImagem();
	loginTasks.clicaButtonBookNow();
	loginTasks.clicaButtonOpcao();
	}
	
}
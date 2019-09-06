package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SPatente extends PageObject {

//	@FindBy(id = "vPATENTE")
	private WebElement spatente = driver.findElement(By.xpath("//select[@id='vPATENTE']"));

	public SPatente(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(spatente));
		return this.spatente.isDisplayed();
	}

	public void ingresaPatente(String spatente) {
		this.spatente.clear();
		this.spatente.sendKeys(spatente);
	}
}

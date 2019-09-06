package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Continuar extends PageObject {

//	@FindBy(name = "CONTINUAR")
	private WebElement continuar = driver.findElement(By.xpath("//input[@name='CONTINUAR']"));

	public Continuar(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.continuar));
		return this.continuar.isDisplayed();
	}

	public void ContinuarClick() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", this.continuar);
	}
}

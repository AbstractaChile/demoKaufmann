package mkm.objhtml;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FondoNegro extends PageObject {

	@FindBy(id = "SECTIONFONDONEGRO")
	private WebElement fondonegro;

	public FondoNegro(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		wait.until(ExpectedConditions.visibilityOf(fondonegro));
		return this.fondonegro.isDisplayed();
	}

	public void FondoNegroClick() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", fondonegro);
	}
}

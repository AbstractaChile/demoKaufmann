package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SKilometraje extends PageObject {

//	@FindBy(id = "vKILOMETROSTEXT")
	private WebElement skilometraje = driver.findElement(By.xpath("//input[@id='vKILOMETROSTEXT']"));

	public SKilometraje(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(skilometraje));
		return this.skilometraje.isDisplayed();
	}

	public void ingresaKilometraje(String skilometraje) {
		this.skilometraje.clear();
		this.skilometraje.sendKeys(skilometraje);
	}
}

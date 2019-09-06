package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SHorometro extends PageObject {

//	@FindBy(id = "vHOROMETRO")
	private WebElement shorometro = driver.findElement(By.xpath("//select[@id='vHOROMETRO']"));

	public SHorometro(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(this.shorometro));
		return this.shorometro.isDisplayed();
	}

	public void ingresaHorometro(String shorometro) {
		this.shorometro.clear();
		this.shorometro.sendKeys(shorometro);
	}
}

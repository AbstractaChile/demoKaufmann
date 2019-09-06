package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class STipoVehiculo extends PageObject {

	@FindBy(id = "vTIPOVEHICULO")
	private WebElement stipovehiculo;

	public STipoVehiculo(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(stipovehiculo));
		return this.stipovehiculo.isDisplayed();
	}

	public void STipoVehiculoClick() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", stipovehiculo);
	}

	public void STipoVehiculoOpcionClick() {
//		stipovehiculo.findElement(By.xpath("//option[. = 'Minibus']")).click();
		Select vehiculo = new Select(driver.findElement((By) stipovehiculo));
		vehiculo.selectByVisibleText("Bus");
	}
}

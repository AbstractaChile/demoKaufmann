package mkm.objhtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SMarca extends PageObject {

//	@FindBy(id = "vMARCA")
	private WebElement smarca = driver.findElement(By.xpath("//select[@id='vMARCA']"));

	public SMarca(WebDriver driver) {
		super(driver);
	}

	public boolean isInitialized() {
		wait.until(ExpectedConditions.visibilityOf(smarca));
		return this.smarca.isDisplayed();
	}

	public void SMarcaClick() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", smarca);
	}

	public void SMarcaOpcionClick() {
		smarca.findElement(By.xpath("//option[. = 'Mercedes Benz']")).click();
	}
}

package mkm.formtest;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import mkm.objhtml.ContinuarReserva;
import mkm.objhtml.FondoNegro;
import mkm.objhtml.FunctionalTest;
import mkm.objhtml.Section2ConsultarReserva;

public class ConsultarReservaFormTest extends FunctionalTest{
	
	@Test
	public void inicioConsultar(){
				
		driver.get(url);
		driver.manage().window().setSize(new Dimension(1936, 1056));
	   
		FondoNegro fNEG = new FondoNegro(driver);
		Assert.assertTrue(fNEG.isInitialized());
		fNEG.FondoNegroClick(); 
		fNEG.FondoNegroClick();
		
		Section2ConsultarReserva s2CRV = new Section2ConsultarReserva(driver);
		Assert.assertTrue(s2CRV.isInitialized());
		s2CRV.Section2ConsultarReservaClick();
		
		ContinuarReserva sCRV = new ContinuarReserva(driver);
		Assert.assertTrue(sCRV.isInitialized());
	    //Assert.assertEquals("mkm.objhtml.ContinuarReserva",sCRV.toString().trim());
	}
}

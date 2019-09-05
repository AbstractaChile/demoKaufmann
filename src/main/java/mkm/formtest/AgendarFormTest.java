package mkm.formtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import mkm.objhtml.Continuar;
import mkm.objhtml.FondoNegro;
import mkm.objhtml.FunctionalTest;
import mkm.objhtml.SHorometro;
import mkm.objhtml.SKilometraje;
import mkm.objhtml.SMarca;
import mkm.objhtml.SModelo;
import mkm.objhtml.SPatente;
import mkm.objhtml.STipoServicio;
import mkm.objhtml.STipoVehiculo;
import mkm.objhtml.Section1Agendar;

public class AgendarFormTest extends FunctionalTest{
	
	@Test
	public void inicioAgendar(){
				
		driver.get(url);
		driver.manage().window().setSize(new Dimension(1936, 1056));
	   
		FondoNegro fNEG = new FondoNegro(driver);
		Assert.assertTrue(fNEG.isInitialized());
		fNEG.FondoNegroClick(); 
		fNEG.FondoNegroClick();
		
		Section1Agendar s1AGN = new Section1Agendar(driver);
		Assert.assertTrue(s1AGN.isInitialized());
		s1AGN.Section1AgendarClick(); 
		
		STipoServicio sTSO = new STipoServicio(driver);
		Assert.assertTrue(sTSO.isInitialized());
		sTSO.STipoServicioClick();
		sTSO.STipoServicioOpcionClick();
		sTSO.STipoServicioClick();
		
		STipoVehiculo sTVH = new STipoVehiculo(driver);
		Assert.assertTrue(sTVH.isInitialized());
		sTVH.STipoVehiculoClick();
		sTVH.STipoVehiculoOpcionClick();
		sTVH.STipoVehiculoClick();
		
		SMarca sMCA = new SMarca(driver);
		Assert.assertTrue(sMCA.isInitialized());
		sMCA.SMarcaClick();
		sMCA.SMarcaOpcionClick();
		sMCA.SMarcaClick();
		
	    SModelo sMOD = new SModelo(driver);
	    Assert.assertTrue(sMOD.isInitialized());
	    sMOD.isInitialized();
	    sMOD.ingresaModelo("FUSO ROSA");
	    
	    SPatente sPAT = new SPatente(driver);
	    Assert.assertTrue(sPAT.isInitialized());
	    sPAT.isInitialized();
	    sPAT.ingresaPatente("CPFB37");
	    
	    SKilometraje sKMT = new SKilometraje(driver);
	    Assert.assertTrue(sKMT.isInitialized());
	    sKMT.isInitialized();
	    sKMT.ingresaKilometraje("15000");
	    
	    SHorometro sHMO = new SHorometro(driver);
	    Assert.assertTrue(sHMO.isInitialized());
	    sHMO.isInitialized();
	    sHMO.ingresaHorometro("99964");
	    
	    Continuar cTNR = new Continuar(driver);
		Assert.assertTrue(cTNR.isInitialized());
		cTNR.ContinuarClick(); 
	    
	    
	}
}

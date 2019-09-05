package mkm.formtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import mkm.objhtml.AceptaPP;
import mkm.objhtml.Anular;
import mkm.objhtml.FondoNegro;
import mkm.objhtml.FunctionalTest;
import mkm.objhtml.SCodigoAgenda;
import mkm.objhtml.STblock;
import mkm.objhtml.Section3AnularReserva;
import mkm.objhtml.Volver;





public class AnularReservaFormTest extends FunctionalTest{
	
	@Test
	public void inicioAnular()throws IOException {
		
		
		File fdata=new File("data.xlsx");

		FileInputStream finput = new FileInputStream(fdata);

		XSSFWorkbook workbook = new XSSFWorkbook(finput);

		XSSFSheet sheet= workbook.getSheetAt(0);

		XSSFCell cellxlsx;

		
		for(int i=0; i<=sheet.getLastRowNum(); i++)
		{
	
			cellxlsx = sheet.getRow(i).getCell(0);
			cellxlsx.setCellType(CellType.STRING);
			
			driver.get(url);
			driver.manage().window().setSize(new Dimension(1936, 1056));
			
			FondoNegro fNEGG = new FondoNegro(driver);
			Assert.assertTrue(fNEGG.isInitialized());
			fNEGG.FondoNegroClick();
			fNEGG.FondoNegroClick();
			    			
			Section3AnularReserva s3ARV = new Section3AnularReserva(driver);
			Assert.assertTrue(s3ARV.isInitialized());
			s3ARV.Section3AnularReservaClick();
			
			SCodigoAgenda sCDA = new SCodigoAgenda(driver);
			Assert.assertTrue(sCDA.isInitialized());
			sCDA.ingresaScodigoAgenda(cellxlsx.getStringCellValue());
			
			
			Anular aNUL = new Anular(driver);
			Assert.assertTrue(aNUL.isInitialized());
			aNUL.AnularClick();
			
			
			AceptaPP aAPP = new AceptaPP(driver);
			if(aAPP.isInitialized())
				aAPP.AnularClick();
			
			Volver vVER = new Volver(driver);
			Assert.assertTrue(vVER.isInitialized());
			vVER.VolverClick();
			
		}	
	}	
}

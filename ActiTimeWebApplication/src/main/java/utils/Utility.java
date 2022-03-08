package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String getDataFromExcelShgeet(String sheet, int row, int col) throws EncryptedDocumentException, IOException
	{
		String path= "C:\\Users\\TOSHIBA\\Desktop\\acttime.xlsx";
		FileInputStream file = new FileInputStream(path);
		String value= WorkbookFactory.create(file).getSheet(path).getRow(row).getCell(col).getStringCellValue();
		
		String data= value;
		return data;
		
	}
	
	public static void getScreenshot(WebDriver driver, int testID) throws IOException
	{
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd MM yyyy HH mm ss");
		LocalDateTime now= LocalDateTime.now();
		String DT = dft.format(now);
		
		TakesScreenshot src= (TakesScreenshot)driver;
		File Source= src.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\TOSHIBA\\Desktop\\screenshot\\"+"Test-"+"testID"+"DT"+" .jpg");
		
		FileHandler.copy(Source, dest);
	}
	
	

}

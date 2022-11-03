package utils;

import org.openqa.selenium.WebDriver;

public class Utility {

	// 2 methods - static public 
	
	public static void captureScreenshot(WebDriver driver, int testID) {
		
		// image name 
		// Test-testID date & time 
		// eg.  Test-1234 12 10 2022 17 56 23
	}
	
	public static String  getDataFromExcel(String sheet, int row, int cell) {
		String data;
		// sheetname + row no + cell no
		
		try {
			data = getStringCellValue();
		}
		catch(exception name )
		{
			double value = getNumericCellValue();
			// goggle 
			// how to convert double / int to String 
			
			data = Double.toString(value);
		}
		
		return data ;
	}
	
}

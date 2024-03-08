package marathon.assignment3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromSheet {

	public static String[][] excelCreateData() throws IOException {
		// TODO Auto-generated method stub
		//step-1
        XSSFWorkbook wb=new XSSFWorkbook("./xcelSheet/SalesForce.xlsx");
        
        //step-2
        //index value
        XSSFSheet sheet=wb.getSheetAt(0);
        
        //using sheet name
        //XSSFSheet sheet2 = wb.getSheet("sheet1");
      //step-3
        int rowCount = sheet.getLastRowNum();
      //No. of columns
      short cellCount = sheet.getRow(1).getLastCellNum(); 


      String data[][] = new String [rowCount][cellCount];
      for (int i = 1; i <=rowCount; i++) {
      for (int j = 0; j < cellCount; j++) {
      //iterating each index & storing the value by index
      String dataValue = sheet.getRow(i).getCell(j).getStringCellValue(); 
      data[i-1][j] = dataValue; 
      } 
      }
      //Closing the excel
      wb.close();

      return data;
      }}

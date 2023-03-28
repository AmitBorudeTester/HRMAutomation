package testutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFile {
	static String data;

public static String senddata(int row ,int coloumn) throws IOException {
	
	//path="src//test//resources//file//login.xlsx";
	//String path="src\\test\\resources\\file\\login.xlsx";
	String  path ="src"+File.separator+"test"+File.separator+"resources"+File.separator+"file"+File.separator+"login.xlsx";
	
	FileInputStream file= new FileInputStream(path);
	Cell c =WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(coloumn);// cell type value
	
	CellType type=c.getCellType(); //read datatype of cell
	
	if(type==CellType.STRING) {
	 data=	c.getStringCellValue();// string type
	}
	else if(type==CellType.NUMERIC) {
		double d=c.getNumericCellValue(); //  double type data
		 data=Double.toString(d);   // convert double to string
	}
	else if(type==CellType.BLANK) {
		System.out.println("empty cell bro");
	}
	
	return data;
}
}

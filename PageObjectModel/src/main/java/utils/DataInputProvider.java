package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

	

	public static String[][] getAllSheetData(String sheetName) throws InterruptedException {

		int count = 0;
		String[] data = null;
		String returnObj[][] = null;

		File csvFile = new File(sheetName);

		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		ArrayList<String> content = new ArrayList<String>();
		try {

			// this loop is pseudo code
			br = new BufferedReader(new FileReader(csvFile));
			int datalength = 0;
			int listsize = 0;
			;

			while ((line = br.readLine()) != null) {
				// use comma as separator

				content.add(line);
			}
			System.out.println(content);

			listsize = content.size();
		//	System.out.println("listsize: " +listsize);
			datalength = content.get(0).split(cvsSplitBy).length;
		//	System.out.println("datalength: " +datalength);
			returnObj = new String[listsize][datalength];
			
		//	int length = datalength/2;

			for (int i = 0; i<listsize; i++) {
	            
	            data = content.get(i).split(cvsSplitBy);
	            for (int j=0; j< datalength ; j++) {
	                returnObj[i][j] = data[j];
	                
	            }

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	//	System.out.println("Done");
		return returnObj;

	}
}

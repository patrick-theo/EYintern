package comps;


import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Exce {
	public static void main(String[] args) throws Exception {
		SAXParserFactory spf=SAXParserFactory.newInstance();
		SAXParser sp=spf.newSAXParser();
		sp.parse("invoice.xml",new MyXmlHandlerrr());
	}
}
	
	class MyXmlHandlerrr extends DefaultHandler{
		boolean itemname=false;
		boolean itemprice=false;
		boolean itemnumber=false;
		boolean itemquantity=false;
		boolean amount=false;
		int rowNum=0;
		 XSSFWorkbook workbook = new XSSFWorkbook(); 
	        XSSFSheet spreadsheet 
	            = workbook.createSheet("Invoice data"); 	
	        XSSFRow row; 
	       int colid=0;
	       
	       
	        
	@Override
		public void endDocument() throws SAXException {
			//System.out.println("Started");
		}
	@Override
			public void startDocument() throws SAXException {
		row = spreadsheet.createRow(rowNum++);
		Cell cell = row.createCell(colid++);
		cell.setCellValue("itemnumber");
		 cell = row.createCell(colid++);
		cell.setCellValue("itemname");
		 cell = row.createCell(colid++);
		cell.setCellValue("itemquantity");
	 cell = row.createCell(colid++);
		cell.setCellValue("itemprice");
		cell = row.createCell(colid++);
		cell.setCellValue("amount");
		colid=0;
			}
	@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("item")) {
			row = spreadsheet.createRow(rowNum++);
		}
	
		if(qName.equalsIgnoreCase("itemnumber")) {
			itemnumber=true;
		}
		if(qName.equalsIgnoreCase("itemname")) {
			itemname=true;
		}
		if(qName.equalsIgnoreCase("itemquantity")) {
			itemquantity=true;
		}
		if(qName.equalsIgnoreCase("itemprice")) {
			itemprice=true;
		}
		if(qName.equalsIgnoreCase("amount")) {
			amount=true;
		}
		}
	@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("item")) {
			colid=0;
		}
		}
	@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
		if(itemnumber) {
			String sno=new String(ch,start,length);
			Cell cell = row.createCell(colid++);
			cell.setCellValue(sno);
			this.itemnumber=false;
		}
		if(itemname) {
			String name=new String(ch,start,length);
			Cell cell = row.createCell(colid++);
			cell.setCellValue(name);
			this.itemname=false;
		}
		if(itemquantity) {
			String quantity=new String(ch,start,length);
			Cell cell = row.createCell(colid++);
			cell.setCellValue(quantity);
			this.itemquantity=false;
		}
			if(itemprice) {
				String price=new String(ch,start,length);
				Cell cell = row.createCell(colid++);
				cell.setCellValue(price);
				this.itemprice=false;
			}
			if(amount) {
				String amount=new String(ch,start,length);
				Cell cell = row.createCell(colid++);
				cell.setCellValue(amount);
				this.amount=false;
			}
			try {
				 FileOutputStream out = new FileOutputStream( 
		                    new File("Invoice.xls")); 
		          
		                workbook.write(out); 
		                out.close();
		               
					
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			 
		}

	}

	
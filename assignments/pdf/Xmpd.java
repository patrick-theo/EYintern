package comps;

public class Xmpd {
	public static void main(String[] args) throws Exception {
		XMLtoPDFConverter xmlToPDF = new XMLtoPDFConverter();
		xmlToPDF.convertXMLtoPDF(args[0]);
//		xmlToPDF.convertXMLtoPDF("C:/workspace/EYInternshipTraining/invoice.xml");
	}
}
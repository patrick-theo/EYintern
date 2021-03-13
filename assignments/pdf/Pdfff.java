package comps;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import org.apache.fo;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.xmlgraphics.util.MimeConstants;

interface WriteToPDF {
	public void convertXMLtoPDF(String filePath) throws Exception;
}

public class Pdfff implements WriteToPDF {
	@Override
	public void convertXMLtoPDF(String filePath) throws Exception {
		// XSL style sheet FO file
		File xsltStyleSheet = new File("P:/src/stuless.xsl");
		// Input XML file
		StreamSource xmlFile = new StreamSource(new File(filePath));
		// Instance of FOP factory
		FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
		// Create a user agent for the transformation
		FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
		// Set up output stream to store the converted file
		OutputStream out = new FileOutputStream("P:/src/PDFFF.pdf");
		try {
			// Construct FOP with the required output format
			Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
			// Set up transformers for xslt files
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer(new StreamSource(xsltStyleSheet));
			// Pipe generated FO through to FOP
			Result result = new SAXResult(fop.getDefaultHandler());
			// Start transformation of XSLT file and start FOP processing
			// XML -> XSL-FO -> PDF
			transformer.transform(xmlFile, result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
}
	}
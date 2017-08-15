package com.insured.worker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import com.google.common.io.Files;

public class ContentExtractor {

	public void getContent(String filePath) throws IOException, SAXException, TikaException {
		

		BodyContentHandler handler = new BodyContentHandler();
		Metadata metadata = new Metadata();
		FileInputStream inputstream = new FileInputStream(new File(filePath));
		ParseContext pcontext = new ParseContext();

		// parsing the document using PDF parser
		PDFParser pdfparser = new PDFParser();
		System.out.println("Extracting contents from pdf");
		pdfparser.parse(inputstream, handler, metadata, pcontext);
		System.out.println("Extraction complete");
		// getting the content of the document
		// System.out.println("Contents of the PDF :" + handler.toString());
		try {
			System.out.println("Generating contents.txt");
			storeUnstructuredContentIntoFile("contents.txt", "Contents of the PDF : \n" + handler.toString());
			System.out.println("Generated...");
		} catch (Exception e) {
			System.out.println("Exception occured while extracting content from input file " + filePath);
		}
		// getting metadata of the document
		System.out.println("Extracting meta data");
		String[] metadataNames = metadata.names();
		System.out.println("Extraction complete");
		StringBuilder stringBuilder = new StringBuilder();
		// System.out.println("Metadata of the PDF:");
		stringBuilder.append("Metadata of the PDF: \n");
		for (String name : metadataNames) {
			// System.out.println(name+ " : " + metadata.get(name));
			stringBuilder.append(name + " : " + metadata.get(name) + "\n");
		}
		// System.out.println(stringBuilder.toString());
		try {
			System.out.println("Generating metadata.txt");
			storeUnstructuredContentIntoFile("metadata.txt", stringBuilder.toString());
			System.out.println("Generated...");
		} catch (Exception e) {
			System.out.println("Exception occured while extracting metadata from input file " + filePath);
		}
	}

	public void storeUnstructuredContentIntoFile(String fileName, String unStructuredContent) throws IOException {
		Files.write(unStructuredContent.getBytes(), new File(fileName));

	}
}

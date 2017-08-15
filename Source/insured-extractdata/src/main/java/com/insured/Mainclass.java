package com.insured;

import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import com.insured.worker.ContentExtractor;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {

			ContentExtractor contentExtractor = new ContentExtractor();
			try {
				System.out.println("Process started");
				contentExtractor.getContent(args[0]);
				System.out.println("Process completed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TikaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Please feed absolute filepath as input");
			System.out.println("for example, your command should be like :\n"
					+ " java -jar insured-extractdata.jar \"c:/file.pdf\" ");
		}
	}

}

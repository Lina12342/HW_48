package core;

import java.io.*;
import java.net.URL;
import javax.xml.stream.*;

public class StAX_Parser {
	public static void main(String[] args) throws Exception {

		URL url = new URL("http://alex.academy/ebay.xml");

		final String element_01 = "orig-kw";
		final String element_02 = "engine";
		final String element_03 = "kadu-version";
		final String element_04 = "response-time";
		final String element_05 = "deals";
		final String element_06 = "normalized-kw";
		final String element_07 = "database";
		final String element_08 = "lang_id";
		final String element_09 = "country_id";
		final String element_10 = "kadu-branch";
		InputStream in = url.openStream();

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader reader = factory.createXMLStreamReader(in);
		int eventType = reader.getEventType();

		while (reader.hasNext()) {

		eventType = reader.next();

			if (eventType == XMLStreamReader.START_ELEMENT) {
			if (reader.getLocalName() == element_01) {System.out.println("Key Word: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_02) {System.out.println("Engine: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_03) {System.out.println("Version: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_04) {System.out.println("Response time: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_05) {System.out.println("Number of deals: " + reader.getAttributeValue(0));}
			if (reader.getLocalName() == element_06) {System.out.println("Normalized: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_07) {System.out.println("Database: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_08) {System.out.println("Lang: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_09) {System.out.println("Country: \t " + reader.getElementText());}
			if (reader.getLocalName() == element_10) {System.out.println("Branch: \t " + reader.getElementText());}
			}
		}
	}
}
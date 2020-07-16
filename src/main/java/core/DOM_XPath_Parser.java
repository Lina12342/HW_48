package core;

import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.Document;

public class DOM_XPath_Parser {

	public static void main(String[] args) throws Exception {

		String url = "http://alex.academy/ebay.xml";

		String xpath_element_01 = "//server/orig-kw";
		String xpath_element_02 = "//server/engine";
		String xpath_element_03 = "//server/kadu-version";
		String xpath_element_04 = "//response-time";
		String xpath_element_06 =  "//server/normalized-kw";
		String xpath_element_07 =  "//server/database";
		String xpath_element_08 =  "//server/lang_id";
		String xpath_element_09 =  "//server/country_id";
		String xpath_element_10 =  "//server/kadu-branch";


		String xpath_attribute_01 = "//deals/@count";

		// Get the DOM Builder Factory
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();

		// Get the DOM Builder
		DocumentBuilder b = f.newDocumentBuilder();

		// Load and Parse the XML document contains the complete XML as a Tree.
		Document d = b.parse(url);

		// Optional
		d.getDocumentElement().normalize();

		// xPath
		XPathFactory xPathfactory = XPathFactory.newInstance();
		XPath xpath = xPathfactory.newXPath();

		String element_01 = xpath.compile(xpath_element_01).evaluate(d);
		String element_02 = xpath.compile(xpath_element_02).evaluate(d);
		String element_03 = xpath.compile(xpath_element_03).evaluate(d);
		String element_04 = xpath.compile(xpath_element_04).evaluate(d);
		String element_06 = xpath.compile(xpath_element_06).evaluate(d);
		String element_07 = xpath.compile(xpath_element_07).evaluate(d);
		String element_08 = xpath.compile(xpath_element_08).evaluate(d);
		String element_09 = xpath.compile(xpath_element_09).evaluate(d);
		String element_10 = xpath.compile(xpath_element_10).evaluate(d);
		
		String attribute_01 = xpath.compile(xpath_attribute_01).evaluate(d);

		System.out.println("Key Word: \t " + element_01);
		System.out.println("Engine: \t " + element_02);
		System.out.println("Version: \t " + element_03);
		System.out.println("Response time: \t " + element_04);
		System.out.println("Normalized: \t " + element_06);
		System.out.println("Database: \t " + element_07);
		System.out.println("Lang: \t " + element_08);
		System.out.println("Country: \t " + element_09);
		System.out.println("Branch: \t " + element_10);
		System.out.println("Number of deals: " + attribute_01);

	}
}
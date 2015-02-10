package com.amos.factory.spring;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ClassPathXmlApplicationContext {

	public static void main(String[] args) throws Exception {
		// Properties props = new Properties();
		// props.load(ClassPathXmlApplicationContext.class.getResourceAsStream("bean.properties"));
		// String cls = props.getProperty("Plane");
		// Class class1 = Class.forName(cls);
		// Object newInstance = Class.forName(cls).newInstance();
		// class1.getMethods()[0].invoke(newInstance);

		String fileName = ClassPathXmlApplicationContext.class.getClassLoader().getResource("").getPath() + "applicationContext.xml";

		String idName = "car";
		String classaName = "";

		fileName = "D:\\develop\\DesignPattern\\src\\com\\amos\\factory\\spring\\applicationContext.xml";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(fileName);
		Element element = document.getDocumentElement();
		NodeList beanNodes = element.getElementsByTagName("bean");
		for (int i = 0; i < beanNodes.getLength(); i++) {
			element = (Element) beanNodes.item(i);
			String id = element.getAttribute("id");

			if (id.equals(idName)) {
				classaName = element.getAttribute("class");
			}
		}

		Class<?> cls = Class.forName(classaName);
		Object newInstance =cls.newInstance();
		cls.getMethods()[0].invoke(newInstance);

	}

}

package com.serenity.restassured.utils.enums;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class UtilidadesSoap {

  public static String obtenerRequestSoap(String path) {
    String content = null;
    try {
      content = Files.asCharSource(new File(path), Charsets.UTF_8).read();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;
  }

  public static String obtenerValorEtiquetaXML(String xml, String etiquetaXml)
      throws IOException, SAXException, ParserConfigurationException {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(new InputSource(new StringReader(xml)));
    Element rootElement = document.getDocumentElement();
    NodeList list = rootElement.getElementsByTagName(etiquetaXml);
    if (list != null && list.getLength() > 0) {
      NodeList subList = list.item(0).getChildNodes();
      if (subList != null && subList.getLength() > 0) {
        return subList.item(0).getNodeValue();
      }
    }
    return null;
  }
}

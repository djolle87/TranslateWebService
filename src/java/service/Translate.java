/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import buisiness.TranslateSystem;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 *
 * @author Djole
 */
@WebService(serviceName = "TranslateService")
public class Translate {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "translate")
    public String translate(@WebParam(name = "word") String word, @WebParam(name = "fromLanguage") String fromLanguage, @WebParam(name = "toLanguage") String toLanguage) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        TranslateSystem ts = new TranslateSystem();
        return ts.translate(word, fromLanguage, toLanguage);
    }
}

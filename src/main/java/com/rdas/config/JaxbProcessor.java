package com.rdas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.oxm.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by x148128 on 25/03/2016.
 */
@Component
public class JaxbProcessor {

    @Autowired
    private Marshaller marshaller;

    @Autowired
    private Unmarshaller unmarshaller;

    //Converts Object to XML file
    public void objectToXML(String fileName, Object graph) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            marshaller.marshal(graph, new StreamResult(fos));
        }
    }

    //Converts XML to Java Object
    public Object xmlToObject(String fileName) throws Exception {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            return unmarshaller.unmarshal(new StreamSource(fis));
        }
    }
}

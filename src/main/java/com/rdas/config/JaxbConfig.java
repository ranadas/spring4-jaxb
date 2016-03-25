package com.rdas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by x148128 on 25/03/2016.
 */
@Configuration
public class JaxbConfig {
    @Bean
    public Jaxb2Marshaller getCastorMarshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        //TODO "com.rdas.myschema".split("")
        jaxb2Marshaller.setPackagesToScan(new String[] {"com.rdas.myschema"});
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("jaxb.formatted.output", true);
        jaxb2Marshaller.setMarshallerProperties(map);
        return jaxb2Marshaller;
    }
}

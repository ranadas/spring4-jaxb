package com.ams;

import com.rdas.config.JaxbProcessor;
import com.config.TestSpringConfigMin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.FileNotFoundException;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by x148128 on 25/02/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestSpringConfigMin.class)
public class GenericSpring4Test {

    @Autowired
    private JaxbProcessor jaxbProcessor;

    @Test
    public void testProperties() throws FileNotFoundException {
        assertThat(jaxbProcessor).isNotNull();
    }
}
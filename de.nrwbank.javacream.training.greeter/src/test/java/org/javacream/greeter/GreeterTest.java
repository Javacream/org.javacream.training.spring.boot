package org.javacream.greeter;

import org.javacream.greeter.api.GreeterService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=GreeterConfiguration.class)
public class GreeterTest {
    @Autowired private GreeterService greeterService;
    @Test public void testGreeter(){
        final String testName = "Hugo";
        final String expectedResult = "Hello Hugo!";
        final String result = greeterService.greet(testName);
        Assert.assertEquals(expectedResult, result);
    }
}

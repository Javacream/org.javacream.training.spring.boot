package org.javacream.greeter.test;

import org.javacream.greeter.GreeterConfiguration;
import org.javacream.greeter.api.Greeter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GreeterConfiguration.class)
public class GreeterTest {

    @Qualifier(Greeter.GreeterQualifiers.NORMAL)
    @Autowired private Greeter greeter;
    @Test public void testGreeter(){
        
    }
}

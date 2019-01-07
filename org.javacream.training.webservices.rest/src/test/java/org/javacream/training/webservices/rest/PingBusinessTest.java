package org.javacream.training.webservices.rest;

import org.javacream.training.webservices.rest.demo.PingBusiness;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PingBusinessTest {

    @Autowired private PingBusiness pingBusiness;

    @Test public void testBusiness(){
        Assert.assertTrue(pingBusiness.ping().startsWith("Ping"));
    }
}

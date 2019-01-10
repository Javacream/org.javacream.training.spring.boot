package org.javacream.store.test;

import org.javacream.store.api.StoreService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoreServiceTestConfiguration.class)
public class StoreServiceTest {

    @Autowired private StoreService storeService;
    private static final String TEST_CAT = "TEST_CAT";
    private static final String TEST_ID = "TEST_ID";
    private static final int TEST_STOCK = 42;

    @Test public void testStoreServiceUnknownCategory(){
        Assert.assertTrue(storeService.getStock("this", "that") == 0);
    }
    @Test public void testStoreServiceUnknownId(){
        Assert.assertTrue(storeService.getStock(TEST_CAT, "that") == 0);
    }
    @Test public void testStoreServiceValidCatAndId(){
        Assert.assertTrue(storeService.getStock(TEST_CAT, TEST_ID) == TEST_STOCK);
    }


}
@Configuration
@ComponentScan(basePackages = "org.javacream.store")
@EnableAutoConfiguration
class StoreServiceTestConfiguration{

}

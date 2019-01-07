package org.javacream.store.test;

import org.javacream.store.api.StoreService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoreServiceTestConfiguration.class)
public class StoreServiceTest {

    @Autowired private StoreService storeService;

    @Test public void testStoreService(){
        Assert.assertTrue(storeService.getStock("this", "that") > 0);
    }
    @Test public void testStoreService2(){
        Assert.assertTrue(storeService.getStock("this", "that") > 0);
    }
    @Test public void testStoreService3(){
        Assert.assertTrue(storeService.getStock("this", "that") > 0);
    }
    @Test public void testStoreService4(){
        Assert.assertTrue(storeService.getStock("this", "that") > 0);
    }
    @Test public void testStoreService5(){
        Assert.assertTrue(storeService.getStock("this", "that") > 0);
    }
    @Test public void testStoreService6(){
        Assert.assertTrue(storeService.getStock("this", "that") > 0);
    }

}
@Configuration
@ComponentScan(basePackages = "org.javacream.store")
class StoreServiceTestConfiguration{

}

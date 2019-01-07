package org.javacream.store.test;

import org.javacream.store.api.StoreService;
import org.javacream.store.impl.SimpleStoreService;
import org.junit.Assert;
import org.junit.Test;

public class PlainTest {
    private StoreService storeService;

    @Test
    public void testStoreService() {
        Assert.assertTrue(new SimpleStoreService().getStock("this", "that") > 0);
    }
    @Test
    public void testStoreService2() {
        Assert.assertTrue(new SimpleStoreService().getStock("this", "that") > 0);
    }
    @Test
    public void testStoreService4() {
        Assert.assertTrue(new SimpleStoreService().getStock("this", "that") > 0);
    }
    @Test
    public void testStoreService5() {
        Assert.assertTrue(new SimpleStoreService().getStock("this", "that") > 0);
    }
    @Test
    public void testStoreService786() {
        Assert.assertTrue(new SimpleStoreService().getStock("this", "that") > 0);
    }
    @Test
    public void testStoreServicea() {
        Assert.assertTrue(new SimpleStoreService().getStock("this", "that") > 0);
    }

}

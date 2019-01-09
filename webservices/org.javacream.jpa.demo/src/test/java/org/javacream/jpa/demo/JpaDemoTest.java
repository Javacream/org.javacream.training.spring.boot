package org.javacream.jpa.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoTest {
    @Autowired JpaDemo jpaDemo;

    @Test public void testJpaDemoLoads(){
        System.out.println("Instance: " + jpaDemo);
    }
    @Test public void testJpaDemo(){
        jpaDemo.logMessage("Hello");
        jpaDemo.showMessages();
    }
}

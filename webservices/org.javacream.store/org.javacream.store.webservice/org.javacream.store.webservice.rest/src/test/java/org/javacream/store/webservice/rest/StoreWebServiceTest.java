package org.javacream.store.webservice.rest;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=StoreWebServiceTestConfiguration.class)
public class StoreWebServiceTest {
    @Autowired private MockMvc mockMvc;

    @Test public void testStoreWebService() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/store/cat/id")).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("0")));
    }
}
@Configuration
@ComponentScan(basePackages = "org.javacream.store")
class StoreWebServiceTestConfiguration{

}


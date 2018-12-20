package org.javacream.app.batch;

import org.javacream.echo.api.Echo;
import org.javacream.greeter.api.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BatchStarter {
    @Autowired private Echo echo;
    @Autowired @Qualifier(Greeter.GreeterQualifiers.FRIENDLY) private Greeter greeter;

    @PostConstruct public void startBatch(){
        System.out.println(greeter.greet("batch"));

    }
}



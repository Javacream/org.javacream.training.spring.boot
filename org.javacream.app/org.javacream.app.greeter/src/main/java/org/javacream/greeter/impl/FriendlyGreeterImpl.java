package org.javacream.greeter.impl;

import org.javacream.greeter.api.Greeter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(Greeter.GreeterQualifiers.FRIENDLY)
public class FriendlyGreeterImpl implements Greeter {
    @Override
    public String greet(String name) {


        return "Hello " + name + " my good old friend";
    }
}

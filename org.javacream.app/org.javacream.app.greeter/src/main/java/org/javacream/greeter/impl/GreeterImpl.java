package org.javacream.greeter.impl;

import org.javacream.greeter.api.Greeter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(Greeter.GreeterQualifiers.NORMAL)
public class GreeterImpl implements Greeter {
    @Override
    public String greet(String name) {
        return "Hello " + name;
    }
}

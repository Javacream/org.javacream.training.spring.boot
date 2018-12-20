package org.javacream.greeter.impl;

import org.javacream.greeter.api.GreeterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreeterImpl implements GreeterService {
    @Value("${greeter.prefix}") private String prefix;
    @Value("${greeter.suffix}") private String suffix;
    @Override
    public String greet(String name) {
        return prefix + name + suffix;
    }
}

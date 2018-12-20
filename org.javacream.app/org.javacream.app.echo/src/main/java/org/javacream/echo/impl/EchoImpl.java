package org.javacream.echo.impl;

import org.javacream.echo.api.Echo;
import org.springframework.stereotype.Service;

@Service
public class EchoImpl implements Echo {

    public String echo(String message){
        return message;
    }
}

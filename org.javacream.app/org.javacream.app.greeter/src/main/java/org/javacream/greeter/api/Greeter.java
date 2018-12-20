package org.javacream.greeter.api;

public interface Greeter {
    public String greet(String name);

    public class GreeterQualifiers{
        public static final String FRIENDLY = "friendly";
        public static final String NORMAL = "normal";
    }
}

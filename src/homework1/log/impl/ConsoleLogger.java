package homework1.log.impl;

import homework1.log.Loggable;

import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(), message);
    }
}

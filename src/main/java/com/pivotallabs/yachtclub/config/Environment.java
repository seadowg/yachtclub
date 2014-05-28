package com.pivotallabs.yachtclub.config;

import java.util.Optional;

public class Environment {
    public int getPort() {
        String stringPort = Optional.ofNullable(System.getenv().get("PORT")).orElse("4567");
        return Integer.parseInt(stringPort);
    }
}

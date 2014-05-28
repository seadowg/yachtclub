package com.pivotallabs.yachtclub.config;

import org.apache.log4j.BasicConfigurator;
import static spark.SparkBase.setPort;

public class Configurator {
    private Environment env;

    public Configurator(Environment env) {
        this.env = env;
    }

    public void configureLogger() {
        BasicConfigurator.configure();
    }

    public void configurePort() {
        setPort((env.getPort()));
    }
}

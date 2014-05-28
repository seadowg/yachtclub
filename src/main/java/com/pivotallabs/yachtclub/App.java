package com.pivotallabs.yachtclub;

import com.pivotallabs.yachtclub.config.Configurator;
import com.pivotallabs.yachtclub.config.Environment;
import com.pivotallabs.yachtclub.web.Routes;

class App {
    public static void main(String[] args) {
        Configurator configurator = new Configurator(new Environment());
        configurator.configureLogger();
        configurator.configurePort();

        Routes.load();
    }
}
package com.pivotallabs.yachtclub;

import java.util.Optional;

import static spark.Spark.*;

class App{
    public static void main(String[] args) {
        int appPort = Integer.parseInt(System.getenv().get("VCAP_APP_PORT"));
        setPort(Optional.ofNullable(appPort).orElse(4567));

        get("/", (request, response)-> "<h1>Yacht Club</h1><h2>What would you like to tell the captain?</h2><form><textarea></textarea><input type='submit' value='send'></input></form>");
    }
}
package com.pivotallabs.yachtclub.web;

import com.pivotallabs.yachtclub.io.Template;

import static spark.Spark.get;

public class Routes {
    public static void load() {
        get("/", (req, res) -> new Template("index.mustache").render());
    }
}

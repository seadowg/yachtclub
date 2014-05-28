package com.pivotallabs.yachtclub.io;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.IOException;
import java.io.StringWriter;

public class Template {
    private String name;

    public Template(String name) {
        this.name = name;
    }

    public String render() {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(name);
        StringWriter stringWriter = new StringWriter();

        try {
            mustache.execute(stringWriter, null).close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringWriter.toString();
    }
}

package com.sample.pages;

import org.apache.click.Page;

public class HelloWorldPage extends Page {
    @Override
    public boolean onSecurityCheck() {
        // Perform security checks if needed, return true to continue processing.
        return true;
    }

    public void onInit() {
        addModel("mensaje", "Este es un mensaje personalizado.");
    }

    @Override
    public void onGet() {
        super.onGet();
    }

    @Override
    public void onRender() {
        super.onRender();
    }

}

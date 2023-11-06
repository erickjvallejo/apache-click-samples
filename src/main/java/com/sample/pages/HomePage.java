package com.sample.pages;

import org.apache.click.Page;

public class HomePage extends Page {
    @Override
    public boolean onSecurityCheck() {
        return true;
    }

    public void onInit() {
        addModel("message", "Custom Message on Home Page");
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

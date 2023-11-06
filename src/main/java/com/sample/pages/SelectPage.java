package com.sample.pages;

import org.apache.click.Page;
import org.apache.click.control.*;
import org.apache.click.element.CssImport;
import org.apache.click.element.Element;
import org.apache.click.element.JsImport;
import org.apache.click.element.JsScript;

import java.util.Date;
import java.util.List;

public class SelectPage extends Page {

    private Form form = new Form("form");
    private Date time = new Date();
    private Select selectControl = new Select("mySelect", "Choose an option:");
    private Submit saveButton = new Submit("mySaveButton", "Save", this, "onSaveClick");
    private Submit actionA = new Submit("actionA", "Action A", this, "onActionAClick");
    private Submit actionB = new Submit("actionB", "Action B", this, "onActionBClick");

    public SelectPage() {
        addControl(form);
//        selectControl.setAttribute("onchange", "submitForm()");
        form.add(new TextField("name", true));
        form.add(saveButton);
        form.add(selectControl);
        selectControl.setDisabled(true);
        form.add(actionA);
        form.add(actionB);
//        form.setListener(this, "onSubmit");
        addModel("time", time);
    }

    @Override
    public List<Element> getHeadElements() {
        if (headElements == null) {
            headElements = super.getHeadElements();
            headElements.add(new JsScript("alert('Welcome to HomePage');"));
        }
        return headElements;
    }

    @Override
    public boolean onSecurityCheck() {
        return super.onSecurityCheck();
    }

    @Override
    public void onInit() {
        fillSelect();
    }

    @Override
    public void onGet() {
        super.onGet();

    }

    @Override
    public void onPost() {
        super.onPost();
    }

    @Override
    public void onRender() {
        super.onRender();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    private void fillSelect() {
        for (int i = 0; i < 4; i++) {
            selectControl.add("data " + i);
        }

    }

    public boolean onSaveClick() {
        return onSubmit();
    }

    public boolean onLinkClick() {
        String msg = "ControlListenerPage#" + hashCode()
                + " object method <tt>onLinkClick()</tt> invoked.";
        addModel("msg", msg);
        return true;
    }

    public boolean onSubmit() {
        if (form.isValid()) {
            String msg = "Your name is: " + form.getFieldValue("name") + "<br>"
                    + "You are selected : " + selectControl.getValue();

            addModel("msg", msg);
        }
        return true;
    }

    public boolean onActionAClick(){
        selectControl.setDisabled(true);
        return true;
    }

    public boolean onActionBClick(){
        selectControl.setDisabled(false);
        return true;
    }
}

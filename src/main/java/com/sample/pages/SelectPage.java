package com.sample.pages;

import org.apache.click.Page;
import org.apache.click.control.Select;

public class SelectPage extends Page {


    public SelectPage() {

    }

    @Override
    public void onInit() {
        // Crear un control Select
        Select selectControl = new Select("miSelect", "Seleccione una opción:");
        selectControl.add("opcion1");
        selectControl.add("opcion2");

        // Agregar el control Select a la página
        addControl(selectControl);
    }
}

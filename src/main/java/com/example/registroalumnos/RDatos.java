package com.example.registroalumnos;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class RDatos {
    private MainApp main;
    private TextField nombreField;
    private TextField apellidoField;
    private ChoiceBox<String> generoChoiceBox;
    private TextField gradoField;

    public RDatos(MainApp main) {
        this.main = main;
    }

    public GridPane getLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Datos.fxml"));
        loader.setController(this);
        return loader.load();
    }

    public String getNombre() {
        return nombreField.getText();
    }

    public String getApellido() {
        return apellidoField.getText();
    }

    public String getGenero() {
        return generoChoiceBox.getValue();
    }

    public String getGrado() {
        return gradoField.getText();
    }

    public void handleGenerarReporte() {
        mainApp.showReporte();
    }
}
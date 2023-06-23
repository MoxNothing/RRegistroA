package com.example.registroalumnos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RResultado {
    @FXML
    private VBox layout;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label nombreValueLabel;

    @FXML
    private Label apellidoValueLabel;

    @FXML
    private Label generoValueLabel;

    @FXML
    private Label gradoValueLabel;

    @FXML
    private Label modalidadValueLabel;

    @FXML
    private Label montoValueLabel;

    @FXML
    private Label duracionValueLabel;

    @FXML
    private Button salirButton;

    @FXML
    private void salirButtonAction() {
        Stage stage = (Stage) layout.getScene().getWindow();
        stage.close();
    }

    public void mostrarReporte(String nombre, String apellido, String genero, String grado, String modalidad, String monto, String duracion) {
        nombreValueLabel.setText(nombre);
        apellidoValueLabel.setText(apellido);
        generoValueLabel.setText(genero);
        gradoValueLabel.setText(grado);
        modalidadValueLabel.setText(modalidad);
        montoValueLabel.setText(monto);
        duracionValueLabel.setText(duracion);
    }
}


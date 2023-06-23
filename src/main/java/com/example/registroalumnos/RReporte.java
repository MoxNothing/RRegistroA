package com.example.registroalumnos;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class RReporte{
    @FXML
    private Label nombreValueLabel;
    @FXML
    private Label apellidoValueLabel;
    @FXML
    private Label generoValueLabel;
    @FXML
    private Label gradoValueLabel;
    @FXML
    private ChoiceBox<String> modalidadChoiceBox;
    @FXML
    private Label montoValueLabel;
    @FXML
    private Label duracionValueLabel;

    public void initialize() {
        modalidadChoiceBox.getItems().addAll("Presencial", "Semipresencial", "A distancia");
    }

    @FXML
    private void calcularButtonClicked(ActionEvent event) {
        String modalidad = modalidadChoiceBox.getValue();
        double monto = obtenerMontoPorModalidad(modalidad);
        int duracion = obtenerDuracionPorModalidad(modalidad);

        montoValueLabel.setText("$" + monto);
        duracionValueLabel.setText(duracion + " Meses");
    }

    private double obtenerMontoPorModalidad(String modalidad) {
        switch (modalidad) {
            case "Presencial":
                return 140.0 * 4;
            case "Semipresencial":
                return 150.0 * 5;
            case "A distancia":
                return 200.0 * 3;
            default:
                return 0.0;
        }
    }

    private int obtenerDuracionPorModalidad(String modalidad) {
        switch (modalidad) {
            case "Presencial":
            case "Semipresencial":
                return 4;
            case "A distancia":
                return 2;
            default:
                return 0;
        }
    }
}
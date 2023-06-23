package com.example.registroalumnos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RUsuarios {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorMessage;
    @FXML
    private Button IniciarSesion;

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.isEmpty() || password.isEmpty()) {
            errorMessage.setText("Por favor ingrese un correo electrónico y contraseña.");
        } else {
            errorMessage.setText("");
            mainApp.mostrarRDatos();
        }
    }
}
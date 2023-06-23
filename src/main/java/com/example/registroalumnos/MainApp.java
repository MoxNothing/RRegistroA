package com.example.registroalumnos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showRegistroUsuario();
    }

    public void showRegistroUsuario() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Usuarios.fxml"));
        Parent root = loader.load();
        RUsuarios controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registro de Usuario");
        primaryStage.show();
    }

    public void mostrarRDatos() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Datos.fxml"));
        Parent root = loader.load();
        RDatos controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registro de Datos");
        primaryStage.show();
    }

    public void showReporte(String nombre, String apellido, String genero, String grado) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Reporte.fxml"));
        Parent root = loader.load();
        RReporte controller = loader.getController();
        controller.setMainApp(this);
        controller.setRDatos(nombre, apellido, genero, grado);

        Scene scene = new Scene(root, 400, 300);
        Stage reporteStage = new Stage();
        reporteStage.setScene(scene);
        reporteStage.setTitle("Reporte");
        reporteStage.initOwner(primaryStage);
        reporteStage.show();
    }

    public void mostrarReporte(String nombre, String apellido, String genero, String grado, String modalidad, String montoAPagar, String duracion) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Resultado.fxml"));
        Parent root = loader.load();
        RResultado controller = loader.getController();
        controller.setMainApp(this);
        controller.mostrarReporte(nombre, apellido, genero, grado, modalidad, montoAPagar, duracion);

        Scene scene = new Scene(root, 400, 300);
        Stage resultadoStage = new Stage();
        resultadoStage.setScene(scene);
        resultadoStage.setTitle("Resultado");
        resultadoStage.initOwner(primaryStage);
        resultadoStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}

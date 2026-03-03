package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello JavaFX (Gradle)");
        Button button = new Button("Click me");
        button.setOnAction(e -> label.setText("Clicked!"));

        VBox root = new VBox(12, label, button);
        root.setStyle("-fx-padding: 18; -fx-alignment: center;");

        stage.setTitle("HelloFXGradle");
        stage.setScene(new Scene(root, 360, 220));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
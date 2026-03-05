package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello JavaFX (Gradle)");
        Button button = new Button("Click me");
        TextField textField = new TextField(); 

        TextArea responseArea = new TextArea();
        responseArea.setEditable(false);

        button.setOnAction(e -> label.setText("Clicked!"));
        button.setOnAction(e -> handleButtonClick(textField, responseArea));
        
        button.setDisable(true);
        textField.textProperty().addListener((observable, oldValue, newValue) ->
            button.setDisable(newValue.isEmpty())
        );

        VBox root = new VBox(12, label, textField, button, responseArea);
        root.setStyle("-fx-padding: 18; -fx-alignment: center;");

        stage.setTitle("HelloFXGradle");
        stage.setScene(new Scene(root, 360, 220));
        stage.show();
    }

    private void handleButtonClick(TextField textField, TextArea responseArea) {
        String input = textField.getText();
        responseArea.setText("You entered: \n" + input);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
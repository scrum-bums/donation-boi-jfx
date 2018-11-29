package com.scrumbums.donationboijfx.main.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stage;
    private static Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public static Scene getScene() {
        return scene;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        Parent entryScreen = FXMLLoader.load(getClass().getClassLoader().getResource("EntryScreen.fxml"));
        scene = new Scene(entryScreen);
        primaryStage.setTitle("Donation Boi");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

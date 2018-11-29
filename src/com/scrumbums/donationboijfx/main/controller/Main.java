package com.scrumbums.donationboijfx.main.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent entryScreen = FXMLLoader.load(getClass().getClassLoader().getResource("EntryScreen.fxml"));
        primaryStage.setTitle("Donation Boi");
        stage = primaryStage;
        Scene scene = new Scene(entryScreen,400, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

package com.scrumbums.donationboijfx.main.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginScreen implements Initializable {
    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passField;

    @FXML
    private Button loginButton;

    @FXML
    private Button backButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginButton.setOnAction(actionEvent -> {
            System.out.println("login pressed");
        });

        backButton.setOnAction(actionEvent -> {
            try {
                Main.getStage()
                        .setScene(new Scene(FXMLLoader.load(getClass().getClassLoader().getResource("EntryScreen.fxml")),
                                600, 400));
            } catch (IOException e) {
                System.out.println("This shouldn't happen.");
            }
        });

    }
}

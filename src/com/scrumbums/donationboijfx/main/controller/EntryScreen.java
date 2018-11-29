package com.scrumbums.donationboijfx.main.controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EntryScreen implements Initializable {
    private Scene scene;

    @FXML
    Button loginButton;

    @FXML
    Button registerButton;

    Parent entryScreen;

    @Override
    public void initialize(URL url, ResourceBundle res) {
        Stage stage = Main.getStage();
        loginButton.setOnAction(e -> {
            try {
                 entryScreen = FXMLLoader.load(getClass().getClassLoader().getResource("LoginScreen.fxml"));
            } catch (IOException io) {
                System.out.println("This shouldn't happen");
            }
            stage.setScene(new Scene(entryScreen, 600, 400));
        });
    }



}

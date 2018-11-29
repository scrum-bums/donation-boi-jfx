package com.scrumbums.donationboijfx.main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EntryScreen implements Initializable {
    private Stage stage;

    @FXML
    protected void loginButton(ActionEvent event) {

    }

    @FXML
    protected void registerButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle res) {
        stage = Main.getStage();
    }



}

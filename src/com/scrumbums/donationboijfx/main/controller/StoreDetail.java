package com.scrumbums.donationboijfx.main.controller;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class StoreDetail implements Initializable {
    @FXML
    private Button exitButton;

    @FXML
    private Text text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text.setText(StoreList.getSel().toString());
        exitButton.setOnAction(e -> Main.setScene("StoreList.fxml"));
    }
}

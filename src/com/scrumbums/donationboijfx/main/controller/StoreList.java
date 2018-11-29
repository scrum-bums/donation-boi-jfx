package com.scrumbums.donationboijfx.main.controller;

import com.scrumbums.donationboijfx.main.model.entities.Store;
import com.scrumbums.donationboijfx.main.model.util.DatabaseAbstraction;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class StoreList implements Initializable {
    @FXML
    private Button logoutButton;

    @FXML
    private ListView<Store> list;

    private static Store sel;

    public static Store getSel() {
        return sel;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        logoutButton.setOnAction(e -> {
            DatabaseAbstraction.logout();
            Main.setScene("EntryScreen.fxml");
        });

        list.setItems(FXCollections.observableArrayList(DatabaseAbstraction.stores));

        list.setOnMouseClicked(v -> {
            sel = list.getSelectionModel().getSelectedItem();
            Main.setScene("StoreDetail.fxml");
        });

    }
}

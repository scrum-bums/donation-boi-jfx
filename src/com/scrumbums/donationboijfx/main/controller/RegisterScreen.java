package com.scrumbums.donationboijfx.main.controller;

import com.scrumbums.donationboijfx.main.model.UserRole;
import com.scrumbums.donationboijfx.main.model.entities.User;
import com.scrumbums.donationboijfx.main.model.util.DatabaseAbstraction;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RegisterScreen implements Initializable {

    public TextField nameField;
    public TextField emailField;
    public TextField usernameField;
    public PasswordField passwordField;
    public Spinner<UserRole> roleSpinner;
    public Button registerButton;
    public Button cancelButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleSpinner.setValueFactory(new SpinnerValueFactory.ListSpinnerValueFactory<>(FXCollections.observableArrayList(UserRole.values())));

        registerButton.setOnAction(e -> {
            if(!(nameField.getText().equals("")
                    || emailField.getText().equals("")
                    || usernameField.getText().equals("")
                    || passwordField.getText().equals(""))) {
                if(DatabaseAbstraction.register(new User(nameField.getText(), usernameField.getText(),
                        emailField.getText(), passwordField.getText(), roleSpinner.getValue()))) {
                    DatabaseAbstraction.login(emailField.getText(), passwordField.getText());
                    Main.setScene("StoreList.fxml");
                }
            }
        });
        cancelButton.setOnAction(e -> Main.setScene("EntryScreen.fxml"));

    }
}

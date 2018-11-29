package com.scrumbums.donationboijfx.main.controller;

import com.scrumbums.donationboijfx.main.model.UserRole;
import com.scrumbums.donationboijfx.main.model.entities.Location;
import com.scrumbums.donationboijfx.main.model.entities.Store;
import com.scrumbums.donationboijfx.main.model.entities.User;
import com.scrumbums.donationboijfx.main.model.util.DatabaseAbstraction;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

    public static void setScene(String s) {
        try {
            Main.getStage()
                    .setScene(new Scene(FXMLLoader.load(Main.class.getClassLoader().getResource(s)),
                            600, 400));
        } catch (IOException e) {
            System.out.println("This shouldn't happen.");
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader(new File(getClass().getClassLoader().getResource("LocationData.csv").toURI())));
        r.lines().skip(1).forEach((s) -> {
            String[] strings = s.split(",");
            Float lat = Float.parseFloat(strings[2]);
            Float lon = Float.parseFloat(strings[3]);
            String addr = strings[4];
            String city = strings[5];
            String state = strings[6];
            int zip = Integer.parseInt(strings[7]);
            Location l = new Location(addr, state, city, zip, lat, lon);
            DatabaseAbstraction.stores.add(new Store(strings[1], l, strings[9], strings[10], strings[8]));
        });
        DatabaseAbstraction.register(new User("test", "user", "user","pass", UserRole.EMPLOYEE));
        stage = primaryStage;
        Main.setScene("EntryScreen.fxml");
        primaryStage.setTitle("Donation Boi");
        primaryStage.show();
    }
}

package controller;

import model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class SceneController {

    @FXML
    Button orbutton, banbutton, pinebutton, dalangbuttn, bluebutton;

    banana bana = new banana();
    blueberry blue = new blueberry();
    dalangdalana dalang = new dalangdalana();
    orange or = new orange();
    pineapple pine = new pineapple();

    public void initialize() {

        bana.setName("Banana");
        bana.setPrice("Php 50.00");

        blue.setName("Blue berry");
        blue.setPrice("Php 70.00");

        dalang.setName("Dalang dalana");
        dalang.setPrice("Php 20.00");

        or.setName("Orange");
        or.setPrice("Php 60.00");

        pine.setName("Pineapple");
        pine.setPrice("Php 40.00");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(orbutton)) {
            alert.setContentText("Indulge the farm freshness of " + or.getName() + " for a price of " + or.getPrice());
        }

        
        if (sourceButton.equals(banbutton)) {
            alert.setContentText("Introducing the freshness of " + bana.getName() + " for a price of " + bana.getPrice());
        }

        
        if (sourceButton.equals(pinebutton)) {
            alert.setContentText("Not just your ordinary things, but extraordinary! I present to you " + pine.getName() + " for a price of " + pine.getPrice());
        }

        
        if (sourceButton.equals(dalangbuttn)) {
            alert.setContentText("Indulge the farm freshness of " + dalang.getName() + " for a price of " + dalang.getPrice());
        }

        
        if (sourceButton.equals(bluebutton)) {
            alert.setContentText("Sweet things we got you for our " + blue.getName() + " for a price of " + blue.getPrice());
        }

        alert.showAndWait();
    }
    
}
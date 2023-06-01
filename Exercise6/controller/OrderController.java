package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class OrderController implements Initializable{

 @FXML Label product1, product2, product3;
 @FXML Text txt;
    @Override
    public void initialize (URL arg0, ResourceBundle arg1){

        product1.setText(HomeController.blamp.getProductName());
        product2.setText(HomeController.blamp.getProductName());

        
    }

}
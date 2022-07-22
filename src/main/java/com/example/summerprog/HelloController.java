package com.example.summerprog;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField nameArea;

    @FXML
    private Label nameLabel;

    @FXML
    private Label welcomeText;

    @FXML
    private Button yesButton;

    @FXML
    void initialize() {
        yesButton.setOnAction(actionEvent -> System.out.println("Prikol"));
    }

}

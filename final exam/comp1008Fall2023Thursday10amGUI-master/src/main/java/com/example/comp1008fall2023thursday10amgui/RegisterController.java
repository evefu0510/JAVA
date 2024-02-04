package com.example.comp1008fall2023thursday10amgui;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private Label error;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField confirmPassword;

    private RegisterModel model = new RegisterModel();

    @FXML
    void onRegisterClick(Event event) {

        error.setText("");

        try{
            model.processForm(username.getText(), password.getText(), confirmPassword.getText());
            username.setText("");
            password.setText("");
            confirmPassword.setText("");
            System.out.println("Successfully created user!");
        }
        catch (IllegalArgumentException e){
            error.setText(e.getMessage());
        }


    }
    @FXML
    void initialize(){
        error.setText("");
    }

}

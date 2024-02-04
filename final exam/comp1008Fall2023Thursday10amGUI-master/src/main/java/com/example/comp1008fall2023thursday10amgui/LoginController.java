package com.example.comp1008fall2023thursday10amgui;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label error;

    @FXML
    void onLoginClickPast(Event event) {

//        System.out.println(username.getText());
//        System.out.println(password.getText());

        error.setText("");

        if(username.getText().equals("admin") && password.getText().equals("pass")){
            System.out.println("Congrats!");
            username.setText("");
            password.setText("");
        }
        else{
            error.setText("Invalid username and/or password");
        }

    }
    @FXML
    void onLoginClick(Event event) {


        error.setText("");
        try {
            List<String> allLines = Files.readAllLines(RegisterModel.pathFile);
            boolean found = false;

            for(String line : allLines){
                String[] pieces = line.split("/");

                String currentUsername = pieces[0];
                String currentPassword = pieces[1];

                if(currentUsername.equals(username.getText())  && currentPassword.equals(password.getText())){
                    found = true;
                    break;
                }

            }

            if(found){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Congrats");
                alert.setContentText("Successfully logged in!");
                alert.show();
            }
            else{
                error.setText("Invalid username and/or password");
            }

        }
        catch (Exception e){
            System.err.println(e);
        }

    }
    @FXML
    void onRegisterClick(Event event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("register-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Register");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize(){
        //runs right before stage is shown. all nodes have been loaded. stage hasn't yet appears

        error.setText("");
    }
}

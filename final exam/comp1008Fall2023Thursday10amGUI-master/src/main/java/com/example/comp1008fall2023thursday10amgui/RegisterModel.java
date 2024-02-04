package com.example.comp1008fall2023thursday10amgui;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class RegisterModel {
    public static final Path pathRoot = Path.of(
            "src","main","resources",
            "com","example","comp1008fall2023thursday10amgui"
    );

    public static final Path pathFile = pathRoot.resolve("credentials.txt");

    private String username, password, confirmPassword;

    private static final int MIN_LENGTH = 5;

    public RegisterModel(){}

    public void processForm(String username, String password, String confirmPassword) {
        setUsername(username);
        setPassword(password);
        setConfirmPassword(confirmPassword);
        saveData();
    }
    private void saveData(){
        try {

            if (!pathRoot.toFile().exists()) {
                Files.createDirectory(pathRoot);
            }

            if (!pathFile.toFile().exists()) {
                Files.createFile(pathFile);
            }

            String content = String.format("%s/%s%n", username, password);
            Files.writeString(pathFile, content, StandardOpenOption.APPEND);

        }
        catch (Exception e){
            System.err.println(e);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username.length() < MIN_LENGTH)
            throw new IllegalArgumentException("Username is too short");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < MIN_LENGTH)
            throw new IllegalArgumentException("Password is too short");
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        if(!password.equals(confirmPassword))
            throw new IllegalArgumentException("Password do not match");
        this.confirmPassword = confirmPassword;
    }
}

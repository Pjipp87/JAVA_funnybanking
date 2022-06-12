package com.funnybanking;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * RegistrationWindowController
 */
public class RegistrationWindowOneController {

    
    // Buttons
    @FXML
    private Button cancel;
    @FXML
    private Button forward;

    @FXML
    private void cancelRegistration() throws IOException{
        App.setRoot("StartupWindow");  
    }

    @FXML
    private void goForward() throws IOException{
        App.setRoot("RegistrationWindowTwo");  
    }



}